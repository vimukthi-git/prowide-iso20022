
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
 * Class for camt.004.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00400103"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.004.001.03")
public class MxCamt00400103
    extends AbstractMX
{

    @XmlElement(name = "camt.004.001.03", required = true)
    protected Camt00400103 camt00400103;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AccountReport8 .class, Accounts3 .class, AmountChoice.class, BalanceStatus1Code.class, BalanceType6Code.class, BalanceType7Code.class, BilateralLimitDetails2 .class, Camt00400103 .class, CashAccountDetails3 .class, CashAccountType2Code.class, CashBalanceDetails4 .class, CashBalanceDetails5 .class, ClearingSystemMemberIdentificationChoice.class, CreditDebitCode.class, CurrencyAndAmount.class, DateAndDateTimeChoice.class, DatePeriodDetails1 .class, ErrorHandling2 .class, Frequency2Code.class, LimitDetails.class, MemberIdentificationChoice.class, MessageIdentification.class, MxCamt00400103 .class, QueryReference.class, SimpleIdentificationInformation.class, StandingOrderDetails3 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.004.001.03";

    public MxCamt00400103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00400103(final String xml) {
        this();
        MxCamt00400103 tmp = parse(xml);
        camt00400103 = tmp.getCamt00400103();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00400103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00400103 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00400103 }
     *     
     */
    public Camt00400103 getCamt00400103() {
        return camt00400103;
    }

    /**
     * Sets the value of the camt00400103 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00400103 }
     *     
     */
    public MxCamt00400103 setCamt00400103(Camt00400103 value) {
        this.camt00400103 = value;
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
    public static MxCamt00400103 parse(String xml) {
        return ((MxCamt00400103) MxReadImpl.parse(MxCamt00400103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00400103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00400103) parserImpl.read(MxCamt00400103 .class, xml, _classes));
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
     * Creates an MxCamt00400103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00400103 message
     * @return
     *     a new instance of MxCamt00400103
     */
    public final static MxCamt00400103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt00400103 .class);
    }

}
