
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
 * Terminal maintenance actions to be performed by a point of interaction (POI).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementPlanReplacementV04", propOrder = {
    "hdr",
    "mgmtPlan",
    "sctyTrlr"
})
public class ManagementPlanReplacementV04 {

    @XmlElement(name = "Hdr", required = true)
    protected Header14 hdr;
    @XmlElement(name = "MgmtPlan", required = true)
    protected ManagementPlan4 mgmtPlan;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType12 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header14 }
     *     
     */
    public Header14 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header14 }
     *     
     */
    public ManagementPlanReplacementV04 setHdr(Header14 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the mgmtPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlan4 }
     *     
     */
    public ManagementPlan4 getMgmtPlan() {
        return mgmtPlan;
    }

    /**
     * Sets the value of the mgmtPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlan4 }
     *     
     */
    public ManagementPlanReplacementV04 setMgmtPlan(ManagementPlan4 value) {
        this.mgmtPlan = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType12 }
     *     
     */
    public ContentInformationType12 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType12 }
     *     
     */
    public ManagementPlanReplacementV04 setSctyTrlr(ContentInformationType12 value) {
        this.sctyTrlr = value;
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
