
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
 * Defines the criteria which are used to search for the status of the payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatusSearch5", propOrder = {
    "pmtInstrSts",
    "pmtInstrStsDtTm",
    "prtryStsRsn"
})
public class InstructionStatusSearch5 {

    @XmlElement(name = "PmtInstrSts")
    protected PaymentStatusCodeSearch2Choice pmtInstrSts;
    @XmlElement(name = "PmtInstrStsDtTm")
    protected DateTimePeriod1Choice pmtInstrStsDtTm;
    @XmlElement(name = "PrtryStsRsn")
    protected String prtryStsRsn;

    /**
     * Gets the value of the pmtInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public PaymentStatusCodeSearch2Choice getPmtInstrSts() {
        return pmtInstrSts;
    }

    /**
     * Sets the value of the pmtInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public InstructionStatusSearch5 setPmtInstrSts(PaymentStatusCodeSearch2Choice value) {
        this.pmtInstrSts = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPmtInstrStsDtTm() {
        return pmtInstrStsDtTm;
    }

    /**
     * Sets the value of the pmtInstrStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public InstructionStatusSearch5 setPmtInstrStsDtTm(DateTimePeriod1Choice value) {
        this.pmtInstrStsDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prtryStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryStsRsn() {
        return prtryStsRsn;
    }

    /**
     * Sets the value of the prtryStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructionStatusSearch5 setPrtryStsRsn(String value) {
        this.prtryStsRsn = value;
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
