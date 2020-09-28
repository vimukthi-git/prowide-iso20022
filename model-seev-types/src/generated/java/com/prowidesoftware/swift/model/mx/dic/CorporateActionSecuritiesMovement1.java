
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
 * Information about the securities movements.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSecuritiesMovement1", propOrder = {
    "pstngDtTm",
    "sctyId",
    "pstngQty",
    "acctDtls"
})
public class CorporateActionSecuritiesMovement1 {

    @XmlElement(name = "PstngDtTm")
    protected DateAndDateTimeChoice pstngDtTm;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "PstngQty", required = true)
    protected UnitOrFaceAmount1Choice pstngQty;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<SecuritiesAccount8> acctDtls;

    /**
     * Gets the value of the pstngDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPstngDtTm() {
        return pstngDtTm;
    }

    /**
     * Sets the value of the pstngDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public CorporateActionSecuritiesMovement1 setPstngDtTm(DateAndDateTimeChoice value) {
        this.pstngDtTm = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public CorporateActionSecuritiesMovement1 setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateActionSecuritiesMovement1 setPstngQty(UnitOrFaceAmount1Choice value) {
        this.pstngQty = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount8 }
     * 
     * 
     */
    public List<SecuritiesAccount8> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<SecuritiesAccount8>();
        }
        return this.acctDtls;
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
     * Adds a new item to the acctDtls list.
     * @see #getAcctDtls()
     * 
     */
    public CorporateActionSecuritiesMovement1 addAcctDtls(SecuritiesAccount8 acctDtls) {
        getAcctDtls().add(acctDtls);
        return this;
    }

}
