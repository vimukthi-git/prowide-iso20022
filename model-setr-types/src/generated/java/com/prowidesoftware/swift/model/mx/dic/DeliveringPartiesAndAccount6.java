
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveringPartiesAndAccount6", propOrder = {
    "dlvrrsCtdnDtls",
    "dlvrrsIntrmyDtls",
    "dlvrgAgtDtls"
})
public class DeliveringPartiesAndAccount6 {

    @XmlElement(name = "DlvrrsCtdnDtls")
    protected PartyIdentificationAndAccount13 dlvrrsCtdnDtls;
    @XmlElement(name = "DlvrrsIntrmyDtls")
    protected PartyIdentificationAndAccount13 dlvrrsIntrmyDtls;
    @XmlElement(name = "DlvrgAgtDtls", required = true)
    protected PartyIdentificationAndAccount13 dlvrgAgtDtls;

    /**
     * Gets the value of the dlvrrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public PartyIdentificationAndAccount13 getDlvrrsCtdnDtls() {
        return dlvrrsCtdnDtls;
    }

    /**
     * Sets the value of the dlvrrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public DeliveringPartiesAndAccount6 setDlvrrsCtdnDtls(PartyIdentificationAndAccount13 value) {
        this.dlvrrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public PartyIdentificationAndAccount13 getDlvrrsIntrmyDtls() {
        return dlvrrsIntrmyDtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public DeliveringPartiesAndAccount6 setDlvrrsIntrmyDtls(PartyIdentificationAndAccount13 value) {
        this.dlvrrsIntrmyDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public PartyIdentificationAndAccount13 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public DeliveringPartiesAndAccount6 setDlvrgAgtDtls(PartyIdentificationAndAccount13 value) {
        this.dlvrgAgtDtls = value;
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
