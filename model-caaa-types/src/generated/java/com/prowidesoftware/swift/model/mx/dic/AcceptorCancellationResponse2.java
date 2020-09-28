
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
 * Cancellation response from the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorCancellationResponse2", propOrder = {
    "envt",
    "tx",
    "txRspn"
})
public class AcceptorCancellationResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment11 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransaction6 tx;
    @XmlElement(name = "TxRspn", required = true)
    protected CardPaymentTransaction10 txRspn;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment11 }
     *     
     */
    public CardPaymentEnvironment11 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment11 }
     *     
     */
    public AcceptorCancellationResponse2 setEnvt(CardPaymentEnvironment11 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction6 }
     *     
     */
    public CardPaymentTransaction6 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction6 }
     *     
     */
    public AcceptorCancellationResponse2 setTx(CardPaymentTransaction6 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction10 }
     *     
     */
    public CardPaymentTransaction10 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction10 }
     *     
     */
    public AcceptorCancellationResponse2 setTxRspn(CardPaymentTransaction10 value) {
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

}
