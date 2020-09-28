
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
 * Class for camt.047.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrRsvatn"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.047.001.03")
public class MxCamt04700103
    extends AbstractMX
{

    @XmlElement(name = "RtrRsvatn", required = true)
    protected ReturnReservationV03 rtrRsvatn;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 47;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CurrentAndDefaultReservation1 .class, DateAndDateTimeChoice.class, ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader3 .class, MxCamt04700103 .class, OriginalBusinessQuery1 .class, PostalAddress6 .class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, Reservation1 .class, ReservationIdentification1 .class, ReservationOrError2Choice.class, ReservationOrError3Choice.class, ReservationReport3 .class, ReservationStatus1Choice.class, ReservationStatus1Code.class, ReservationType1Choice.class, ReservationType2Code.class, ReturnReservationV03 .class, SystemIdentification2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.047.001.03";

    public MxCamt04700103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04700103(final String xml) {
        this();
        MxCamt04700103 tmp = parse(xml);
        rtrRsvatn = tmp.getRtrRsvatn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04700103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnReservationV03 }
     *     
     */
    public ReturnReservationV03 getRtrRsvatn() {
        return rtrRsvatn;
    }

    /**
     * Sets the value of the rtrRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnReservationV03 }
     *     
     */
    public MxCamt04700103 setRtrRsvatn(ReturnReservationV03 value) {
        this.rtrRsvatn = value;
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
    public static MxCamt04700103 parse(String xml) {
        return ((MxCamt04700103) MxReadImpl.parse(MxCamt04700103 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04700103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04700103) parserImpl.read(MxCamt04700103 .class, xml, _classes));
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
     * Creates an MxCamt04700103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04700103 message
     * @return
     *     a new instance of MxCamt04700103
     */
    public final static MxCamt04700103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt04700103 .class);
    }

}
