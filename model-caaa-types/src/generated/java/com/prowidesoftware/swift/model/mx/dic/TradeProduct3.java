
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
 * Tangible output or service produced by human or mechanical effort, or by a natural process for purposes of specifying a product.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeProduct3", propOrder = {
    "id",
    "nm",
    "desc",
    "ctryOfOrgn",
    "pdctChrtcs",
    "pdctCtgy",
    "gblSrlIdr"
})
public class TradeProduct3 {

    @XmlElement(name = "Id")
    protected List<ProductIdentifier2Choice> id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "CtryOfOrgn")
    protected List<CountryCodeAndName1> ctryOfOrgn;
    @XmlElement(name = "PdctChrtcs")
    protected List<ProductCharacteristics4> pdctChrtcs;
    @XmlElement(name = "PdctCtgy")
    protected List<ProductCategory1Choice> pdctCtgy;
    @XmlElement(name = "GblSrlIdr")
    protected List<String> gblSrlIdr;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentifier2Choice }
     * 
     * 
     */
    public List<ProductIdentifier2Choice> getId() {
        if (id == null) {
            id = new ArrayList<ProductIdentifier2Choice>();
        }
        return this.id;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeProduct3 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeProduct3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfOrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctryOfOrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtryOfOrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeAndName1 }
     * 
     * 
     */
    public List<CountryCodeAndName1> getCtryOfOrgn() {
        if (ctryOfOrgn == null) {
            ctryOfOrgn = new ArrayList<CountryCodeAndName1>();
        }
        return this.ctryOfOrgn;
    }

    /**
     * Gets the value of the pdctChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdctChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCharacteristics4 }
     * 
     * 
     */
    public List<ProductCharacteristics4> getPdctChrtcs() {
        if (pdctChrtcs == null) {
            pdctChrtcs = new ArrayList<ProductCharacteristics4>();
        }
        return this.pdctChrtcs;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdctCtgy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdctCtgy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategory1Choice }
     * 
     * 
     */
    public List<ProductCategory1Choice> getPdctCtgy() {
        if (pdctCtgy == null) {
            pdctCtgy = new ArrayList<ProductCategory1Choice>();
        }
        return this.pdctCtgy;
    }

    /**
     * Gets the value of the gblSrlIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gblSrlIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGblSrlIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGblSrlIdr() {
        if (gblSrlIdr == null) {
            gblSrlIdr = new ArrayList<String>();
        }
        return this.gblSrlIdr;
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
     * Adds a new item to the id list.
     * @see #getId()
     * 
     */
    public TradeProduct3 addId(ProductIdentifier2Choice id) {
        getId().add(id);
        return this;
    }

    /**
     * Adds a new item to the ctryOfOrgn list.
     * @see #getCtryOfOrgn()
     * 
     */
    public TradeProduct3 addCtryOfOrgn(CountryCodeAndName1 ctryOfOrgn) {
        getCtryOfOrgn().add(ctryOfOrgn);
        return this;
    }

    /**
     * Adds a new item to the pdctChrtcs list.
     * @see #getPdctChrtcs()
     * 
     */
    public TradeProduct3 addPdctChrtcs(ProductCharacteristics4 pdctChrtcs) {
        getPdctChrtcs().add(pdctChrtcs);
        return this;
    }

    /**
     * Adds a new item to the pdctCtgy list.
     * @see #getPdctCtgy()
     * 
     */
    public TradeProduct3 addPdctCtgy(ProductCategory1Choice pdctCtgy) {
        getPdctCtgy().add(pdctCtgy);
        return this;
    }

    /**
     * Adds a new item to the gblSrlIdr list.
     * @see #getGblSrlIdr()
     * 
     */
    public TradeProduct3 addGblSrlIdr(String gblSrlIdr) {
        getGblSrlIdr().add(gblSrlIdr);
        return this;
    }

}
