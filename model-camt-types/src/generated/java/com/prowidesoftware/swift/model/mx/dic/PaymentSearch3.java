
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria used to search for a payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSearch3", propOrder = {
    "txRef",
    "trfValDt",
    "instrRef",
    "instrSts",
    "instdAmt",
    "instdAmtCcy",
    "cdtDbtInd",
    "intrBkSttlmAmt",
    "intrBkSttlmAmtCcy",
    "pmtMtd",
    "prty",
    "prcgVldtyTm",
    "instr",
    "pmtTp",
    "pmtInstrRef",
    "intrBkValDt",
    "rltdRef",
    "pmtTxPty"
})
public class PaymentSearch3 {

    @XmlElement(name = "TxRef")
    protected List<String> txRef;
    @XmlElement(name = "TrfValDt")
    protected List<DateAndDateTimeSearchChoice> trfValDt;
    @XmlElement(name = "InstrRef")
    protected List<PaymentIdentification3Choice> instrRef;
    @XmlElement(name = "InstrSts")
    protected List<InstructionStatusSearch3> instrSts;
    @XmlElement(name = "InstdAmt")
    protected List<AmountRangeChoice> instdAmt;
    @XmlElement(name = "InstdAmtCcy")
    protected List<String> instdAmtCcy;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "IntrBkSttlmAmt")
    protected List<AmountRangeChoice> intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmAmtCcy")
    protected List<String> intrBkSttlmAmtCcy;
    @XmlElement(name = "PmtMtd")
    protected List<PaymentOrigin1Choice> pmtMtd;
    @XmlElement(name = "Prty")
    protected List<PriorityCodeChoice> prty;
    @XmlElement(name = "PrcgVldtyTm")
    protected List<DateTimePeriodChoice> prcgVldtyTm;
    @XmlElement(name = "Instr")
    @XmlSchemaType(name = "string")
    protected List<Instruction1Code> instr;
    @XmlElement(name = "PmtTp")
    protected List<PaymentType2Choice> pmtTp;
    @XmlElement(name = "PmtInstrRef")
    protected List<String> pmtInstrRef;
    @XmlElement(name = "IntrBkValDt")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> intrBkValDt;
    @XmlElement(name = "RltdRef")
    protected List<String> rltdRef;
    @XmlElement(name = "PmtTxPty")
    protected PaymentTransactionParty pmtTxPty;

    /**
     * Gets the value of the txRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxRef() {
        if (txRef == null) {
            txRef = new ArrayList<String>();
        }
        return this.txRef;
    }

    /**
     * Gets the value of the trfValDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trfValDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateAndDateTimeSearchChoice }
     * 
     * 
     */
    public List<DateAndDateTimeSearchChoice> getTrfValDt() {
        if (trfValDt == null) {
            trfValDt = new ArrayList<DateAndDateTimeSearchChoice>();
        }
        return this.trfValDt;
    }

    /**
     * Gets the value of the instrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentIdentification3Choice }
     * 
     * 
     */
    public List<PaymentIdentification3Choice> getInstrRef() {
        if (instrRef == null) {
            instrRef = new ArrayList<PaymentIdentification3Choice>();
        }
        return this.instrRef;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionStatusSearch3 }
     * 
     * 
     */
    public List<InstructionStatusSearch3> getInstrSts() {
        if (instrSts == null) {
            instrSts = new ArrayList<InstructionStatusSearch3>();
        }
        return this.instrSts;
    }

    /**
     * Gets the value of the instdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountRangeChoice }
     * 
     * 
     */
    public List<AmountRangeChoice> getInstdAmt() {
        if (instdAmt == null) {
            instdAmt = new ArrayList<AmountRangeChoice>();
        }
        return this.instdAmt;
    }

    /**
     * Gets the value of the instdAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instdAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInstdAmtCcy() {
        if (instdAmtCcy == null) {
            instdAmtCcy = new ArrayList<String>();
        }
        return this.instdAmtCcy;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public PaymentSearch3 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkSttlmAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountRangeChoice }
     * 
     * 
     */
    public List<AmountRangeChoice> getIntrBkSttlmAmt() {
        if (intrBkSttlmAmt == null) {
            intrBkSttlmAmt = new ArrayList<AmountRangeChoice>();
        }
        return this.intrBkSttlmAmt;
    }

    /**
     * Gets the value of the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkSttlmAmtCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkSttlmAmtCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIntrBkSttlmAmtCcy() {
        if (intrBkSttlmAmtCcy == null) {
            intrBkSttlmAmtCcy = new ArrayList<String>();
        }
        return this.intrBkSttlmAmtCcy;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtMtd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtMtd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentOrigin1Choice }
     * 
     * 
     */
    public List<PaymentOrigin1Choice> getPmtMtd() {
        if (pmtMtd == null) {
            pmtMtd = new ArrayList<PaymentOrigin1Choice>();
        }
        return this.pmtMtd;
    }

    /**
     * Gets the value of the prty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityCodeChoice }
     * 
     * 
     */
    public List<PriorityCodeChoice> getPrty() {
        if (prty == null) {
            prty = new ArrayList<PriorityCodeChoice>();
        }
        return this.prty;
    }

    /**
     * Gets the value of the prcgVldtyTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prcgVldtyTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgVldtyTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePeriodChoice }
     * 
     * 
     */
    public List<DateTimePeriodChoice> getPrcgVldtyTm() {
        if (prcgVldtyTm == null) {
            prcgVldtyTm = new ArrayList<DateTimePeriodChoice>();
        }
        return this.prcgVldtyTm;
    }

    /**
     * Gets the value of the instr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instruction1Code }
     * 
     * 
     */
    public List<Instruction1Code> getInstr() {
        if (instr == null) {
            instr = new ArrayList<Instruction1Code>();
        }
        return this.instr;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType2Choice }
     * 
     * 
     */
    public List<PaymentType2Choice> getPmtTp() {
        if (pmtTp == null) {
            pmtTp = new ArrayList<PaymentType2Choice>();
        }
        return this.pmtTp;
    }

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInstrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPmtInstrRef() {
        if (pmtInstrRef == null) {
            pmtInstrRef = new ArrayList<String>();
        }
        return this.pmtInstrRef;
    }

    /**
     * Gets the value of the intrBkValDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrBkValDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrBkValDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getIntrBkValDt() {
        if (intrBkValDt == null) {
            intrBkValDt = new ArrayList<XMLGregorianCalendar>();
        }
        return this.intrBkValDt;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<String>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the pmtTxPty property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionParty }
     *     
     */
    public PaymentTransactionParty getPmtTxPty() {
        return pmtTxPty;
    }

    /**
     * Sets the value of the pmtTxPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionParty }
     *     
     */
    public PaymentSearch3 setPmtTxPty(PaymentTransactionParty value) {
        this.pmtTxPty = value;
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

    /**
     * Adds a new item to the txRef list.
     * @see #getTxRef()
     * 
     */
    public PaymentSearch3 addTxRef(String txRef) {
        getTxRef().add(txRef);
        return this;
    }

    /**
     * Adds a new item to the trfValDt list.
     * @see #getTrfValDt()
     * 
     */
    public PaymentSearch3 addTrfValDt(DateAndDateTimeSearchChoice trfValDt) {
        getTrfValDt().add(trfValDt);
        return this;
    }

    /**
     * Adds a new item to the instrRef list.
     * @see #getInstrRef()
     * 
     */
    public PaymentSearch3 addInstrRef(PaymentIdentification3Choice instrRef) {
        getInstrRef().add(instrRef);
        return this;
    }

    /**
     * Adds a new item to the instrSts list.
     * @see #getInstrSts()
     * 
     */
    public PaymentSearch3 addInstrSts(InstructionStatusSearch3 instrSts) {
        getInstrSts().add(instrSts);
        return this;
    }

    /**
     * Adds a new item to the instdAmt list.
     * @see #getInstdAmt()
     * 
     */
    public PaymentSearch3 addInstdAmt(AmountRangeChoice instdAmt) {
        getInstdAmt().add(instdAmt);
        return this;
    }

    /**
     * Adds a new item to the instdAmtCcy list.
     * @see #getInstdAmtCcy()
     * 
     */
    public PaymentSearch3 addInstdAmtCcy(String instdAmtCcy) {
        getInstdAmtCcy().add(instdAmtCcy);
        return this;
    }

    /**
     * Adds a new item to the intrBkSttlmAmt list.
     * @see #getIntrBkSttlmAmt()
     * 
     */
    public PaymentSearch3 addIntrBkSttlmAmt(AmountRangeChoice intrBkSttlmAmt) {
        getIntrBkSttlmAmt().add(intrBkSttlmAmt);
        return this;
    }

    /**
     * Adds a new item to the intrBkSttlmAmtCcy list.
     * @see #getIntrBkSttlmAmtCcy()
     * 
     */
    public PaymentSearch3 addIntrBkSttlmAmtCcy(String intrBkSttlmAmtCcy) {
        getIntrBkSttlmAmtCcy().add(intrBkSttlmAmtCcy);
        return this;
    }

    /**
     * Adds a new item to the pmtMtd list.
     * @see #getPmtMtd()
     * 
     */
    public PaymentSearch3 addPmtMtd(PaymentOrigin1Choice pmtMtd) {
        getPmtMtd().add(pmtMtd);
        return this;
    }

    /**
     * Adds a new item to the prty list.
     * @see #getPrty()
     * 
     */
    public PaymentSearch3 addPrty(PriorityCodeChoice prty) {
        getPrty().add(prty);
        return this;
    }

    /**
     * Adds a new item to the prcgVldtyTm list.
     * @see #getPrcgVldtyTm()
     * 
     */
    public PaymentSearch3 addPrcgVldtyTm(DateTimePeriodChoice prcgVldtyTm) {
        getPrcgVldtyTm().add(prcgVldtyTm);
        return this;
    }

    /**
     * Adds a new item to the instr list.
     * @see #getInstr()
     * 
     */
    public PaymentSearch3 addInstr(Instruction1Code instr) {
        getInstr().add(instr);
        return this;
    }

    /**
     * Adds a new item to the pmtTp list.
     * @see #getPmtTp()
     * 
     */
    public PaymentSearch3 addPmtTp(PaymentType2Choice pmtTp) {
        getPmtTp().add(pmtTp);
        return this;
    }

    /**
     * Adds a new item to the pmtInstrRef list.
     * @see #getPmtInstrRef()
     * 
     */
    public PaymentSearch3 addPmtInstrRef(String pmtInstrRef) {
        getPmtInstrRef().add(pmtInstrRef);
        return this;
    }

    /**
     * Adds a new item to the intrBkValDt list.
     * @see #getIntrBkValDt()
     * 
     */
    public PaymentSearch3 addIntrBkValDt(XMLGregorianCalendar intrBkValDt) {
        getIntrBkValDt().add(intrBkValDt);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public PaymentSearch3 addRltdRef(String rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

}
