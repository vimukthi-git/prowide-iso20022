
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
 * Class for camt.998.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cshMgmtPrtryMsg"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.998.001.03")
public class MxCamt99800103
    extends AbstractMX
{

    @XmlElement(name = "CshMgmtPrtryMsg", required = true)
    protected CashManagementProprietaryMessageV03 cshMgmtPrtryMsg;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 998;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CashManagementProprietaryMessageV03 .class, MessageHeader1 .class, MessageReference2 .class, MxCamt99800103 .class, ProprietaryData5 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.998.001.03";

    public MxCamt99800103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt99800103(final String xml) {
        this();
        MxCamt99800103 tmp = parse(xml);
        cshMgmtPrtryMsg = tmp.getCshMgmtPrtryMsg();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt99800103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cshMgmtPrtryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link CashManagementProprietaryMessageV03 }
     *     
     */
    public CashManagementProprietaryMessageV03 getCshMgmtPrtryMsg() {
        return cshMgmtPrtryMsg;
    }

    /**
     * Sets the value of the cshMgmtPrtryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashManagementProprietaryMessageV03 }
     *     
     */
    public MxCamt99800103 setCshMgmtPrtryMsg(CashManagementProprietaryMessageV03 value) {
        this.cshMgmtPrtryMsg = value;
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
    public static MxCamt99800103 parse(String xml) {
        return ((MxCamt99800103) MxReadImpl.parse(MxCamt99800103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt99800103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt99800103) parserImpl.read(MxCamt99800103 .class, xml, _classes));
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
     * Creates an MxCamt99800103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt99800103 message
     * @return
     *     a new instance of MxCamt99800103
     */
    public final static MxCamt99800103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt99800103 .class);
    }

}
