
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
 * Specifies prices related to a corporate action option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice8", propOrder = {
    "indctvOrMktPric",
    "exrcPric",
    "issePric",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct"
})
public class CorporateActionPrice8 {

    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice2Choice indctvOrMktPric;
    @XmlElement(name = "ExrcPric")
    protected PriceFormat5Choice exrcPric;
    @XmlElement(name = "IssePric")
    protected PriceFormat5Choice issePric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat9Choice gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat5Choice gncCshPricPdPerPdct;

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice2Choice }
     *     
     */
    public IndicativeOrMarketPrice2Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice2Choice }
     *     
     */
    public CorporateActionPrice8 setIndctvOrMktPric(IndicativeOrMarketPrice2Choice value) {
        this.indctvOrMktPric = value;
        return this;
    }

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice8 setExrcPric(PriceFormat5Choice value) {
        this.exrcPric = value;
        return this;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice8 setIssePric(PriceFormat5Choice value) {
        this.issePric = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat9Choice }
     *     
     */
    public PriceFormat9Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat9Choice }
     *     
     */
    public CorporateActionPrice8 setGncCshPricRcvdPerPdct(PriceFormat9Choice value) {
        this.gncCshPricRcvdPerPdct = value;
        return this;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public PriceFormat5Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat5Choice }
     *     
     */
    public CorporateActionPrice8 setGncCshPricPdPerPdct(PriceFormat5Choice value) {
        this.gncCshPricPdPerPdct = value;
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
