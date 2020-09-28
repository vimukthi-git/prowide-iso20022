
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
 * Class for camt.060.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctRptgReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.060.001.01")
public class MxCamt06000101
    extends AbstractMX
{

    @XmlElement(name = "AcctRptgReq", required = true)
    protected AccountReportingRequestV01 acctRptgReq;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 60;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountReportingRequestV01 .class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BalanceSubType1Choice.class, BalanceType12 .class, BalanceType12Code.class, BalanceType5Choice.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, CashAccount20 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndPlaceOfBirth.class, DatePeriodDetails1 .class, EntryStatus2Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, FloorLimitType1Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader43 .class, Limit2 .class, MxCamt06000101 .class, NamePrefix1Code.class, OrganisationIdentification4 .class, OrganisationIdentificationSchemeName1Choice.class, Party6Choice.class, Party7Choice.class, PartyIdentification32 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, QueryType3Code.class, ReportingPeriod1 .class, ReportingRequest1 .class, TimePeriodDetails1 .class, TransactionType1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.060.001.01";

    public MxCamt06000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt06000101(final String xml) {
        this();
        MxCamt06000101 tmp = parse(xml);
        acctRptgReq = tmp.getAcctRptgReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt06000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctRptgReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReportingRequestV01 }
     *     
     */
    public AccountReportingRequestV01 getAcctRptgReq() {
        return acctRptgReq;
    }

    /**
     * Sets the value of the acctRptgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReportingRequestV01 }
     *     
     */
    public MxCamt06000101 setAcctRptgReq(AccountReportingRequestV01 value) {
        this.acctRptgReq = value;
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
    public static MxCamt06000101 parse(String xml) {
        return ((MxCamt06000101) MxReadImpl.parse(MxCamt06000101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt06000101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt06000101) parserImpl.read(MxCamt06000101 .class, xml, _classes));
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
     * Creates an MxCamt06000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt06000101 message
     * @return
     *     a new instance of MxCamt06000101
     */
    public final static MxCamt06000101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt06000101 .class);
    }

}
