
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
 * Class for acmt.006.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMgmtStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:acmt.006.001.04")
public class MxAcmt00600104
    extends AbstractMX
{

    @XmlElement(name = "AcctMgmtStsRpt", required = true)
    protected AccountManagementStatusReportV04 acctMgmtStsRpt;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountManagementStatus1Code.class, AccountManagementStatusAndReason3 .class, AccountManagementStatusReportV04 .class, AdditionalReference3 .class, AddressType2Code.class, Extension1 .class, GenericIdentification1 .class, GenericIdentification29 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxAcmt00600104 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PostalAddress1 .class, RejectedReason4Choice.class, RejectedStatusReason6Code.class, RejectionReason16 .class, Status14Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:acmt.006.001.04";

    public MxAcmt00600104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00600104(final String xml) {
        this();
        MxAcmt00600104 tmp = parse(xml);
        acctMgmtStsRpt = tmp.getAcctMgmtStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00600104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMgmtStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatusReportV04 }
     *     
     */
    public AccountManagementStatusReportV04 getAcctMgmtStsRpt() {
        return acctMgmtStsRpt;
    }

    /**
     * Sets the value of the acctMgmtStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatusReportV04 }
     *     
     */
    public MxAcmt00600104 setAcctMgmtStsRpt(AccountManagementStatusReportV04 value) {
        this.acctMgmtStsRpt = value;
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
    public static MxAcmt00600104 parse(String xml) {
        return ((MxAcmt00600104) MxReadImpl.parse(MxAcmt00600104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00600104 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00600104) parserImpl.read(MxAcmt00600104 .class, xml, _classes));
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
     * Creates an MxAcmt00600104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00600104 message
     * @return
     *     a new instance of MxAcmt00600104
     */
    public final static MxAcmt00600104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAcmt00600104 .class);
    }

}
