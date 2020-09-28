
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding notification general information details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotificationSD6", propOrder = {
    "plcAndNm",
    "evtSts",
    "apprvdDt",
    "mtchDt",
    "actvUntilDt",
    "svcLvlAgrmtPrd",
    "vldtnNotSpprtdRsn"
})
public class CorporateActionNotificationSD6 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "EvtSts")
    @XmlSchemaType(name = "string")
    protected EventWorkflowStatus1Code evtSts;
    @XmlElement(name = "ApprvdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar apprvdDt;
    @XmlElement(name = "MtchDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtchDt;
    @XmlElement(name = "ActvUntilDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actvUntilDt;
    @XmlElement(name = "SvcLvlAgrmtPrd")
    protected Period3 svcLvlAgrmtPrd;
    @XmlElement(name = "VldtnNotSpprtdRsn")
    protected String vldtnNotSpprtdRsn;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD6 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the evtSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventWorkflowStatus1Code }
     *     
     */
    public EventWorkflowStatus1Code getEvtSts() {
        return evtSts;
    }

    /**
     * Sets the value of the evtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventWorkflowStatus1Code }
     *     
     */
    public CorporateActionNotificationSD6 setEvtSts(EventWorkflowStatus1Code value) {
        this.evtSts = value;
        return this;
    }

    /**
     * Gets the value of the apprvdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprvdDt() {
        return apprvdDt;
    }

    /**
     * Sets the value of the apprvdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionNotificationSD6 setApprvdDt(XMLGregorianCalendar value) {
        this.apprvdDt = value;
        return this;
    }

    /**
     * Gets the value of the mtchDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtchDt() {
        return mtchDt;
    }

    /**
     * Sets the value of the mtchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionNotificationSD6 setMtchDt(XMLGregorianCalendar value) {
        this.mtchDt = value;
        return this;
    }

    /**
     * Gets the value of the actvUntilDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActvUntilDt() {
        return actvUntilDt;
    }

    /**
     * Sets the value of the actvUntilDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public CorporateActionNotificationSD6 setActvUntilDt(XMLGregorianCalendar value) {
        this.actvUntilDt = value;
        return this;
    }

    /**
     * Gets the value of the svcLvlAgrmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period3 }
     *     
     */
    public Period3 getSvcLvlAgrmtPrd() {
        return svcLvlAgrmtPrd;
    }

    /**
     * Sets the value of the svcLvlAgrmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period3 }
     *     
     */
    public CorporateActionNotificationSD6 setSvcLvlAgrmtPrd(Period3 value) {
        this.svcLvlAgrmtPrd = value;
        return this;
    }

    /**
     * Gets the value of the vldtnNotSpprtdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVldtnNotSpprtdRsn() {
        return vldtnNotSpprtdRsn;
    }

    /**
     * Sets the value of the vldtnNotSpprtdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD6 setVldtnNotSpprtdRsn(String value) {
        this.vldtnNotSpprtdRsn = value;
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
