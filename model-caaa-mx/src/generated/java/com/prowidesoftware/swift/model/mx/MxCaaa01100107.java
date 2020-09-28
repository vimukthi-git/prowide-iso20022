
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
 * Class for caaa.011.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.07")
public class MxCaaa01100107
    extends AbstractMX
{

    @XmlElement(name = "AccptrBtchTrf", required = true)
    protected AcceptorBatchTransferV07 accptrBtchTrf;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorBatchTransferV07 .class, AccountChoiceMethod1Code.class, AccountIdentification39Choice.class, AccountingAccount1 .class, Acquirer4 .class, Acquirer5 .class, Action8 .class, ActionMessage2 .class, ActionMessage5 .class, ActionType7Code.class, AdditionalInformation1 .class, AdditionalInformation6 .class, AddressType2Code.class, AddressVerification1 .class, Adjustment6 .class, AdjustmentDirection1Code.class, AdjustmentType1Choice.class, AdjustmentType2Code.class, AggregationTransaction2 .class, Algorithm11Code.class, Algorithm16Code.class, Algorithm17Code.class, Algorithm18Code.class, Algorithm19Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification12 .class, AlgorithmIdentification18 .class, AlgorithmIdentification19 .class, AlgorithmIdentification20 .class, AlgorithmIdentification21 .class, AlgorithmIdentification22 .class, AlgorithmIdentification23 .class, AlgorithmIdentification24 .class, AmountAndDirection93 .class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData5 .class, AuthenticationEntity2Code.class, AuthenticationMethod5Code.class, AuthenticationMethod6Code.class, AuthenticationResult1Code.class, AuthorisationResult10 .class, AuthorisationResult11 .class, AuthorisationResult12 .class, BinaryFile1 .class, BytePadding1Code.class, CardAccount14 .class, CardAccountType3Code.class, CardDataReading5Code.class, CardDirectDebit1 .class, CardFallback1Code.class, CardPaymentBatchTransfer6 .class, CardPaymentContext24 .class, CardPaymentContext26 .class, CardPaymentDataSet19 .class, CardPaymentDataSetTransaction22 .class, CardPaymentDataSetTransaction23 .class, CardPaymentDataSetTransaction24 .class, CardPaymentDataSetTransaction25 .class, CardPaymentDataSetTransaction6Choice.class, CardPaymentEnvironment68 .class, CardPaymentEnvironment69 .class, CardPaymentEnvironment70 .class, CardPaymentInvoice3 .class, CardPaymentServiceType12Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType9Code.class, CardPaymentToken4 .class, CardPaymentTransaction78 .class, CardPaymentTransaction79 .class, CardPaymentTransaction80 .class, CardPaymentTransaction81 .class, CardPaymentTransaction83 .class, CardPaymentTransaction84 .class, CardPaymentTransactionDetails32 .class, CardPaymentTransactionDetails34 .class, CardPaymentTransactionDetails44 .class, CardPaymentTransactionDetails45 .class, CardPaymentTransactionResult3 .class, CardProductType1Code.class, Cardholder13 .class, CardholderAuthentication11 .class, CardholderVerificationCapability4Code.class, CashAccountIdentification7Choice.class, CertificateIssuer1 .class, ChargeType17Code.class, ChargeType8Code.class, ChargeTypeFormat3Choice.class, ChargesDetails4 .class, ChargesType1Choice.class, Commission18 .class, Commission19 .class, CommonData7 .class, CommunicationAddress9 .class, CommunicationCharacteristics3 .class, Consignment5 .class, Contacts3 .class, ContentInformationType16 .class, ContentInformationType17 .class, ContentInformationType19 .class, ContentType2Code.class, CountryCodeAndName1 .class, Creditor3 .class, CryptographicKey13 .class, CryptographicKeyType3Code.class, CurrencyAndAmount.class, CurrencyConversion14 .class, CurrencyConversion15 .class, CurrencyDetails2 .class, CurrencyDetails3 .class, CustomerDevice1 .class, DataSetCategory8Code.class, DataSetIdentification5 .class, DateAndDateTime1Choice.class, DateAndPlaceOfBirth1 .class, DateFormat56Choice.class, DateType6Code.class, Debtor3 .class, DetailedAmount14 .class, DetailedAmount15 .class, DetailedAmount4 .class, DigestedData5 .class, DiscountOrChargeType1Choice.class, DiscountType1Code.class, DiscountTypeFormat1Choice.class, DisplayCapabilities4 .class, DocumentGeneralInformation2 .class, DocumentIdentification22 .class, DocumentIdentification23 .class, EncapsulatedContent3 .class, EncryptedContent4 .class, EncryptionFormat2Code.class, EnvelopedData5 .class, FailureReason3Code.class, Frequency3Code.class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification32 .class, GenericIdentification36 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification90 .class, GenericIdentification94 .class, GenericInformation1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Header25 .class, Incoterms3 .class, Incoterms4Choice.class, InformationType1Choice.class, InformationType1Code.class, InstalmentPlan1Code.class, InvoiceHeader3 .class, IssuerAndSerialNumber1 .class, KEK5 .class, KEKIdentifier2 .class, KeyTransport5 .class, KeyUsage1Code.class, LegalOrganisation1 .class, LineItem17 .class, LineItemAllowanceCharge3 .class, LineItemMonetarySummation1 .class, LineItemTax1 .class, LocationCategory1Code.class, LocationCategory3Code.class, MandateRelatedInformation13 .class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MxCaaa01100107 .class, NameAndAddress3 .class, NameAndAddress6 .class, NamePrefix1Code.class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN6 .class, OnLineReason1Code.class, Organisation26 .class, Organisation32 .class, Organisation9 .class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalAmountDetails1 .class, OriginatorInformation1 .class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType2Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType5Code.class, Packaging1 .class, Parameter10 .class, Parameter11 .class, Parameter12 .class, Parameter5 .class, Parameter7 .class, Parameter9 .class, Party36Choice.class, PartyIdentification100Choice.class, PartyIdentification129 .class, PartyIdentification72Choice.class, PartyType14Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard28 .class, PaymentContext24 .class, PaymentTokenIdentifiers1 .class, Period14 .class, PersonIdentification14 .class, PersonIdentification15 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData15 .class, PlainCardData17 .class, PointOfInteraction8 .class, PointOfInteractionCapabilities6 .class, PointOfInteractionComponent8 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics4 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress1 .class, PostalAddress2 .class, PostalAddress22 .class, PostalAddress6 .class, Product3 .class, Product4 .class, Product5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductCharacteristics4 .class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity16 .class, Recipient5Choice.class, Recipient6Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, SaleContext2 .class, SignedData5 .class, Signer4 .class, SimpleIdentificationInformation4 .class, SupportedPaymentOption1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TaxType15Code.class, TaxTypeFormat1Choice.class, Traceability5 .class, TradeAgreement16 .class, TradeDelivery3 .class, TradeParty4 .class, TradeProduct3 .class, TransactionChannel5Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionTotals7 .class, TransactionVerificationResult4 .class, TransportMeans3 .class, TypeOfAmount8Code.class, TypeTransactionTotals2Code.class, UnitOfMeasure6Choice.class, UnitOfMeasure6Code.class, UnitOfMeasure9Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.07";

    public MxCaaa01100107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01100107(final String xml) {
        this();
        MxCaaa01100107 tmp = parse(xml);
        accptrBtchTrf = tmp.getAccptrBtchTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01100107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferV07 }
     *     
     */
    public AcceptorBatchTransferV07 getAccptrBtchTrf() {
        return accptrBtchTrf;
    }

    /**
     * Sets the value of the accptrBtchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferV07 }
     *     
     */
    public MxCaaa01100107 setAccptrBtchTrf(AcceptorBatchTransferV07 value) {
        this.accptrBtchTrf = value;
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
    public static MxCaaa01100107 parse(String xml) {
        return ((MxCaaa01100107) MxReadImpl.parse(MxCaaa01100107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01100107 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01100107) parserImpl.read(MxCaaa01100107 .class, xml, _classes));
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
     * Creates an MxCaaa01100107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01100107 message
     * @return
     *     a new instance of MxCaaa01100107
     */
    public final static MxCaaa01100107 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa01100107 .class);
    }

}
