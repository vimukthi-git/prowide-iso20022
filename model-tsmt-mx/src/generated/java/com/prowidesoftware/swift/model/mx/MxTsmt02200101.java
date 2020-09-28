
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
 * Class for tsmt.022.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt02200101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.022.001.01")
public class MxTsmt02200101
    extends AbstractMX
{

    @XmlElement(name = "tsmt.022.001.01", required = true)
    protected Tsmt02200101 tsmt02200101;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BICIdentification1 .class, DocumentIdentification5 .class, MessageIdentification1 .class, MxTsmt02200101 .class, Reason2 .class, RejectedElement1 .class, RejectionReason1Choice.class, SimpleIdentificationInformation.class, Tsmt02200101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.022.001.01";

    public MxTsmt02200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt02200101(final String xml) {
        this();
        MxTsmt02200101 tmp = parse(xml);
        tsmt02200101 = tmp.getTsmt02200101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt02200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt02200101 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt02200101 }
     *     
     */
    public Tsmt02200101 getTsmt02200101() {
        return tsmt02200101;
    }

    /**
     * Sets the value of the tsmt02200101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt02200101 }
     *     
     */
    public MxTsmt02200101 setTsmt02200101(Tsmt02200101 value) {
        this.tsmt02200101 = value;
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
    public static MxTsmt02200101 parse(String xml) {
        return ((MxTsmt02200101) MxReadImpl.parse(MxTsmt02200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt02200101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt02200101) parserImpl.read(MxTsmt02200101 .class, xml, _classes));
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
     * Creates an MxTsmt02200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt02200101 message
     * @return
     *     a new instance of MxTsmt02200101
     */
    public final static MxTsmt02200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt02200101 .class);
    }

}
