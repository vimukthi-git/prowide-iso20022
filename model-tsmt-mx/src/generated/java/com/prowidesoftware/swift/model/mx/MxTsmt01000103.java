
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.010.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "baselnMtchRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.010.001.03")
public class MxTsmt01000103
    extends AbstractMX
{

    @XmlElement(name = "BaselnMtchRpt", required = true)
    protected BaselineMatchReportV03 baselnMtchRpt;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Action2Code.class, BICIdentification1 .class, BaselineMatchReportV03 .class, BaselineStatus3Code.class, DocumentIdentification3 .class, DocumentIdentification4 .class, DocumentIdentification5 .class, ElementIdentification1 .class, GenericIdentification4 .class, Limit1 .class, MessageIdentification1 .class, MisMatchReport3 .class, MxTsmt01000103 .class, PartyIdentification26 .class, PendingActivity2 .class, PostalAddress5 .class, SimpleIdentificationInformation.class, TransactionStatus4 .class, ValidationResult5 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.010.001.03";

    public MxTsmt01000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt01000103(final String xml) {
        this();
        MxTsmt01000103 tmp = parse(xml);
        baselnMtchRpt = tmp.getBaselnMtchRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt01000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the baselnMtchRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BaselineMatchReportV03 }
     *     
     */
    public BaselineMatchReportV03 getBaselnMtchRpt() {
        return baselnMtchRpt;
    }

    /**
     * Sets the value of the baselnMtchRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineMatchReportV03 }
     *     
     */
    public MxTsmt01000103 setBaselnMtchRpt(BaselineMatchReportV03 value) {
        this.baselnMtchRpt = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxTsmt01000103 parse(String xml) {
        return ((MxTsmt01000103) MxReadImpl.parse(MxTsmt01000103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt01000103 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt01000103) parserImpl.read(MxTsmt01000103 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxTsmt01000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt01000103 message
     * @return
     *     a new instance of MxTsmt01000103
     */
    public final static MxTsmt01000103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt01000103 .class);
    }

}
