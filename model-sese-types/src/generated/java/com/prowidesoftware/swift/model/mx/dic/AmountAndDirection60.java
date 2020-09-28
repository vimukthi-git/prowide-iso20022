
package com.prowidesoftware.swift.model.mx.dic;

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
 * Posting of an item to a cash account, in the context of a cash transaction, that results in an increase or decrease to the balance of the account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountAndDirection60", propOrder = {
    "acrdIntrstInd",
    "stmpDtyInd",
    "brkrgAmtInd",
    "amt",
    "cdtDbtInd",
    "orgnlCcyAndOrdrdAmt",
    "fxDtls",
    "valDt"
})
public class AmountAndDirection60 {

    @XmlElement(name = "AcrdIntrstInd")
    protected Boolean acrdIntrstInd;
    @XmlElement(name = "StmpDtyInd")
    protected Boolean stmpDtyInd;
    @XmlElement(name = "BrkrgAmtInd")
    protected Boolean brkrgAmtInd;
    @XmlElement(name = "Amt", required = true)
    protected RestrictedFINActiveCurrencyAndAmount amt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "OrgnlCcyAndOrdrdAmt")
    protected RestrictedFINActiveOrHistoricCurrencyAndAmount orgnlCcyAndOrdrdAmt;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms27 fxDtls;
    @XmlElement(name = "ValDt")
    protected DateAndDateTimeChoice valDt;

    /**
     * Gets the value of the acrdIntrstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcrdIntrstInd() {
        return acrdIntrstInd;
    }

    /**
     * Sets the value of the acrdIntrstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AmountAndDirection60 setAcrdIntrstInd(Boolean value) {
        this.acrdIntrstInd = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStmpDtyInd() {
        return stmpDtyInd;
    }

    /**
     * Sets the value of the stmpDtyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AmountAndDirection60 setStmpDtyInd(Boolean value) {
        this.stmpDtyInd = value;
        return this;
    }

    /**
     * Gets the value of the brkrgAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrkrgAmtInd() {
        return brkrgAmtInd;
    }

    /**
     * Sets the value of the brkrgAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AmountAndDirection60 setBrkrgAmtInd(Boolean value) {
        this.brkrgAmtInd = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public AmountAndDirection60 setAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
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
    public AmountAndDirection60 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCcyAndOrdrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveOrHistoricCurrencyAndAmount getOrgnlCcyAndOrdrdAmt() {
        return orgnlCcyAndOrdrdAmt;
    }

    /**
     * Sets the value of the orgnlCcyAndOrdrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AmountAndDirection60 setOrgnlCcyAndOrdrdAmt(RestrictedFINActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlCcyAndOrdrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms27 }
     *     
     */
    public ForeignExchangeTerms27 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms27 }
     *     
     */
    public AmountAndDirection60 setFXDtls(ForeignExchangeTerms27 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AmountAndDirection60 setValDt(DateAndDateTimeChoice value) {
        this.valDt = value;
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

}
