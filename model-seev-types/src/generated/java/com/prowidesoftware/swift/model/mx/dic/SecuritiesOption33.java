
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
 * Provides information about the corporate action security option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption33", propOrder = {
    "sctyDtls",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "nonElgblPrcdsInd",
    "issrOfferrTaxbltyInd",
    "newSctiesIssncInd",
    "entitldQty",
    "frctnDspstn",
    "ccyOptn",
    "tradgPrd",
    "dtDtls",
    "rateDtls",
    "pricDtls"
})
public class SecuritiesOption33 {

    @XmlElement(name = "SctyDtls", required = true)
    protected FinancialInstrumentAttributes34 sctyDtls;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator1Choice tempFinInstrmInd;
    @XmlElement(name = "NonElgblPrcdsInd")
    protected NonEligibleProceedsIndicator1Choice nonElgblPrcdsInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    @XmlSchemaType(name = "string")
    protected IssuerTaxability1Code issrOfferrTaxbltyInd;
    @XmlElement(name = "NewSctiesIssncInd")
    @XmlSchemaType(name = "string")
    protected NewSecuritiesIssuanceType1Code newSctiesIssncInd;
    @XmlElement(name = "EntitldQty")
    protected Quantity6Choice entitldQty;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType19Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "TradgPrd")
    protected Period3Choice tradgPrd;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate9 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate28 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice38 pricDtls;

    /**
     * Gets the value of the sctyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes34 }
     *     
     */
    public FinancialInstrumentAttributes34 getSctyDtls() {
        return sctyDtls;
    }

    /**
     * Sets the value of the sctyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes34 }
     *     
     */
    public SecuritiesOption33 setSctyDtls(FinancialInstrumentAttributes34 value) {
        this.sctyDtls = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public SecuritiesOption33 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryFinancialInstrumentIndicator1Choice }
     *     
     */
    public TemporaryFinancialInstrumentIndicator1Choice getTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryFinancialInstrumentIndicator1Choice }
     *     
     */
    public SecuritiesOption33 setTempFinInstrmInd(TemporaryFinancialInstrumentIndicator1Choice value) {
        this.tempFinInstrmInd = value;
        return this;
    }

    /**
     * Gets the value of the nonElgblPrcdsInd property.
     * 
     * @return
     *     possible object is
     *     {@link NonEligibleProceedsIndicator1Choice }
     *     
     */
    public NonEligibleProceedsIndicator1Choice getNonElgblPrcdsInd() {
        return nonElgblPrcdsInd;
    }

    /**
     * Sets the value of the nonElgblPrcdsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEligibleProceedsIndicator1Choice }
     *     
     */
    public SecuritiesOption33 setNonElgblPrcdsInd(NonEligibleProceedsIndicator1Choice value) {
        this.nonElgblPrcdsInd = value;
        return this;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerTaxability1Code }
     *     
     */
    public IssuerTaxability1Code getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerTaxability1Code }
     *     
     */
    public SecuritiesOption33 setIssrOfferrTaxbltyInd(IssuerTaxability1Code value) {
        this.issrOfferrTaxbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesIssncInd property.
     * 
     * @return
     *     possible object is
     *     {@link NewSecuritiesIssuanceType1Code }
     *     
     */
    public NewSecuritiesIssuanceType1Code getNewSctiesIssncInd() {
        return newSctiesIssncInd;
    }

    /**
     * Sets the value of the newSctiesIssncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSecuritiesIssuanceType1Code }
     *     
     */
    public SecuritiesOption33 setNewSctiesIssncInd(NewSecuritiesIssuanceType1Code value) {
        this.newSctiesIssncInd = value;
        return this;
    }

    /**
     * Gets the value of the entitldQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getEntitldQty() {
        return entitldQty;
    }

    /**
     * Sets the value of the entitldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public SecuritiesOption33 setEntitldQty(Quantity6Choice value) {
        this.entitldQty = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType19Choice }
     *     
     */
    public FractionDispositionType19Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType19Choice }
     *     
     */
    public SecuritiesOption33 setFrctnDspstn(FractionDispositionType19Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the ccyOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOptn() {
        return ccyOptn;
    }

    /**
     * Sets the value of the ccyOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOption33 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3Choice }
     *     
     */
    public Period3Choice getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3Choice }
     *     
     */
    public SecuritiesOption33 setTradgPrd(Period3Choice value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate9 }
     *     
     */
    public SecurityDate9 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate9 }
     *     
     */
    public SecuritiesOption33 setDtDtls(SecurityDate9 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate28 }
     *     
     */
    public CorporateActionRate28 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate28 }
     *     
     */
    public SecuritiesOption33 setRateDtls(CorporateActionRate28 value) {
        this.rateDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice38 }
     *     
     */
    public CorporateActionPrice38 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice38 }
     *     
     */
    public SecuritiesOption33 setPricDtls(CorporateActionPrice38 value) {
        this.pricDtls = value;
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
