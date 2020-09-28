
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
 * Provides additional information regarding optional dividend election details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalDividendAccountQuantitySD3", propOrder = {
    "plcAndNm",
    "bnfclOwnrQty",
    "nbOfAccts"
})
public class OptionalDividendAccountQuantitySD3 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "BnfclOwnrQty", required = true)
    protected FinancialInstrumentQuantity15Choice bnfclOwnrQty;
    @XmlElement(name = "NbOfAccts", required = true)
    protected String nbOfAccts;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionalDividendAccountQuantitySD3 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the bnfclOwnrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public FinancialInstrumentQuantity15Choice getBnfclOwnrQty() {
        return bnfclOwnrQty;
    }

    /**
     * Sets the value of the bnfclOwnrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity15Choice }
     *     
     */
    public OptionalDividendAccountQuantitySD3 setBnfclOwnrQty(FinancialInstrumentQuantity15Choice value) {
        this.bnfclOwnrQty = value;
        return this;
    }

    /**
     * Gets the value of the nbOfAccts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfAccts() {
        return nbOfAccts;
    }

    /**
     * Sets the value of the nbOfAccts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionalDividendAccountQuantitySD3 setNbOfAccts(String value) {
        this.nbOfAccts = value;
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
