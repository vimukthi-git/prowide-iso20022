
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
 * Details of the Financial Institution responding to the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponderDetails1", propOrder = {
    "dtTmStmp",
    "rspndr"
})
public class ResponderDetails1 {

    @XmlElement(name = "DtTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTmStmp;
    @XmlElement(name = "Rspndr", required = true)
    protected String rspndr;

    /**
     * Gets the value of the dtTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTmStmp() {
        return dtTmStmp;
    }

    /**
     * Sets the value of the dtTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ResponderDetails1 setDtTmStmp(XMLGregorianCalendar value) {
        this.dtTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the rspndr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspndr() {
        return rspndr;
    }

    /**
     * Sets the value of the rspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ResponderDetails1 setRspndr(String value) {
        this.rspndr = value;
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
