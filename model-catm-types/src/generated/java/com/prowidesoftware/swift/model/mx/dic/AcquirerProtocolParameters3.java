
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Acceptor parameters dedicated to the acquirer protocol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerProtocolParameters3", propOrder = {
    "acqrrId",
    "applId",
    "hst",
    "onLineTx",
    "offLineTx",
    "rcncltnXchg",
    "rcncltnByAcqrr",
    "ttlsPerCcy",
    "spltTtls",
    "cardDataVrfctn",
    "btchTrfCntt",
    "msgItm",
    "prtctCardData"
})
public class AcquirerProtocolParameters3 {

    @XmlElement(name = "AcqrrId", required = true)
    protected List<GenericIdentification32> acqrrId;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "Hst")
    protected List<AcquirerHostConfiguration2> hst;
    @XmlElement(name = "OnLineTx")
    protected AcquirerProtocolParameters4 onLineTx;
    @XmlElement(name = "OffLineTx")
    protected AcquirerProtocolParameters4 offLineTx;
    @XmlElement(name = "RcncltnXchg")
    protected ExchangeConfiguration2 rcncltnXchg;
    @XmlElement(name = "RcncltnByAcqrr")
    protected Boolean rcncltnByAcqrr;
    @XmlElement(name = "TtlsPerCcy")
    protected Boolean ttlsPerCcy;
    @XmlElement(name = "SpltTtls")
    protected Boolean spltTtls;
    @XmlElement(name = "CardDataVrfctn")
    protected Boolean cardDataVrfctn;
    @XmlElement(name = "BtchTrfCntt")
    @XmlSchemaType(name = "string")
    protected List<BatchTransactionType1Code> btchTrfCntt;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition1> msgItm;
    @XmlElement(name = "PrtctCardData")
    protected boolean prtctCardData;

    /**
     * Gets the value of the acqrrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acqrrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcqrrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification32 }
     * 
     * 
     */
    public List<GenericIdentification32> getAcqrrId() {
        if (acqrrId == null) {
            acqrrId = new ArrayList<GenericIdentification32>();
        }
        return this.acqrrId;
    }

    /**
     * Gets the value of the applId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplId() {
        if (applId == null) {
            applId = new ArrayList<String>();
        }
        return this.applId;
    }

    /**
     * Gets the value of the hst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerHostConfiguration2 }
     * 
     * 
     */
    public List<AcquirerHostConfiguration2> getHst() {
        if (hst == null) {
            hst = new ArrayList<AcquirerHostConfiguration2>();
        }
        return this.hst;
    }

    /**
     * Gets the value of the onLineTx property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerProtocolParameters4 }
     *     
     */
    public AcquirerProtocolParameters4 getOnLineTx() {
        return onLineTx;
    }

    /**
     * Sets the value of the onLineTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerProtocolParameters4 }
     *     
     */
    public AcquirerProtocolParameters3 setOnLineTx(AcquirerProtocolParameters4 value) {
        this.onLineTx = value;
        return this;
    }

    /**
     * Gets the value of the offLineTx property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerProtocolParameters4 }
     *     
     */
    public AcquirerProtocolParameters4 getOffLineTx() {
        return offLineTx;
    }

    /**
     * Sets the value of the offLineTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerProtocolParameters4 }
     *     
     */
    public AcquirerProtocolParameters3 setOffLineTx(AcquirerProtocolParameters4 value) {
        this.offLineTx = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration2 }
     *     
     */
    public ExchangeConfiguration2 getRcncltnXchg() {
        return rcncltnXchg;
    }

    /**
     * Sets the value of the rcncltnXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration2 }
     *     
     */
    public AcquirerProtocolParameters3 setRcncltnXchg(ExchangeConfiguration2 value) {
        this.rcncltnXchg = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnByAcqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcncltnByAcqrr() {
        return rcncltnByAcqrr;
    }

    /**
     * Sets the value of the rcncltnByAcqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters3 setRcncltnByAcqrr(Boolean value) {
        this.rcncltnByAcqrr = value;
        return this;
    }

    /**
     * Gets the value of the ttlsPerCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTtlsPerCcy() {
        return ttlsPerCcy;
    }

    /**
     * Sets the value of the ttlsPerCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters3 setTtlsPerCcy(Boolean value) {
        this.ttlsPerCcy = value;
        return this;
    }

    /**
     * Gets the value of the spltTtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltTtls() {
        return spltTtls;
    }

    /**
     * Sets the value of the spltTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters3 setSpltTtls(Boolean value) {
        this.spltTtls = value;
        return this;
    }

    /**
     * Gets the value of the cardDataVrfctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardDataVrfctn() {
        return cardDataVrfctn;
    }

    /**
     * Sets the value of the cardDataVrfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters3 setCardDataVrfctn(Boolean value) {
        this.cardDataVrfctn = value;
        return this;
    }

    /**
     * Gets the value of the btchTrfCntt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the btchTrfCntt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtchTrfCntt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchTransactionType1Code }
     * 
     * 
     */
    public List<BatchTransactionType1Code> getBtchTrfCntt() {
        if (btchTrfCntt == null) {
            btchTrfCntt = new ArrayList<BatchTransactionType1Code>();
        }
        return this.btchTrfCntt;
    }

    /**
     * Gets the value of the msgItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageItemCondition1 }
     * 
     * 
     */
    public List<MessageItemCondition1> getMsgItm() {
        if (msgItm == null) {
            msgItm = new ArrayList<MessageItemCondition1>();
        }
        return this.msgItm;
    }

    /**
     * Gets the value of the prtctCardData property.
     * 
     */
    public boolean isPrtctCardData() {
        return prtctCardData;
    }

    /**
     * Sets the value of the prtctCardData property.
     * 
     */
    public AcquirerProtocolParameters3 setPrtctCardData(boolean value) {
        this.prtctCardData = value;
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
     * Adds a new item to the acqrrId list.
     * @see #getAcqrrId()
     * 
     */
    public AcquirerProtocolParameters3 addAcqrrId(GenericIdentification32 acqrrId) {
        getAcqrrId().add(acqrrId);
        return this;
    }

    /**
     * Adds a new item to the applId list.
     * @see #getApplId()
     * 
     */
    public AcquirerProtocolParameters3 addApplId(String applId) {
        getApplId().add(applId);
        return this;
    }

    /**
     * Adds a new item to the hst list.
     * @see #getHst()
     * 
     */
    public AcquirerProtocolParameters3 addHst(AcquirerHostConfiguration2 hst) {
        getHst().add(hst);
        return this;
    }

    /**
     * Adds a new item to the btchTrfCntt list.
     * @see #getBtchTrfCntt()
     * 
     */
    public AcquirerProtocolParameters3 addBtchTrfCntt(BatchTransactionType1Code btchTrfCntt) {
        getBtchTrfCntt().add(btchTrfCntt);
        return this;
    }

    /**
     * Adds a new item to the msgItm list.
     * @see #getMsgItm()
     * 
     */
    public AcquirerProtocolParameters3 addMsgItm(MessageItemCondition1 msgItm) {
        getMsgItm().add(msgItm);
        return this;
    }

}
