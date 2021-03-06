
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemStatus3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SystemStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTV"/&gt;
 *     &lt;enumeration value="CLSD"/&gt;
 *     &lt;enumeration value="RMPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SystemStatus3Code")
@XmlEnum
public enum SystemStatus3Code {


    /**
     * System is functioning normally, that is, operational.
     * 
     */
    ACTV,

    /**
     * System is closed (eg. normal closure of an RTGS).
     * 
     */
    CLSD,

    /**
     * System is starting a new maintenance period.
     * 
     */
    RMPS;

    public String value() {
        return name();
    }

    public static SystemStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
