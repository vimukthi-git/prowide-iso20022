
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
 * Class for tsmt.009.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "tsmt00900102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:tsmt.009.001.02")
public class MxTsmt00900102
    extends AbstractMX
{

    @XmlElement(name = "tsmt.009.001.02", required = true)
    protected Tsmt00900102 tsmt00900102;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountIdentificationAndName2 .class, AccountIdentificationOrNameChoice.class, Adjustment3 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, AirportDescription1 .class, AirportName1Choice.class, BICIdentification1 .class, Baseline2 .class, Charge12 .class, ChargeType8Code.class, ChargesDetails1 .class, CurrencyAndAmount.class, DocumentIdentification1 .class, DocumentIdentification5 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, FreightCharges1Code.class, GenericIdentification4 .class, Incoterms1 .class, Incoterms1Code.class, LineItem5 .class, LineItemDetails4 .class, MessageIdentification1 .class, MultimodalTransport1 .class, MxTsmt00900102 .class, NameAndAddress6 .class, PartyIdentification9 .class, PaymentPeriod1 .class, PaymentTerms1 .class, PaymentTime1Code.class, PercentageTolerance1 .class, PostalAddress2 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity2 .class, RequiredSubmission1 .class, SettlementTerms1 .class, SimpleIdentificationInformation.class, SingleTransport1 .class, Tax13 .class, TaxType9Code.class, TradeFinanceService2Code.class, TransportByAir1 .class, TransportByRail1 .class, TransportByRoad1 .class, TransportBySea1 .class, TransportMeans1Choice.class, Tsmt00900102 .class, UnitPrice8 .class, UserDefinedInformation1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:tsmt.009.001.02";

    public MxTsmt00900102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt00900102(final String xml) {
        this();
        MxTsmt00900102 tmp = parse(xml);
        tsmt00900102 = tmp.getTsmt00900102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt00900102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the tsmt00900102 property.
     * 
     * @return
     *     possible object is
     *     {@link Tsmt00900102 }
     *     
     */
    public Tsmt00900102 getTsmt00900102() {
        return tsmt00900102;
    }

    /**
     * Sets the value of the tsmt00900102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tsmt00900102 }
     *     
     */
    public MxTsmt00900102 setTsmt00900102(Tsmt00900102 value) {
        this.tsmt00900102 = value;
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
    public static MxTsmt00900102 parse(String xml) {
        return ((MxTsmt00900102) MxReadImpl.parse(MxTsmt00900102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt00900102 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt00900102) parserImpl.read(MxTsmt00900102 .class, xml, _classes));
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
     * Creates an MxTsmt00900102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt00900102 message
     * @return
     *     a new instance of MxTsmt00900102
     */
    public final static MxTsmt00900102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTsmt00900102 .class);
    }

}
