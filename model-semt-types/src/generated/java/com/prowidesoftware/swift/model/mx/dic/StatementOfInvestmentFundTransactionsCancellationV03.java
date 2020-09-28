
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
 * Scope
 * An account servicer, for example, a transfer agent sends the StatementOfInvestmentFundTransactionsCancellation message to the account owner, for example, an investment manager or its authorised representative to cancel a previously sent StatementOfInvestmentFundTransactions message.
 * Usage
 * The StatementOfInvestmentFundTransactionsCancellation message is used to cancel a previously sent StatementOfInvestmentFundTransactions message. This message must contain the reference of the message to be cancelled.
 * This message may also contain all the details of the message to be cancelled, but this is not recommended.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementOfInvestmentFundTransactionsCancellationV03", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "stmtToBeCanc"
})
public class StatementOfInvestmentFundTransactionsCancellationV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference2 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference2 rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "StmtToBeCanc")
    protected StatementOfInvestmentFundTransactions3 stmtToBeCanc;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public StatementOfInvestmentFundTransactionsCancellationV03 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public StatementOfInvestmentFundTransactionsCancellationV03 setPrvsRef(AdditionalReference2 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public StatementOfInvestmentFundTransactionsCancellationV03 setRltdRef(AdditionalReference2 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public StatementOfInvestmentFundTransactionsCancellationV03 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the stmtToBeCanc property.
     * 
     * @return
     *     possible object is
     *     {@link StatementOfInvestmentFundTransactions3 }
     *     
     */
    public StatementOfInvestmentFundTransactions3 getStmtToBeCanc() {
        return stmtToBeCanc;
    }

    /**
     * Sets the value of the stmtToBeCanc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementOfInvestmentFundTransactions3 }
     *     
     */
    public StatementOfInvestmentFundTransactionsCancellationV03 setStmtToBeCanc(StatementOfInvestmentFundTransactions3 value) {
        this.stmtToBeCanc = value;
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
