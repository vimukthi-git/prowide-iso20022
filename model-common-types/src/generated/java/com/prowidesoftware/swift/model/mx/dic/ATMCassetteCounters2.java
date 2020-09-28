
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Counters of media inside an ATM cassette.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassetteCounters2", propOrder = {
    "tp",
    "addedNb",
    "rmvdNb",
    "dspnsdNb",
    "dpstNb",
    "rcycldNb",
    "rtrctdNb",
    "rjctdNb",
    "presntdNb"
})
public class ATMCassetteCounters2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCounterType1Code tp;
    @XmlElement(name = "AddedNb")
    protected BigDecimal addedNb;
    @XmlElement(name = "RmvdNb")
    protected BigDecimal rmvdNb;
    @XmlElement(name = "DspnsdNb")
    protected BigDecimal dspnsdNb;
    @XmlElement(name = "DpstNb")
    protected BigDecimal dpstNb;
    @XmlElement(name = "RcycldNb")
    protected BigDecimal rcycldNb;
    @XmlElement(name = "RtrctdNb")
    protected BigDecimal rtrctdNb;
    @XmlElement(name = "RjctdNb")
    protected BigDecimal rjctdNb;
    @XmlElement(name = "PresntdNb")
    protected BigDecimal presntdNb;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCounterType1Code }
     *     
     */
    public ATMCounterType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCounterType1Code }
     *     
     */
    public ATMCassetteCounters2 setTp(ATMCounterType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the addedNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddedNb() {
        return addedNb;
    }

    /**
     * Sets the value of the addedNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setAddedNb(BigDecimal value) {
        this.addedNb = value;
        return this;
    }

    /**
     * Gets the value of the rmvdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmvdNb() {
        return rmvdNb;
    }

    /**
     * Sets the value of the rmvdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setRmvdNb(BigDecimal value) {
        this.rmvdNb = value;
        return this;
    }

    /**
     * Gets the value of the dspnsdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDspnsdNb() {
        return dspnsdNb;
    }

    /**
     * Sets the value of the dspnsdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setDspnsdNb(BigDecimal value) {
        this.dspnsdNb = value;
        return this;
    }

    /**
     * Gets the value of the dpstNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDpstNb() {
        return dpstNb;
    }

    /**
     * Sets the value of the dpstNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setDpstNb(BigDecimal value) {
        this.dpstNb = value;
        return this;
    }

    /**
     * Gets the value of the rcycldNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcycldNb() {
        return rcycldNb;
    }

    /**
     * Sets the value of the rcycldNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setRcycldNb(BigDecimal value) {
        this.rcycldNb = value;
        return this;
    }

    /**
     * Gets the value of the rtrctdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRtrctdNb() {
        return rtrctdNb;
    }

    /**
     * Sets the value of the rtrctdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setRtrctdNb(BigDecimal value) {
        this.rtrctdNb = value;
        return this;
    }

    /**
     * Gets the value of the rjctdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRjctdNb() {
        return rjctdNb;
    }

    /**
     * Sets the value of the rjctdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setRjctdNb(BigDecimal value) {
        this.rjctdNb = value;
        return this;
    }

    /**
     * Gets the value of the presntdNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPresntdNb() {
        return presntdNb;
    }

    /**
     * Sets the value of the presntdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMCassetteCounters2 setPresntdNb(BigDecimal value) {
        this.presntdNb = value;
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
