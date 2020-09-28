
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
 * Class for caaa.017.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCcyConvsRspn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.017.001.06")
public class MxCaaa01700106
    extends AbstractMX
{

    @XmlElement(name = "AccptrCcyConvsRspn", required = true)
    protected AcceptorCurrencyConversionResponseV06 accptrCcyConvsRspn;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 17;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCurrencyConversionResponse6 .class, AcceptorCurrencyConversionResponseV06 .class, ActionMessage5 .class, AggregationTransaction2 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData5 .class, BytePadding1Code.class, CardAccountType3Code.class, CardDataReading5Code.class, CardPaymentEnvironment69 .class, CardPaymentToken4 .class, CardPaymentTransaction88 .class, CardPaymentTransactionDetails47 .class, CardProductType1Code.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, ContentInformationType16 .class, ContentInformationType17 .class, ContentInformationType19 .class, ContentType2Code.class, CurrencyAndAmount.class, CurrencyConversion14 .class, CurrencyConversion15 .class, CurrencyConversion16 .class, CurrencyConversionResponse3Code.class, CurrencyDetails2 .class, CurrencyDetails3 .class, DetailedAmount14 .class, DetailedAmount15 .class, DetailedAmount4 .class, DigestedData5 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, Frequency3Code.class, GenericIdentification32 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification94 .class, GenericInformation1 .class, Header35 .class, IndustryData1 .class, InstalmentPlan1Code.class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, MessageFunction14Code.class, MxCaaa01700106 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineReason1Code.class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputFormat1Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyType3Code.class, PartyType4Code.class, PaymentCard28 .class, PaymentTokenIdentifiers1 .class, PlainCardData15 .class, Product6 .class, Recipient5Choice.class, Recipient6Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, SignedData5 .class, Signer4 .class, Traceability5 .class, TransactionIdentifier1 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.017.001.06";

    public MxCaaa01700106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01700106(final String xml) {
        this();
        MxCaaa01700106 tmp = parse(xml);
        accptrCcyConvsRspn = tmp.getAccptrCcyConvsRspn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01700106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCcyConvsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCurrencyConversionResponseV06 }
     *     
     */
    public AcceptorCurrencyConversionResponseV06 getAccptrCcyConvsRspn() {
        return accptrCcyConvsRspn;
    }

    /**
     * Sets the value of the accptrCcyConvsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCurrencyConversionResponseV06 }
     *     
     */
    public MxCaaa01700106 setAccptrCcyConvsRspn(AcceptorCurrencyConversionResponseV06 value) {
        this.accptrCcyConvsRspn = value;
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
    public static MxCaaa01700106 parse(String xml) {
        return ((MxCaaa01700106) MxReadImpl.parse(MxCaaa01700106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01700106 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01700106) parserImpl.read(MxCaaa01700106 .class, xml, _classes));
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
     * Creates an MxCaaa01700106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01700106 message
     * @return
     *     a new instance of MxCaaa01700106
     */
    public final static MxCaaa01700106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa01700106 .class);
    }

}
