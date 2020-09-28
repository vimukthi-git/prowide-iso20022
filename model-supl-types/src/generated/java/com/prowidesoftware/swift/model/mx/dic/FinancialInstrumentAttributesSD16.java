
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides additional information regarding corporate action option securities movement security details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributesSD16", propOrder = {
    "plcAndNm",
    "dtcSctyTrfblFlg",
    "dclrdDsbrsdSctyDtls",
    "dtcDsbrsdSctyAsstTp",
    "dtcDsbrsdSctyAsstClss",
    "babyBdDnmtn"
})
public class FinancialInstrumentAttributesSD16 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "DTCSctyTrfblFlg")
    protected Boolean dtcSctyTrfblFlg;
    @XmlElement(name = "DclrdDsbrsdSctyDtls")
    protected FinancialInstrumentAttributesSD18 dclrdDsbrsdSctyDtls;
    @XmlElement(name = "DTCDsbrsdSctyAsstTp")
    @XmlSchemaType(name = "string")
    protected DTCAssetType3Code dtcDsbrsdSctyAsstTp;
    @XmlElement(name = "DTCDsbrsdSctyAsstClss")
    @XmlSchemaType(name = "string")
    protected AssetClass1Code dtcDsbrsdSctyAsstClss;
    @XmlElement(name = "BabyBdDnmtn")
    protected BigDecimal babyBdDnmtn;

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
    public FinancialInstrumentAttributesSD16 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the dtcSctyTrfblFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDTCSctyTrfblFlg() {
        return dtcSctyTrfblFlg;
    }

    /**
     * Sets the value of the dtcSctyTrfblFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD16 setDTCSctyTrfblFlg(Boolean value) {
        this.dtcSctyTrfblFlg = value;
        return this;
    }

    /**
     * Gets the value of the dclrdDsbrsdSctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD18 }
     *     
     */
    public FinancialInstrumentAttributesSD18 getDclrdDsbrsdSctyDtls() {
        return dclrdDsbrsdSctyDtls;
    }

    /**
     * Sets the value of the dclrdDsbrsdSctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD18 }
     *     
     */
    public FinancialInstrumentAttributesSD16 setDclrdDsbrsdSctyDtls(FinancialInstrumentAttributesSD18 value) {
        this.dclrdDsbrsdSctyDtls = value;
        return this;
    }

    /**
     * Gets the value of the dtcDsbrsdSctyAsstTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCAssetType3Code }
     *     
     */
    public DTCAssetType3Code getDTCDsbrsdSctyAsstTp() {
        return dtcDsbrsdSctyAsstTp;
    }

    /**
     * Sets the value of the dtcDsbrsdSctyAsstTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCAssetType3Code }
     *     
     */
    public FinancialInstrumentAttributesSD16 setDTCDsbrsdSctyAsstTp(DTCAssetType3Code value) {
        this.dtcDsbrsdSctyAsstTp = value;
        return this;
    }

    /**
     * Gets the value of the dtcDsbrsdSctyAsstClss property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClass1Code }
     *     
     */
    public AssetClass1Code getDTCDsbrsdSctyAsstClss() {
        return dtcDsbrsdSctyAsstClss;
    }

    /**
     * Sets the value of the dtcDsbrsdSctyAsstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClass1Code }
     *     
     */
    public FinancialInstrumentAttributesSD16 setDTCDsbrsdSctyAsstClss(AssetClass1Code value) {
        this.dtcDsbrsdSctyAsstClss = value;
        return this;
    }

    /**
     * Gets the value of the babyBdDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBabyBdDnmtn() {
        return babyBdDnmtn;
    }

    /**
     * Sets the value of the babyBdDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributesSD16 setBabyBdDnmtn(BigDecimal value) {
        this.babyBdDnmtn = value;
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
