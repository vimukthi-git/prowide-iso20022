
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
 * Scope
 * The ManagementPlanReplacement message is sent by the master terminal manager or delegated terminal manager to the acceptor system to replace the TMS action list of the POI system.
 * Usage
 * The ManagementPlanReplacement message may embed the information required by the acceptor system for the planning of the TMS actions to be performed by the POI including the trigger, time conditions and TMS addresses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementPlanReplacementV01", propOrder = {
    "hdr",
    "mgmtPlan",
    "sctyTrlr"
})
public class ManagementPlanReplacementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header4 hdr;
    @XmlElement(name = "MgmtPlan", required = true)
    protected ManagementPlan1 mgmtPlan;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType1 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header4 }
     *     
     */
    public Header4 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header4 }
     *     
     */
    public ManagementPlanReplacementV01 setHdr(Header4 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the mgmtPlan property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlan1 }
     *     
     */
    public ManagementPlan1 getMgmtPlan() {
        return mgmtPlan;
    }

    /**
     * Sets the value of the mgmtPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlan1 }
     *     
     */
    public ManagementPlanReplacementV01 setMgmtPlan(ManagementPlan1 value) {
        this.mgmtPlan = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType1 }
     *     
     */
    public ContentInformationType1 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType1 }
     *     
     */
    public ManagementPlanReplacementV01 setSctyTrlr(ContentInformationType1 value) {
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
