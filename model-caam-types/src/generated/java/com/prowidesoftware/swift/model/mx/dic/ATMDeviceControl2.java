
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
 * Information related to the control of an ATM device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDeviceControl2", propOrder = {
    "envt",
    "cmd"
})
public class ATMDeviceControl2 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment7 envt;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand10> cmd;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public ATMEnvironment7 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment7 }
     *     
     */
    public ATMDeviceControl2 setEnvt(ATMEnvironment7 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand10 }
     * 
     * 
     */
    public List<ATMCommand10> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<ATMCommand10>();
        }
        return this.cmd;
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
     * Adds a new item to the cmd list.
     * @see #getCmd()
     * 
     */
    public ATMDeviceControl2 addCmd(ATMCommand10 cmd) {
        getCmd().add(cmd);
        return this;
    }

}
