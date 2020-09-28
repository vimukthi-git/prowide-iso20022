
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
 * Characteristics and values set for a bilateral limit, including the counterparty upon which the limit applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilateralLimit3", propOrder = {
    "ctrPtyId",
    "lmtAmt",
    "cdtDbtInd",
    "bilBal"
})
public class BilateralLimit3 {

    @XmlElement(name = "CtrPtyId", required = true)
    protected BranchAndFinancialInstitutionIdentification6 ctrPtyId;
    @XmlElement(name = "LmtAmt", required = true)
    protected Amount2Choice lmtAmt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "BilBal")
    protected List<CashBalance11> bilBal;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BilateralLimit3 setCtrPtyId(BranchAndFinancialInstitutionIdentification6 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the lmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getLmtAmt() {
        return lmtAmt;
    }

    /**
     * Sets the value of the lmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public BilateralLimit3 setLmtAmt(Amount2Choice value) {
        this.lmtAmt = value;
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
    public BilateralLimit3 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the bilBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance11 }
     * 
     * 
     */
    public List<CashBalance11> getBilBal() {
        if (bilBal == null) {
            bilBal = new ArrayList<CashBalance11>();
        }
        return this.bilBal;
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
     * Adds a new item to the bilBal list.
     * @see #getBilBal()
     * 
     */
    public BilateralLimit3 addBilBal(CashBalance11 bilBal) {
        getBilBal().add(bilBal);
        return this;
    }

}
