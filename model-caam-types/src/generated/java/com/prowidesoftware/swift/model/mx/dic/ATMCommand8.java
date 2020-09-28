
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
 * Command result for reinitialization of the transaction counters.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand8", propOrder = {
    "tp",
    "reqrdDtTm",
    "prcdDtTm",
    "cmdId",
    "rslt",
    "addtlErrInf"
})
public class ATMCommand8 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand5Code tp;
    @XmlElement(name = "ReqrdDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqrdDtTm;
    @XmlElement(name = "PrcdDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prcdDtTm;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionResult2Code rslt;
    @XmlElement(name = "AddtlErrInf")
    protected String addtlErrInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand5Code }
     *     
     */
    public ATMCommand5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand5Code }
     *     
     */
    public ATMCommand8 setTp(ATMCommand5Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the reqrdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqrdDtTm() {
        return reqrdDtTm;
    }

    /**
     * Sets the value of the reqrdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ATMCommand8 setReqrdDtTm(XMLGregorianCalendar value) {
        this.reqrdDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prcdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrcdDtTm() {
        return prcdDtTm;
    }

    /**
     * Sets the value of the prcdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ATMCommand8 setPrcdDtTm(XMLGregorianCalendar value) {
        this.prcdDtTm = value;
        return this;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommand8 setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionResult2Code }
     *     
     */
    public TerminalManagementActionResult2Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionResult2Code }
     *     
     */
    public ATMCommand8 setRslt(TerminalManagementActionResult2Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the addtlErrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlErrInf() {
        return addtlErrInf;
    }

    /**
     * Sets the value of the addtlErrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ATMCommand8 setAddtlErrInf(String value) {
        this.addtlErrInf = value;
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
