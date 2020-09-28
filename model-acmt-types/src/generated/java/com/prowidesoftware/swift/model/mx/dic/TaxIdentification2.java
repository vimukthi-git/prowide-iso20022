
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
 * Tax identification information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIdentification2", propOrder = {
    "id",
    "taxIdTp",
    "issr",
    "isseDt",
    "xpryDt",
    "issrCtry"
})
public class TaxIdentification2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TaxIdTp", required = true)
    protected TaxIdentificationType1Choice taxIdTp;
    @XmlElement(name = "Issr")
    protected String issr;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "IssrCtry", required = true)
    protected String issrCtry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxIdentification2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the taxIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentificationType1Choice }
     *     
     */
    public TaxIdentificationType1Choice getTaxIdTp() {
        return taxIdTp;
    }

    /**
     * Sets the value of the taxIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentificationType1Choice }
     *     
     */
    public TaxIdentification2 setTaxIdTp(TaxIdentificationType1Choice value) {
        this.taxIdTp = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxIdentification2 setIssr(String value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TaxIdentification2 setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TaxIdentification2 setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the issrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCtry() {
        return issrCtry;
    }

    /**
     * Sets the value of the issrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TaxIdentification2 setIssrCtry(String value) {
        this.issrCtry = value;
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
