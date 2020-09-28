
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
 * The DTCCCANOEligibleBalanceSD1 message extends ISO corporate action notification (Eligible Balance market practice) message with DTCC corporate action eligible balance elements not covered in the standard message. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOEligibleBalanceSD1V04", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "dstrbtnAcctBal",
    "redAcctBal"
})
public class DTCCCANOEligibleBalanceSD1V04 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD14 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD9 undrlygScty;
    @XmlElement(name = "DstrbtnAcctBal")
    protected List<AccountBalanceSD7> dstrbtnAcctBal;
    @XmlElement(name = "RedAcctBal")
    protected AccountBalanceSD6 redAcctBal;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD14 }
     *     
     */
    public CorporateActionGeneralInformationSD14 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD14 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V04 setCorpActnGnlInf(CorporateActionGeneralInformationSD14 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD9 }
     *     
     */
    public FinancialInstrumentAttributesSD9 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD9 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V04 setUndrlygScty(FinancialInstrumentAttributesSD9 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnAcctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dstrbtnAcctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDstrbtnAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalanceSD7 }
     * 
     * 
     */
    public List<AccountBalanceSD7> getDstrbtnAcctBal() {
        if (dstrbtnAcctBal == null) {
            dstrbtnAcctBal = new ArrayList<AccountBalanceSD7>();
        }
        return this.dstrbtnAcctBal;
    }

    /**
     * Gets the value of the redAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBalanceSD6 }
     *     
     */
    public AccountBalanceSD6 getRedAcctBal() {
        return redAcctBal;
    }

    /**
     * Sets the value of the redAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBalanceSD6 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V04 setRedAcctBal(AccountBalanceSD6 value) {
        this.redAcctBal = value;
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
     * Adds a new item to the dstrbtnAcctBal list.
     * @see #getDstrbtnAcctBal()
     * 
     */
    public DTCCCANOEligibleBalanceSD1V04 addDstrbtnAcctBal(AccountBalanceSD7 dstrbtnAcctBal) {
        getDstrbtnAcctBal().add(dstrbtnAcctBal);
        return this;
    }

}
