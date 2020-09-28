
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
 * Choice between the identification of a status or statement query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusOrStatement4Choice", propOrder = {
    "stsAdvc",
    "stmt"
})
public class StatusOrStatement4Choice {

    @XmlElement(name = "StsAdvc")
    protected DocumentNumber7 stsAdvc;
    @XmlElement(name = "Stmt")
    protected DocumentNumber3 stmt;

    /**
     * Gets the value of the stsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber7 }
     *     
     */
    public DocumentNumber7 getStsAdvc() {
        return stsAdvc;
    }

    /**
     * Sets the value of the stsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber7 }
     *     
     */
    public StatusOrStatement4Choice setStsAdvc(DocumentNumber7 value) {
        this.stsAdvc = value;
        return this;
    }

    /**
     * Gets the value of the stmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber3 }
     *     
     */
    public DocumentNumber3 getStmt() {
        return stmt;
    }

    /**
     * Sets the value of the stmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber3 }
     *     
     */
    public StatusOrStatement4Choice setStmt(DocumentNumber3 value) {
        this.stmt = value;
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
