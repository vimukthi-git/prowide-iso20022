
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderCancellationStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderCancellationStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STNP"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderCancellationStatus2Code")
@XmlEnum
public enum OrderCancellationStatus2Code {


    /**
     * Order cancellation request has been sent to the next party, eg, the next intermediary.
     * 
     */
    STNP,

    /**
     * Status of the order cancellation request is received, that is, technical validation of the message is ok, and the message is now at the receiving side.
     * 
     */
    RECE,

    /**
     * Order cancellation request is pending, The order cancellation request has been received but this does not indicate the order has been cancelled.
     * 
     */
    CANP,

    /**
     * Status of the order cancellation request is completed. The cancellation request has been accepted and processed; the order has been cancelled.
     * 
     */
    CAND;

    public String value() {
        return name();
    }

    public static OrderCancellationStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
