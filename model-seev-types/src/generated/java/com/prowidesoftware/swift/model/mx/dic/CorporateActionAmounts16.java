
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
 * Specifies amounts in the framework of a corporate action event.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionAmounts16", propOrder = {
    "grssCshAmt",
    "netCshAmt",
    "slctnFees",
    "cshInLieuOfShr",
    "cptlGn",
    "intrstAmt",
    "mktClmAmt",
    "indmntyAmt",
    "manfctrdDvddPmtAmt",
    "rinvstmtAmt",
    "fullyFrnkdAmt",
    "ufrnkdAmt",
    "sndryOrOthrAmt",
    "cshIncntiv",
    "taxFreeAmt",
    "taxDfrrdAmt",
    "valAddedTaxAmt",
    "stmpDtyAmt",
    "taxRclmAmt",
    "taxCdtAmt",
    "whldgOfFrgnTaxAmt",
    "whldgOfLclTaxAmt",
    "addtlTaxAmt",
    "whldgTaxAmt",
    "fsclStmpAmt",
    "exctgBrkrAmt",
    "pngAgtComssnAmt",
    "lclBrkrComssnAmt",
    "rgltryFeesAmt",
    "shppgFeesAmt",
    "chrgsAmt",
    "entitldAmt",
    "orgnlAmt",
    "acrdIntrstAmt",
    "incmPrtn"
})
public class CorporateActionAmounts16 {

    @XmlElement(name = "GrssCshAmt")
    protected ActiveCurrencyAndAmount grssCshAmt;
    @XmlElement(name = "NetCshAmt")
    protected ActiveCurrencyAndAmount netCshAmt;
    @XmlElement(name = "SlctnFees")
    protected ActiveCurrencyAndAmount slctnFees;
    @XmlElement(name = "CshInLieuOfShr")
    protected ActiveCurrencyAndAmount cshInLieuOfShr;
    @XmlElement(name = "CptlGn")
    protected ActiveCurrencyAndAmount cptlGn;
    @XmlElement(name = "IntrstAmt")
    protected ActiveCurrencyAndAmount intrstAmt;
    @XmlElement(name = "MktClmAmt")
    protected ActiveCurrencyAndAmount mktClmAmt;
    @XmlElement(name = "IndmntyAmt")
    protected ActiveCurrencyAndAmount indmntyAmt;
    @XmlElement(name = "ManfctrdDvddPmtAmt")
    protected ActiveCurrencyAndAmount manfctrdDvddPmtAmt;
    @XmlElement(name = "RinvstmtAmt")
    protected ActiveCurrencyAndAmount rinvstmtAmt;
    @XmlElement(name = "FullyFrnkdAmt")
    protected ActiveCurrencyAndAmount fullyFrnkdAmt;
    @XmlElement(name = "UfrnkdAmt")
    protected ActiveCurrencyAndAmount ufrnkdAmt;
    @XmlElement(name = "SndryOrOthrAmt")
    protected ActiveCurrencyAndAmount sndryOrOthrAmt;
    @XmlElement(name = "CshIncntiv")
    protected ActiveCurrencyAndAmount cshIncntiv;
    @XmlElement(name = "TaxFreeAmt")
    protected ActiveCurrencyAndAmount taxFreeAmt;
    @XmlElement(name = "TaxDfrrdAmt")
    protected ActiveCurrencyAndAmount taxDfrrdAmt;
    @XmlElement(name = "ValAddedTaxAmt")
    protected ActiveCurrencyAndAmount valAddedTaxAmt;
    @XmlElement(name = "StmpDtyAmt")
    protected ActiveCurrencyAndAmount stmpDtyAmt;
    @XmlElement(name = "TaxRclmAmt")
    protected ActiveCurrencyAndAmount taxRclmAmt;
    @XmlElement(name = "TaxCdtAmt")
    protected ActiveCurrencyAndAmount taxCdtAmt;
    @XmlElement(name = "WhldgOfFrgnTaxAmt")
    protected ActiveCurrencyAndAmount whldgOfFrgnTaxAmt;
    @XmlElement(name = "WhldgOfLclTaxAmt")
    protected ActiveCurrencyAndAmount whldgOfLclTaxAmt;
    @XmlElement(name = "AddtlTaxAmt")
    protected ActiveCurrencyAndAmount addtlTaxAmt;
    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "FsclStmpAmt")
    protected ActiveCurrencyAndAmount fsclStmpAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected ActiveCurrencyAndAmount exctgBrkrAmt;
    @XmlElement(name = "PngAgtComssnAmt")
    protected ActiveCurrencyAndAmount pngAgtComssnAmt;
    @XmlElement(name = "LclBrkrComssnAmt")
    protected ActiveCurrencyAndAmount lclBrkrComssnAmt;
    @XmlElement(name = "RgltryFeesAmt")
    protected ActiveCurrencyAndAmount rgltryFeesAmt;
    @XmlElement(name = "ShppgFeesAmt")
    protected ActiveCurrencyAndAmount shppgFeesAmt;
    @XmlElement(name = "ChrgsAmt")
    protected ActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "EntitldAmt")
    protected ActiveCurrencyAndAmount entitldAmt;
    @XmlElement(name = "OrgnlAmt")
    protected ActiveCurrencyAndAmount orgnlAmt;
    @XmlElement(name = "AcrdIntrstAmt")
    protected ActiveCurrencyAndAmount acrdIntrstAmt;
    @XmlElement(name = "IncmPrtn")
    protected ActiveCurrencyAndAmount incmPrtn;

    /**
     * Gets the value of the grssCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssCshAmt() {
        return grssCshAmt;
    }

    /**
     * Sets the value of the grssCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setGrssCshAmt(ActiveCurrencyAndAmount value) {
        this.grssCshAmt = value;
        return this;
    }

    /**
     * Gets the value of the netCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetCshAmt() {
        return netCshAmt;
    }

    /**
     * Sets the value of the netCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setNetCshAmt(ActiveCurrencyAndAmount value) {
        this.netCshAmt = value;
        return this;
    }

    /**
     * Gets the value of the slctnFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSlctnFees() {
        return slctnFees;
    }

    /**
     * Sets the value of the slctnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setSlctnFees(ActiveCurrencyAndAmount value) {
        this.slctnFees = value;
        return this;
    }

    /**
     * Gets the value of the cshInLieuOfShr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshInLieuOfShr() {
        return cshInLieuOfShr;
    }

    /**
     * Sets the value of the cshInLieuOfShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setCshInLieuOfShr(ActiveCurrencyAndAmount value) {
        this.cshInLieuOfShr = value;
        return this;
    }

    /**
     * Gets the value of the cptlGn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCptlGn() {
        return cptlGn;
    }

    /**
     * Sets the value of the cptlGn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setCptlGn(ActiveCurrencyAndAmount value) {
        this.cptlGn = value;
        return this;
    }

    /**
     * Gets the value of the intrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntrstAmt() {
        return intrstAmt;
    }

    /**
     * Sets the value of the intrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setIntrstAmt(ActiveCurrencyAndAmount value) {
        this.intrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the mktClmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktClmAmt() {
        return mktClmAmt;
    }

    /**
     * Sets the value of the mktClmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setMktClmAmt(ActiveCurrencyAndAmount value) {
        this.mktClmAmt = value;
        return this;
    }

    /**
     * Gets the value of the indmntyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIndmntyAmt() {
        return indmntyAmt;
    }

    /**
     * Sets the value of the indmntyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setIndmntyAmt(ActiveCurrencyAndAmount value) {
        this.indmntyAmt = value;
        return this;
    }

    /**
     * Gets the value of the manfctrdDvddPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getManfctrdDvddPmtAmt() {
        return manfctrdDvddPmtAmt;
    }

    /**
     * Sets the value of the manfctrdDvddPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setManfctrdDvddPmtAmt(ActiveCurrencyAndAmount value) {
        this.manfctrdDvddPmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRinvstmtAmt() {
        return rinvstmtAmt;
    }

    /**
     * Sets the value of the rinvstmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setRinvstmtAmt(ActiveCurrencyAndAmount value) {
        this.rinvstmtAmt = value;
        return this;
    }

    /**
     * Gets the value of the fullyFrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFullyFrnkdAmt() {
        return fullyFrnkdAmt;
    }

    /**
     * Sets the value of the fullyFrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setFullyFrnkdAmt(ActiveCurrencyAndAmount value) {
        this.fullyFrnkdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ufrnkdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUfrnkdAmt() {
        return ufrnkdAmt;
    }

    /**
     * Sets the value of the ufrnkdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setUfrnkdAmt(ActiveCurrencyAndAmount value) {
        this.ufrnkdAmt = value;
        return this;
    }

    /**
     * Gets the value of the sndryOrOthrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSndryOrOthrAmt() {
        return sndryOrOthrAmt;
    }

    /**
     * Sets the value of the sndryOrOthrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setSndryOrOthrAmt(ActiveCurrencyAndAmount value) {
        this.sndryOrOthrAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshIncntiv property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshIncntiv() {
        return cshIncntiv;
    }

    /**
     * Sets the value of the cshIncntiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setCshIncntiv(ActiveCurrencyAndAmount value) {
        this.cshIncntiv = value;
        return this;
    }

    /**
     * Gets the value of the taxFreeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxFreeAmt() {
        return taxFreeAmt;
    }

    /**
     * Sets the value of the taxFreeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setTaxFreeAmt(ActiveCurrencyAndAmount value) {
        this.taxFreeAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxDfrrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxDfrrdAmt() {
        return taxDfrrdAmt;
    }

    /**
     * Sets the value of the taxDfrrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setTaxDfrrdAmt(ActiveCurrencyAndAmount value) {
        this.taxDfrrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getValAddedTaxAmt() {
        return valAddedTaxAmt;
    }

    /**
     * Sets the value of the valAddedTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setValAddedTaxAmt(ActiveCurrencyAndAmount value) {
        this.valAddedTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmpDtyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getStmpDtyAmt() {
        return stmpDtyAmt;
    }

    /**
     * Sets the value of the stmpDtyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setStmpDtyAmt(ActiveCurrencyAndAmount value) {
        this.stmpDtyAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxRclmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxRclmAmt() {
        return taxRclmAmt;
    }

    /**
     * Sets the value of the taxRclmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setTaxRclmAmt(ActiveCurrencyAndAmount value) {
        this.taxRclmAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTaxCdtAmt() {
        return taxCdtAmt;
    }

    /**
     * Sets the value of the taxCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setTaxCdtAmt(ActiveCurrencyAndAmount value) {
        this.taxCdtAmt = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfFrgnTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgOfFrgnTaxAmt() {
        return whldgOfFrgnTaxAmt;
    }

    /**
     * Sets the value of the whldgOfFrgnTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setWhldgOfFrgnTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgOfFrgnTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the whldgOfLclTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgOfLclTaxAmt() {
        return whldgOfLclTaxAmt;
    }

    /**
     * Sets the value of the whldgOfLclTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setWhldgOfLclTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgOfLclTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAddtlTaxAmt() {
        return addtlTaxAmt;
    }

    /**
     * Sets the value of the addtlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setAddtlTaxAmt(ActiveCurrencyAndAmount value) {
        this.addtlTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
        return this;
    }

    /**
     * Gets the value of the fsclStmpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getFsclStmpAmt() {
        return fsclStmpAmt;
    }

    /**
     * Sets the value of the fsclStmpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setFsclStmpAmt(ActiveCurrencyAndAmount value) {
        this.fsclStmpAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setExctgBrkrAmt(ActiveCurrencyAndAmount value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the pngAgtComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPngAgtComssnAmt() {
        return pngAgtComssnAmt;
    }

    /**
     * Sets the value of the pngAgtComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setPngAgtComssnAmt(ActiveCurrencyAndAmount value) {
        this.pngAgtComssnAmt = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLclBrkrComssnAmt() {
        return lclBrkrComssnAmt;
    }

    /**
     * Sets the value of the lclBrkrComssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setLclBrkrComssnAmt(ActiveCurrencyAndAmount value) {
        this.lclBrkrComssnAmt = value;
        return this;
    }

    /**
     * Gets the value of the rgltryFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRgltryFeesAmt() {
        return rgltryFeesAmt;
    }

    /**
     * Sets the value of the rgltryFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setRgltryFeesAmt(ActiveCurrencyAndAmount value) {
        this.rgltryFeesAmt = value;
        return this;
    }

    /**
     * Gets the value of the shppgFeesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getShppgFeesAmt() {
        return shppgFeesAmt;
    }

    /**
     * Sets the value of the shppgFeesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setShppgFeesAmt(ActiveCurrencyAndAmount value) {
        this.shppgFeesAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setChrgsAmt(ActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
        return this;
    }

    /**
     * Gets the value of the entitldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEntitldAmt() {
        return entitldAmt;
    }

    /**
     * Sets the value of the entitldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setEntitldAmt(ActiveCurrencyAndAmount value) {
        this.entitldAmt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setOrgnlAmt(ActiveCurrencyAndAmount value) {
        this.orgnlAmt = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setAcrdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the incmPrtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIncmPrtn() {
        return incmPrtn;
    }

    /**
     * Sets the value of the incmPrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CorporateActionAmounts16 setIncmPrtn(ActiveCurrencyAndAmount value) {
        this.incmPrtn = value;
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
