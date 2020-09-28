
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Specifies the physical parameters of a shareholders meeting. Several dates and places can be defined for a meeting
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meeting3", propOrder = {
    "dtAndTm",
    "dtSts",
    "qrmReqrd",
    "lctn",
    "qrmQty"
})
public class Meeting3 {

    @XmlElement(name = "DtAndTm", required = true)
    protected DateFormat2Choice dtAndTm;
    @XmlElement(name = "DtSts")
    @XmlSchemaType(name = "string")
    protected MeetingDateStatus1Code dtSts;
    @XmlElement(name = "QrmReqrd")
    protected boolean qrmReqrd;
    @XmlElement(name = "Lctn", required = true)
    protected List<LocationFormat1Choice> lctn;
    @XmlElement(name = "QrmQty")
    protected QuorumQuantity1Choice qrmQty;

    /**
     * Gets the value of the dtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat2Choice }
     *     
     */
    public DateFormat2Choice getDtAndTm() {
        return dtAndTm;
    }

    /**
     * Sets the value of the dtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat2Choice }
     *     
     */
    public Meeting3 setDtAndTm(DateFormat2Choice value) {
        this.dtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the dtSts property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingDateStatus1Code }
     *     
     */
    public MeetingDateStatus1Code getDtSts() {
        return dtSts;
    }

    /**
     * Sets the value of the dtSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingDateStatus1Code }
     *     
     */
    public Meeting3 setDtSts(MeetingDateStatus1Code value) {
        this.dtSts = value;
        return this;
    }

    /**
     * Gets the value of the qrmReqrd property.
     * 
     */
    public boolean isQrmReqrd() {
        return qrmReqrd;
    }

    /**
     * Sets the value of the qrmReqrd property.
     * 
     */
    public Meeting3 setQrmReqrd(boolean value) {
        this.qrmReqrd = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationFormat1Choice }
     * 
     * 
     */
    public List<LocationFormat1Choice> getLctn() {
        if (lctn == null) {
            lctn = new ArrayList<LocationFormat1Choice>();
        }
        return this.lctn;
    }

    /**
     * Gets the value of the qrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link QuorumQuantity1Choice }
     *     
     */
    public QuorumQuantity1Choice getQrmQty() {
        return qrmQty;
    }

    /**
     * Sets the value of the qrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuorumQuantity1Choice }
     *     
     */
    public Meeting3 setQrmQty(QuorumQuantity1Choice value) {
        this.qrmQty = value;
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

    /**
     * Adds a new item to the lctn list.
     * @see #getLctn()
     * 
     */
    public Meeting3 addLctn(LocationFormat1Choice lctn) {
        getLctn().add(lctn);
        return this;
    }

}
