
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
 * Environment of the cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment12", propOrder = {
    "acqrr",
    "mrchnt",
    "poi",
    "card"
})
public class CardPaymentEnvironment12 {

    @XmlElement(name = "Acqrr")
    protected Acquirer2 acqrr;
    @XmlElement(name = "Mrchnt")
    protected Organisation8 mrchnt;
    @XmlElement(name = "POI", required = true)
    protected PointOfInteraction2 poi;
    @XmlElement(name = "Card", required = true)
    protected PaymentCard6 card;

    /**
     * Gets the value of the acqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer2 }
     *     
     */
    public Acquirer2 getAcqrr() {
        return acqrr;
    }

    /**
     * Sets the value of the acqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer2 }
     *     
     */
    public CardPaymentEnvironment12 setAcqrr(Acquirer2 value) {
        this.acqrr = value;
        return this;
    }

    /**
     * Gets the value of the mrchnt property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation8 }
     *     
     */
    public Organisation8 getMrchnt() {
        return mrchnt;
    }

    /**
     * Sets the value of the mrchnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation8 }
     *     
     */
    public CardPaymentEnvironment12 setMrchnt(Organisation8 value) {
        this.mrchnt = value;
        return this;
    }

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction2 }
     *     
     */
    public PointOfInteraction2 getPOI() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction2 }
     *     
     */
    public CardPaymentEnvironment12 setPOI(PointOfInteraction2 value) {
        this.poi = value;
        return this;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard6 }
     *     
     */
    public PaymentCard6 getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard6 }
     *     
     */
    public CardPaymentEnvironment12 setCard(PaymentCard6 value) {
        this.card = value;
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
