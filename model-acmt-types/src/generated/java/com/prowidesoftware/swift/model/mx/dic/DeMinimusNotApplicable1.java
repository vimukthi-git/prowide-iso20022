
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
 * Conditions applicable when the investor is not covered by the "de minimis" exemption.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeMinimusNotApplicable1", propOrder = {
    "rstrctdPrsnRsn"
})
public class DeMinimusNotApplicable1 {

    @XmlElement(name = "RstrctdPrsnRsn", required = true)
    protected String rstrctdPrsnRsn;

    /**
     * Gets the value of the rstrctdPrsnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstrctdPrsnRsn() {
        return rstrctdPrsnRsn;
    }

    /**
     * Sets the value of the rstrctdPrsnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeMinimusNotApplicable1 setRstrctdPrsnRsn(String value) {
        this.rstrctdPrsnRsn = value;
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
