
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReorganisationTransactionType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReorganisationTransactionType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReorganisationTransactionType2Code")
@XmlEnum
public enum ReorganisationTransactionType2Code {


    /**
     * Reorganisation is a cover protect directly to agent transaction type.
     * 
     */
    COVA;

    public String value() {
        return name();
    }

    public static ReorganisationTransactionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
