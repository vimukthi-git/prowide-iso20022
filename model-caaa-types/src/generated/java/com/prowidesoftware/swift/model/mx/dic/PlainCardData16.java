
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
 * Sensitive data associated with the payment card performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData16", propOrder = {
    "pan",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "svcCd",
    "trck1",
    "trck2",
    "trck3"
})
public class PlainCardData16 {

    @XmlElement(name = "PAN", required = true)
    protected String pan;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt")
    protected String fctvDt;
    @XmlElement(name = "XpryDt", required = true)
    protected String xpryDt;
    @XmlElement(name = "SvcCd")
    protected String svcCd;
    @XmlElement(name = "Trck1")
    protected String trck1;
    @XmlElement(name = "Trck2")
    protected String trck2;
    @XmlElement(name = "Trck3")
    protected String trck3;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setPAN(String value) {
        this.pan = value;
        return this;
    }

    /**
     * Gets the value of the cardSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNb() {
        return cardSeqNb;
    }

    /**
     * Sets the value of the cardSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setCardSeqNb(String value) {
        this.cardSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setFctvDt(String value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setXpryDt(String value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the svcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCd() {
        return svcCd;
    }

    /**
     * Sets the value of the svcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setSvcCd(String value) {
        this.svcCd = value;
        return this;
    }

    /**
     * Gets the value of the trck1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck1() {
        return trck1;
    }

    /**
     * Sets the value of the trck1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setTrck1(String value) {
        this.trck1 = value;
        return this;
    }

    /**
     * Gets the value of the trck2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck2() {
        return trck2;
    }

    /**
     * Sets the value of the trck2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setTrck2(String value) {
        this.trck2 = value;
        return this;
    }

    /**
     * Gets the value of the trck3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck3() {
        return trck3;
    }

    /**
     * Sets the value of the trck3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PlainCardData16 setTrck3(String value) {
        this.trck3 = value;
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
