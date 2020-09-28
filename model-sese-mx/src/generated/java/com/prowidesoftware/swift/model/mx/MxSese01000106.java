
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
 * Class for sese.010.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfCxlStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.010.001.06")
public class MxSese01000106
    extends AbstractMX
{

    @XmlElement(name = "TrfCxlStsRpt", required = true)
    protected TransferCancellationStatusReportV06 trfCxlStsRpt;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalReference7 .class, AdditionalReference8 .class, AddressType2Code.class, CancellationCompleteReason1Choice.class, CancellationRejectedReason1Code.class, CancellationStatus2Code.class, CancellationStatusAndReason4 .class, CancelledCompleteReason1 .class, CancelledStatusReason1Code.class, Extension1 .class, GenericIdentification1 .class, GenericIdentification36 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01000106 .class, NameAndAddress5 .class, PartyIdentification113 .class, PartyIdentification90Choice.class, PartyIdentification97Choice.class, PostalAddress1 .class, References61Choice.class, RejectedReason17Choice.class, RejectionReason33 .class, Status21Choice.class, TransferCancellationPendingStatus1 .class, TransferCancellationStatus2 .class, TransferCancellationStatusReportV06 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.010.001.06";

    public MxSese01000106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01000106(final String xml) {
        this();
        MxSese01000106 tmp = parse(xml);
        trfCxlStsRpt = tmp.getTrfCxlStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01000106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the trfCxlStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCancellationStatusReportV06 }
     *     
     */
    public TransferCancellationStatusReportV06 getTrfCxlStsRpt() {
        return trfCxlStsRpt;
    }

    /**
     * Sets the value of the trfCxlStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCancellationStatusReportV06 }
     *     
     */
    public MxSese01000106 setTrfCxlStsRpt(TransferCancellationStatusReportV06 value) {
        this.trfCxlStsRpt = value;
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
    public static MxSese01000106 parse(String xml) {
        return ((MxSese01000106) MxReadImpl.parse(MxSese01000106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01000106 parse(String xml, MxRead parserImpl) {
        return ((MxSese01000106) parserImpl.read(MxSese01000106 .class, xml, _classes));
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
     * Creates an MxSese01000106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01000106 message
     * @return
     *     a new instance of MxSese01000106
     */
    public final static MxSese01000106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese01000106 .class);
    }

}
