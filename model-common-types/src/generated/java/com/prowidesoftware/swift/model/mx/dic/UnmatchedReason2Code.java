
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnmatchedReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnmatchedReason2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CMIS"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="DELN"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="SETS"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="DTRA"/&gt;
 *     &lt;enumeration value="CLAT"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="IIND"/&gt;
 *     &lt;enumeration value="FRAP"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="PODU"/&gt;
 *     &lt;enumeration value="REGD"/&gt;
 *     &lt;enumeration value="RTGS"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="CPCA"/&gt;
 *     &lt;enumeration value="IEXE"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="LEOG"/&gt;
 *     &lt;enumeration value="NMAS"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="DTRD"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="TXST"/&gt;
 *     &lt;enumeration value="ICUS"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="MIME"/&gt;
 *     &lt;enumeration value="UNBR"/&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnmatchedReason2Code")
@XmlEnum
public enum UnmatchedReason2Code {


    /**
     * A matching instruction from your counterparty could not be found.
     * 
     */
    CMIS,

    /**
     * Settlement date/time does not match.
     * 
     */
    DDAT,

    /**
     * Direction of the trade does not match. Counterparty expects a delivery from you, not a receipt or vice versa.
     * 
     */
    DELN,

    /**
     * Depository does not match.
     * 
     */
    DEPT,

    /**
     * Settlement amount does not match
     * 
     */
    DMON,

    /**
     * Deal price does not match.
     * 
     */
    DDEA,

    /**
     * Quantity of financial instruments does not match.
     * 
     */
    DQUA,

    /**
     * Received after the account servicer's deadline. Processed on best effort basis.
     * 
     */
    ADEA,

    /**
     * Settlement transaction type does not match (relates to the settlement transaction type codes available for field :22F::SETR.)
     * 
     */
    SETR,

    /**
     * Settlement system/method does not match (for example, instruction is to settle using settlement system/method A. Counterparty expects settlement to occur using settlement system/method B).
     * 
     */
    SETS,

    /**
     * Financial instrument identification does not match, for example, ISIN, financial instrument attributes differs...
     * 
     */
    DSEC,

    /**
     * Counterparty has been contacted or contacted us, and does not recognise the transaction.
     * 
     */
    DTRA,

    /**
     * Counterparty's instruction was too late for matching
     * 
     */
    CLAT,

    /**
     * Counterparty's instruction is physical settlement, your instruction is not, or vice versa.
     * 
     */
    PHYS,

    /**
     * Common reference does not match.
     * 
     */
    IIND,

    /**
     * Payment type does not match: your instruction is free of payment, your counterparty's instruction is against payment or vice versa.
     * 
     */
    FRAP,

    /**
     * Place of trade does not match.
     * 
     */
    PLCE,

    /**
     * Instruction has not been matched. It is a possible duplicate instruction.
     * 
     */
    PODU,

    /**
     * Registration details linked to the transaction are incorrect.
     * 
     */
    REGD,

    /**
     * Counterparty is for Real Time Gross Settlement (RTGS) system, you are for non-RTGS or vice versa.
     * 
     */
    RTGS,

    /**
     * Participant of delivering or receiving depository does not match.
     * 
     */
    ICAG,

    /**
     * Counterparty cancelled their instruction.
     * 
     */
    CPCA,

    /**
     * Client of delivering or receiving party 2 does not match.
     * 
     */
    IEXE,

    /**
     * Settlement amount currency does not match.
     * 
     */
    NCRR,

    /**
     * Counterparty is for settlement through letter of guarantee, your instruction is not, or vice versa.
     * 
     */
    LEOG,

    /**
     * Matching process has not yet started.
     * 
     */
    NMAS,

    /**
     * Safekeeping account used as matching criteria on the market concerned does not match. This includes Buyer/seller's account, direct client's account at the receiving/delivering agent, or receiving/delivering agent's account at the CSD.
     * 
     */
    SAFE,

    /**
     * Trade date does not match.
     * 
     */
    DTRD,

    /**
     * Your instruction was too late for matching.
     * 
     */
    LATE,

    /**
     * Disagreement on the tax status of the financial instruments to be settled.
     * 
     */
    TXST,

    /**
     * Client of delivering or receiving party 1 does not match.
     * 
     */
    ICUS,

    /**
     * Other. See Narrative.
     * 
     */
    OTHR,

    /**
     * Missing market execution details.
     * 
     */
    MIME,

    /**
     * Market side trade is unmatched.
     * 
     */
    UNBR,

    /**
     * The place of safekeeping information does not allow matching to take place.
     * 
     */
    INPS;

    public String value() {
        return name();
    }

    public static UnmatchedReason2Code fromValue(String v) {
        return valueOf(v);
    }

}
