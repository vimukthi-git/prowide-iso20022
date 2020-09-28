
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
 * Class for caam.002.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "atmDvcCtrl"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caam.002.001.01")
public class MxCaam00200101
    extends AbstractMX
{

    @XmlElement(name = "ATMDvcCtrl", required = true)
    protected ATMDeviceControlV01 atmDvcCtrl;
    public final static transient String BUSINESS_PROCESS = "caam";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ATMCommand2Code.class, ATMCommand4 .class, ATMCommandIdentification1 .class, ATMCommandParameters1 .class, ATMCommandParameters2Choice.class, ATMCommandReason1Code.class, ATMConfigurationParameter1 .class, ATMConfigurationParameter2 .class, ATMDeviceControl1 .class, ATMDeviceControlV01 .class, ATMEnvironment7 .class, ATMMessageFunction1 .class, ATMSecurityConfiguration1 .class, ATMSecurityConfiguration2 .class, ATMSecurityConfiguration3 .class, ATMSecurityConfiguration4 .class, ATMSecurityConfiguration5 .class, ATMSecurityScheme2Code.class, ATMStatus1Code.class, ATMStatus2Code.class, Acquirer7 .class, Acquirer8 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttributeType1Code.class, AuthenticatedData4 .class, AutomatedTellerMachine3 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType10 .class, ContentInformationType13 .class, ContentType2Code.class, CryptographicKeyType4Code.class, DataSetCategory7Code.class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, GenericIdentification77 .class, GeographicCoordinates1 .class, GeographicLocation1Choice.class, Header20 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KEKIdentifier4 .class, KeyTransport4 .class, MessageFunction7Code.class, MessageFunction8Code.class, MessageProtection1Code.class, MxCaam00200101 .class, PINFormat4Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType12Code.class, PostalAddress17 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, SignedData4 .class, Signer3 .class, TMSContactLevel2Code.class, TerminalHosting1 .class, Traceability4 .class, TransactionEnvironment3Code.class, UTMCoordinates1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caam.002.001.01";

    public MxCaam00200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaam00200101(final String xml) {
        this();
        MxCaam00200101 tmp = parse(xml);
        atmDvcCtrl = tmp.getATMDvcCtrl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaam00200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the atmDvcCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDeviceControlV01 }
     *     
     */
    public ATMDeviceControlV01 getATMDvcCtrl() {
        return atmDvcCtrl;
    }

    /**
     * Sets the value of the atmDvcCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDeviceControlV01 }
     *     
     */
    public MxCaam00200101 setATMDvcCtrl(ATMDeviceControlV01 value) {
        this.atmDvcCtrl = value;
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
    public static MxCaam00200101 parse(String xml) {
        return ((MxCaam00200101) MxReadImpl.parse(MxCaam00200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaam00200101 parse(String xml, MxRead parserImpl) {
        return ((MxCaam00200101) parserImpl.read(MxCaam00200101 .class, xml, _classes));
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
     * Creates an MxCaam00200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaam00200101 message
     * @return
     *     a new instance of MxCaam00200101
     */
    public final static MxCaam00200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCaam00200101 .class);
    }

}
