
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
 * The NotificationToReceiveCancellationAdvice message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is used to advise the account servicing institution about the cancellation of one or more notifications in a previous NotificationToReceive message.
 * Usage
 * The NotificationToReceiveCancellationAdvice message is used to advise the account servicing institution that the funds are no longer expected. The message can be used in either a direct or a relay scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationToReceiveCancellationAdviceV01", propOrder = {
    "grpHdr",
    "orgnlNtfctn"
})
public class NotificationToReceiveCancellationAdviceV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader43 grpHdr;
    @XmlElement(name = "OrgnlNtfctn", required = true)
    protected OriginalNotification1 orgnlNtfctn;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader43 }
     *     
     */
    public GroupHeader43 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader43 }
     *     
     */
    public NotificationToReceiveCancellationAdviceV01 setGrpHdr(GroupHeader43 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalNotification1 }
     *     
     */
    public OriginalNotification1 getOrgnlNtfctn() {
        return orgnlNtfctn;
    }

    /**
     * Sets the value of the orgnlNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalNotification1 }
     *     
     */
    public NotificationToReceiveCancellationAdviceV01 setOrgnlNtfctn(OriginalNotification1 value) {
        this.orgnlNtfctn = value;
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
