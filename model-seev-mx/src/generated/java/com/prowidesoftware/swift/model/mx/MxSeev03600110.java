
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
 * Class for seev.036.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntConf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.10")
public class MxSeev03600110
    extends AbstractMX
{

    @XmlElement(name = "CorpActnMvmntConf", required = true)
    protected CorporateActionMovementConfirmationV10 corpActnMvmntConf;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 36;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account8Choice.class, AccountAndBalance43 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalBusinessProcess7Code.class, AdditionalBusinessProcessFormat11Choice.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndQuantityRatio4 .class, AmountAndRateStatus1 .class, AmountPrice2 .class, AmountPrice3 .class, AmountPricePerAmount2 .class, AmountPricePerFinancialInstrumentQuantity6 .class, AmountPriceType1Code.class, AmountPriceType2Code.class, AmountToAmountRatio2 .class, BalanceFormat5Choice.class, BalanceFormat6Choice.class, CashAccountIdentification5Choice.class, CashOption64 .class, CashParties34 .class, CorporateAction44 .class, CorporateActionAmounts50 .class, CorporateActionBalanceDetails31 .class, CorporateActionDate59 .class, CorporateActionDate60 .class, CorporateActionDate65 .class, CorporateActionEventReference3 .class, CorporateActionEventReference3Choice.class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat14Choice.class, CorporateActionEventType25Code.class, CorporateActionEventType74Choice.class, CorporateActionGeneralInformation126 .class, CorporateActionMovementConfirmationV10 .class, CorporateActionNarrative31 .class, CorporateActionOption154 .class, CorporateActionOption19Choice.class, CorporateActionOption8Code.class, CorporateActionPeriod13 .class, CorporateActionPrice59 .class, CorporateActionPrice61 .class, CorporateActionRate88 .class, CorporateActionRate90 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateFormat43Choice.class, DateFormat45Choice.class, DateType8Code.class, DeemedRateType1Choice.class, DeemedRateType1Code.class, DividendRateType1Code.class, DocumentIdentification31 .class, DocumentIdentification32 .class, DocumentIdentification3Choice.class, DocumentIdentification9 .class, DocumentNumber5Choice.class, FinancialInstrumentQuantity1Choice.class, ForeignExchangeTerms23 .class, FractionDispositionType11Code.class, FractionDispositionType27Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification47 .class, GenericIdentification78 .class, GrossDividendRateFormat28Choice.class, GrossDividendRateFormat29Choice.class, GrossDividendRateType4Code.class, GrossDividendRateType5Code.class, IdentificationSource3Choice.class, IdentificationType42Choice.class, IndicativeOrMarketPrice8Choice.class, InterestRateUsedForPaymentFormat7Choice.class, IntermediateSecuritiesDistributionTypeFormat16Choice.class, IntermediateSecurityDistributionType4Code.class, IssuerOfferorTaxabilityIndicator1Choice.class, IssuerTaxability2Code.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxSeev03600110 .class, NameAndAddress5 .class, NetDividendRateFormat30Choice.class, NetDividendRateFormat32Choice.class, NetDividendRateType4Code.class, NetDividendRateType5Code.class, NewSecuritiesIssuanceType6Code.class, OptionFeatures6Code.class, OptionFeaturesFormat18Choice.class, OptionNumber1Choice.class, OptionNumber1Code.class, OriginalAndCurrentQuantities1 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification133Choice.class, PartyIdentification143 .class, PartyIdentificationAndAccount162 .class, PartyIdentificationAndAccount163 .class, PartyIdentificationAndAccount172 .class, Payment1Code.class, PercentagePrice1 .class, Period11 .class, PostalAddress1 .class, PriceDetails23 .class, PriceFormat48Choice.class, PriceFormat50Choice.class, PriceFormat51Choice.class, PriceRateType3Code.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, Quantity17Choice.class, Quantity18Choice.class, Quantity19Choice.class, Quantity6Choice.class, QuantityToQuantityRatio1 .class, RateAndAmountFormat39Choice.class, RateAndAmountFormat40Choice.class, RateAndAmountFormat52Choice.class, RateDetails32 .class, RateFormat22Choice.class, RateStatus1Code.class, RateStatus3Choice.class, RateType33Choice.class, RateType36Choice.class, RateType42Choice.class, RateType68Choice.class, RateType69Choice.class, RateType70Choice.class, RateType71Choice.class, RateType7Code.class, RateTypeAndAmountAndStatus24 .class, RateTypeAndAmountAndStatus26 .class, RateTypeAndAmountAndStatus37 .class, RateTypeAndAmountAndStatus38 .class, RateTypeAndAmountAndStatus39 .class, RateTypeAndAmountAndStatus40 .class, RateTypeAndAmountAndStatus41 .class, RateTypeAndPercentageRate10 .class, RateTypeAndPercentageRate8 .class, RatioFormat19Choice.class, RatioFormat20Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesOption70 .class, SecurityDate15 .class, SecurityIdentification19 .class, SettlementParties75 .class, ShortLong1Code.class, SignedQuantityFormat6 .class, SignedQuantityFormat7 .class, SolicitationFeeRateFormat8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxVoucher4 .class, TemporaryFinancialInstrumentIndicator3Choice.class, TotalEligibleBalanceFormat8 .class, TypeOfIdentification1Code.class, WithholdingTaxRateType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.036.001.10";

    public MxSeev03600110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev03600110(final String xml) {
        this();
        MxSeev03600110 tmp = parse(xml);
        corpActnMvmntConf = tmp.getCorpActnMvmntConf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev03600110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntConf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementConfirmationV10 }
     *     
     */
    public CorporateActionMovementConfirmationV10 getCorpActnMvmntConf() {
        return corpActnMvmntConf;
    }

    /**
     * Sets the value of the corpActnMvmntConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementConfirmationV10 }
     *     
     */
    public MxSeev03600110 setCorpActnMvmntConf(CorporateActionMovementConfirmationV10 value) {
        this.corpActnMvmntConf = value;
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
    public static MxSeev03600110 parse(String xml) {
        return ((MxSeev03600110) MxReadImpl.parse(MxSeev03600110 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev03600110 parse(String xml, MxRead parserImpl) {
        return ((MxSeev03600110) parserImpl.read(MxSeev03600110 .class, xml, _classes));
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
     * Creates an MxSeev03600110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev03600110 message
     * @return
     *     a new instance of MxSeev03600110
     */
    public final static MxSeev03600110 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev03600110 .class);
    }

}
