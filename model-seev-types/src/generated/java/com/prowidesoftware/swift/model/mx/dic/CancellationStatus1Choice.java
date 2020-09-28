
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
 * Status applying to the instruction cancellation request received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus1Choice", propOrder = {
    "prcgSts",
    "rjctnSts"
})
public class CancellationStatus1Choice {

    @XmlElement(name = "PrcgSts")
    protected CancellationProcessingStatus1 prcgSts;
    @XmlElement(name = "RjctnSts")
    protected CancellationRejectionStatus1 rjctnSts;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationProcessingStatus1 }
     *     
     */
    public CancellationProcessingStatus1 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationProcessingStatus1 }
     *     
     */
    public CancellationStatus1Choice setPrcgSts(CancellationProcessingStatus1 value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the rjctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRejectionStatus1 }
     *     
     */
    public CancellationRejectionStatus1 getRjctnSts() {
        return rjctnSts;
    }

    /**
     * Sets the value of the rjctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRejectionStatus1 }
     *     
     */
    public CancellationStatus1Choice setRjctnSts(CancellationRejectionStatus1 value) {
        this.rjctnSts = value;
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
