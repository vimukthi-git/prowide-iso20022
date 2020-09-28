
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
@XmlType(name = "CashParties35", propOrder = {
    "dbtr",
    "dbtrAgt",
    "cdtr",
    "cdtrAgt"
})
public class CashParties35 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentificationAndAccount164 dbtr;
    @XmlElement(name = "DbtrAgt")
    protected PartyIdentificationAndAccount171 dbtrAgt;
    @XmlElement(name = "Cdtr")
    protected PartyIdentificationAndAccount164 cdtr;
    @XmlElement(name = "CdtrAgt")
    protected PartyIdentificationAndAccount171 cdtrAgt;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public PartyIdentificationAndAccount164 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public CashParties35 setDbtr(PartyIdentificationAndAccount164 value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public CashParties35 setDbtrAgt(PartyIdentificationAndAccount171 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public PartyIdentificationAndAccount164 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount164 }
     *     
     */
    public CashParties35 setCdtr(PartyIdentificationAndAccount164 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public PartyIdentificationAndAccount171 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount171 }
     *     
     */
    public CashParties35 setCdtrAgt(PartyIdentificationAndAccount171 value) {
        this.cdtrAgt = value;
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
