
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
 * Specifies the arrangement of the transport of goods and services and the parties involved in this process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Consignment5", propOrder = {
    "consgnr",
    "consgn",
    "trnsprtMeans"
})
public class Consignment5 {

    @XmlElement(name = "Consgnr")
    protected TradeParty4 consgnr;
    @XmlElement(name = "Consgn")
    protected TradeParty4 consgn;
    @XmlElement(name = "TrnsprtMeans")
    protected List<TransportMeans3> trnsprtMeans;

    /**
     * Gets the value of the consgnr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getConsgnr() {
        return consgnr;
    }

    /**
     * Sets the value of the consgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public Consignment5 setConsgnr(TradeParty4 value) {
        this.consgnr = value;
        return this;
    }

    /**
     * Gets the value of the consgn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty4 }
     *     
     */
    public TradeParty4 getConsgn() {
        return consgn;
    }

    /**
     * Sets the value of the consgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty4 }
     *     
     */
    public Consignment5 setConsgn(TradeParty4 value) {
        this.consgn = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trnsprtMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrnsprtMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeans3 }
     * 
     * 
     */
    public List<TransportMeans3> getTrnsprtMeans() {
        if (trnsprtMeans == null) {
            trnsprtMeans = new ArrayList<TransportMeans3>();
        }
        return this.trnsprtMeans;
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
     * Adds a new item to the trnsprtMeans list.
     * @see #getTrnsprtMeans()
     * 
     */
    public Consignment5 addTrnsprtMeans(TransportMeans3 trnsprtMeans) {
        getTrnsprtMeans().add(trnsprtMeans);
        return this;
    }

}
