
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
 * Class for semt.042.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesBalTrnsprncyRptStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.042.001.01")
public class MxSemt04200101
    extends AbstractMX
{

    @XmlElement(name = "SctiesBalTrnsprncyRptStsAdvc", required = true)
    protected SecuritiesBalanceTransparencyReportStatusAdviceV01 sctiesBalTrnsprncyRptStsAdvc;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 42;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTimeChoice.class, GenericIdentification30 .class, GenericIdentification36 .class, HoldingAccountLevel1Code.class, HoldingRejectionReason41Code.class, IdentificationSource3Choice.class, MessageIdentification1 .class, MxSemt04200101 .class, NameAndAddress5 .class, NoReasonCode.class, NumberOfItemsPerStatus1 .class, OtherIdentification1 .class, Pagination.class, PartyIdentification100 .class, PartyIdentification71Choice.class, PostalAddress1 .class, ReportItem1 .class, ReportItemRejectionReason1Choice.class, ReportItemStatus1 .class, ReportItemStatus1Choice.class, ReportItemStatus1Code.class, SecuritiesAccount19 .class, SecuritiesBalanceTransparencyReportStatusAdviceV01 .class, SecurityIdentification19 .class, StatementReference1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.042.001.01";

    public MxSemt04200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt04200101(final String xml) {
        this();
        MxSemt04200101 tmp = parse(xml);
        sctiesBalTrnsprncyRptStsAdvc = tmp.getSctiesBalTrnsprncyRptStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt04200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesBalTrnsprncyRptStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceTransparencyReportStatusAdviceV01 }
     *     
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 getSctiesBalTrnsprncyRptStsAdvc() {
        return sctiesBalTrnsprncyRptStsAdvc;
    }

    /**
     * Sets the value of the sctiesBalTrnsprncyRptStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceTransparencyReportStatusAdviceV01 }
     *     
     */
    public MxSemt04200101 setSctiesBalTrnsprncyRptStsAdvc(SecuritiesBalanceTransparencyReportStatusAdviceV01 value) {
        this.sctiesBalTrnsprncyRptStsAdvc = value;
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
    public static MxSemt04200101 parse(String xml) {
        return ((MxSemt04200101) MxReadImpl.parse(MxSemt04200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt04200101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt04200101) parserImpl.read(MxSemt04200101 .class, xml, _classes));
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
     * Creates an MxSemt04200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt04200101 message
     * @return
     *     a new instance of MxSemt04200101
     */
    public final static MxSemt04200101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt04200101 .class);
    }

}
