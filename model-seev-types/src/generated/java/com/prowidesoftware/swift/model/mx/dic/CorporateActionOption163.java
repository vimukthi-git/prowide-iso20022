
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption163", propOrder = {
    "optnNb",
    "optnTp",
    "frctnDspstn",
    "offerTp",
    "optnFeatrs",
    "optnAvlbtySts",
    "certfctnBrkdwnTp",
    "nonDmclCtry",
    "vldDmclCtry",
    "ccyOptn",
    "dfltPrcgOrStgInstr",
    "chrgsApldInd",
    "certfctnBrkdwnInd",
    "wdrwlAllwdInd",
    "chngAllwdInd",
    "apldOptnInd",
    "finInstrmId",
    "dtDtls",
    "prdDtls",
    "rateAndAmtDtls",
    "pricDtls",
    "sctiesQty",
    "sctiesMvmntDtls",
    "cshMvmntDtls",
    "addtlInf"
})
public class CorporateActionOption163 {

    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption30Choice optnTp;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType26Choice frctnDspstn;
    @XmlElement(name = "OfferTp")
    protected List<OfferTypeFormat10Choice> offerTp;
    @XmlElement(name = "OptnFeatrs")
    protected List<OptionFeaturesFormat24Choice> optnFeatrs;
    @XmlElement(name = "OptnAvlbtySts")
    protected OptionAvailabilityStatus3Choice optnAvlbtySts;
    @XmlElement(name = "CertfctnBrkdwnTp")
    protected List<BeneficiaryCertificationType9Choice> certfctnBrkdwnTp;
    @XmlElement(name = "NonDmclCtry")
    protected List<String> nonDmclCtry;
    @XmlElement(name = "VldDmclCtry")
    protected List<String> vldDmclCtry;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DfltPrcgOrStgInstr", required = true)
    protected DefaultProcessingOrStandingInstruction1Choice dfltPrcgOrStgInstr;
    @XmlElement(name = "ChrgsApldInd")
    protected Boolean chrgsApldInd;
    @XmlElement(name = "CertfctnBrkdwnInd")
    protected Boolean certfctnBrkdwnInd;
    @XmlElement(name = "WdrwlAllwdInd")
    protected Boolean wdrwlAllwdInd;
    @XmlElement(name = "ChngAllwdInd")
    protected Boolean chngAllwdInd;
    @XmlElement(name = "ApldOptnInd")
    protected Boolean apldOptnInd;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate75 dtDtls;
    @XmlElement(name = "PrdDtls")
    protected CorporateActionPeriod12 prdDtls;
    @XmlElement(name = "RateAndAmtDtls")
    protected CorporateActionRate99 rateAndAmtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice68 pricDtls;
    @XmlElement(name = "SctiesQty")
    protected SecuritiesOption51 sctiesQty;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOption71> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption71> cshMvmntDtls;
    @XmlElement(name = "AddtlInf")
    protected CorporateActionNarrative29 addtlInf;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOption163 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public CorporateActionOption30Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public CorporateActionOption163 setOptnTp(CorporateActionOption30Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType26Choice }
     *     
     */
    public FractionDispositionType26Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType26Choice }
     *     
     */
    public CorporateActionOption163 setFrctnDspstn(FractionDispositionType26Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the offerTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferTypeFormat10Choice }
     * 
     * 
     */
    public List<OfferTypeFormat10Choice> getOfferTp() {
        if (offerTp == null) {
            offerTp = new ArrayList<OfferTypeFormat10Choice>();
        }
        return this.offerTp;
    }

    /**
     * Gets the value of the optnFeatrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnFeatrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnFeatrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionFeaturesFormat24Choice }
     * 
     * 
     */
    public List<OptionFeaturesFormat24Choice> getOptnFeatrs() {
        if (optnFeatrs == null) {
            optnFeatrs = new ArrayList<OptionFeaturesFormat24Choice>();
        }
        return this.optnFeatrs;
    }

    /**
     * Gets the value of the optnAvlbtySts property.
     * 
     * @return
     *     possible object is
     *     {@link OptionAvailabilityStatus3Choice }
     *     
     */
    public OptionAvailabilityStatus3Choice getOptnAvlbtySts() {
        return optnAvlbtySts;
    }

    /**
     * Sets the value of the optnAvlbtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionAvailabilityStatus3Choice }
     *     
     */
    public CorporateActionOption163 setOptnAvlbtySts(OptionAvailabilityStatus3Choice value) {
        this.optnAvlbtySts = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwnTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certfctnBrkdwnTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertfctnBrkdwnTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiaryCertificationType9Choice }
     * 
     * 
     */
    public List<BeneficiaryCertificationType9Choice> getCertfctnBrkdwnTp() {
        if (certfctnBrkdwnTp == null) {
            certfctnBrkdwnTp = new ArrayList<BeneficiaryCertificationType9Choice>();
        }
        return this.certfctnBrkdwnTp;
    }

    /**
     * Gets the value of the nonDmclCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonDmclCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonDmclCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNonDmclCtry() {
        if (nonDmclCtry == null) {
            nonDmclCtry = new ArrayList<String>();
        }
        return this.nonDmclCtry;
    }

    /**
     * Gets the value of the vldDmclCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vldDmclCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVldDmclCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVldDmclCtry() {
        if (vldDmclCtry == null) {
            vldDmclCtry = new ArrayList<String>();
        }
        return this.vldDmclCtry;
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
    public CorporateActionOption163 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the dfltPrcgOrStgInstr property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public DefaultProcessingOrStandingInstruction1Choice getDfltPrcgOrStgInstr() {
        return dfltPrcgOrStgInstr;
    }

    /**
     * Sets the value of the dfltPrcgOrStgInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public CorporateActionOption163 setDfltPrcgOrStgInstr(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltPrcgOrStgInstr = value;
        return this;
    }

    /**
     * Gets the value of the chrgsApldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChrgsApldInd() {
        return chrgsApldInd;
    }

    /**
     * Sets the value of the chrgsApldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption163 setChrgsApldInd(Boolean value) {
        this.chrgsApldInd = value;
        return this;
    }

    /**
     * Gets the value of the certfctnBrkdwnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertfctnBrkdwnInd() {
        return certfctnBrkdwnInd;
    }

    /**
     * Sets the value of the certfctnBrkdwnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption163 setCertfctnBrkdwnInd(Boolean value) {
        this.certfctnBrkdwnInd = value;
        return this;
    }

    /**
     * Gets the value of the wdrwlAllwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWdrwlAllwdInd() {
        return wdrwlAllwdInd;
    }

    /**
     * Sets the value of the wdrwlAllwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption163 setWdrwlAllwdInd(Boolean value) {
        this.wdrwlAllwdInd = value;
        return this;
    }

    /**
     * Gets the value of the chngAllwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChngAllwdInd() {
        return chngAllwdInd;
    }

    /**
     * Sets the value of the chngAllwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption163 setChngAllwdInd(Boolean value) {
        this.chngAllwdInd = value;
        return this;
    }

    /**
     * Gets the value of the apldOptnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApldOptnInd() {
        return apldOptnInd;
    }

    /**
     * Sets the value of the apldOptnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOption163 setApldOptnInd(Boolean value) {
        this.apldOptnInd = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public CorporateActionOption163 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate75 }
     *     
     */
    public CorporateActionDate75 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate75 }
     *     
     */
    public CorporateActionOption163 setDtDtls(CorporateActionDate75 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the prdDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPeriod12 }
     *     
     */
    public CorporateActionPeriod12 getPrdDtls() {
        return prdDtls;
    }

    /**
     * Sets the value of the prdDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPeriod12 }
     *     
     */
    public CorporateActionOption163 setPrdDtls(CorporateActionPeriod12 value) {
        this.prdDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateAndAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate99 }
     *     
     */
    public CorporateActionRate99 getRateAndAmtDtls() {
        return rateAndAmtDtls;
    }

    /**
     * Sets the value of the rateAndAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate99 }
     *     
     */
    public CorporateActionOption163 setRateAndAmtDtls(CorporateActionRate99 value) {
        this.rateAndAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice68 }
     *     
     */
    public CorporateActionPrice68 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice68 }
     *     
     */
    public CorporateActionOption163 setPricDtls(CorporateActionPrice68 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesOption51 }
     *     
     */
    public SecuritiesOption51 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesOption51 }
     *     
     */
    public CorporateActionOption163 setSctiesQty(SecuritiesOption51 value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOption71 }
     * 
     * 
     */
    public List<SecuritiesOption71> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<SecuritiesOption71>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOption71 }
     * 
     * 
     */
    public List<CashOption71> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<CashOption71>();
        }
        return this.cshMvmntDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNarrative29 }
     *     
     */
    public CorporateActionNarrative29 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNarrative29 }
     *     
     */
    public CorporateActionOption163 setAddtlInf(CorporateActionNarrative29 value) {
        this.addtlInf = value;
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
     * Adds a new item to the offerTp list.
     * @see #getOfferTp()
     * 
     */
    public CorporateActionOption163 addOfferTp(OfferTypeFormat10Choice offerTp) {
        getOfferTp().add(offerTp);
        return this;
    }

    /**
     * Adds a new item to the optnFeatrs list.
     * @see #getOptnFeatrs()
     * 
     */
    public CorporateActionOption163 addOptnFeatrs(OptionFeaturesFormat24Choice optnFeatrs) {
        getOptnFeatrs().add(optnFeatrs);
        return this;
    }

    /**
     * Adds a new item to the certfctnBrkdwnTp list.
     * @see #getCertfctnBrkdwnTp()
     * 
     */
    public CorporateActionOption163 addCertfctnBrkdwnTp(BeneficiaryCertificationType9Choice certfctnBrkdwnTp) {
        getCertfctnBrkdwnTp().add(certfctnBrkdwnTp);
        return this;
    }

    /**
     * Adds a new item to the nonDmclCtry list.
     * @see #getNonDmclCtry()
     * 
     */
    public CorporateActionOption163 addNonDmclCtry(String nonDmclCtry) {
        getNonDmclCtry().add(nonDmclCtry);
        return this;
    }

    /**
     * Adds a new item to the vldDmclCtry list.
     * @see #getVldDmclCtry()
     * 
     */
    public CorporateActionOption163 addVldDmclCtry(String vldDmclCtry) {
        getVldDmclCtry().add(vldDmclCtry);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public CorporateActionOption163 addSctiesMvmntDtls(SecuritiesOption71 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public CorporateActionOption163 addCshMvmntDtls(CashOption71 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

}
