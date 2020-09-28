
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides the placement agent identification for a hedge fund if the investor was referred by one.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredAgent3", propOrder = {
    "rfrd",
    "rfrdPlcmntAgt"
})
public class ReferredAgent3 {

    @XmlElement(name = "Rfrd", required = true)
    @XmlSchemaType(name = "string")
    protected Referred1Code rfrd;
    @XmlElement(name = "RfrdPlcmntAgt")
    protected PartyIdentification125Choice rfrdPlcmntAgt;

    /**
     * Gets the value of the rfrd property.
     * 
     * @return
     *     possible object is
     *     {@link Referred1Code }
     *     
     */
    public Referred1Code getRfrd() {
        return rfrd;
    }

    /**
     * Sets the value of the rfrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Referred1Code }
     *     
     */
    public ReferredAgent3 setRfrd(Referred1Code value) {
        this.rfrd = value;
        return this;
    }

    /**
     * Gets the value of the rfrdPlcmntAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getRfrdPlcmntAgt() {
        return rfrdPlcmntAgt;
    }

    /**
     * Sets the value of the rfrdPlcmntAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public ReferredAgent3 setRfrdPlcmntAgt(PartyIdentification125Choice value) {
        this.rfrdPlcmntAgt = value;
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
