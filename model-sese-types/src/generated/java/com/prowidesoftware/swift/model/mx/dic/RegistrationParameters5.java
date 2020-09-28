
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
 * Information related to registration of securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationParameters5", propOrder = {
    "certfctnId",
    "certfctnDtTm",
    "regarAcct",
    "certNb"
})
public class RegistrationParameters5 {

    @XmlElement(name = "CertfctnId")
    protected String certfctnId;
    @XmlElement(name = "CertfctnDtTm")
    protected DateAndDateTimeChoice certfctnDtTm;
    @XmlElement(name = "RegarAcct")
    protected String regarAcct;
    @XmlElement(name = "CertNb")
    protected List<SecuritiesCertificate5> certNb;

    /**
     * Gets the value of the certfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertfctnId() {
        return certfctnId;
    }

    /**
     * Sets the value of the certfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegistrationParameters5 setCertfctnId(String value) {
        this.certfctnId = value;
        return this;
    }

    /**
     * Gets the value of the certfctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCertfctnDtTm() {
        return certfctnDtTm;
    }

    /**
     * Sets the value of the certfctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public RegistrationParameters5 setCertfctnDtTm(DateAndDateTimeChoice value) {
        this.certfctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the regarAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegarAcct() {
        return regarAcct;
    }

    /**
     * Sets the value of the regarAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegistrationParameters5 setRegarAcct(String value) {
        this.regarAcct = value;
        return this;
    }

    /**
     * Gets the value of the certNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCertificate5 }
     * 
     * 
     */
    public List<SecuritiesCertificate5> getCertNb() {
        if (certNb == null) {
            certNb = new ArrayList<SecuritiesCertificate5>();
        }
        return this.certNb;
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
     * Adds a new item to the certNb list.
     * @see #getCertNb()
     * 
     */
    public RegistrationParameters5 addCertNb(SecuritiesCertificate5 certNb) {
        getCertNb().add(certNb);
        return this;
    }

}
