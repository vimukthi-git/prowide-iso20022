
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the periodic money market fund report related header details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketFundReportHeader2", propOrder = {
    "rptgPrdFrToQrtr",
    "rptgYr",
    "elmtJustfn"
})
public class MoneyMarketFundReportHeader2 {

    @XmlElement(name = "RptgPrdFrToQrtr", required = true)
    protected QuarterPeriod1 rptgPrdFrToQrtr;
    @XmlElement(name = "RptgYr", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar rptgYr;
    @XmlElement(name = "ElmtJustfn")
    protected List<ReportItemJustification1> elmtJustfn;

    /**
     * Gets the value of the rptgPrdFrToQrtr property.
     * 
     * @return
     *     possible object is
     *     {@link QuarterPeriod1 }
     *     
     */
    public QuarterPeriod1 getRptgPrdFrToQrtr() {
        return rptgPrdFrToQrtr;
    }

    /**
     * Sets the value of the rptgPrdFrToQrtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuarterPeriod1 }
     *     
     */
    public MoneyMarketFundReportHeader2 setRptgPrdFrToQrtr(QuarterPeriod1 value) {
        this.rptgPrdFrToQrtr = value;
        return this;
    }

    /**
     * Gets the value of the rptgYr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgYr() {
        return rptgYr;
    }

    /**
     * Sets the value of the rptgYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public MoneyMarketFundReportHeader2 setRptgYr(XMLGregorianCalendar value) {
        this.rptgYr = value;
        return this;
    }

    /**
     * Gets the value of the elmtJustfn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elmtJustfn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElmtJustfn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportItemJustification1 }
     * 
     * 
     */
    public List<ReportItemJustification1> getElmtJustfn() {
        if (elmtJustfn == null) {
            elmtJustfn = new ArrayList<ReportItemJustification1>();
        }
        return this.elmtJustfn;
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
     * Adds a new item to the elmtJustfn list.
     * @see #getElmtJustfn()
     * 
     */
    public MoneyMarketFundReportHeader2 addElmtJustfn(ReportItemJustification1 elmtJustfn) {
        getElmtJustfn().add(elmtJustfn);
        return this;
    }

}
