
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
 * Result of the captured set of transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet9", propOrder = {
    "dataSetId",
    "dataSetRslt",
    "rmvDataSet",
    "dataSetInitr",
    "txTtls",
    "rjctdTx"
})
public class CardPaymentDataSet9 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification1 dataSetId;
    @XmlElement(name = "DataSetRslt", required = true)
    protected ResponseType1 dataSetRslt;
    @XmlElement(name = "RmvDataSet")
    protected boolean rmvDataSet;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification32 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals2> txTtls;
    @XmlElement(name = "RjctdTx")
    protected List<CardPaymentDataSet8> rjctdTx;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification1 }
     *     
     */
    public DataSetIdentification1 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification1 }
     *     
     */
    public CardPaymentDataSet9 setDataSetId(DataSetIdentification1 value) {
        this.dataSetId = value;
        return this;
    }

    /**
     * Gets the value of the dataSetRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType1 }
     *     
     */
    public ResponseType1 getDataSetRslt() {
        return dataSetRslt;
    }

    /**
     * Sets the value of the dataSetRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType1 }
     *     
     */
    public CardPaymentDataSet9 setDataSetRslt(ResponseType1 value) {
        this.dataSetRslt = value;
        return this;
    }

    /**
     * Gets the value of the rmvDataSet property.
     * 
     */
    public boolean isRmvDataSet() {
        return rmvDataSet;
    }

    /**
     * Sets the value of the rmvDataSet property.
     * 
     */
    public CardPaymentDataSet9 setRmvDataSet(boolean value) {
        this.rmvDataSet = value;
        return this;
    }

    /**
     * Gets the value of the dataSetInitr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getDataSetInitr() {
        return dataSetInitr;
    }

    /**
     * Sets the value of the dataSetInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public CardPaymentDataSet9 setDataSetInitr(GenericIdentification32 value) {
        this.dataSetInitr = value;
        return this;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals2 }
     * 
     * 
     */
    public List<TransactionTotals2> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotals2>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the rjctdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet8 }
     * 
     * 
     */
    public List<CardPaymentDataSet8> getRjctdTx() {
        if (rjctdTx == null) {
            rjctdTx = new ArrayList<CardPaymentDataSet8>();
        }
        return this.rjctdTx;
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
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public CardPaymentDataSet9 addTxTtls(TransactionTotals2 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

    /**
     * Adds a new item to the rjctdTx list.
     * @see #getRjctdTx()
     * 
     */
    public CardPaymentDataSet9 addRjctdTx(CardPaymentDataSet8 rjctdTx) {
        getRjctdTx().add(rjctdTx);
        return this;
    }

}
