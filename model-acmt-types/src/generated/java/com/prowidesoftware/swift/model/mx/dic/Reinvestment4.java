
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
 * Reinvestment information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reinvestment4", propOrder = {
    "finInstrmDtls",
    "reqdNAVCcy",
    "rinvstmtPctg"
})
public class Reinvestment4 {

    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument87 finInstrmDtls;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "RinvstmtPctg", required = true)
    protected BigDecimal rinvstmtPctg;

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument87 }
     *     
     */
    public FinancialInstrument87 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument87 }
     *     
     */
    public Reinvestment4 setFinInstrmDtls(FinancialInstrument87 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reinvestment4 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRinvstmtPctg() {
        return rinvstmtPctg;
    }

    /**
     * Sets the value of the rinvstmtPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Reinvestment4 setRinvstmtPctg(BigDecimal value) {
        this.rinvstmtPctg = value;
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
