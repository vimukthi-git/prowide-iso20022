
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
 * Specifies the loan data details in case of a repurchase trade transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData29", propOrder = {
    "unqTradIdr",
    "mstrAgrmt"
})
public class LoanData29 {

    @XmlElement(name = "UnqTradIdr")
    protected String unqTradIdr;
    @XmlElement(name = "MstrAgrmt", required = true)
    protected MasterAgreement1 mstrAgrmt;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData29 setUnqTradIdr(String value) {
        this.unqTradIdr = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement1 }
     *     
     */
    public MasterAgreement1 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement1 }
     *     
     */
    public LoanData29 setMstrAgrmt(MasterAgreement1 value) {
        this.mstrAgrmt = value;
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
