
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
 * Payment processes required to transfer cash from the debtor to the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashParties38", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt",
    "intrmy"
})
public class CashParties38 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount177 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount178 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount177 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount178 cdtrAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentificationAndAccount178 intrmy;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public PartyIdentificationAndAccount177 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public CashParties38 setDbtr(PartyIdentificationAndAccount177 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public PartyIdentificationAndAccount178 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public CashParties38 setDbtrAgt(PartyIdentificationAndAccount178 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public PartyIdentificationAndAccount177 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount177 }
     *     
     */
    public CashParties38 setCdtr(PartyIdentificationAndAccount177 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public PartyIdentificationAndAccount178 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public CashParties38 setCdtrAgt(PartyIdentificationAndAccount178 value) {
        this.cdtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public PartyIdentificationAndAccount178 getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount178 }
     *     
     */
    public CashParties38 setIntrmy(PartyIdentificationAndAccount178 value) {
        this.intrmy = value;
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
