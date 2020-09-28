
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
 * Class for trea.002.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "amdNDFOpngV02"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.002.001.02")
public class MxTrea00200102
    extends AbstractMX
{

    @XmlElement(name = "AmdNDFOpngV02", required = true)
    protected AmendNonDeliverableForwardOpeningV02 amdNDFOpngV02;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmendNonDeliverableForwardOpeningV02 .class, AmountsAndValueDate1 .class, FundIdentification2 .class, MxTrea00200102 .class, NameAndAddress8 .class, NonDeliverableForwardValuationConditions2 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, TradeAgreement2 .class, TradePartyIdentification3 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.002.001.02";

    public MxTrea00200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea00200102(final String xml) {
        this();
        MxTrea00200102 tmp = parse(xml);
        amdNDFOpngV02 = tmp.getAmdNDFOpngV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea00200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the amdNDFOpngV02 property.
     * 
     * @return
     *     possible object is
     *     {@link AmendNonDeliverableForwardOpeningV02 }
     *     
     */
    public AmendNonDeliverableForwardOpeningV02 getAmdNDFOpngV02() {
        return amdNDFOpngV02;
    }

    /**
     * Sets the value of the amdNDFOpngV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendNonDeliverableForwardOpeningV02 }
     *     
     */
    public MxTrea00200102 setAmdNDFOpngV02(AmendNonDeliverableForwardOpeningV02 value) {
        this.amdNDFOpngV02 = value;
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
    public static MxTrea00200102 parse(String xml) {
        return ((MxTrea00200102) MxReadImpl.parse(MxTrea00200102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea00200102 parse(String xml, MxRead parserImpl) {
        return ((MxTrea00200102) parserImpl.read(MxTrea00200102 .class, xml, _classes));
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
     * Creates an MxTrea00200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea00200102 message
     * @return
     *     a new instance of MxTrea00200102
     */
    public final static MxTrea00200102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTrea00200102 .class);
    }

}
