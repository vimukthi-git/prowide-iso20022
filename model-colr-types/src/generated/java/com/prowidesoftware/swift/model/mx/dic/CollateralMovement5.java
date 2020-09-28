
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
 * Provides the agreed amount and the collateral movement direction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement5", propOrder = {
    "agrdAmt",
    "mvmntDrctn"
})
public class CollateralMovement5 {

    @XmlElement(name = "AgrdAmt", required = true)
    protected ActiveCurrencyAndAmount agrdAmt;
    @XmlElement(name = "MvmntDrctn")
    protected List<CollateralMovement3Choice> mvmntDrctn;

    /**
     * Gets the value of the agrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAgrdAmt() {
        return agrdAmt;
    }

    /**
     * Sets the value of the agrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralMovement5 setAgrdAmt(ActiveCurrencyAndAmount value) {
        this.agrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the mvmntDrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mvmntDrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmntDrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralMovement3Choice }
     * 
     * 
     */
    public List<CollateralMovement3Choice> getMvmntDrctn() {
        if (mvmntDrctn == null) {
            mvmntDrctn = new ArrayList<CollateralMovement3Choice>();
        }
        return this.mvmntDrctn;
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
     * Adds a new item to the mvmntDrctn list.
     * @see #getMvmntDrctn()
     * 
     */
    public CollateralMovement5 addMvmntDrctn(CollateralMovement3Choice mvmntDrctn) {
        getMvmntDrctn().add(mvmntDrctn);
        return this;
    }

}
