
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
 * Class for caaa.003.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCmpltnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.003.001.08")
public class MxCaaa00300108
    extends AbstractMX
{

    @XmlElement(name = "AccptrCmpltnAdvc", required = true)
    protected AcceptorCompletionAdviceV08 accptrCmpltnAdvc;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCompletionAdvice8 .class, AcceptorCompletionAdviceV08 .class, AccountChoiceMethod1Code.class, AccountIdentification39Choice.class, Acquirer4 .class, ActionMessage5 .class, AddressType2Code.class, AddressVerification1 .class, AggregationTransaction2 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationEntity2Code.class, AuthenticationMethod5Code.class, AuthenticationMethod6Code.class, AuthenticationResult1Code.class, AuthorisationResult11 .class, BytePadding1Code.class, CardAccount15 .class, CardAccountType3Code.class, CardDataReading5Code.class, CardDataReading6Code.class, CardDirectDebit2 .class, CardFallback1Code.class, CardPaymentContext27 .class, CardPaymentEnvironment68 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType9Code.class, CardPaymentToken4 .class, CardPaymentTransaction79 .class, CardPaymentTransaction89 .class, CardPaymentTransactionDetails47 .class, CardPaymentTransactionResult3 .class, CardProductType1Code.class, Cardholder13 .class, CardholderAuthentication11 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, Commission18 .class, Commission19 .class, CommunicationAddress9 .class, CommunicationCharacteristics3 .class, ContentInformationType16 .class, ContentInformationType17 .class, ContentInformationType19 .class, ContentType2Code.class, Creditor4 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion14 .class, CurrencyConversion15 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice1 .class, DateAndPlaceOfBirth1 .class, Debtor4 .class, DetailedAmount14 .class, DetailedAmount15 .class, DetailedAmount4 .class, DigestedData5 .class, DisplayCapabilities4 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, FailureReason3Code.class, Frequency3Code.class, GenericIdentification1 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification90 .class, GenericIdentification94 .class, GenericInformation1 .class, Header36 .class, IndustryData1 .class, InstalmentPlan1Code.class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LocationCategory1Code.class, LocationCategory3Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction14Code.class, MxCaaa00300108 .class, NameAndAddress3 .class, NameAndAddress6 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN6 .class, OnLineReason1Code.class, Organisation26 .class, Organisation32 .class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, PartyIdentification177Choice.class, PartyIdentification178Choice.class, PartyType14Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard28 .class, PaymentContext26 .class, PaymentTokenIdentifiers1 .class, PersonIdentification15 .class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction8 .class, PointOfInteractionCapabilities6 .class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress22 .class, Product6 .class, Recipient5Choice.class, Recipient6Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, SaleContext3 .class, SaleTokenScope1Code.class, SignedData5 .class, Signer4 .class, SimpleIdentificationInformation4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SupportedPaymentOption1Code.class, Traceability5 .class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult4 .class, TypeOfAmount8Code.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.003.001.08";

    public MxCaaa00300108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00300108(final String xml) {
        this();
        MxCaaa00300108 tmp = parse(xml);
        accptrCmpltnAdvc = tmp.getAccptrCmpltnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00300108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceV08 }
     *     
     */
    public AcceptorCompletionAdviceV08 getAccptrCmpltnAdvc() {
        return accptrCmpltnAdvc;
    }

    /**
     * Sets the value of the accptrCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceV08 }
     *     
     */
    public MxCaaa00300108 setAccptrCmpltnAdvc(AcceptorCompletionAdviceV08 value) {
        this.accptrCmpltnAdvc = value;
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
    public static MxCaaa00300108 parse(String xml) {
        return ((MxCaaa00300108) MxReadImpl.parse(MxCaaa00300108 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00300108 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00300108) parserImpl.read(MxCaaa00300108 .class, xml, _classes));
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
     * Creates an MxCaaa00300108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00300108 message
     * @return
     *     a new instance of MxCaaa00300108
     */
    public final static MxCaaa00300108 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa00300108 .class);
    }

}
