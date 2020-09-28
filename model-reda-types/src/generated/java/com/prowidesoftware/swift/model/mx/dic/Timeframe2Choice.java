
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between TimeFrame elements that define a period as number of days after an activity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Timeframe2Choice", propOrder = {
    "tPlus",
    "rPlus",
    "prepmt"
})
public class Timeframe2Choice {

    @XmlElement(name = "TPlus")
    protected BigDecimal tPlus;
    @XmlElement(name = "RPlus")
    protected BigDecimal rPlus;
    @XmlElement(name = "Prepmt")
    protected Boolean prepmt;

    /**
     * Gets the value of the tPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTPlus() {
        return tPlus;
    }

    /**
     * Sets the value of the tPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Timeframe2Choice setTPlus(BigDecimal value) {
        this.tPlus = value;
        return this;
    }

    /**
     * Gets the value of the rPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRPlus() {
        return rPlus;
    }

    /**
     * Sets the value of the rPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Timeframe2Choice setRPlus(BigDecimal value) {
        this.rPlus = value;
        return this;
    }

    /**
     * Gets the value of the prepmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrepmt() {
        return prepmt;
    }

    /**
     * Sets the value of the prepmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Timeframe2Choice setPrepmt(Boolean value) {
        this.prepmt = value;
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
