
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
 * Provides details about the valuation of each piece of collateral that is posted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuation5", propOrder = {
    "collId",
    "collTp",
    "sttlmSts",
    "nbOfDaysAcrd",
    "valtnAmts",
    "dayCntBsis",
    "xchgRate",
    "ccyHrcut",
    "adjstdRate",
    "sctiesColl",
    "cshColl",
    "othrColl"
})
public class CollateralValuation5 {

    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "CollTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralType1Code collTp;
    @XmlElement(name = "SttlmSts", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementStatus2Code sttlmSts;
    @XmlElement(name = "NbOfDaysAcrd", required = true)
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "ValtnAmts", required = true)
    protected CollateralAmount1 valtnAmts;
    @XmlElement(name = "DayCntBsis", required = true)
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code dayCntBsis;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CcyHrcut")
    protected BigDecimal ccyHrcut;
    @XmlElement(name = "AdjstdRate")
    protected BigDecimal adjstdRate;
    @XmlElement(name = "SctiesColl")
    protected SecuritiesCollateral6 sctiesColl;
    @XmlElement(name = "CshColl")
    protected CashCollateral4 cshColl;
    @XmlElement(name = "OthrColl")
    protected OtherCollateral6 othrColl;

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValuation5 setCollId(String value) {
        this.collId = value;
        return this;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType1Code }
     *     
     */
    public CollateralType1Code getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType1Code }
     *     
     */
    public CollateralValuation5 setCollTp(CollateralType1Code value) {
        this.collTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus2Code }
     *     
     */
    public SettlementStatus2Code getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus2Code }
     *     
     */
    public CollateralValuation5 setSttlmSts(SettlementStatus2Code value) {
        this.sttlmSts = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation5 setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount1 }
     *     
     */
    public CollateralAmount1 getValtnAmts() {
        return valtnAmts;
    }

    /**
     * Sets the value of the valtnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount1 }
     *     
     */
    public CollateralValuation5 setValtnAmts(CollateralAmount1 value) {
        this.valtnAmts = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestComputationMethod2Code getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public CollateralValuation5 setDayCntBsis(InterestComputationMethod2Code value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation5 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the ccyHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCcyHrcut() {
        return ccyHrcut;
    }

    /**
     * Sets the value of the ccyHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation5 setCcyHrcut(BigDecimal value) {
        this.ccyHrcut = value;
        return this;
    }

    /**
     * Gets the value of the adjstdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstdRate() {
        return adjstdRate;
    }

    /**
     * Sets the value of the adjstdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CollateralValuation5 setAdjstdRate(BigDecimal value) {
        this.adjstdRate = value;
        return this;
    }

    /**
     * Gets the value of the sctiesColl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesCollateral6 }
     *     
     */
    public SecuritiesCollateral6 getSctiesColl() {
        return sctiesColl;
    }

    /**
     * Sets the value of the sctiesColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesCollateral6 }
     *     
     */
    public CollateralValuation5 setSctiesColl(SecuritiesCollateral6 value) {
        this.sctiesColl = value;
        return this;
    }

    /**
     * Gets the value of the cshColl property.
     * 
     * @return
     *     possible object is
     *     {@link CashCollateral4 }
     *     
     */
    public CashCollateral4 getCshColl() {
        return cshColl;
    }

    /**
     * Sets the value of the cshColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashCollateral4 }
     *     
     */
    public CollateralValuation5 setCshColl(CashCollateral4 value) {
        this.cshColl = value;
        return this;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCollateral6 }
     *     
     */
    public OtherCollateral6 getOthrColl() {
        return othrColl;
    }

    /**
     * Sets the value of the othrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCollateral6 }
     *     
     */
    public CollateralValuation5 setOthrColl(OtherCollateral6 value) {
        this.othrColl = value;
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
