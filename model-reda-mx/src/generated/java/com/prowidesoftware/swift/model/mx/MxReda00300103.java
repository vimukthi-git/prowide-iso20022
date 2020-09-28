
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
 * Class for reda.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pricRptCrrctnV03"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:reda.003.001.03")
public class MxReda00300103
    extends AbstractMX
{

    @XmlElement(name = "PricRptCrrctnV03", required = true)
    protected PriceReportCorrectionV03 pricRptCrrctnV03;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CalculationBasis2Code.class, Charge15 .class, ChargeType9Code.class, DateAndDateTimeChoice.class, DateOrDateTimePeriodChoice.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUDividendStatus1Code.class, EventFrequency1Code.class, Extension1 .class, FinancialInstrument8 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, MessageIdentification1 .class, MxReda00300103 .class, NameAndAddress5 .class, Pagination.class, PartyIdentification2Choice.class, PerformanceFactors1 .class, PostalAddress1 .class, PriceCorrection3 .class, PriceMethod1Code.class, PriceReportCorrectionV03 .class, PriceType2 .class, PriceValuation3 .class, PriceValue1 .class, PriceValue5 .class, PriceValueChange1 .class, SecurityIdentification3Choice.class, StatisticsByPredefinedTimePeriods2 .class, StatisticsByUserDefinedTimePeriod2 .class, Tax17 .class, TaxCalculationInformation4 .class, TaxType12Code.class, TaxableIncomePerShareCalculated2Code.class, TypeOfPrice6Code.class, TypeOfPrice9Code.class, UnitPrice15 .class, ValuationStatistics3 .class, ValuationTiming1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:reda.003.001.03";

    public MxReda00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00300103(final String xml) {
        this();
        MxReda00300103 tmp = parse(xml);
        pricRptCrrctnV03 = tmp.getPricRptCrrctnV03();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pricRptCrrctnV03 property.
     * 
     * @return
     *     possible object is
     *     {@link PriceReportCorrectionV03 }
     *     
     */
    public PriceReportCorrectionV03 getPricRptCrrctnV03() {
        return pricRptCrrctnV03;
    }

    /**
     * Sets the value of the pricRptCrrctnV03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceReportCorrectionV03 }
     *     
     */
    public MxReda00300103 setPricRptCrrctnV03(PriceReportCorrectionV03 value) {
        this.pricRptCrrctnV03 = value;
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
    public static MxReda00300103 parse(String xml) {
        return ((MxReda00300103) MxReadImpl.parse(MxReda00300103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00300103 parse(String xml, MxRead parserImpl) {
        return ((MxReda00300103) parserImpl.read(MxReda00300103 .class, xml, _classes));
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
     * Creates an MxReda00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00300103 message
     * @return
     *     a new instance of MxReda00300103
     */
    public final static MxReda00300103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxReda00300103 .class);
    }

}
