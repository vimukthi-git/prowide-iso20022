
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
 * The AccountOpeningRequest message is sent from an organisation to a financial institution as part of the account opening process. It is the initial request to open an account.
 * Usage
 * This message should only be used for initiating the account opening process.
 * It could be sent together with other related documents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountOpeningRequestV01", propOrder = {
    "refs",
    "acct",
    "ctrctDts",
    "undrlygMstrAgrmt",
    "acctSvcrId",
    "org",
    "mndt",
    "refAcct",
    "dgtlSgntr"
})
public class AccountOpeningRequestV01 {

    @XmlElement(name = "Refs", required = true)
    protected References4 refs;
    @XmlElement(name = "Acct", required = true)
    protected CustomerAccount1 acct;
    @XmlElement(name = "CtrctDts")
    protected AccountContract2 ctrctDts;
    @XmlElement(name = "UndrlygMstrAgrmt")
    protected ContractDocument1 undrlygMstrAgrmt;
    @XmlElement(name = "AcctSvcrId", required = true)
    protected BranchAndFinancialInstitutionIdentification4 acctSvcrId;
    @XmlElement(name = "Org", required = true)
    protected List<Organisation7> org;
    @XmlElement(name = "Mndt")
    protected List<OperationMandate1> mndt;
    @XmlElement(name = "RefAcct")
    protected CashAccount16 refAcct;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature1> dgtlSgntr;

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link References4 }
     *     
     */
    public References4 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link References4 }
     *     
     */
    public AccountOpeningRequestV01 setRefs(References4 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount1 }
     *     
     */
    public CustomerAccount1 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount1 }
     *     
     */
    public AccountOpeningRequestV01 setAcct(CustomerAccount1 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the ctrctDts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountContract2 }
     *     
     */
    public AccountContract2 getCtrctDts() {
        return ctrctDts;
    }

    /**
     * Sets the value of the ctrctDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountContract2 }
     *     
     */
    public AccountOpeningRequestV01 setCtrctDts(AccountContract2 value) {
        this.ctrctDts = value;
        return this;
    }

    /**
     * Gets the value of the undrlygMstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDocument1 }
     *     
     */
    public ContractDocument1 getUndrlygMstrAgrmt() {
        return undrlygMstrAgrmt;
    }

    /**
     * Sets the value of the undrlygMstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDocument1 }
     *     
     */
    public AccountOpeningRequestV01 setUndrlygMstrAgrmt(ContractDocument1 value) {
        this.undrlygMstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcrId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getAcctSvcrId() {
        return acctSvcrId;
    }

    /**
     * Sets the value of the acctSvcrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public AccountOpeningRequestV01 setAcctSvcrId(BranchAndFinancialInstitutionIdentification4 value) {
        this.acctSvcrId = value;
        return this;
    }

    /**
     * Gets the value of the org property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the org property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation7 }
     * 
     * 
     */
    public List<Organisation7> getOrg() {
        if (org == null) {
            org = new ArrayList<Organisation7>();
        }
        return this.org;
    }

    /**
     * Gets the value of the mndt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mndt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMndt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationMandate1 }
     * 
     * 
     */
    public List<OperationMandate1> getMndt() {
        if (mndt == null) {
            mndt = new ArrayList<OperationMandate1>();
        }
        return this.mndt;
    }

    /**
     * Gets the value of the refAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getRefAcct() {
        return refAcct;
    }

    /**
     * Sets the value of the refAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public AccountOpeningRequestV01 setRefAcct(CashAccount16 value) {
        this.refAcct = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature1 }
     * 
     * 
     */
    public List<PartyAndSignature1> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<PartyAndSignature1>();
        }
        return this.dgtlSgntr;
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
     * Adds a new item to the org list.
     * @see #getOrg()
     * 
     */
    public AccountOpeningRequestV01 addOrg(Organisation7 org) {
        getOrg().add(org);
        return this;
    }

    /**
     * Adds a new item to the mndt list.
     * @see #getMndt()
     * 
     */
    public AccountOpeningRequestV01 addMndt(OperationMandate1 mndt) {
        getMndt().add(mndt);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public AccountOpeningRequestV01 addDgtlSgntr(PartyAndSignature1 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
