
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
 * Choice between a reason or no reason for the corporate action instruction cancellation pending cancellation status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingCancellationStatus5Choice", propOrder = {
    "notSpcfdRsn",
    "rsn"
})
public class PendingCancellationStatus5Choice {

    @XmlElement(name = "NotSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode notSpcfdRsn;
    @XmlElement(name = "Rsn")
    protected List<PendingCancellationStatusReason5> rsn;

    /**
     * Gets the value of the notSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNotSpcfdRsn() {
        return notSpcfdRsn;
    }

    /**
     * Sets the value of the notSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public PendingCancellationStatus5Choice setNotSpcfdRsn(NoReasonCode value) {
        this.notSpcfdRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingCancellationStatusReason5 }
     * 
     * 
     */
    public List<PendingCancellationStatusReason5> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<PendingCancellationStatusReason5>();
        }
        return this.rsn;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public PendingCancellationStatus5Choice addRsn(PendingCancellationStatusReason5 rsn) {
        getRsn().add(rsn);
        return this;
    }

}
