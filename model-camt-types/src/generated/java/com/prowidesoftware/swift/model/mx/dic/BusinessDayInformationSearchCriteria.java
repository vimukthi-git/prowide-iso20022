
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
 * Defines the criteria used to search for system business day information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayInformationSearchCriteria", propOrder = {
    "sysId",
    "sysCcy"
})
public class BusinessDayInformationSearchCriteria {

    @XmlElement(name = "SysId")
    protected List<SystemIdentificationChoice> sysId;
    @XmlElement(name = "SysCcy")
    protected List<String> sysCcy;

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemIdentificationChoice }
     * 
     * 
     */
    public List<SystemIdentificationChoice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<SystemIdentificationChoice>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the sysCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSysCcy() {
        if (sysCcy == null) {
            sysCcy = new ArrayList<String>();
        }
        return this.sysCcy;
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
     * Adds a new item to the sysId list.
     * @see #getSysId()
     * 
     */
    public BusinessDayInformationSearchCriteria addSysId(SystemIdentificationChoice sysId) {
        getSysId().add(sysId);
        return this;
    }

    /**
     * Adds a new item to the sysCcy list.
     * @see #getSysCcy()
     * 
     */
    public BusinessDayInformationSearchCriteria addSysCcy(String sysCcy) {
        getSysCcy().add(sysCcy);
        return this;
    }

}
