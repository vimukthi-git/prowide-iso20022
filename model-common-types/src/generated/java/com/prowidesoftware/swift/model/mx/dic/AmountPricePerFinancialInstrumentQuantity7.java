
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
 * Specifies a ratio: amount price per financial instrument quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity7", propOrder = {
    "amtPricTp",
    "pricVal",
    "finInstrmQty"
})
public class AmountPricePerFinancialInstrumentQuantity7 {

    @XmlElement(name = "AmtPricTp", required = true)
    @XmlSchemaType(name = "string")
    protected AmountPriceType1Code amtPricTp;
    @XmlElement(name = "PricVal", required = true)
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount pricVal;
    @XmlElement(name = "FinInstrmQty", required = true)
    protected FinancialInstrumentQuantity15Choice finInstrmQty;

    /**
     * Gets the value of the amtPricTp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPriceType1Code }
     *     
     */
    public AmountPriceType1Code getAmtPricTp() {
        return amtPricTp;
    }

    /**
     * Sets the value of the amtPricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPriceType1Code }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity7 setAmtPricTp(AmountPriceType1Code value) {
        this.amtPricTp = value;
        return this;
    }

    /**
     * Gets the value of the pricVal property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getPricVal() {
        return pricVal;
    }

    /**
     * Sets the value of the pricVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity7 setPricVal(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.pricVal = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity7 setFinInstrmQty(FinancialInstrumentQuantity15Choice value) {
        this.finInstrmQty = value;
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
