
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionGroupStatusCodeSEPA_DFU1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionGroupStatusCodeSEPA_DFU1"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionGroupStatusCodeSEPA_DFU1")
@XmlEnum
public enum TransactionGroupStatusCodeSEPADFU1 {


    /**
     * RJCT
     * 
     */
    RJCT;

    public String value() {
        return name();
    }

    public static TransactionGroupStatusCodeSEPADFU1 fromValue(String v) {
        return valueOf(v);
    }

}
