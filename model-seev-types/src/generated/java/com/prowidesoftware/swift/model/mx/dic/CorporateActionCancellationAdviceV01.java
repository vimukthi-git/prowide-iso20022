
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * An account servicer sends the CorporateActionCancellationAdvice message to an account owner or its designated agent to cancel a previously announced corporate action event in case of error from the account servicer or in case of withdrawal by the issuer.
 * Usage
 * The message may also be used to:
 * - re-send a message previously sent (the sub-function of the message is Duplicate),
 * - provide a third party with a copy of a message for information (the sub-function of the message is Copy),
 * - re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate).
 * ISO 15022 - 20022 COEXISTENCE
 * This ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment.  The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows:  “CoexistenceXxxxRule”.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCancellationAdviceV01", propOrder = {
    "id",
    "cxlAdvcGnlInf",
    "corpActnGnlInf",
    "acctsDtls",
    "msgOrgtr",
    "msgRcpt",
    "issrAgt",
    "pngAgt",
    "subPngAgt",
    "regar",
    "rsellngAgt",
    "physSctiesAgt",
    "drpAgt",
    "slctnAgt",
    "infAgt",
    "xtnsn"
})
public class CorporateActionCancellationAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "CxlAdvcGnlInf", required = true)
    protected CorporateActionCancellation1 cxlAdvcGnlInf;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation8 corpActnGnlInf;
    @XmlElement(name = "AcctsDtls", required = true)
    protected AccountIdentification6Choice acctsDtls;
    @XmlElement(name = "MsgOrgtr")
    protected PartyIdentification10Choice msgOrgtr;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification10Choice msgRcpt;
    @XmlElement(name = "IssrAgt")
    protected List<PartyIdentification10Choice> issrAgt;
    @XmlElement(name = "PngAgt")
    protected List<PartyIdentification10Choice> pngAgt;
    @XmlElement(name = "SubPngAgt")
    protected List<PartyIdentification10Choice> subPngAgt;
    @XmlElement(name = "Regar")
    protected PartyIdentification10Choice regar;
    @XmlElement(name = "RsellngAgt")
    protected List<PartyIdentification10Choice> rsellngAgt;
    @XmlElement(name = "PhysSctiesAgt")
    protected PartyIdentification10Choice physSctiesAgt;
    @XmlElement(name = "DrpAgt")
    protected PartyIdentification10Choice drpAgt;
    @XmlElement(name = "SlctnAgt")
    protected List<PartyIdentification10Choice> slctnAgt;
    @XmlElement(name = "InfAgt")
    protected PartyIdentification10Choice infAgt;
    @XmlElement(name = "Xtnsn")
    protected List<Extension2> xtnsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public CorporateActionCancellationAdviceV01 setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cxlAdvcGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellation1 }
     *     
     */
    public CorporateActionCancellation1 getCxlAdvcGnlInf() {
        return cxlAdvcGnlInf;
    }

    /**
     * Sets the value of the cxlAdvcGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellation1 }
     *     
     */
    public CorporateActionCancellationAdviceV01 setCxlAdvcGnlInf(CorporateActionCancellation1 value) {
        this.cxlAdvcGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation8 }
     *     
     */
    public CorporateActionGeneralInformation8 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation8 }
     *     
     */
    public CorporateActionCancellationAdviceV01 setCorpActnGnlInf(CorporateActionGeneralInformation8 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the acctsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification6Choice }
     *     
     */
    public AccountIdentification6Choice getAcctsDtls() {
        return acctsDtls;
    }

    /**
     * Sets the value of the acctsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification6Choice }
     *     
     */
    public CorporateActionCancellationAdviceV01 setAcctsDtls(AccountIdentification6Choice value) {
        this.acctsDtls = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionCancellationAdviceV01 setMsgOrgtr(PartyIdentification10Choice value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the msgRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Sets the value of the msgRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionCancellationAdviceV01 setMsgRcpt(PartyIdentification10Choice value) {
        this.msgRcpt = value;
        return this;
    }

    /**
     * Gets the value of the issrAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issrAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getIssrAgt() {
        if (issrAgt == null) {
            issrAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.issrAgt;
    }

    /**
     * Gets the value of the pngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getPngAgt() {
        if (pngAgt == null) {
            pngAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.pngAgt;
    }

    /**
     * Gets the value of the subPngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getSubPngAgt() {
        if (subPngAgt == null) {
            subPngAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.subPngAgt;
    }

    /**
     * Gets the value of the regar property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getRegar() {
        return regar;
    }

    /**
     * Sets the value of the regar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionCancellationAdviceV01 setRegar(PartyIdentification10Choice value) {
        this.regar = value;
        return this;
    }

    /**
     * Gets the value of the rsellngAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsellngAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsellngAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getRsellngAgt() {
        if (rsellngAgt == null) {
            rsellngAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.rsellngAgt;
    }

    /**
     * Gets the value of the physSctiesAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getPhysSctiesAgt() {
        return physSctiesAgt;
    }

    /**
     * Sets the value of the physSctiesAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionCancellationAdviceV01 setPhysSctiesAgt(PartyIdentification10Choice value) {
        this.physSctiesAgt = value;
        return this;
    }

    /**
     * Gets the value of the drpAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getDrpAgt() {
        return drpAgt;
    }

    /**
     * Sets the value of the drpAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionCancellationAdviceV01 setDrpAgt(PartyIdentification10Choice value) {
        this.drpAgt = value;
        return this;
    }

    /**
     * Gets the value of the slctnAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slctnAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlctnAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification10Choice }
     * 
     * 
     */
    public List<PartyIdentification10Choice> getSlctnAgt() {
        if (slctnAgt == null) {
            slctnAgt = new ArrayList<PartyIdentification10Choice>();
        }
        return this.slctnAgt;
    }

    /**
     * Gets the value of the infAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public PartyIdentification10Choice getInfAgt() {
        return infAgt;
    }

    /**
     * Sets the value of the infAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification10Choice }
     *     
     */
    public CorporateActionCancellationAdviceV01 setInfAgt(PartyIdentification10Choice value) {
        this.infAgt = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension2 }
     * 
     * 
     */
    public List<Extension2> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension2>();
        }
        return this.xtnsn;
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
     * Adds a new item to the issrAgt list.
     * @see #getIssrAgt()
     * 
     */
    public CorporateActionCancellationAdviceV01 addIssrAgt(PartyIdentification10Choice issrAgt) {
        getIssrAgt().add(issrAgt);
        return this;
    }

    /**
     * Adds a new item to the pngAgt list.
     * @see #getPngAgt()
     * 
     */
    public CorporateActionCancellationAdviceV01 addPngAgt(PartyIdentification10Choice pngAgt) {
        getPngAgt().add(pngAgt);
        return this;
    }

    /**
     * Adds a new item to the subPngAgt list.
     * @see #getSubPngAgt()
     * 
     */
    public CorporateActionCancellationAdviceV01 addSubPngAgt(PartyIdentification10Choice subPngAgt) {
        getSubPngAgt().add(subPngAgt);
        return this;
    }

    /**
     * Adds a new item to the rsellngAgt list.
     * @see #getRsellngAgt()
     * 
     */
    public CorporateActionCancellationAdviceV01 addRsellngAgt(PartyIdentification10Choice rsellngAgt) {
        getRsellngAgt().add(rsellngAgt);
        return this;
    }

    /**
     * Adds a new item to the slctnAgt list.
     * @see #getSlctnAgt()
     * 
     */
    public CorporateActionCancellationAdviceV01 addSlctnAgt(PartyIdentification10Choice slctnAgt) {
        getSlctnAgt().add(slctnAgt);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public CorporateActionCancellationAdviceV01 addXtnsn(Extension2 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
