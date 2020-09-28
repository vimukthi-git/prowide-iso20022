
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Characteristics of the ownership of an investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountOwnershipInformation15", propOrder = {
    "pty",
    "mnyLndrgChck",
    "modfdInvstrPrflVldtn",
    "ownrshBnfcryRate",
    "clntId",
    "fsclXmptn",
    "sgntryRghtInd",
    "miFIDClssfctn",
    "ntfctn",
    "fatcaFormTp",
    "fatcaSts",
    "fatcaRptgDt",
    "crsFormTp",
    "crsSts",
    "crsRptgDt",
    "othrId",
    "taxXmptn",
    "taxRptg",
    "lang",
    "mailTp",
    "ctryAndResdtlSts",
    "mntryWlth",
    "eqtyVal",
    "workgCptl",
    "cpnyLk",
    "elctrncMlngSvcRef",
    "pmryComAdr",
    "scndryComAdr",
    "addtlRgltryInf",
    "acctgSts",
    "addtlInf",
    "ctrlgPty"
})
public class InvestmentAccountOwnershipInformation15 {

    @XmlElement(name = "Pty", required = true)
    protected Party33Choice pty;
    @XmlElement(name = "MnyLndrgChck")
    protected MoneyLaunderingCheck1Choice mnyLndrgChck;
    @XmlElement(name = "ModfdInvstrPrflVldtn")
    protected List<ModificationScope27> modfdInvstrPrflVldtn;
    @XmlElement(name = "OwnrshBnfcryRate")
    protected OwnershipBeneficiaryRate1 ownrshBnfcryRate;
    @XmlElement(name = "ClntId")
    protected String clntId;
    @XmlElement(name = "FsclXmptn")
    protected Boolean fsclXmptn;
    @XmlElement(name = "SgntryRghtInd")
    protected Boolean sgntryRghtInd;
    @XmlElement(name = "MiFIDClssfctn")
    protected MiFIDClassification1 miFIDClssfctn;
    @XmlElement(name = "Ntfctn")
    protected List<Notification2> ntfctn;
    @XmlElement(name = "FATCAFormTp")
    protected List<FATCAForm1Choice> fatcaFormTp;
    @XmlElement(name = "FATCASts")
    protected List<FATCAStatus2> fatcaSts;
    @XmlElement(name = "FATCARptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fatcaRptgDt;
    @XmlElement(name = "CRSFormTp")
    protected List<CRSForm1Choice> crsFormTp;
    @XmlElement(name = "CRSSts")
    protected List<CRSStatus4> crsSts;
    @XmlElement(name = "CRSRptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crsRptgDt;
    @XmlElement(name = "OthrId")
    protected List<GenericIdentification82> othrId;
    @XmlElement(name = "TaxXmptn")
    protected TaxExemptionReason2Choice taxXmptn;
    @XmlElement(name = "TaxRptg")
    protected List<TaxReporting2> taxRptg;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "MailTp")
    protected MailType1Choice mailTp;
    @XmlElement(name = "CtryAndResdtlSts")
    protected CountryAndResidentialStatusType2 ctryAndResdtlSts;
    @XmlElement(name = "MntryWlth")
    protected DateAndAmount1 mntryWlth;
    @XmlElement(name = "EqtyVal")
    protected DateAndAmount1 eqtyVal;
    @XmlElement(name = "WorkgCptl")
    protected DateAndAmount1 workgCptl;
    @XmlElement(name = "CpnyLk")
    protected CompanyLink1Choice cpnyLk;
    @XmlElement(name = "ElctrncMlngSvcRef")
    protected String elctrncMlngSvcRef;
    @XmlElement(name = "PmryComAdr")
    protected List<CommunicationAddress6> pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected List<CommunicationAddress6> scndryComAdr;
    @XmlElement(name = "AddtlRgltryInf")
    protected RegulatoryInformation1 addtlRgltryInf;
    @XmlElement(name = "AcctgSts")
    protected AccountingStatus1Choice acctgSts;
    @XmlElement(name = "AddtlInf")
    protected List<AdditiononalInformation12> addtlInf;
    @XmlElement(name = "CtrlgPty")
    protected Boolean ctrlgPty;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link Party33Choice }
     *     
     */
    public Party33Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party33Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setPty(Party33Choice value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the mnyLndrgChck property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyLaunderingCheck1Choice }
     *     
     */
    public MoneyLaunderingCheck1Choice getMnyLndrgChck() {
        return mnyLndrgChck;
    }

    /**
     * Sets the value of the mnyLndrgChck property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyLaunderingCheck1Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setMnyLndrgChck(MoneyLaunderingCheck1Choice value) {
        this.mnyLndrgChck = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstrPrflVldtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdInvstrPrflVldtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdInvstrPrflVldtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope27 }
     * 
     * 
     */
    public List<ModificationScope27> getModfdInvstrPrflVldtn() {
        if (modfdInvstrPrflVldtn == null) {
            modfdInvstrPrflVldtn = new ArrayList<ModificationScope27>();
        }
        return this.modfdInvstrPrflVldtn;
    }

    /**
     * Gets the value of the ownrshBnfcryRate property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipBeneficiaryRate1 }
     *     
     */
    public OwnershipBeneficiaryRate1 getOwnrshBnfcryRate() {
        return ownrshBnfcryRate;
    }

    /**
     * Sets the value of the ownrshBnfcryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipBeneficiaryRate1 }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setOwnrshBnfcryRate(OwnershipBeneficiaryRate1 value) {
        this.ownrshBnfcryRate = value;
        return this;
    }

    /**
     * Gets the value of the clntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntId() {
        return clntId;
    }

    /**
     * Sets the value of the clntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setClntId(String value) {
        this.clntId = value;
        return this;
    }

    /**
     * Gets the value of the fsclXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFsclXmptn() {
        return fsclXmptn;
    }

    /**
     * Sets the value of the fsclXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setFsclXmptn(Boolean value) {
        this.fsclXmptn = value;
        return this;
    }

    /**
     * Gets the value of the sgntryRghtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgntryRghtInd() {
        return sgntryRghtInd;
    }

    /**
     * Sets the value of the sgntryRghtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setSgntryRghtInd(Boolean value) {
        this.sgntryRghtInd = value;
        return this;
    }

    /**
     * Gets the value of the miFIDClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MiFIDClassification1 }
     *     
     */
    public MiFIDClassification1 getMiFIDClssfctn() {
        return miFIDClssfctn;
    }

    /**
     * Sets the value of the miFIDClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiFIDClassification1 }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setMiFIDClssfctn(MiFIDClassification1 value) {
        this.miFIDClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the ntfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification2 }
     * 
     * 
     */
    public List<Notification2> getNtfctn() {
        if (ntfctn == null) {
            ntfctn = new ArrayList<Notification2>();
        }
        return this.ntfctn;
    }

    /**
     * Gets the value of the fatcaFormTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fatcaFormTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFATCAFormTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATCAForm1Choice }
     * 
     * 
     */
    public List<FATCAForm1Choice> getFATCAFormTp() {
        if (fatcaFormTp == null) {
            fatcaFormTp = new ArrayList<FATCAForm1Choice>();
        }
        return this.fatcaFormTp;
    }

    /**
     * Gets the value of the fatcaSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fatcaSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFATCASts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATCAStatus2 }
     * 
     * 
     */
    public List<FATCAStatus2> getFATCASts() {
        if (fatcaSts == null) {
            fatcaSts = new ArrayList<FATCAStatus2>();
        }
        return this.fatcaSts;
    }

    /**
     * Gets the value of the fatcaRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFATCARptgDt() {
        return fatcaRptgDt;
    }

    /**
     * Sets the value of the fatcaRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setFATCARptgDt(XMLGregorianCalendar value) {
        this.fatcaRptgDt = value;
        return this;
    }

    /**
     * Gets the value of the crsFormTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crsFormTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRSFormTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRSForm1Choice }
     * 
     * 
     */
    public List<CRSForm1Choice> getCRSFormTp() {
        if (crsFormTp == null) {
            crsFormTp = new ArrayList<CRSForm1Choice>();
        }
        return this.crsFormTp;
    }

    /**
     * Gets the value of the crsSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crsSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRSSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRSStatus4 }
     * 
     * 
     */
    public List<CRSStatus4> getCRSSts() {
        if (crsSts == null) {
            crsSts = new ArrayList<CRSStatus4>();
        }
        return this.crsSts;
    }

    /**
     * Gets the value of the crsRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCRSRptgDt() {
        return crsRptgDt;
    }

    /**
     * Sets the value of the crsRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setCRSRptgDt(XMLGregorianCalendar value) {
        this.crsRptgDt = value;
        return this;
    }

    /**
     * Gets the value of the othrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification82 }
     * 
     * 
     */
    public List<GenericIdentification82> getOthrId() {
        if (othrId == null) {
            othrId = new ArrayList<GenericIdentification82>();
        }
        return this.othrId;
    }

    /**
     * Gets the value of the taxXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public TaxExemptionReason2Choice getTaxXmptn() {
        return taxXmptn;
    }

    /**
     * Sets the value of the taxXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReason2Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setTaxXmptn(TaxExemptionReason2Choice value) {
        this.taxXmptn = value;
        return this;
    }

    /**
     * Gets the value of the taxRptg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRptg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRptg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxReporting2 }
     * 
     * 
     */
    public List<TaxReporting2> getTaxRptg() {
        if (taxRptg == null) {
            taxRptg = new ArrayList<TaxReporting2>();
        }
        return this.taxRptg;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setLang(String value) {
        this.lang = value;
        return this;
    }

    /**
     * Gets the value of the mailTp property.
     * 
     * @return
     *     possible object is
     *     {@link MailType1Choice }
     *     
     */
    public MailType1Choice getMailTp() {
        return mailTp;
    }

    /**
     * Sets the value of the mailTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailType1Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setMailTp(MailType1Choice value) {
        this.mailTp = value;
        return this;
    }

    /**
     * Gets the value of the ctryAndResdtlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CountryAndResidentialStatusType2 }
     *     
     */
    public CountryAndResidentialStatusType2 getCtryAndResdtlSts() {
        return ctryAndResdtlSts;
    }

    /**
     * Sets the value of the ctryAndResdtlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryAndResidentialStatusType2 }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setCtryAndResdtlSts(CountryAndResidentialStatusType2 value) {
        this.ctryAndResdtlSts = value;
        return this;
    }

    /**
     * Gets the value of the mntryWlth property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount1 }
     *     
     */
    public DateAndAmount1 getMntryWlth() {
        return mntryWlth;
    }

    /**
     * Sets the value of the mntryWlth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount1 }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setMntryWlth(DateAndAmount1 value) {
        this.mntryWlth = value;
        return this;
    }

    /**
     * Gets the value of the eqtyVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount1 }
     *     
     */
    public DateAndAmount1 getEqtyVal() {
        return eqtyVal;
    }

    /**
     * Sets the value of the eqtyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount1 }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setEqtyVal(DateAndAmount1 value) {
        this.eqtyVal = value;
        return this;
    }

    /**
     * Gets the value of the workgCptl property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount1 }
     *     
     */
    public DateAndAmount1 getWorkgCptl() {
        return workgCptl;
    }

    /**
     * Sets the value of the workgCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount1 }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setWorkgCptl(DateAndAmount1 value) {
        this.workgCptl = value;
        return this;
    }

    /**
     * Gets the value of the cpnyLk property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLink1Choice }
     *     
     */
    public CompanyLink1Choice getCpnyLk() {
        return cpnyLk;
    }

    /**
     * Sets the value of the cpnyLk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLink1Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setCpnyLk(CompanyLink1Choice value) {
        this.cpnyLk = value;
        return this;
    }

    /**
     * Gets the value of the elctrncMlngSvcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElctrncMlngSvcRef() {
        return elctrncMlngSvcRef;
    }

    /**
     * Sets the value of the elctrncMlngSvcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setElctrncMlngSvcRef(String value) {
        this.elctrncMlngSvcRef = value;
        return this;
    }

    /**
     * Gets the value of the pmryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     */
    public List<CommunicationAddress6> getPmryComAdr() {
        if (pmryComAdr == null) {
            pmryComAdr = new ArrayList<CommunicationAddress6>();
        }
        return this.pmryComAdr;
    }

    /**
     * Gets the value of the scndryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scndryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     */
    public List<CommunicationAddress6> getScndryComAdr() {
        if (scndryComAdr == null) {
            scndryComAdr = new ArrayList<CommunicationAddress6>();
        }
        return this.scndryComAdr;
    }

    /**
     * Gets the value of the addtlRgltryInf property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryInformation1 }
     *     
     */
    public RegulatoryInformation1 getAddtlRgltryInf() {
        return addtlRgltryInf;
    }

    /**
     * Sets the value of the addtlRgltryInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryInformation1 }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setAddtlRgltryInf(RegulatoryInformation1 value) {
        this.addtlRgltryInf = value;
        return this;
    }

    /**
     * Gets the value of the acctgSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public AccountingStatus1Choice getAcctgSts() {
        return acctgSts;
    }

    /**
     * Sets the value of the acctgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingStatus1Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setAcctgSts(AccountingStatus1Choice value) {
        this.acctgSts = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditiononalInformation12 }
     * 
     * 
     */
    public List<AdditiononalInformation12> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditiononalInformation12>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the ctrlgPty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrlgPty() {
        return ctrlgPty;
    }

    /**
     * Sets the value of the ctrlgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccountOwnershipInformation15 setCtrlgPty(Boolean value) {
        this.ctrlgPty = value;
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
     * Adds a new item to the modfdInvstrPrflVldtn list.
     * @see #getModfdInvstrPrflVldtn()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addModfdInvstrPrflVldtn(ModificationScope27 modfdInvstrPrflVldtn) {
        getModfdInvstrPrflVldtn().add(modfdInvstrPrflVldtn);
        return this;
    }

    /**
     * Adds a new item to the ntfctn list.
     * @see #getNtfctn()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addNtfctn(Notification2 ntfctn) {
        getNtfctn().add(ntfctn);
        return this;
    }

    /**
     * Adds a new item to the fATCAFormTp list.
     * @see #getFATCAFormTp()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addFATCAFormTp(FATCAForm1Choice fATCAFormTp) {
        getFATCAFormTp().add(fATCAFormTp);
        return this;
    }

    /**
     * Adds a new item to the fATCASts list.
     * @see #getFATCASts()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addFATCASts(FATCAStatus2 fATCASts) {
        getFATCASts().add(fATCASts);
        return this;
    }

    /**
     * Adds a new item to the cRSFormTp list.
     * @see #getCRSFormTp()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addCRSFormTp(CRSForm1Choice cRSFormTp) {
        getCRSFormTp().add(cRSFormTp);
        return this;
    }

    /**
     * Adds a new item to the cRSSts list.
     * @see #getCRSSts()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addCRSSts(CRSStatus4 cRSSts) {
        getCRSSts().add(cRSSts);
        return this;
    }

    /**
     * Adds a new item to the othrId list.
     * @see #getOthrId()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addOthrId(GenericIdentification82 othrId) {
        getOthrId().add(othrId);
        return this;
    }

    /**
     * Adds a new item to the taxRptg list.
     * @see #getTaxRptg()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addTaxRptg(TaxReporting2 taxRptg) {
        getTaxRptg().add(taxRptg);
        return this;
    }

    /**
     * Adds a new item to the pmryComAdr list.
     * @see #getPmryComAdr()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addPmryComAdr(CommunicationAddress6 pmryComAdr) {
        getPmryComAdr().add(pmryComAdr);
        return this;
    }

    /**
     * Adds a new item to the scndryComAdr list.
     * @see #getScndryComAdr()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addScndryComAdr(CommunicationAddress6 scndryComAdr) {
        getScndryComAdr().add(scndryComAdr);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public InvestmentAccountOwnershipInformation15 addAddtlInf(AdditiononalInformation12 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
