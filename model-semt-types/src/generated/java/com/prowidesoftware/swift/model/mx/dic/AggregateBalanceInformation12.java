
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Overall position, in a single security, held in a securities account at a specified place of safekeeping.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateBalanceInformation12", propOrder = {
    "finInstrmId",
    "finInstrmAttrbts",
    "invstmtFndsFinInstrmAttrbts",
    "valtnHrcutDtls",
    "aggtBal",
    "avlblBal",
    "notAvlblBal",
    "sfkpgPlc",
    "corpActnOptnTp",
    "pricDtls",
    "fxDtls",
    "daysAcrd",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "qtyBrkdwn",
    "balBrkdwn",
    "addtlBalBrkdwn",
    "balAtSfkpgPlc",
    "hldgAddtlDtls",
    "splmtryData"
})
public class AggregateBalanceInformation12 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "FinInstrmAttrbts")
    protected FinancialInstrumentAttributes20 finInstrmAttrbts;
    @XmlElement(name = "InvstmtFndsFinInstrmAttrbts")
    protected FinancialInstrument21 invstmtFndsFinInstrmAttrbts;
    @XmlElement(name = "ValtnHrcutDtls")
    protected BasicCollateralValuation1Details valtnHrcutDtls;
    @XmlElement(name = "AggtBal", required = true)
    protected Balance1 aggtBal;
    @XmlElement(name = "AvlblBal")
    protected BalanceQuantity5Choice avlblBal;
    @XmlElement(name = "NotAvlblBal")
    protected BalanceQuantity5Choice notAvlblBal;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat3Choice sfkpgPlc;
    @XmlElement(name = "CorpActnOptnTp")
    @XmlSchemaType(name = "string")
    protected CorporateActionOption5Code corpActnOptnTp;
    @XmlElement(name = "PricDtls")
    protected List<PriceInformation5> pricDtls;
    @XmlElement(name = "FXDtls")
    protected List<ForeignExchangeTerms14> fxDtls;
    @XmlElement(name = "DaysAcrd")
    protected BigDecimal daysAcrd;
    @XmlElement(name = "AcctBaseCcyAmts")
    protected BalanceAmounts3 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts3 instrmCcyAmts;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown3> qtyBrkdwn;
    @XmlElement(name = "BalBrkdwn")
    protected List<SubBalanceInformation5> balBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwn")
    protected List<AdditionalBalanceInformation5> addtlBalBrkdwn;
    @XmlElement(name = "BalAtSfkpgPlc")
    protected List<AggregateBalancePerSafekeepingPlace11> balAtSfkpgPlc;
    @XmlElement(name = "HldgAddtlDtls")
    protected String hldgAddtlDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public AggregateBalanceInformation12 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes20 }
     *     
     */
    public FinancialInstrumentAttributes20 getFinInstrmAttrbts() {
        return finInstrmAttrbts;
    }

    /**
     * Sets the value of the finInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes20 }
     *     
     */
    public AggregateBalanceInformation12 setFinInstrmAttrbts(FinancialInstrumentAttributes20 value) {
        this.finInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument21 }
     *     
     */
    public FinancialInstrument21 getInvstmtFndsFinInstrmAttrbts() {
        return invstmtFndsFinInstrmAttrbts;
    }

    /**
     * Sets the value of the invstmtFndsFinInstrmAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument21 }
     *     
     */
    public AggregateBalanceInformation12 setInvstmtFndsFinInstrmAttrbts(FinancialInstrument21 value) {
        this.invstmtFndsFinInstrmAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the valtnHrcutDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BasicCollateralValuation1Details }
     *     
     */
    public BasicCollateralValuation1Details getValtnHrcutDtls() {
        return valtnHrcutDtls;
    }

    /**
     * Sets the value of the valtnHrcutDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicCollateralValuation1Details }
     *     
     */
    public AggregateBalanceInformation12 setValtnHrcutDtls(BasicCollateralValuation1Details value) {
        this.valtnHrcutDtls = value;
        return this;
    }

    /**
     * Gets the value of the aggtBal property.
     * 
     * @return
     *     possible object is
     *     {@link Balance1 }
     *     
     */
    public Balance1 getAggtBal() {
        return aggtBal;
    }

    /**
     * Sets the value of the aggtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance1 }
     *     
     */
    public AggregateBalanceInformation12 setAggtBal(Balance1 value) {
        this.aggtBal = value;
        return this;
    }

    /**
     * Gets the value of the avlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public BalanceQuantity5Choice getAvlblBal() {
        return avlblBal;
    }

    /**
     * Sets the value of the avlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public AggregateBalanceInformation12 setAvlblBal(BalanceQuantity5Choice value) {
        this.avlblBal = value;
        return this;
    }

    /**
     * Gets the value of the notAvlblBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public BalanceQuantity5Choice getNotAvlblBal() {
        return notAvlblBal;
    }

    /**
     * Sets the value of the notAvlblBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity5Choice }
     *     
     */
    public AggregateBalanceInformation12 setNotAvlblBal(BalanceQuantity5Choice value) {
        this.notAvlblBal = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public SafekeepingPlaceFormat3Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public AggregateBalanceInformation12 setSfkpgPlc(SafekeepingPlaceFormat3Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the corpActnOptnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption5Code }
     *     
     */
    public CorporateActionOption5Code getCorpActnOptnTp() {
        return corpActnOptnTp;
    }

    /**
     * Sets the value of the corpActnOptnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption5Code }
     *     
     */
    public AggregateBalanceInformation12 setCorpActnOptnTp(CorporateActionOption5Code value) {
        this.corpActnOptnTp = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceInformation5 }
     * 
     * 
     */
    public List<PriceInformation5> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<PriceInformation5>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeTerms14 }
     * 
     * 
     */
    public List<ForeignExchangeTerms14> getFXDtls() {
        if (fxDtls == null) {
            fxDtls = new ArrayList<ForeignExchangeTerms14>();
        }
        return this.fxDtls;
    }

    /**
     * Gets the value of the daysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAcrd() {
        return daysAcrd;
    }

    /**
     * Sets the value of the daysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AggregateBalanceInformation12 setDaysAcrd(BigDecimal value) {
        this.daysAcrd = value;
        return this;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public BalanceAmounts3 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public AggregateBalanceInformation12 setAcctBaseCcyAmts(BalanceAmounts3 value) {
        this.acctBaseCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public BalanceAmounts3 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts3 }
     *     
     */
    public AggregateBalanceInformation12 setInstrmCcyAmts(BalanceAmounts3 value) {
        this.instrmCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityBreakdown3 }
     * 
     * 
     */
    public List<QuantityBreakdown3> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown3>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the balBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubBalanceInformation5 }
     * 
     * 
     */
    public List<SubBalanceInformation5> getBalBrkdwn() {
        if (balBrkdwn == null) {
            balBrkdwn = new ArrayList<SubBalanceInformation5>();
        }
        return this.balBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlBalBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation5 }
     * 
     * 
     */
    public List<AdditionalBalanceInformation5> getAddtlBalBrkdwn() {
        if (addtlBalBrkdwn == null) {
            addtlBalBrkdwn = new ArrayList<AdditionalBalanceInformation5>();
        }
        return this.addtlBalBrkdwn;
    }

    /**
     * Gets the value of the balAtSfkpgPlc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balAtSfkpgPlc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalAtSfkpgPlc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalancePerSafekeepingPlace11 }
     * 
     * 
     */
    public List<AggregateBalancePerSafekeepingPlace11> getBalAtSfkpgPlc() {
        if (balAtSfkpgPlc == null) {
            balAtSfkpgPlc = new ArrayList<AggregateBalancePerSafekeepingPlace11>();
        }
        return this.balAtSfkpgPlc;
    }

    /**
     * Gets the value of the hldgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHldgAddtlDtls() {
        return hldgAddtlDtls;
    }

    /**
     * Sets the value of the hldgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AggregateBalanceInformation12 setHldgAddtlDtls(String value) {
        this.hldgAddtlDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the pricDtls list.
     * @see #getPricDtls()
     * 
     */
    public AggregateBalanceInformation12 addPricDtls(PriceInformation5 pricDtls) {
        getPricDtls().add(pricDtls);
        return this;
    }

    /**
     * Adds a new item to the fXDtls list.
     * @see #getFXDtls()
     * 
     */
    public AggregateBalanceInformation12 addFXDtls(ForeignExchangeTerms14 fXDtls) {
        getFXDtls().add(fXDtls);
        return this;
    }

    /**
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public AggregateBalanceInformation12 addQtyBrkdwn(QuantityBreakdown3 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balBrkdwn list.
     * @see #getBalBrkdwn()
     * 
     */
    public AggregateBalanceInformation12 addBalBrkdwn(SubBalanceInformation5 balBrkdwn) {
        getBalBrkdwn().add(balBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the addtlBalBrkdwn list.
     * @see #getAddtlBalBrkdwn()
     * 
     */
    public AggregateBalanceInformation12 addAddtlBalBrkdwn(AdditionalBalanceInformation5 addtlBalBrkdwn) {
        getAddtlBalBrkdwn().add(addtlBalBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the balAtSfkpgPlc list.
     * @see #getBalAtSfkpgPlc()
     * 
     */
    public AggregateBalanceInformation12 addBalAtSfkpgPlc(AggregateBalancePerSafekeepingPlace11 balAtSfkpgPlc) {
        getBalAtSfkpgPlc().add(balAtSfkpgPlc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public AggregateBalanceInformation12 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
