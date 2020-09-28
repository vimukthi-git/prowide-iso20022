
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
 * Scope
 * The IntentToPayReport message is sent by the matching application to the two primary banks after receiving an IntentToPayNotification message.
 * This message is a report per transaction that were referenced in the IntentToPayNotice message. For each transaction, the matching application has accumulated the amounts present in all previous IntentToPayNotice messages and reports the total.
 * Usage
 * The IntentToPayReport message is a report that is automatically generated by the matching application following an IntentToPayNotice message. No response is expected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntentToPayReportV01", propOrder = {
    "rptId",
    "rptdItms"
})
public class IntentToPayReportV01 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "RptdItms")
    protected List<ReportLine1> rptdItms;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public IntentToPayReportV01 setRptId(MessageIdentification1 value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptdItms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptdItms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdItms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportLine1 }
     * 
     * 
     */
    public List<ReportLine1> getRptdItms() {
        if (rptdItms == null) {
            rptdItms = new ArrayList<ReportLine1>();
        }
        return this.rptdItms;
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
     * Adds a new item to the rptdItms list.
     * @see #getRptdItms()
     * 
     */
    public IntentToPayReportV01 addRptdItms(ReportLine1 rptdItms) {
        getRptdItms().add(rptdItms);
        return this;
    }

}
