
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Transaction information in the authorisation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction12", propOrder = {
    "txId",
    "rcptTxId",
    "rcncltnId",
    "intrchngData",
    "txDtls"
})
public class CardPaymentTransaction12 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcptTxId")
    protected String rcptTxId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "IntrchngData")
    protected String intrchngData;
    @XmlElement(name = "TxDtls", required = true)
    protected CardPaymentTransactionDetails11 txDtls;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public CardPaymentTransaction12 setTxId(TransactionIdentifier1 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rcptTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptTxId() {
        return rcptTxId;
    }

    /**
     * Sets the value of the rcptTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction12 setRcptTxId(String value) {
        this.rcptTxId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction12 setRcncltnId(String value) {
        this.rcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the intrchngData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrchngData() {
        return intrchngData;
    }

    /**
     * Sets the value of the intrchngData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransaction12 setIntrchngData(String value) {
        this.intrchngData = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionDetails11 }
     *     
     */
    public CardPaymentTransactionDetails11 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionDetails11 }
     *     
     */
    public CardPaymentTransaction12 setTxDtls(CardPaymentTransactionDetails11 value) {
        this.txDtls = value;
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
