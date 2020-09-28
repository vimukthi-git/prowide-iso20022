
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
 * Update of the acceptor configuration to be dowloaded by the terminal management system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorConfigurationUpdateV02", propOrder = {
    "hdr",
    "accptrCfgtn",
    "sctyTrlr"
})
public class AcceptorConfigurationUpdateV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header4 hdr;
    @XmlElement(name = "AccptrCfgtn", required = true)
    protected AcceptorConfiguration2 accptrCfgtn;
    @XmlElement(name = "SctyTrlr", required = true)
    protected ContentInformationType4 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header4 }
     *     
     */
    public Header4 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header4 }
     *     
     */
    public AcceptorConfigurationUpdateV02 setHdr(Header4 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the accptrCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorConfiguration2 }
     *     
     */
    public AcceptorConfiguration2 getAccptrCfgtn() {
        return accptrCfgtn;
    }

    /**
     * Sets the value of the accptrCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorConfiguration2 }
     *     
     */
    public AcceptorConfigurationUpdateV02 setAccptrCfgtn(AcceptorConfiguration2 value) {
        this.accptrCfgtn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType4 }
     *     
     */
    public ContentInformationType4 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType4 }
     *     
     */
    public AcceptorConfigurationUpdateV02 setSctyTrlr(ContentInformationType4 value) {
        this.sctyTrlr = value;
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
