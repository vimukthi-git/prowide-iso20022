
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * It is used to provide confirmation details of one or more reservations set by the member (or on behalf of the member) and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationOrError2Choice", propOrder = {
    "bizRpt",
    "oprlErr"
})
public class ReservationOrError2Choice {

    @XmlElement(name = "BizRpt")
    protected CurrentAndDefaultReservation1 bizRpt;
    @XmlElement(name = "OprlErr")
    protected List<ErrorHandling3> oprlErr;

    /**
     * Gets the value of the bizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentAndDefaultReservation1 }
     *     
     */
    public CurrentAndDefaultReservation1 getBizRpt() {
        return bizRpt;
    }

    /**
     * Sets the value of the bizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentAndDefaultReservation1 }
     *     
     */
    public ReservationOrError2Choice setBizRpt(CurrentAndDefaultReservation1 value) {
        this.bizRpt = value;
        return this;
    }

    /**
     * Gets the value of the oprlErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oprlErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOprlErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling3 }
     * 
     * 
     */
    public List<ErrorHandling3> getOprlErr() {
        if (oprlErr == null) {
            oprlErr = new ArrayList<ErrorHandling3>();
        }
        return this.oprlErr;
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
     * Adds a new item to the oprlErr list.
     * @see #getOprlErr()
     * 
     */
    public ReservationOrError2Choice addOprlErr(ErrorHandling3 oprlErr) {
        getOprlErr().add(oprlErr);
        return this;
    }

}
