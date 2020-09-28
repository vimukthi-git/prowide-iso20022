
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
 * Scope
 * The CollateralProposalResponse message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager to either accept or reject the collateral which has been proposed for the margin call. This message applies to both initial and counter proposals. If the collateral proposal is rejected then a new collateral proposal must be made.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * The CollateralProposalResponse message can be sent in response to a previously received CollateralProposal message in order to accept or reject the collateral that has been proposed to cover the margin call.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposalResponseV05", propOrder = {
    "txId",
    "oblgtn",
    "prpslRspn",
    "splmtryData"
})
public class CollateralProposalResponseV05 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation5 oblgtn;
    @XmlElement(name = "PrpslRspn", required = true)
    protected CollateralProposalResponse3Choice prpslRspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralProposalResponseV05 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation5 }
     *     
     */
    public Obligation5 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation5 }
     *     
     */
    public CollateralProposalResponseV05 setOblgtn(Obligation5 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the prpslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponse3Choice }
     *     
     */
    public CollateralProposalResponse3Choice getPrpslRspn() {
        return prpslRspn;
    }

    /**
     * Sets the value of the prpslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponse3Choice }
     *     
     */
    public CollateralProposalResponseV05 setPrpslRspn(CollateralProposalResponse3Choice value) {
        this.prpslRspn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CollateralProposalResponseV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
