
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
 * Data related to the cardholder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder12", propOrder = {
    "id",
    "nm",
    "lang",
    "bllgAdr",
    "shppgAdr",
    "tripNb",
    "vhcl",
    "authntcn",
    "txVrfctnRslt",
    "prsnlData"
})
public class Cardholder12 {

    @XmlElement(name = "Id")
    protected PersonIdentification11 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "BllgAdr")
    protected PostalAddress18 bllgAdr;
    @XmlElement(name = "ShppgAdr")
    protected PostalAddress18 shppgAdr;
    @XmlElement(name = "TripNb")
    protected String tripNb;
    @XmlElement(name = "Vhcl")
    protected Vehicle1 vhcl;
    @XmlElement(name = "Authntcn")
    protected List<CardholderAuthentication10> authntcn;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult4> txVrfctnRslt;
    @XmlElement(name = "PrsnlData")
    protected String prsnlData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification11 }
     *     
     */
    public PersonIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification11 }
     *     
     */
    public Cardholder12 setId(PersonIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder12 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder12 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress18 }
     *     
     */
    public PostalAddress18 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress18 }
     *     
     */
    public Cardholder12 setBllgAdr(PostalAddress18 value) {
        this.bllgAdr = value;
        return this;
    }

    /**
     * Gets the value of the shppgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress18 }
     *     
     */
    public PostalAddress18 getShppgAdr() {
        return shppgAdr;
    }

    /**
     * Sets the value of the shppgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress18 }
     *     
     */
    public Cardholder12 setShppgAdr(PostalAddress18 value) {
        this.shppgAdr = value;
        return this;
    }

    /**
     * Gets the value of the tripNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNb() {
        return tripNb;
    }

    /**
     * Sets the value of the tripNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder12 setTripNb(String value) {
        this.tripNb = value;
        return this;
    }

    /**
     * Gets the value of the vhcl property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle1 }
     *     
     */
    public Vehicle1 getVhcl() {
        return vhcl;
    }

    /**
     * Sets the value of the vhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle1 }
     *     
     */
    public Cardholder12 setVhcl(Vehicle1 value) {
        this.vhcl = value;
        return this;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authntcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderAuthentication10 }
     * 
     * 
     */
    public List<CardholderAuthentication10> getAuthntcn() {
        if (authntcn == null) {
            authntcn = new ArrayList<CardholderAuthentication10>();
        }
        return this.authntcn;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult4 }
     * 
     * 
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<TransactionVerificationResult4>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the prsnlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlData() {
        return prsnlData;
    }

    /**
     * Sets the value of the prsnlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cardholder12 setPrsnlData(String value) {
        this.prsnlData = value;
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
     * Adds a new item to the authntcn list.
     * @see #getAuthntcn()
     * 
     */
    public Cardholder12 addAuthntcn(CardholderAuthentication10 authntcn) {
        getAuthntcn().add(authntcn);
        return this;
    }

    /**
     * Adds a new item to the txVrfctnRslt list.
     * @see #getTxVrfctnRslt()
     * 
     */
    public Cardholder12 addTxVrfctnRslt(TransactionVerificationResult4 txVrfctnRslt) {
        getTxVrfctnRslt().add(txVrfctnRslt);
        return this;
    }

}
