
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Information on the shipment date, the charges, the routing and the goods described in the transport document
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDetails1", propOrder = {
    "trnsprtDocRef",
    "trnsprtdGoods",
    "rtgSummry",
    "propsdShipmntDt",
    "actlShipmntDt",
    "incotrms",
    "frghtChrgs"
})
public class TransportDetails1 {

    @XmlElement(name = "TrnsprtDocRef", required = true)
    protected List<DocumentIdentification7> trnsprtDocRef;
    @XmlElement(name = "TrnsprtdGoods", required = true)
    protected List<TransportedGoods1> trnsprtdGoods;
    @XmlElement(name = "RtgSummry", required = true)
    protected TransportMeans2Choice rtgSummry;
    @XmlElement(name = "PropsdShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar propsdShipmntDt;
    @XmlElement(name = "ActlShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actlShipmntDt;
    @XmlElement(name = "Incotrms")
    protected Incoterms2 incotrms;
    @XmlElement(name = "FrghtChrgs")
    protected Charge13 frghtChrgs;

    /**
     * Gets the value of the trnsprtDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIdentification7 }
     * 
     * 
     */
    public List<DocumentIdentification7> getTrnsprtDocRef() {
        if (trnsprtDocRef == null) {
            trnsprtDocRef = new ArrayList<DocumentIdentification7>();
        }
        return this.trnsprtDocRef;
    }

    /**
     * Gets the value of the trnsprtdGoods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtdGoods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtdGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportedGoods1 }
     * 
     * 
     */
    public List<TransportedGoods1> getTrnsprtdGoods() {
        if (trnsprtdGoods == null) {
            trnsprtdGoods = new ArrayList<TransportedGoods1>();
        }
        return this.trnsprtdGoods;
    }

    /**
     * Gets the value of the rtgSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeans2Choice }
     *     
     */
    public TransportMeans2Choice getRtgSummry() {
        return rtgSummry;
    }

    /**
     * Sets the value of the rtgSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeans2Choice }
     *     
     */
    public TransportDetails1 setRtgSummry(TransportMeans2Choice value) {
        this.rtgSummry = value;
        return this;
    }

    /**
     * Gets the value of the propsdShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPropsdShipmntDt() {
        return propsdShipmntDt;
    }

    /**
     * Sets the value of the propsdShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TransportDetails1 setPropsdShipmntDt(XMLGregorianCalendar value) {
        this.propsdShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the actlShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActlShipmntDt() {
        return actlShipmntDt;
    }

    /**
     * Sets the value of the actlShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TransportDetails1 setActlShipmntDt(XMLGregorianCalendar value) {
        this.actlShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the incotrms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms2 }
     *     
     */
    public Incoterms2 getIncotrms() {
        return incotrms;
    }

    /**
     * Sets the value of the incotrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms2 }
     *     
     */
    public TransportDetails1 setIncotrms(Incoterms2 value) {
        this.incotrms = value;
        return this;
    }

    /**
     * Gets the value of the frghtChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charge13 }
     *     
     */
    public Charge13 getFrghtChrgs() {
        return frghtChrgs;
    }

    /**
     * Sets the value of the frghtChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge13 }
     *     
     */
    public TransportDetails1 setFrghtChrgs(Charge13 value) {
        this.frghtChrgs = value;
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

    /**
     * Adds a new item to the trnsprtDocRef list.
     * @see #getTrnsprtDocRef()
     * 
     */
    public TransportDetails1 addTrnsprtDocRef(DocumentIdentification7 trnsprtDocRef) {
        getTrnsprtDocRef().add(trnsprtDocRef);
        return this;
    }

    /**
     * Adds a new item to the trnsprtdGoods list.
     * @see #getTrnsprtdGoods()
     * 
     */
    public TransportDetails1 addTrnsprtdGoods(TransportedGoods1 trnsprtdGoods) {
        getTrnsprtdGoods().add(trnsprtdGoods);
        return this;
    }

}
