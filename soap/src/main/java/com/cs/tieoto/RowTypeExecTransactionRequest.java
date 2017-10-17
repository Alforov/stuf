
package com.cs.tieoto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_ExecTransaction_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_ExecTransaction_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAYMENT_MODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CARD_ACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_ACCT_CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXECUTE_ON" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TRAN_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRAN_CCY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRAN_AMNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BATCH_NR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLIP_NR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEAL_DESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNTERPARTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INTERNAL_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BANK_C" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GROUPC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRAN_DATE_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EXECUTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BOOKING_MSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_CODE10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TR_FEE10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHECK_DUPL" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="INSTL_AGR_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACCNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_ExecTransaction_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "paymentmode",
    "accountno",
    "cardacct",
    "cardacctccy",
    "card",
    "executeon",
    "trantype",
    "tranccy",
    "tranamnt",
    "branch",
    "batchnr",
    "slipnr",
    "dealdesc",
    "counterparty",
    "internalno",
    "bankc",
    "groupc",
    "trandatetime",
    "executiontype",
    "bookingmsg",
    "trcode",
    "trfee",
    "trcode2",
    "trfee2",
    "trcode3",
    "trfee3",
    "trcode4",
    "trfee4",
    "trcode5",
    "trfee5",
    "trcode6",
    "trfee6",
    "trcode7",
    "trfee7",
    "trcode8",
    "trfee8",
    "trcode9",
    "trfee9",
    "trcode10",
    "trfee10",
    "checkdupl",
    "instlagrno",
    "accnttype"
})
public class RowTypeExecTransactionRequest {

    @XmlElement(name = "PAYMENT_MODE", required = true, nillable = true)
    protected String paymentmode;
    @XmlElementRef(name = "ACCOUNT_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> accountno;
    @XmlElementRef(name = "CARD_ACCT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardacct;
    @XmlElementRef(name = "CARD_ACCT_CCY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardacctccy;
    @XmlElementRef(name = "CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> card;
    @XmlElementRef(name = "EXECUTE_ON", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> executeon;
    @XmlElement(name = "TRAN_TYPE", required = true, nillable = true)
    protected String trantype;
    @XmlElement(name = "TRAN_CCY", required = true, nillable = true)
    protected String tranccy;
    @XmlElement(name = "TRAN_AMNT", required = true, nillable = true)
    protected BigDecimal tranamnt;
    @XmlElementRef(name = "BRANCH", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branch;
    @XmlElementRef(name = "BATCH_NR", type = JAXBElement.class, required = false)
    protected JAXBElement<String> batchnr;
    @XmlElementRef(name = "SLIP_NR", type = JAXBElement.class, required = false)
    protected JAXBElement<String> slipnr;
    @XmlElementRef(name = "DEAL_DESC", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealdesc;
    @XmlElementRef(name = "COUNTERPARTY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> counterparty;
    @XmlElementRef(name = "INTERNAL_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> internalno;
    @XmlElement(name = "BANK_C", required = true, nillable = true)
    protected String bankc;
    @XmlElement(name = "GROUPC", required = true, nillable = true)
    protected String groupc;
    @XmlElementRef(name = "TRAN_DATE_TIME", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> trandatetime;
    @XmlElementRef(name = "EXECUTION_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> executiontype;
    @XmlElementRef(name = "BOOKING_MSG", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookingmsg;
    @XmlElementRef(name = "TR_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode;
    @XmlElementRef(name = "TR_FEE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee;
    @XmlElementRef(name = "TR_CODE2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode2;
    @XmlElementRef(name = "TR_FEE2", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee2;
    @XmlElementRef(name = "TR_CODE3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode3;
    @XmlElementRef(name = "TR_FEE3", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee3;
    @XmlElementRef(name = "TR_CODE4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode4;
    @XmlElementRef(name = "TR_FEE4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee4;
    @XmlElementRef(name = "TR_CODE5", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode5;
    @XmlElementRef(name = "TR_FEE5", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee5;
    @XmlElementRef(name = "TR_CODE6", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode6;
    @XmlElementRef(name = "TR_FEE6", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee6;
    @XmlElementRef(name = "TR_CODE7", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode7;
    @XmlElementRef(name = "TR_FEE7", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee7;
    @XmlElementRef(name = "TR_CODE8", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode8;
    @XmlElementRef(name = "TR_FEE8", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee8;
    @XmlElementRef(name = "TR_CODE9", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode9;
    @XmlElementRef(name = "TR_FEE9", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee9;
    @XmlElementRef(name = "TR_CODE10", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trcode10;
    @XmlElementRef(name = "TR_FEE10", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> trfee10;
    @XmlElementRef(name = "CHECK_DUPL", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> checkdupl;
    @XmlElementRef(name = "INSTL_AGR_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> instlagrno;
    @XmlElementRef(name = "ACCNT_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> accnttype;

    /**
     * Gets the value of the paymentmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTMODE() {
        return paymentmode;
    }

    /**
     * Sets the value of the paymentmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTMODE(String value) {
        this.paymentmode = value;
    }

    /**
     * Gets the value of the accountno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getACCOUNTNO() {
        return accountno;
    }

    /**
     * Sets the value of the accountno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setACCOUNTNO(JAXBElement<BigDecimal> value) {
        this.accountno = value;
    }

    /**
     * Gets the value of the cardacct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDACCT() {
        return cardacct;
    }

    /**
     * Sets the value of the cardacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDACCT(JAXBElement<String> value) {
        this.cardacct = value;
    }

    /**
     * Gets the value of the cardacctccy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDACCTCCY() {
        return cardacctccy;
    }

    /**
     * Sets the value of the cardacctccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDACCTCCY(JAXBElement<String> value) {
        this.cardacctccy = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARD() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARD(JAXBElement<String> value) {
        this.card = value;
    }

    /**
     * Gets the value of the executeon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXECUTEON() {
        return executeon;
    }

    /**
     * Sets the value of the executeon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXECUTEON(JAXBElement<XMLGregorianCalendar> value) {
        this.executeon = value;
    }

    /**
     * Gets the value of the trantype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANTYPE() {
        return trantype;
    }

    /**
     * Sets the value of the trantype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANTYPE(String value) {
        this.trantype = value;
    }

    /**
     * Gets the value of the tranccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANCCY() {
        return tranccy;
    }

    /**
     * Sets the value of the tranccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANCCY(String value) {
        this.tranccy = value;
    }

    /**
     * Gets the value of the tranamnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTRANAMNT() {
        return tranamnt;
    }

    /**
     * Sets the value of the tranamnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTRANAMNT(BigDecimal value) {
        this.tranamnt = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBRANCH(JAXBElement<String> value) {
        this.branch = value;
    }

    /**
     * Gets the value of the batchnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBATCHNR() {
        return batchnr;
    }

    /**
     * Sets the value of the batchnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBATCHNR(JAXBElement<String> value) {
        this.batchnr = value;
    }

    /**
     * Gets the value of the slipnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSLIPNR() {
        return slipnr;
    }

    /**
     * Sets the value of the slipnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSLIPNR(JAXBElement<String> value) {
        this.slipnr = value;
    }

    /**
     * Gets the value of the dealdesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEALDESC() {
        return dealdesc;
    }

    /**
     * Sets the value of the dealdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEALDESC(JAXBElement<String> value) {
        this.dealdesc = value;
    }

    /**
     * Gets the value of the counterparty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOUNTERPARTY() {
        return counterparty;
    }

    /**
     * Sets the value of the counterparty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOUNTERPARTY(JAXBElement<String> value) {
        this.counterparty = value;
    }

    /**
     * Gets the value of the internalno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getINTERNALNO() {
        return internalno;
    }

    /**
     * Sets the value of the internalno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setINTERNALNO(JAXBElement<BigDecimal> value) {
        this.internalno = value;
    }

    /**
     * Gets the value of the bankc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKC() {
        return bankc;
    }

    /**
     * Sets the value of the bankc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKC(String value) {
        this.bankc = value;
    }

    /**
     * Gets the value of the groupc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPC() {
        return groupc;
    }

    /**
     * Sets the value of the groupc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPC(String value) {
        this.groupc = value;
    }

    /**
     * Gets the value of the trandatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTRANDATETIME() {
        return trandatetime;
    }

    /**
     * Sets the value of the trandatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTRANDATETIME(JAXBElement<XMLGregorianCalendar> value) {
        this.trandatetime = value;
    }

    /**
     * Gets the value of the executiontype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEXECUTIONTYPE() {
        return executiontype;
    }

    /**
     * Sets the value of the executiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEXECUTIONTYPE(JAXBElement<BigDecimal> value) {
        this.executiontype = value;
    }

    /**
     * Gets the value of the bookingmsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBOOKINGMSG() {
        return bookingmsg;
    }

    /**
     * Sets the value of the bookingmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBOOKINGMSG(JAXBElement<String> value) {
        this.bookingmsg = value;
    }

    /**
     * Gets the value of the trcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE() {
        return trcode;
    }

    /**
     * Sets the value of the trcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE(JAXBElement<String> value) {
        this.trcode = value;
    }

    /**
     * Gets the value of the trfee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE() {
        return trfee;
    }

    /**
     * Sets the value of the trfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE(JAXBElement<BigDecimal> value) {
        this.trfee = value;
    }

    /**
     * Gets the value of the trcode2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE2() {
        return trcode2;
    }

    /**
     * Sets the value of the trcode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE2(JAXBElement<String> value) {
        this.trcode2 = value;
    }

    /**
     * Gets the value of the trfee2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE2() {
        return trfee2;
    }

    /**
     * Sets the value of the trfee2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE2(JAXBElement<BigDecimal> value) {
        this.trfee2 = value;
    }

    /**
     * Gets the value of the trcode3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE3() {
        return trcode3;
    }

    /**
     * Sets the value of the trcode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE3(JAXBElement<String> value) {
        this.trcode3 = value;
    }

    /**
     * Gets the value of the trfee3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE3() {
        return trfee3;
    }

    /**
     * Sets the value of the trfee3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE3(JAXBElement<BigDecimal> value) {
        this.trfee3 = value;
    }

    /**
     * Gets the value of the trcode4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE4() {
        return trcode4;
    }

    /**
     * Sets the value of the trcode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE4(JAXBElement<String> value) {
        this.trcode4 = value;
    }

    /**
     * Gets the value of the trfee4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE4() {
        return trfee4;
    }

    /**
     * Sets the value of the trfee4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE4(JAXBElement<BigDecimal> value) {
        this.trfee4 = value;
    }

    /**
     * Gets the value of the trcode5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE5() {
        return trcode5;
    }

    /**
     * Sets the value of the trcode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE5(JAXBElement<String> value) {
        this.trcode5 = value;
    }

    /**
     * Gets the value of the trfee5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE5() {
        return trfee5;
    }

    /**
     * Sets the value of the trfee5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE5(JAXBElement<BigDecimal> value) {
        this.trfee5 = value;
    }

    /**
     * Gets the value of the trcode6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE6() {
        return trcode6;
    }

    /**
     * Sets the value of the trcode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE6(JAXBElement<String> value) {
        this.trcode6 = value;
    }

    /**
     * Gets the value of the trfee6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE6() {
        return trfee6;
    }

    /**
     * Sets the value of the trfee6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE6(JAXBElement<BigDecimal> value) {
        this.trfee6 = value;
    }

    /**
     * Gets the value of the trcode7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE7() {
        return trcode7;
    }

    /**
     * Sets the value of the trcode7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE7(JAXBElement<String> value) {
        this.trcode7 = value;
    }

    /**
     * Gets the value of the trfee7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE7() {
        return trfee7;
    }

    /**
     * Sets the value of the trfee7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE7(JAXBElement<BigDecimal> value) {
        this.trfee7 = value;
    }

    /**
     * Gets the value of the trcode8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE8() {
        return trcode8;
    }

    /**
     * Sets the value of the trcode8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE8(JAXBElement<String> value) {
        this.trcode8 = value;
    }

    /**
     * Gets the value of the trfee8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE8() {
        return trfee8;
    }

    /**
     * Sets the value of the trfee8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE8(JAXBElement<BigDecimal> value) {
        this.trfee8 = value;
    }

    /**
     * Gets the value of the trcode9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE9() {
        return trcode9;
    }

    /**
     * Sets the value of the trcode9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE9(JAXBElement<String> value) {
        this.trcode9 = value;
    }

    /**
     * Gets the value of the trfee9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE9() {
        return trfee9;
    }

    /**
     * Sets the value of the trfee9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE9(JAXBElement<BigDecimal> value) {
        this.trfee9 = value;
    }

    /**
     * Gets the value of the trcode10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRCODE10() {
        return trcode10;
    }

    /**
     * Sets the value of the trcode10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRCODE10(JAXBElement<String> value) {
        this.trcode10 = value;
    }

    /**
     * Gets the value of the trfee10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTRFEE10() {
        return trfee10;
    }

    /**
     * Sets the value of the trfee10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTRFEE10(JAXBElement<BigDecimal> value) {
        this.trfee10 = value;
    }

    /**
     * Gets the value of the checkdupl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCHECKDUPL() {
        return checkdupl;
    }

    /**
     * Sets the value of the checkdupl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCHECKDUPL(JAXBElement<BigInteger> value) {
        this.checkdupl = value;
    }

    /**
     * Gets the value of the instlagrno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getINSTLAGRNO() {
        return instlagrno;
    }

    /**
     * Sets the value of the instlagrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setINSTLAGRNO(JAXBElement<BigDecimal> value) {
        this.instlagrno = value;
    }

    /**
     * Gets the value of the accnttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getACCNTTYPE() {
        return accnttype;
    }

    /**
     * Sets the value of the accnttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setACCNTTYPE(JAXBElement<BigInteger> value) {
        this.accnttype = value;
    }

}
