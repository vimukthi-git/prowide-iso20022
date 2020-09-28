
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
 * The Notification Of Case Assignment message is sent by a case assignee to a case creator/case assigner.
 * This message is used to inform the case assigner that:
 * - the assignee is reassigning the case to the next agent in the transaction processing chain for further action
 * - the assignee will work on the case himself, without re-assigning it to another party, and therefore indicating that the re-assignment has reached its end-point
 * Usage
 * The Notification Of Case Assignment message is used to notify the case creator or case assigner of further action undertaken by the case assignee in a:
 * - request to cancel payment case
 * - request to modify payment case
 * - unable to apply case
 * - claim non receipt case
 * The Notification Of Case Assignment message
 * - covers one and only one case at a time. If the case assignee needs to inform a case creator or case assigner about several cases, then multiple Notification Of Case Assignment messages must be sent
 * - except in the case where it is used to indicate that an agent is doing the correction himself, this message must be forwarded by all subsequent case assigner(s) until it reaches the case creator
 * - must not be used in place of a Resolution Of Investigation or a Case Status Report message
 * When the assignee does not reassign the case to another party (that is responding with a Notification Of Case Assignment message with notification MINE - The case is processed by the assignee), the case assignment should contain the case assignment elements as received in the original query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationOfCaseAssignmentV03", propOrder = {
    "hdr",
    "_case",
    "assgnmt",
    "ntfctn"
})
public class NotificationOfCaseAssignmentV03 {

    @XmlElement(name = "Hdr", required = true)
    protected ReportHeader2 hdr;
    @XmlElement(name = "Case", required = true)
    protected Case2 _case;
    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment2 assgnmt;
    @XmlElement(name = "Ntfctn", required = true)
    protected CaseForwardingNotification3 ntfctn;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link ReportHeader2 }
     *     
     */
    public ReportHeader2 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportHeader2 }
     *     
     */
    public NotificationOfCaseAssignmentV03 setHdr(ReportHeader2 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case2 }
     *     
     */
    public Case2 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case2 }
     *     
     */
    public NotificationOfCaseAssignmentV03 setCase(Case2 value) {
        this._case = value;
        return this;
    }

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment2 }
     *     
     */
    public CaseAssignment2 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment2 }
     *     
     */
    public NotificationOfCaseAssignmentV03 setAssgnmt(CaseAssignment2 value) {
        this.assgnmt = value;
        return this;
    }

    /**
     * Gets the value of the ntfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CaseForwardingNotification3 }
     *     
     */
    public CaseForwardingNotification3 getNtfctn() {
        return ntfctn;
    }

    /**
     * Sets the value of the ntfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseForwardingNotification3 }
     *     
     */
    public NotificationOfCaseAssignmentV03 setNtfctn(CaseForwardingNotification3 value) {
        this.ntfctn = value;
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
