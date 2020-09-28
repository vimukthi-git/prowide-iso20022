
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
 * Class for acmt.037.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctSwtchTechRjctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.037.001.01")
public class MxAcmt03700101
    extends AbstractMX
{

    @XmlElement(name = "AcctSwtchTechRjctn", required = true)
    protected AccountSwitchTechnicalRejectionV01 acctSwtchTechRjctn;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountSwitchDetails1 .class, AccountSwitchTechnicalRejectionV01 .class, BalanceTransferWindow1Code.class, MessageIdentification1 .class, MxAcmt03700101 .class, ResponseDetails1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SwitchStatus1Code.class, SwitchType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.037.001.01";

    public MxAcmt03700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt03700101(final String xml) {
        this();
        MxAcmt03700101 tmp = parse(xml);
        acctSwtchTechRjctn = tmp.getAcctSwtchTechRjctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt03700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctSwtchTechRjctn property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchTechnicalRejectionV01 }
     *     
     */
    public AccountSwitchTechnicalRejectionV01 getAcctSwtchTechRjctn() {
        return acctSwtchTechRjctn;
    }

    /**
     * Sets the value of the acctSwtchTechRjctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchTechnicalRejectionV01 }
     *     
     */
    public MxAcmt03700101 setAcctSwtchTechRjctn(AccountSwitchTechnicalRejectionV01 value) {
        this.acctSwtchTechRjctn = value;
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
    public static MxAcmt03700101 parse(String xml) {
        return ((MxAcmt03700101) MxReadImpl.parse(MxAcmt03700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt03700101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt03700101) parserImpl.read(MxAcmt03700101 .class, xml, _classes));
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
     * Creates an MxAcmt03700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt03700101 message
     * @return
     *     a new instance of MxAcmt03700101
     */
    public final static MxAcmt03700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt03700101 .class);
    }

}
