
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
 * Class for semt.018.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.018.002.02")
public class MxSemt01800202
    extends AbstractMX
{

    @XmlElement(name = "SctiesTxPdgRpt", required = true)
    protected SecuritiesTransactionPendingReportV02Subset sctiesTxPdgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus6Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason6 .class, AcknowledgementReason8Choice.class, AmountAndDirection12 .class, BeneficialOwnership2Choice.class, BlockTrade1Code.class, BlockTrade2Choice.class, CancellationReason4 .class, CancellationReason8Choice.class, CancellationStatus6Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem2Choice.class, CashSettlementSystem2Code.class, CentralCounterPartyEligibility2Choice.class, CorporateActionEventType2Choice.class, CorporateActionEventType3Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FailingReason1Code.class, FailingReason2 .class, FailingReason2Choice.class, FailingStatus2Choice.class, FinancialInstrumentQuantity15Choice.class, Frequency6Choice.class, GeneratedReason2 .class, GeneratedReason2Code.class, GeneratedReasons2Choice.class, GeneratedStatus2Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, GenericIdentification34 .class, HoldIndicator3 .class, IdentificationSource4Choice.class, InstructionProcessingStatus6Choice.class, LetterOfGuarantee2Choice.class, MarketClientSide2Choice.class, MarketClientSideCode.class, MarketIdentification2Choice.class, MarketIdentification8 .class, MarketType2Code.class, MarketType6Choice.class, MatchingStatus6Choice.class, MxSemt01800202 .class, NameAndAddress12 .class, NettingEligibility2Choice.class, NoReasonCode.class, NoSpecifiedReason1 .class, Number3Choice.class, OriginalAndCurrentQuantities4 .class, OtherIdentification2 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification51Choice.class, PartyIdentification53 .class, PartyIdentification58Choice.class, PartyIdentification65Choice.class, PartyIdentificationAndAccount75 .class, PendingProcessingReason1Code.class, PendingProcessingReason2 .class, PendingProcessingReason2Choice.class, PendingProcessingStatus2Choice.class, PendingReason10Choice.class, PendingReason1Code.class, PendingReason3 .class, PendingReason4 .class, PendingReason6Code.class, PendingReason9Choice.class, PendingStatus7Choice.class, PendingStatus8Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, Quantity10Choice.class, ReceiveDelivery1Code.class, Registration1Code.class, Registration2Choice.class, Registration2Code.class, Registration4Choice.class, RegistrationReason2 .class, RepairReason2 .class, RepairReason4Code.class, RepairReason6Choice.class, RepairStatus2Choice.class, RepurchaseType3Code.class, RepurchaseType6Choice.class, RestrictedFINActiveCurrencyAndAmount.class, RestrictedFINActiveOrHistoricCurrencyAndAmount.class, Restriction2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat4Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText4 .class, SecuritiesAccount17 .class, SecuritiesRTGS2Choice.class, SecuritiesTransactionPendingReportV02Subset.class, SecuritiesTransactionType3Code.class, SecuritiesTransactionType5Choice.class, SecurityIdentification15 .class, SettlementDate6Choice.class, SettlementDateCode4Choice.class, SettlementDetails38 .class, SettlementOrCorporateActionEvent3Choice.class, SettlementParties21 .class, SettlementStatus4Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod2Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlementTransactionCondition9Choice.class, SettlingCapacity1Code.class, SettlingCapacity2Choice.class, Statement26 .class, StatementStructure1Code.class, StatementUpdateType1Code.class, Status4Choice.class, StatusAndReason5 .class, StatusAndReason8 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty2Choice.class, TaxLiability1Code.class, TradeDate2Choice.class, TradeDateCode2Choice.class, Transaction15 .class, Transaction16 .class, TransactionActivity1Code.class, TransactionActivity2Choice.class, TransactionDetails27 .class, TransactionDetails33 .class, UnmatchedReason2Code.class, UnmatchedReason4 .class, UnmatchedReason6Choice.class, UnmatchedStatus4Choice.class, UpdateType3Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.018.002.02";

    public MxSemt01800202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01800202(final String xml) {
        this();
        MxSemt01800202 tmp = parse(xml);
        sctiesTxPdgRpt = tmp.getSctiesTxPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01800202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPendingReportV02Subset }
     *     
     */
    public SecuritiesTransactionPendingReportV02Subset getSctiesTxPdgRpt() {
        return sctiesTxPdgRpt;
    }

    /**
     * Sets the value of the sctiesTxPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPendingReportV02Subset }
     *     
     */
    public MxSemt01800202 setSctiesTxPdgRpt(SecuritiesTransactionPendingReportV02Subset value) {
        this.sctiesTxPdgRpt = value;
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
    public static MxSemt01800202 parse(String xml) {
        return ((MxSemt01800202) MxReadImpl.parse(MxSemt01800202 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01800202 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01800202) parserImpl.read(MxSemt01800202 .class, xml, _classes));
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
     * Creates an MxSemt01800202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01800202 message
     * @return
     *     a new instance of MxSemt01800202
     */
    public final static MxSemt01800202 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt01800202 .class);
    }

}
