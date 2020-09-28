
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
 * Provides information about the cash movement resulting from the election instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCashMovements2", propOrder = {
    "pstngId",
    "pstngDtTm",
    "pstngAmt",
    "acctDtls"
})
public class CorporateActionCashMovements2 {

    @XmlElement(name = "PstngId")
    protected String pstngId;
    @XmlElement(name = "PstngDtTm")
    protected DateAndDateTimeChoice pstngDtTm;
    @XmlElement(name = "PstngAmt", required = true)
    protected ActiveCurrencyAndAmount pstngAmt;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<CashAccount19> acctDtls;

    /**
     * Gets the value of the pstngId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstngId() {
        return pstngId;
    }

    /**
     * Sets the value of the pstngId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCashMovements2 setPstngId(String value) {
        this.pstngId = value;
        return this;
    }

    /**
     * Gets the value of the pstngDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPstngDtTm() {
        return pstngDtTm;
    }

    /**
     * Sets the value of the pstngDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public CorporateActionCashMovements2 setPstngDtTm(DateAndDateTimeChoice value) {
        this.pstngDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pstngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPstngAmt() {
        return pstngAmt;
    }

    /**
     * Sets the value of the pstngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionCashMovements2 setPstngAmt(ActiveCurrencyAndAmount value) {
        this.pstngAmt = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount19 }
     * 
     * 
     */
    public List<CashAccount19> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<CashAccount19>();
        }
        return this.acctDtls;
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
     * Adds a new item to the acctDtls list.
     * @see #getAcctDtls()
     * 
     */
    public CorporateActionCashMovements2 addAcctDtls(CashAccount19 acctDtls) {
        getAcctDtls().add(acctDtls);
        return this;
    }

}
