
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
 * Breakdown of the cash movements into a fund by order type, eg, order by quantity of units or amount of money.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalOrderQuantityType1", propOrder = {
    "strd",
    "addtlInf"
})
public class OriginalOrderQuantityType1 {

    @XmlElement(name = "Strd", required = true)
    @XmlSchemaType(name = "string")
    protected OrderQuantityType1Code strd;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the strd property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityType1Code }
     *     
     */
    public OrderQuantityType1Code getStrd() {
        return strd;
    }

    /**
     * Sets the value of the strd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityType1Code }
     *     
     */
    public OriginalOrderQuantityType1 setStrd(OrderQuantityType1Code value) {
        this.strd = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalOrderQuantityType1 setAddtlInf(String value) {
        this.addtlInf = value;
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
