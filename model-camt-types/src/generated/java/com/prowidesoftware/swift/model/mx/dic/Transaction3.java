
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
 * Payment processes required to transfer cash from the debtor to the creditor.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction3", propOrder = {
    "pmtTo",
    "pmtFr",
    "cdtDbtInd",
    "pmt",
    "acctNtry"
})
public class Transaction3 {

    @XmlElement(name = "PmtTo")
    protected SystemDetails2 pmtTo;
    @XmlElement(name = "PmtFr")
    protected SystemDetails2 pmtFr;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Pmt")
    protected PaymentDetails5 pmt;
    @XmlElement(name = "AcctNtry")
    protected AccountCashEntryDetails3 acctNtry;

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetails2 }
     *     
     */
    public SystemDetails2 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetails2 }
     *     
     */
    public Transaction3 setPmtTo(SystemDetails2 value) {
        this.pmtTo = value;
        return this;
    }

    /**
     * Gets the value of the pmtFr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetails2 }
     *     
     */
    public SystemDetails2 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetails2 }
     *     
     */
    public Transaction3 setPmtFr(SystemDetails2 value) {
        this.pmtFr = value;
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
    public Transaction3 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails5 }
     *     
     */
    public PaymentDetails5 getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails5 }
     *     
     */
    public Transaction3 setPmt(PaymentDetails5 value) {
        this.pmt = value;
        return this;
    }

    /**
     * Gets the value of the acctNtry property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCashEntryDetails3 }
     *     
     */
    public AccountCashEntryDetails3 getAcctNtry() {
        return acctNtry;
    }

    /**
     * Sets the value of the acctNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCashEntryDetails3 }
     *     
     */
    public Transaction3 setAcctNtry(AccountCashEntryDetails3 value) {
        this.acctNtry = value;
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
