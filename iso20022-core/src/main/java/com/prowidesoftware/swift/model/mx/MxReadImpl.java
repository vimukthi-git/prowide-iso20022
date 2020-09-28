/*
 * Copyright 2006-2020 Prowide
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.ProwideException;
import com.prowidesoftware.swift.io.parser.MxParser;
import com.prowidesoftware.swift.model.MxBusinessProcess;
import com.prowidesoftware.swift.model.MxId;
import com.prowidesoftware.swift.utils.SafeXmlUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.xml.sax.SAXParseException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.StringReader;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Default implementation of the {@link MxRead} interface to parse XML strings into Mx message objects.
 *
 * <p>The implementation is not a straight forward jaxb unmarsahlling. Some remarks:
 * <ul>
 *     <li>The parser uses a Stax event reader, to parse only the AppHdr and Document portions of the source XML,
 *     ignoring any container wrapper elements.</li>
 *
 *     <li>The parser is not namespace aware for general ISO 20022 elements, because the dictionary model classes in
 *     the library are not bounded to any specific namespace. This is due to the fact that the library is generated as
 *     a flat shared collection of elements, where the same element implementation is potentially used by many
 *     specific ISO 20022 messages.
 *     This is a special feature of the model, that is not a direct jaxb generation from hundreds of ISO schemas with
 *     each type in its own package, but a custom jaxb process to produce a shareable dictionary for the elements with
 *     minimal custom bindings.
 *     Notice however xsys messages do use namespace for the shared schemas.</li>
 *
 *     <li>For the header, multiple variants are supported. The parser detects the specific header to parse using the
 *     namespace at the AppHdr element. By default it tries to parse the content as head.001.001.01.</li>
 * </ul>
 *
 * <p>This is the default implementation used for the direct parse calls in MX messages. You can inject your own in
 * the alternative parsing methods accepting impementations of {@link MxRead}.
 *
 * @since 9.0
 */
public class MxReadImpl implements MxRead {
	private static final transient Logger log = Logger.getLogger(MxReadImpl.class.getName());

	@SuppressWarnings({ "rawtypes" })
	@Override
	public AbstractMX read(final Class<? extends AbstractMX> targetClass, final String xml, final Class<?>[] classes) {
		return parse(targetClass, xml, classes);
	}

	/**
	 * Static parse implementation of {@link MxRead#read(Class, String, Class[])}
	 * @since 8.0.4
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static AbstractMX parse(final Class<? extends AbstractMX> targetClass, final String xml, final Class<?>[] classes) {
		Validate.isTrue(StringUtils.isNotBlank(xml), "xml to parse must not be null nor a blank string");

		try {
			final String unboundedXml = JaxbUtils.unbindNamespace(xml);

			final XMLInputFactory xif = SafeXmlUtils.inputFactory();
			// May 2020: we cannot set namespace aware false, because xsys messages uses elements in shared namespaces
			//xif.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, false);
			//xif.setProperty(XMLInputFactory.IS_VALIDATING, false);
			final XMLEventReader reader = xif.createXMLEventReader(new StringReader(unboundedXml));

			// only the Document and AppHdr are parsed here, ignoring any optional wrapper content
			AbstractMX mx = null;
			AppHdr appHdr = null;

			XMLEvent e;

			// loop though the xml stream
			while ( (e = reader.peek()) != null ) {

				if (isElementStart(e, MxParser.DOCUMENT_LOCALNAME)) {

					mx = parseDocument(reader, targetClass, classes);

				} else if (isElementStart(e, AppHdr.HEADER_LOCALNAME)) {

					MxParser.MxStructureInfo info = new MxParser(xml).analyzeMessage();

					appHdr = parseHeader(reader, info);

					// if not able to parse the header continue
					if (appHdr == null) {
						reader.next();
					}

				} else {
					reader.next();
				}
			}

	        /*
			 * Sep 2017: alternative implementation using the MxParser stripDocument
			 * current implementation with xml reader is more flexible when the XML is not well-formed, this one can
			 * produce NPE. See MX read test with not well-formed messages.
			 *
			MxParser parser = new MxParser(xml2);
        	AbstractMX mx = (AbstractMX) jaxbUnmarshaller.unmarshal(new StreamSource(new StringReader(parser.stripDocument())), targetClass).getValue();
	        */

			if (mx != null && appHdr != null) {
				mx.setAppHdr(appHdr);
			}

			return mx;

		} catch (final Exception e) {
			return handleParseException(e);
		}
	}

	private static boolean isElementStart(XMLEvent e, String localName) {
		return e.isStartElement() && e.asStartElement().getName().getLocalPart().equals(localName);
	}

	private static AbstractMX parseDocument(XMLEventReader reader, Class<? extends AbstractMX> targetClass, Class<?>[] classes) throws JAXBException, ExecutionException {
		JAXBContext jaxbContext = JaxbContextLoader.INSTANCE.get(targetClass, classes);
		final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return unmarshaller.unmarshal(reader, targetClass).getValue();
	}

	private static AppHdr parseHeader(XMLEventReader reader, MxParser.MxStructureInfo info) {
		if (info.containsLegacyHeader().isPresent() && info.containsLegacyHeader().get()) {
			// parse legacy AH
			return (LegacyAppHdr) JaxbUtils.parse(LegacyAppHdr.class, reader, LegacyAppHdr._classes);

		} else if (StringUtils.equals(info.getHeaderNamespace(), BusinessAppHdrV02.NAMESPACE)) {
			// parse BAH version 2
			return (BusinessAppHdrV02) JaxbUtils.parse(BusinessAppHdrV02.class, reader, BusinessAppHdrV02._classes);

		} else {
			// by default try to parse to BAH version 1
			return  (BusinessAppHdrV01) JaxbUtils.parse(BusinessAppHdrV01.class, reader, BusinessAppHdrV01._classes);
		}
	}

	private static AbstractMX handleParseException(Exception e) {
		if (e instanceof UnmarshalException) {
			final Throwable cause = e.getCause();
			if (cause instanceof SAXParseException) {
				SAXParseException spe = (SAXParseException) cause;
				throw new ProwideException("Error parsing message at line "+spe.getLineNumber() +", column "+spe.getColumnNumber(), cause);
			} else {
				throw new ProwideException("Error parsing message", cause);
			}
		}
		if (e instanceof XMLStreamException) {
			throw new ProwideException("Error parsing message: "+ e.getMessage());
		}
		log.severe("An error occurred while reading XML: " + e.getMessage());
		return null;
	}

	/**
	 * Parses the XML string content into a specific instance of Mx.
	 * <br>
	 * If the string is empty, does not contain any MX message, the message type cannot be
	 * detected or an error occur reading and parsing the message content; this method returns null.
	 * <br>
	 * The implementation detects the message type and uses reflection to call the
	 * parser in the specific Mx subclass.
	 * <br>
	 * If header is present, it is also parsed into the message object.
	 *
	 * @param xml a string containing an MX message in XML format
	 * @param id optional parameter to indicate the specific MX type to create; autodetected from namespace if null.
	 * @return parser message or null if string content could not be parsed into an Mx
	 *
	 * @since 7.8.4
	 */
	@Override
	public AbstractMX read(final String xml, MxId id) {
		return parse(xml, id);
	}

	/**
	 * Static parse implementation of {@link MxRead#read(String, MxId)}
	 * @since 9.0
	 */
	public static AbstractMX parse(final String xml, MxId id) {
		MxParser parser = new MxParser(xml);
		if (id == null) {
			id = parser.detectMessage();
		}
		if (id == null) {
			log.severe("Cannot detect the Mx type from the XML, ensure the XML contains proper namespaces or provide an MxId object as parameter to the parse call");
			return null;
		}
		AbstractMX mx = null;
		String fqn = null;
		try {
			String subPackage = id.getBusinessProcess() == MxBusinessProcess.xsys ? ".sys" : "";
			fqn = "com.prowidesoftware.swift.model.mx" + subPackage + ".Mx" + id.camelized();
			Class<? extends AbstractMX> clazz = (Class<? extends AbstractMX>) Class.forName(fqn);
			java.lang.reflect.Field _classes = clazz.getDeclaredField("_classes");
			mx = parse(clazz, xml, (Class[]) _classes.get(null));
		} catch (ClassNotFoundException e) {
			log.log(Level.SEVERE, "MX model implementation not found for " + fqn, e);
		} catch (Exception e) {
			log.log(Level.SEVERE, "Error calling parse in specific MX model implementation", e);
		}
		return mx;
	}


}