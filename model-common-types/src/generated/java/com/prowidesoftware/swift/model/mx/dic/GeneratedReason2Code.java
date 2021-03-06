
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneratedReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GeneratedReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="RODE"/&gt;
 *     &lt;enumeration value="SPLI"/&gt;
 *     &lt;enumeration value="THRD"/&gt;
 *     &lt;enumeration value="TRAN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GeneratedReason2Code")
@XmlEnum
public enum GeneratedReason2Code {


    /**
     * Transaction has been generated for collateral management purposes.
     * 
     */
    COLL,

    /**
     * Relates to the return of financial instruments resulting from a rejected delivery without matching operation.
     * 
     */
    RODE,

    /**
     * Transaction has been generated to enable settlement following a shortage of position.
     * 
     */
    SPLI,

    /**
     * Transaction has been generated by a third party, for example, a central counterparty.
     * 
     */
    THRD,

    /**
     * Transaction has been generated due to transformation following a corporate action.
     * 
     */
    TRAN,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static GeneratedReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
