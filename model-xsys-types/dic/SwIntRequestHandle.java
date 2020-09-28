
package com.prowidesoftware.swift.model.mx.sys.dic;

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
 * Java class for RequestHandle complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHandle", namespace = "urn:swift:snl:ns.SwInt", propOrder = {
    "requestDescriptor",
    "requestE2EControl",
    "requestHeader",
    "requestPayload",
    "crypto",
    "signatureList"
})
public class SwIntRequestHandle {

    @XmlElement(name = "RequestDescriptor", required = true)
    protected SwIntRequestDescriptor requestDescriptor;
    @XmlElement(name = "RequestE2EControl", namespace = "urn:swift:snl:ns.Sw")
    protected SwE2EControl requestE2EControl;
    @XmlElement(name = "RequestHeader", required = true)
    protected SwIntRequestHeader requestHeader;
    @XmlElement(name = "RequestPayload")
    protected SwIntMixedAnyPayload requestPayload;
    @XmlElement(name = "Crypto", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecCrypto> crypto;
    @XmlElement(name = "SignatureList", namespace = "urn:swift:snl:ns.SwSec")
    protected List<SwSecSignatureList> signatureList;

    /**
     * Gets the value of the requestDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestDescriptor }
     *     
     */
    public SwIntRequestDescriptor getRequestDescriptor() {
        return requestDescriptor;
    }

    /**
     * Sets the value of the requestDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestDescriptor }
     *     
     */
    public SwIntRequestHandle setRequestDescriptor(SwIntRequestDescriptor value) {
        this.requestDescriptor = value;
        return this;
    }

    /**
     * Gets the value of the requestE2EControl property.
     * 
     * @return
     *     possible object is
     *     {@link SwE2EControl }
     *     
     */
    public SwE2EControl getRequestE2EControl() {
        return requestE2EControl;
    }

    /**
     * Sets the value of the requestE2EControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwE2EControl }
     *     
     */
    public SwIntRequestHandle setRequestE2EControl(SwE2EControl value) {
        this.requestE2EControl = value;
        return this;
    }

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public SwIntRequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntRequestHeader }
     *     
     */
    public SwIntRequestHandle setRequestHeader(SwIntRequestHeader value) {
        this.requestHeader = value;
        return this;
    }

    /**
     * Gets the value of the requestPayload property.
     * 
     * @return
     *     possible object is
     *     {@link SwIntMixedAnyPayload }
     *     
     */
    public SwIntMixedAnyPayload getRequestPayload() {
        return requestPayload;
    }

    /**
     * Sets the value of the requestPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwIntMixedAnyPayload }
     *     
     */
    public SwIntRequestHandle setRequestPayload(SwIntMixedAnyPayload value) {
        this.requestPayload = value;
        return this;
    }

    /**
     * Gets the value of the crypto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crypto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrypto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwSecCrypto }
     * 
     * 
     */
    public List<SwSecCrypto> getCrypto() {
        if (crypto == null) {
            crypto = new ArrayList<SwSecCrypto>();
        }
        return this.crypto;
    }

    /**
     * Gets the value of the signatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwSecSignatureList }
     * 
     * 
     */
    public List<SwSecSignatureList> getSignatureList() {
        if (signatureList == null) {
            signatureList = new ArrayList<SwSecSignatureList>();
        }
        return this.signatureList;
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
     * Adds a new item to the crypto list.
     * @see #getCrypto()
     * 
     */
    public SwIntRequestHandle addCrypto(SwSecCrypto crypto) {
        getCrypto().add(crypto);
        return this;
    }

    /**
     * Adds a new item to the signatureList list.
     * @see #getSignatureList()
     * 
     */
    public SwIntRequestHandle addSignatureList(SwSecSignatureList signatureList) {
        getSignatureList().add(signatureList);
        return this;
    }

}
