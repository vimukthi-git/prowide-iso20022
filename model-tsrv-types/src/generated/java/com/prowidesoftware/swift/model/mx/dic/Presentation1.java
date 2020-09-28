
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
 * Information for the presentation of documents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presentation1", propOrder = {
    "mdm",
    "plcOfPresntnOrUdrConfChc",
    "doc",
    "addtlInf"
})
public class Presentation1 {

    @XmlElement(name = "Mdm")
    protected PresentationMedium1Choice mdm;
    @XmlElement(name = "PlcOfPresntnOrUdrConfChc")
    protected PlaceOrUnderConfirmationChoice1 plcOfPresntnOrUdrConfChc;
    @XmlElement(name = "Doc")
    protected List<Document8> doc;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the mdm property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationMedium1Choice }
     *     
     */
    public PresentationMedium1Choice getMdm() {
        return mdm;
    }

    /**
     * Sets the value of the mdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationMedium1Choice }
     *     
     */
    public Presentation1 setMdm(PresentationMedium1Choice value) {
        this.mdm = value;
        return this;
    }

    /**
     * Gets the value of the plcOfPresntnOrUdrConfChc property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOrUnderConfirmationChoice1 }
     *     
     */
    public PlaceOrUnderConfirmationChoice1 getPlcOfPresntnOrUdrConfChc() {
        return plcOfPresntnOrUdrConfChc;
    }

    /**
     * Sets the value of the plcOfPresntnOrUdrConfChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOrUnderConfirmationChoice1 }
     *     
     */
    public Presentation1 setPlcOfPresntnOrUdrConfChc(PlaceOrUnderConfirmationChoice1 value) {
        this.plcOfPresntnOrUdrConfChc = value;
        return this;
    }

    /**
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document8 }
     * 
     * 
     */
    public List<Document8> getDoc() {
        if (doc == null) {
            doc = new ArrayList<Document8>();
        }
        return this.doc;
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
     * Adds a new item to the doc list.
     * @see #getDoc()
     * 
     */
    public Presentation1 addDoc(Document8 doc) {
        getDoc().add(doc);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Presentation1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
