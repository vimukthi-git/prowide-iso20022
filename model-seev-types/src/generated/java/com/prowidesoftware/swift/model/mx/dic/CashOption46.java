
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Provides information about the cash option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption46", propOrder = {
    "cdtDbtInd",
    "ctrctlPmtInd",
    "issrOfferrTaxbltyInd",
    "incmTp",
    "xmptnTp",
    "ctryOfIncmSrc",
    "acct",
    "cshPties",
    "amtDtls",
    "dtDtls",
    "fxDtls",
    "taxVchrDtls",
    "rateAndAmtDtls",
    "pricDtls"
})
public class CashOption46 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CtrctlPmtInd")
    @XmlSchemaType(name = "string")
    protected Payment1Code ctrctlPmtInd;
    @XmlElement(name = "IssrOfferrTaxbltyInd")
    protected GenericIdentification47 issrOfferrTaxbltyInd;
    @XmlElement(name = "IncmTp")
    protected GenericIdentification47 incmTp;
    @XmlElement(name = "XmptnTp")
    protected List<GenericIdentification47> xmptnTp;
    @XmlElement(name = "CtryOfIncmSrc")
    protected String ctryOfIncmSrc;
    @XmlElement(name = "Acct")
    protected Account9Choice acct;
    @XmlElement(name = "CshPties")
    protected CashParties29 cshPties;
    @XmlElement(name = "AmtDtls", required = true)
    protected CorporateActionAmounts39 amtDtls;
    @XmlElement(name = "DtDtls", required = true)
    protected CorporateActionDate24 dtDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms27 fxDtls;
    @XmlElement(name = "TaxVchrDtls")
    protected TaxVoucher3 taxVchrDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected RateDetails24 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected PriceDetails24 pricDtls;

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
    public CashOption46 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the ctrctlPmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Payment1Code }
     *     
     */
    public Payment1Code getCtrctlPmtInd() {
        return ctrctlPmtInd;
    }

    /**
     * Sets the value of the ctrctlPmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment1Code }
     *     
     */
    public CashOption46 setCtrctlPmtInd(Payment1Code value) {
        this.ctrctlPmtInd = value;
        return this;
    }

    /**
     * Gets the value of the issrOfferrTaxbltyInd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getIssrOfferrTaxbltyInd() {
        return issrOfferrTaxbltyInd;
    }

    /**
     * Sets the value of the issrOfferrTaxbltyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public CashOption46 setIssrOfferrTaxbltyInd(GenericIdentification47 value) {
        this.issrOfferrTaxbltyInd = value;
        return this;
    }

    /**
     * Gets the value of the incmTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getIncmTp() {
        return incmTp;
    }

    /**
     * Sets the value of the incmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public CashOption46 setIncmTp(GenericIdentification47 value) {
        this.incmTp = value;
        return this;
    }

    /**
     * Gets the value of the xmptnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmptnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXmptnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification47 }
     * 
     * 
     */
    public List<GenericIdentification47> getXmptnTp() {
        if (xmptnTp == null) {
            xmptnTp = new ArrayList<GenericIdentification47>();
        }
        return this.xmptnTp;
    }

    /**
     * Gets the value of the ctryOfIncmSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncmSrc() {
        return ctryOfIncmSrc;
    }

    /**
     * Sets the value of the ctryOfIncmSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashOption46 setCtryOfIncmSrc(String value) {
        this.ctryOfIncmSrc = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account9Choice }
     *     
     */
    public Account9Choice getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account9Choice }
     *     
     */
    public CashOption46 setAcct(Account9Choice value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the cshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties29 }
     *     
     */
    public CashParties29 getCshPties() {
        return cshPties;
    }

    /**
     * Sets the value of the cshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties29 }
     *     
     */
    public CashOption46 setCshPties(CashParties29 value) {
        this.cshPties = value;
        return this;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAmounts39 }
     *     
     */
    public CorporateActionAmounts39 getAmtDtls() {
        return amtDtls;
    }

    /**
     * Sets the value of the amtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAmounts39 }
     *     
     */
    public CashOption46 setAmtDtls(CorporateActionAmounts39 value) {
        this.amtDtls = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate24 }
     *     
     */
    public CorporateActionDate24 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate24 }
     *     
     */
    public CashOption46 setDtDtls(CorporateActionDate24 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms27 }
     *     
     */
    public ForeignExchangeTerms27 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms27 }
     *     
     */
    public CashOption46 setFXDtls(ForeignExchangeTerms27 value) {
        this.fxDtls = value;
        return this;
    }

    /**
     * Gets the value of the taxVchrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TaxVoucher3 }
     *     
     */
    public TaxVoucher3 getTaxVchrDtls() {
        return taxVchrDtls;
    }

    /**
     * Sets the value of the taxVchrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxVoucher3 }
     *     
     */
    public CashOption46 setTaxVchrDtls(TaxVoucher3 value) {
        this.taxVchrDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RateDetails24 }
     *     
     */
    public RateDetails24 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateDetails24 }
     *     
     */
    public CashOption46 setRateAndAmtDtls(RateDetails24 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PriceDetails24 }
     *     
     */
    public PriceDetails24 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDetails24 }
     *     
     */
    public CashOption46 setPricDtls(PriceDetails24 value) {
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

    /**
     * Adds a new item to the xmptnTp list.
     * @see #getXmptnTp()
     * 
     */
    public CashOption46 addXmptnTp(GenericIdentification47 xmptnTp) {
        getXmptnTp().add(xmptnTp);
        return this;
    }

}
