
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
 * Class for caaa.007.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.04")
public class MxCaaa00700104
    extends AbstractMX
{

    @XmlElement(name = "AccptrCxlAdvc", required = true)
    protected AcceptorCancellationAdviceV04 accptrCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCancellationAdvice4 .class, AcceptorCancellationAdviceV04 .class, Acquirer4 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData4 .class, AuthorisationResult5 .class, BytePadding1Code.class, CardDataReading1Code.class, CardFallback1Code.class, CardPaymentContext11 .class, CardPaymentEnvironment36 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType6Code.class, CardPaymentToken3 .class, CardPaymentTransaction37 .class, CardPaymentTransaction44 .class, CardPaymentTransactionDetails7 .class, CardPaymentTransactionResult2 .class, CardProductType1Code.class, CardholderVerificationCapability1Code.class, CertificateIssuer1 .class, CommunicationCharacteristics2 .class, ContentInformationType10 .class, ContentInformationType11 .class, ContentType2Code.class, CustomerDevice1 .class, DisplayCapabilities2 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason3Code.class, GenericIdentification32 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification70 .class, GenericIdentification76 .class, Header11 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa00700104 .class, OnLineCapability1Code.class, Organisation8 .class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard11 .class, PaymentContext11 .class, PaymentTokenIdentifiers1 .class, PlainCardData9 .class, PointOfInteraction4 .class, PointOfInteractionCapabilities3 .class, PointOfInteractionComponent5 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus2 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, Traceability2 .class, TrackData1 .class, TransactionChannel3Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.007.001.04";

    public MxCaaa00700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00700104(final String xml) {
        this();
        MxCaaa00700104 tmp = parse(xml);
        accptrCxlAdvc = tmp.getAccptrCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceV04 }
     *     
     */
    public AcceptorCancellationAdviceV04 getAccptrCxlAdvc() {
        return accptrCxlAdvc;
    }

    /**
     * Sets the value of the accptrCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceV04 }
     *     
     */
    public MxCaaa00700104 setAccptrCxlAdvc(AcceptorCancellationAdviceV04 value) {
        this.accptrCxlAdvc = value;
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
    public static MxCaaa00700104 parse(String xml) {
        return ((MxCaaa00700104) MxReadImpl.parse(MxCaaa00700104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00700104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00700104) parserImpl.read(MxCaaa00700104 .class, xml, _classes));
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
     * Creates an MxCaaa00700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00700104 message
     * @return
     *     a new instance of MxCaaa00700104
     */
    public final static MxCaaa00700104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaaa00700104 .class);
    }

}
