
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
 * Class for semt.003.002.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalAcctgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.003.002.08")
public class MxSemt00300208
    extends AbstractMX
{

    @XmlElement(name = "SctiesBalAcctgRpt", required = true)
    protected SecuritiesBalanceAccountingReport002V08 sctiesBalAcctgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account12 .class, AccountIdentification4 .class, AdditionalBalanceInformation7 .class, AggregateBalanceInformation27 .class, AggregateBalancePerSafekeepingPlace26 .class, AmountAndDirection14 .class, Balance2 .class, Balance5 .class, BalanceAmounts5 .class, BalanceAmounts6 .class, BalanceQuantity6Choice.class, ClassificationType3Choice.class, CorporateActionOption5Code.class, DateAndDateTimeChoice.class, DerivativeBasicAttributes2 .class, DistributionPolicy1Code.class, EventFrequency3Code.class, EventFrequency4Code.class, ExposureType13Choice.class, ExposureType4Code.class, FinancialInstrument22 .class, FinancialInstrumentAttributes41 .class, FinancialInstrumentQuantity15Choice.class, ForeignExchangeTerms16 .class, FormOfSecurity1Code.class, FormOfSecurity3Choice.class, Frequency5Choice.class, Frequency6Choice.class, GenericIdentification18 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification27 .class, GenericIdentification28 .class, GenericIdentification39 .class, GenericIdentification59 .class, GenericIdentification60 .class, IdentificationSource4Choice.class, InterestComputationMethod2Code.class, InterestComputationMethodFormat2Choice.class, Intermediary22 .class, InvestmentFundRole2Code.class, MarketIdentification10 .class, MarketIdentification2Choice.class, MarketIdentification4Choice.class, MarketType4Code.class, MarketType7Choice.class, MxSemt00300208 .class, NameAndAddress12 .class, Number3Choice.class, Number4Choice.class, OptionStyle2Code.class, OptionStyle5Choice.class, OptionType1Code.class, OptionType3Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification59Choice.class, PledgeeFormat2Choice.class, PledgeeType1Code.class, PledgeeTypeAndAnyBICIdentifier1 .class, PledgeeTypeAndText2 .class, Price3 .class, PriceInformation7 .class, PriceRateOrAmount1Choice.class, PriceRateOrAmountOrUnknown1Choice.class, PriceType2Choice.class, PriceValueType1Code.class, PurposeCode3Choice.class, PurposeCode4Choice.class, Quantity10Choice.class, QuantityAndAvailability2 .class, QuantityBreakdown25 .class, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Role3Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount15 .class, SecuritiesAccount16 .class, SecuritiesAccountPurposeType1Code.class, SecuritiesBalanceAccountingReport002V08 .class, SecuritiesBalanceType12Code.class, SecuritiesBalanceType7Code.class, SecuritiesPaymentStatus1Code.class, SecuritiesPaymentStatus3Choice.class, SecurityIdentification15 .class, ShortLong1Code.class, SimpleIdentificationInformation1 .class, Statement24 .class, StatementBasis1Code.class, StatementBasis4Choice.class, StatementUpdateType1Code.class, SubAccountIdentification39 .class, SubBalanceInformation7 .class, SubBalanceQuantity4Choice.class, SubBalanceType7Choice.class, SubBalanceType8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalValueInPageAndStatement4 .class, TypeOfPrice11Code.class, TypeOfPrice14Code.class, TypeOfPrice5Choice.class, TypeOfPrice7Choice.class, UpdateType3Choice.class, YieldedOrValueType1Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.003.002.08";

    public MxSemt00300208() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00300208(final String xml) {
        this();
        MxSemt00300208 tmp = parse(xml);
        sctiesBalAcctgRpt = tmp.getSctiesBalAcctgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00300208(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalAcctgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceAccountingReport002V08 }
     *     
     */
    public SecuritiesBalanceAccountingReport002V08 getSctiesBalAcctgRpt() {
        return sctiesBalAcctgRpt;
    }

    /**
     * Sets the value of the sctiesBalAcctgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceAccountingReport002V08 }
     *     
     */
    public MxSemt00300208 setSctiesBalAcctgRpt(SecuritiesBalanceAccountingReport002V08 value) {
        this.sctiesBalAcctgRpt = value;
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
    public static MxSemt00300208 parse(String xml) {
        return ((MxSemt00300208) MxReadImpl.parse(MxSemt00300208 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00300208 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00300208) parserImpl.read(MxSemt00300208 .class, xml, _classes));
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
     * Creates an MxSemt00300208 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00300208 message
     * @return
     *     a new instance of MxSemt00300208
     */
    public final static MxSemt00300208 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt00300208 .class);
    }

}
