
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
 * Reports either on the business information or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessOrError6Choice", propOrder = {
    "bizErr",
    "gnlBiz"
})
public class GeneralBusinessOrError6Choice {

    @XmlElement(name = "BizErr")
    protected List<ErrorHandling4> bizErr;
    @XmlElement(name = "GnlBiz")
    protected GeneralBusinessInformation1 gnlBiz;

    /**
     * Gets the value of the bizErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling4 }
     * 
     * 
     */
    public List<ErrorHandling4> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<ErrorHandling4>();
        }
        return this.bizErr;
    }

    /**
     * Gets the value of the gnlBiz property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralBusinessInformation1 }
     *     
     */
    public GeneralBusinessInformation1 getGnlBiz() {
        return gnlBiz;
    }

    /**
     * Sets the value of the gnlBiz property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralBusinessInformation1 }
     *     
     */
    public GeneralBusinessOrError6Choice setGnlBiz(GeneralBusinessInformation1 value) {
        this.gnlBiz = value;
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

    /**
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public GeneralBusinessOrError6Choice addBizErr(ErrorHandling4 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
