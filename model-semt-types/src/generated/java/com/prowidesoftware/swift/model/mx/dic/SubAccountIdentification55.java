
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
 * Account to or from which a securities entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccountIdentification55", propOrder = {
    "acctOwnr",
    "sfkpgAcct",
    "actvtyInd",
    "balForSubAcct"
})
public class SubAccountIdentification55 {

    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct", required = true)
    protected SecuritiesAccount25 sfkpgAcct;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "BalForSubAcct")
    protected List<AggregateBalanceInformation35> balForSubAcct;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public SubAccountIdentification55 setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount25 }
     *     
     */
    public SecuritiesAccount25 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount25 }
     *     
     */
    public SubAccountIdentification55 setSfkpgAcct(SecuritiesAccount25 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public SubAccountIdentification55 setActvtyInd(boolean value) {
        this.actvtyInd = value;
        return this;
    }

    /**
     * Gets the value of the balForSubAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balForSubAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForSubAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalanceInformation35 }
     * 
     * 
     */
    public List<AggregateBalanceInformation35> getBalForSubAcct() {
        if (balForSubAcct == null) {
            balForSubAcct = new ArrayList<AggregateBalanceInformation35>();
        }
        return this.balForSubAcct;
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
     * Adds a new item to the balForSubAcct list.
     * @see #getBalForSubAcct()
     * 
     */
    public SubAccountIdentification55 addBalForSubAcct(AggregateBalanceInformation35 balForSubAcct) {
        getBalForSubAcct().add(balForSubAcct);
        return this;
    }

}
