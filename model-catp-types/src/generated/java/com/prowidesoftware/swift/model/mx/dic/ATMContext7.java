
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
 * Context in which the transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMContext7", propOrder = {
    "ssnRef",
    "svc"
})
public class ATMContext7 {

    @XmlElement(name = "SsnRef")
    protected String ssnRef;
    @XmlElement(name = "Svc", required = true)
    protected ATMService8 svc;

    /**
     * Gets the value of the ssnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnRef() {
        return ssnRef;
    }

    /**
     * Sets the value of the ssnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMContext7 setSsnRef(String value) {
        this.ssnRef = value;
        return this;
    }

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMService8 }
     *     
     */
    public ATMService8 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMService8 }
     *     
     */
    public ATMContext7 setSvc(ATMService8 value) {
        this.svc = value;
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
