
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
 * Account and holding of the next sub-level (Level 8).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel18", propOrder = {
    "acctId",
    "acctOwnr",
    "acctSvcr",
    "bnfclOwnr",
    "balDtls",
    "acctSubLvl9",
    "acctSubLvl9Diff",
    "splmtryData"
})
public class AccountSubLevel18 {

    @XmlElement(name = "AcctId", required = true)
    protected SecuritiesAccount19 acctId;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification100 acctOwnr;
    @XmlElement(name = "AcctSvcr", required = true)
    protected PartyIdentification100 acctSvcr;
    @XmlElement(name = "BnfclOwnr")
    protected List<BeneficialOwner2> bnfclOwnr;
    @XmlElement(name = "BalDtls")
    protected List<AggregateHoldingBalance3> balDtls;
    @XmlElement(name = "AcctSubLvl9")
    protected List<AccountSubLevel19> acctSubLvl9;
    @XmlElement(name = "AcctSubLvl9Diff")
    protected List<AggregateHoldingBalance2> acctSubLvl9Diff;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public AccountSubLevel18 setAcctId(SecuritiesAccount19 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public AccountSubLevel18 setAcctOwnr(PartyIdentification100 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public AccountSubLevel18 setAcctSvcr(PartyIdentification100 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bnfclOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBnfclOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficialOwner2 }
     * 
     * 
     */
    public List<BeneficialOwner2> getBnfclOwnr() {
        if (bnfclOwnr == null) {
            bnfclOwnr = new ArrayList<BeneficialOwner2>();
        }
        return this.bnfclOwnr;
    }

    /**
     * Gets the value of the balDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateHoldingBalance3 }
     * 
     * 
     */
    public List<AggregateHoldingBalance3> getBalDtls() {
        if (balDtls == null) {
            balDtls = new ArrayList<AggregateHoldingBalance3>();
        }
        return this.balDtls;
    }

    /**
     * Gets the value of the acctSubLvl9 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctSubLvl9 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSubLvl9().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSubLevel19 }
     * 
     * 
     */
    public List<AccountSubLevel19> getAcctSubLvl9() {
        if (acctSubLvl9 == null) {
            acctSubLvl9 = new ArrayList<AccountSubLevel19>();
        }
        return this.acctSubLvl9;
    }

    /**
     * Gets the value of the acctSubLvl9Diff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctSubLvl9Diff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctSubLvl9Diff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateHoldingBalance2 }
     * 
     * 
     */
    public List<AggregateHoldingBalance2> getAcctSubLvl9Diff() {
        if (acctSubLvl9Diff == null) {
            acctSubLvl9Diff = new ArrayList<AggregateHoldingBalance2>();
        }
        return this.acctSubLvl9Diff;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the bnfclOwnr list.
     * @see #getBnfclOwnr()
     * 
     */
    public AccountSubLevel18 addBnfclOwnr(BeneficialOwner2 bnfclOwnr) {
        getBnfclOwnr().add(bnfclOwnr);
        return this;
    }

    /**
     * Adds a new item to the balDtls list.
     * @see #getBalDtls()
     * 
     */
    public AccountSubLevel18 addBalDtls(AggregateHoldingBalance3 balDtls) {
        getBalDtls().add(balDtls);
        return this;
    }

    /**
     * Adds a new item to the acctSubLvl9 list.
     * @see #getAcctSubLvl9()
     * 
     */
    public AccountSubLevel18 addAcctSubLvl9(AccountSubLevel19 acctSubLvl9) {
        getAcctSubLvl9().add(acctSubLvl9);
        return this;
    }

    /**
     * Adds a new item to the acctSubLvl9Diff list.
     * @see #getAcctSubLvl9Diff()
     * 
     */
    public AccountSubLevel18 addAcctSubLvl9Diff(AggregateHoldingBalance2 acctSubLvl9Diff) {
        getAcctSubLvl9Diff().add(acctSubLvl9Diff);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AccountSubLevel18 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
