
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
 * Set of elements used to provide information on the status reason of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReasonInformation11", propOrder = {
    "orgtr",
    "rsn",
    "addtlInf"
})
public class StatusReasonInformation11 {

    @XmlElement(name = "Orgtr")
    protected PartyIdentification125 orgtr;
    @XmlElement(name = "Rsn")
    protected StatusReason6Choice rsn;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125 }
     *     
     */
    public PartyIdentification125 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125 }
     *     
     */
    public StatusReasonInformation11 setOrgtr(PartyIdentification125 value) {
        this.orgtr = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason6Choice }
     *     
     */
    public StatusReason6Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason6Choice }
     *     
     */
    public StatusReasonInformation11 setRsn(StatusReason6Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public StatusReasonInformation11 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
