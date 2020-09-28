
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
 * Class for sese.037.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prtflTrfNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.037.001.03")
public class MxSese03700103
    extends AbstractMX
{

    @XmlElement(name = "PrtflTrfNtfctn", required = true)
    protected PortfolioTransferNotificationV03 prtflTrfNtfctn;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 37;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification2 .class, AmountAndDirection7 .class, AmountAndDirection9 .class, ClassificationType2Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DeliveryReceiptType2Code.class, EventFrequency3Code.class, FinancialInstrumentAttributes35 .class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms11 .class, FormOfSecurity1Code.class, FormOfSecurity2Choice.class, Frequency3Choice.class, GenericIdentification1 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification37 .class, IdentificationSource3Choice.class, IdentificationType4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat1Choice.class, MarketIdentification3Choice.class, MxSese03700103 .class, NameAndAddress5 .class, Number2Choice.class, Number3Choice.class, OptionStyle2Code.class, OptionStyle4Choice.class, OptionType1Code.class, OptionType2Choice.class, OtherAmounts15 .class, OtherIdentification1 .class, OtherParties10 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification36Choice.class, PartyIdentification37Choice.class, PartyIdentification44Choice.class, PartyIdentification48 .class, PartyIdentification49Choice.class, PartyIdentificationAndAccount35 .class, PartyTextInformation1 .class, PortfolioTransferNotificationV03 .class, PostalAddress1 .class, Price2 .class, PriceRateOrAmountChoice.class, PriceType1Choice.class, PriceValueType1Code.class, Quantity7 .class, QuantityBreakdown13 .class, ReceiveDelivery1Code.class, Registration1Choice.class, Registration1Code.class, Reporting1Choice.class, Reporting1Code.class, Restriction1Choice.class, SecuritiesAccount13 .class, SecuritiesCertificate1 .class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus2Choice.class, SecuritiesRTGS1Choice.class, SecuritiesTradeDetails24 .class, SecurityIdentification14 .class, SettlementDate1Choice.class, SettlementDate4Code.class, SettlementDateCode1Choice.class, SettlementDetails4 .class, SettlementParties10 .class, SettlementSystemMethod1Choice.class, SettlementSystemMethod1Code.class, SettlementTransactionCondition2Choice.class, SettlementTransactionCondition3Code.class, Statement19 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty1Choice.class, TaxLiability1Code.class, TradeDate1Choice.class, TradeDateCode1Choice.class, TypeOfIdentification1Code.class, TypeOfPrice14Code.class, TypeOfPrice3Choice.class, UpdateType2Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.037.001.03";

    public MxSese03700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03700103(final String xml) {
        this();
        MxSese03700103 tmp = parse(xml);
        prtflTrfNtfctn = tmp.getPrtflTrfNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the prtflTrfNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioTransferNotificationV03 }
     *     
     */
    public PortfolioTransferNotificationV03 getPrtflTrfNtfctn() {
        return prtflTrfNtfctn;
    }

    /**
     * Sets the value of the prtflTrfNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioTransferNotificationV03 }
     *     
     */
    public MxSese03700103 setPrtflTrfNtfctn(PortfolioTransferNotificationV03 value) {
        this.prtflTrfNtfctn = value;
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
    public static MxSese03700103 parse(String xml) {
        return ((MxSese03700103) MxReadImpl.parse(MxSese03700103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03700103 parse(String xml, MxRead parserImpl) {
        return ((MxSese03700103) parserImpl.read(MxSese03700103 .class, xml, _classes));
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
     * Creates an MxSese03700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03700103 message
     * @return
     *     a new instance of MxSese03700103
     */
    public final static MxSese03700103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese03700103 .class);
    }

}
