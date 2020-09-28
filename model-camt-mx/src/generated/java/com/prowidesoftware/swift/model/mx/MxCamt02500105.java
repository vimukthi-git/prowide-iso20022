
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
 * Class for camt.025.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rct"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.025.001.05")
public class MxCamt02500105
    extends AbstractMX
{

    @XmlElement(name = "Rct", required = true)
    protected ReceiptV05 rct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 25;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, LongPaymentIdentification2 .class, MessageHeader9 .class, MxCamt02500105 .class, OriginalMessageAndIssuer1 .class, PaymentIdentification6Choice.class, PaymentInstrument1Code.class, PaymentOrigin1Choice.class, PostalAddress24 .class, QueueTransactionIdentification1 .class, Receipt3 .class, ReceiptV05 .class, RequestHandling1 .class, RequestType4Choice.class, ShortPaymentIdentification2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.025.001.05";

    public MxCamt02500105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02500105(final String xml) {
        this();
        MxCamt02500105 tmp = parse(xml);
        rct = tmp.getRct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02500105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rct property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiptV05 }
     *     
     */
    public ReceiptV05 getRct() {
        return rct;
    }

    /**
     * Sets the value of the rct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiptV05 }
     *     
     */
    public MxCamt02500105 setRct(ReceiptV05 value) {
        this.rct = value;
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
    public static MxCamt02500105 parse(String xml) {
        return ((MxCamt02500105) MxReadImpl.parse(MxCamt02500105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02500105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02500105) parserImpl.read(MxCamt02500105 .class, xml, _classes));
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
     * Creates an MxCamt02500105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02500105 message
     * @return
     *     a new instance of MxCamt02500105
     */
    public final static MxCamt02500105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt02500105 .class);
    }

}
