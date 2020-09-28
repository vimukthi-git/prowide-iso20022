
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
 * Class for auth.017.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgRefDataRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.017.001.01")
public class MxAuth01700101
    extends AbstractMX
{

    @XmlElement(name = "FinInstrmRptgRefDataRpt", required = true)
    protected FinancialInstrumentReportingReferenceDataReportV01 finInstrmRptgRefDataRpt;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AgriculturalCommodityDairy1 .class, AgriculturalCommodityForestry1 .class, AgriculturalCommodityGrain1 .class, AgriculturalCommodityLiveStock1 .class, AgriculturalCommodityOilSeed1 .class, AgriculturalCommodityOliveOil1 .class, AgriculturalCommodityPotato1 .class, AgriculturalCommoditySeafood1 .class, AgriculturalCommoditySoft1 .class, AmountAndDirection61 .class, AssetClass2 .class, AssetClassCommodity3Choice.class, AssetClassCommodityAgricultural1Choice.class, AssetClassCommodityEnergy1Choice.class, AssetClassCommodityEnvironmental1Choice.class, AssetClassCommodityFertilizer1Choice.class, AssetClassCommodityFreight1Choice.class, AssetClassCommodityIndustrialProduct1Choice.class, AssetClassCommodityInflation1 .class, AssetClassCommodityMetal1Choice.class, AssetClassCommodityMultiCommodityExotic1 .class, AssetClassCommodityOfficialEconomicStatistics1 .class, AssetClassCommodityOther1 .class, AssetClassCommodityOtherC102Choice.class, AssetClassCommodityPaper1Choice.class, AssetClassCommodityPolypropylene1Choice.class, AssetClassDetailedSubProductType10Code.class, AssetClassDetailedSubProductType11Code.class, AssetClassDetailedSubProductType12Code.class, AssetClassDetailedSubProductType14Code.class, AssetClassDetailedSubProductType15Code.class, AssetClassDetailedSubProductType1Code.class, AssetClassDetailedSubProductType2Code.class, AssetClassDetailedSubProductType4Code.class, AssetClassDetailedSubProductType5Code.class, AssetClassDetailedSubProductType6Code.class, AssetClassDetailedSubProductType7Code.class, AssetClassDetailedSubProductType8Code.class, AssetClassProductType11Code.class, AssetClassProductType12Code.class, AssetClassProductType13Code.class, AssetClassProductType14Code.class, AssetClassProductType15Code.class, AssetClassProductType1Code.class, AssetClassProductType2Code.class, AssetClassProductType3Code.class, AssetClassProductType4Code.class, AssetClassProductType5Code.class, AssetClassProductType6Code.class, AssetClassProductType7Code.class, AssetClassProductType8Code.class, AssetClassProductType9Code.class, AssetClassSubProductType10Code.class, AssetClassSubProductType15Code.class, AssetClassSubProductType16Code.class, AssetClassSubProductType18Code.class, AssetClassSubProductType1Code.class, AssetClassSubProductType20Code.class, AssetClassSubProductType21Code.class, AssetClassSubProductType22Code.class, AssetClassSubProductType23Code.class, AssetClassSubProductType24Code.class, AssetClassSubProductType25Code.class, AssetClassSubProductType26Code.class, AssetClassSubProductType27Code.class, AssetClassSubProductType28Code.class, AssetClassSubProductType29Code.class, AssetClassSubProductType2Code.class, AssetClassSubProductType30Code.class, AssetClassSubProductType31Code.class, AssetClassSubProductType32Code.class, AssetClassSubProductType33Code.class, AssetClassSubProductType34Code.class, AssetClassSubProductType35Code.class, AssetClassSubProductType36Code.class, AssetClassSubProductType37Code.class, AssetClassSubProductType38Code.class, AssetClassSubProductType39Code.class, AssetClassSubProductType3Code.class, AssetClassSubProductType40Code.class, AssetClassSubProductType41Code.class, AssetClassSubProductType42Code.class, AssetClassSubProductType43Code.class, AssetClassSubProductType44Code.class, AssetClassSubProductType45Code.class, AssetClassSubProductType46Code.class, AssetClassSubProductType47Code.class, AssetClassSubProductType48Code.class, AssetClassSubProductType5Code.class, AssetClassSubProductType6Code.class, AssetClassSubProductType7Code.class, AssetClassSubProductType8Code.class, AssetClassTransactionType1Code.class, AssetFXSubProductType1Code.class, AssetPriceType1Code.class, BenchmarkCurveName2Code.class, BenchmarkCurveName5Choice.class, BenchmarkCurveName6Choice.class, DebtInstrument2 .class, DebtInstrumentSeniorityType1Code.class, DerivativeCommodity2 .class, DerivativeForeignExchange3 .class, DerivativeInstrument5 .class, DerivativeInterest3 .class, EnergyCommodityCoal1 .class, EnergyCommodityDistillates1 .class, EnergyCommodityElectricity1 .class, EnergyCommodityInterEnergy1 .class, EnergyCommodityLightEnd1 .class, EnergyCommodityNaturalGas1 .class, EnergyCommodityOil1 .class, EnergyCommodityRenewableEnergy1 .class, EnvironmentalCommodityCarbonRelated1 .class, EnvironmentalCommodityEmission1 .class, EnvironmentalCommodityWeather1 .class, FertilizerCommodityAmmonia1 .class, FertilizerCommodityDiammoniumPhosphate1 .class, FertilizerCommodityPotash1 .class, FertilizerCommoditySulphur1 .class, FertilizerCommodityUrea1 .class, FertilizerCommodityUreaAndAmmoniumNitrate1 .class, FinancialInstrument48Choice.class, FinancialInstrument53 .class, FinancialInstrument58 .class, FinancialInstrumentIdentification5Choice.class, FinancialInstrumentReportingReferenceDataReportV01 .class, FloatingInterestRate6 .class, FloatingInterestRate8 .class, FreightCommodityContainerShip1 .class, FreightCommodityDry1 .class, FreightCommodityWet1 .class, IndustrialProductCommodityConstruction1 .class, IndustrialProductCommodityManufacturing1 .class, InterestRate6Choice.class, InterestRate8Choice.class, InterestRateContractTerm2 .class, MetalCommodityNonPrecious1 .class, MetalCommodityPrecious1 .class, MxAuth01700101 .class, OptionStyle7Code.class, OptionType2Code.class, OtherC10CommodityDeliverable2 .class, OtherC10CommodityNonDeliverable2 .class, PaperCommodityContainerBoard1 .class, PaperCommodityNewsprint1 .class, PaperCommodityPulp1 .class, PaperCommodityRecoveredPaper1 .class, Period2 .class, Period4Choice.class, PhysicalTransferType4Code.class, PolypropyleneCommodityPlastic1 .class, PriceStatus1Code.class, RateBasis1Code.class, RecordTechnicalData3 .class, SecuritiesMarketReportHeader1 .class, SecuritiesReferenceDataReport5 .class, SecuritiesTransactionPrice1 .class, SecuritiesTransactionPrice2Choice.class, SecuritiesTransactionPrice4Choice.class, SecurityInstrumentDescription9 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradingVenue2Code.class, TradingVenueAttributes1 .class, TradingVenueIdentification1Choice.class, TradingVenueIdentification2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.017.001.01";

    public MxAuth01700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth01700101(final String xml) {
        this();
        MxAuth01700101 tmp = parse(xml);
        finInstrmRptgRefDataRpt = tmp.getFinInstrmRptgRefDataRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth01700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the finInstrmRptgRefDataRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingReferenceDataReportV01 }
     *     
     */
    public FinancialInstrumentReportingReferenceDataReportV01 getFinInstrmRptgRefDataRpt() {
        return finInstrmRptgRefDataRpt;
    }

    /**
     * Sets the value of the finInstrmRptgRefDataRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingReferenceDataReportV01 }
     *     
     */
    public MxAuth01700101 setFinInstrmRptgRefDataRpt(FinancialInstrumentReportingReferenceDataReportV01 value) {
        this.finInstrmRptgRefDataRpt = value;
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
    public static MxAuth01700101 parse(String xml) {
        return ((MxAuth01700101) MxReadImpl.parse(MxAuth01700101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth01700101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth01700101) parserImpl.read(MxAuth01700101 .class, xml, _classes));
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
     * Creates an MxAuth01700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth01700101 message
     * @return
     *     a new instance of MxAuth01700101
     */
    public final static MxAuth01700101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth01700101 .class);
    }

}
