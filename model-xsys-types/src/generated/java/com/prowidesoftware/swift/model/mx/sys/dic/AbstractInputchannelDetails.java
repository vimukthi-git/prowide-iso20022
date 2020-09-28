
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for AbstractInputchannelDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractInputchannelDetails", propOrder = {
    "stat",
    "lastStatChngTm",
    "lastStatChngDN"
})
public class AbstractInputchannelDetails {

    @XmlElement(name = "Stat", required = true)
    @XmlSchemaType(name = "string")
    protected InputChannelStateCode stat;
    @XmlElement(name = "LastStatChngTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastStatChngTm;
    @XmlElement(name = "LastStatChngDN", required = true)
    protected String lastStatChngDN;

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link InputChannelStateCode }
     *     
     */
    public InputChannelStateCode getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputChannelStateCode }
     *     
     */
    public AbstractInputchannelDetails setStat(InputChannelStateCode value) {
        this.stat = value;
        return this;
    }

    /**
     * Gets the value of the lastStatChngTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastStatChngTm() {
        return lastStatChngTm;
    }

    /**
     * Sets the value of the lastStatChngTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public AbstractInputchannelDetails setLastStatChngTm(XMLGregorianCalendar value) {
        this.lastStatChngTm = value;
        return this;
    }

    /**
     * Gets the value of the lastStatChngDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStatChngDN() {
        return lastStatChngDN;
    }

    /**
     * Sets the value of the lastStatChngDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AbstractInputchannelDetails setLastStatChngDN(String value) {
        this.lastStatChngDN = value;
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
