
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
 * Card payment transaction including an authorisation response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSetTransaction5", propOrder = {
    "txSeqCntr",
    "tracblt",
    "envt",
    "tx",
    "txRspn"
})
public class CardPaymentDataSetTransaction5 {

    @XmlElement(name = "TxSeqCntr", required = true)
    protected String txSeqCntr;
    @XmlElement(name = "Tracblt")
    protected List<Traceability1> tracblt;
    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment16 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction12 tx;
    @XmlElement(name = "TxRspn", required = true)
    protected CardPaymentTransaction18 txRspn;

    /**
     * Gets the value of the txSeqCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeqCntr() {
        return txSeqCntr;
    }

    /**
     * Sets the value of the txSeqCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentDataSetTransaction5 setTxSeqCntr(String value) {
        this.txSeqCntr = value;
        return this;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability1 }
     * 
     * 
     */
    public List<Traceability1> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability1>();
        }
        return this.tracblt;
    }

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment16 }
     *     
     */
    public CardPaymentEnvironment16 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment16 }
     *     
     */
    public CardPaymentDataSetTransaction5 setEnvt(CardPaymentEnvironment16 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction12 }
     *     
     */
    public CardPaymentTransaction12 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction12 }
     *     
     */
    public CardPaymentDataSetTransaction5 setTx(CardPaymentTransaction12 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction18 }
     *     
     */
    public CardPaymentTransaction18 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction18 }
     *     
     */
    public CardPaymentDataSetTransaction5 setTxRspn(CardPaymentTransaction18 value) {
        this.txRspn = value;
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
     * Adds a new item to the tracblt list.
     * @see #getTracblt()
     * 
     */
    public CardPaymentDataSetTransaction5 addTracblt(Traceability1 tracblt) {
        getTracblt().add(tracblt);
        return this;
    }

}
