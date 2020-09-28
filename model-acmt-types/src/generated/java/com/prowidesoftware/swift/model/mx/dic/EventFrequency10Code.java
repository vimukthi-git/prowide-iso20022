
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventFrequency10Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventFrequency10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventFrequency10Code")
@XmlEnum
public enum EventFrequency10Code {


    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place as necessary.
     * 
     */
    ADHO;

    public String value() {
        return name();
    }

    public static EventFrequency10Code fromValue(String v) {
        return valueOf(v);
    }

}
