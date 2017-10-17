
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_AccountInfo_Base complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_AccountInfo_Base">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ACC_PRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="C_ACCNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_ACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANZ_ACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CYCLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="COND_SET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STAT_CHANGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STA_COMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUTH_BONUS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AB_EXPIRITY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CRD" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRD_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ATM_LIMIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NON_REDUCE_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ADJUST_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAY_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAY_FREQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CALCUL_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAY_AMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PAY_INTR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIM_AMNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIM_INTR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CREATED_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="STOP_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UFIELD_5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEPOSIT_COMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEPOSIT_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGR_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_EXP_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DEP_OPEN_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEP_FRONT_F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DEP_OPER_ACCT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_OPER_ACCTB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_OPER_BACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IN_FILE_NUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OPEN_INSTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INSTL_LINE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INSTL_CONDSET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_AccountInfo_Base", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "accountno",
    "accprty",
    "caccnttype",
    "cardacct",
    "ccy",
    "tranzacct",
    "cycle",
    "minbal",
    "condset",
    "status",
    "statchange",
    "stacoment",
    "authbonus",
    "abexpirity",
    "crd",
    "crdexpiry",
    "atmlimit",
    "nonreducebal",
    "adjustflag",
    "paycode",
    "payfreq",
    "calculmode",
    "payamnt",
    "payintr",
    "limamnt",
    "limintr",
    "createddate",
    "stopdate",
    "message",
    "ucod7",
    "ucod8",
    "ufield5",
    "ufield6",
    "deposit",
    "depositcoment",
    "depositaccount",
    "agramount",
    "depexpdate",
    "depopenf",
    "depfrontf",
    "depoperacct",
    "depoperacctb",
    "depoperbacct",
    "infilenum",
    "openinstl",
    "instlline",
    "instlcondset"
})
public class RowTypeAccountInfoBase {

    @XmlElementRef(name = "ACCOUNT_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> accountno;
    @XmlElementRef(name = "ACC_PRTY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accprty;
    @XmlElementRef(name = "C_ACCNT_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caccnttype;
    @XmlElementRef(name = "CARD_ACCT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardacct;
    @XmlElementRef(name = "CCY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccy;
    @XmlElementRef(name = "TRANZ_ACCT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranzacct;
    @XmlElementRef(name = "CYCLE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cycle;
    @XmlElementRef(name = "MIN_BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> minbal;
    @XmlElementRef(name = "COND_SET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condset;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "STAT_CHANGE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statchange;
    @XmlElementRef(name = "STA_COMENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stacoment;
    @XmlElementRef(name = "AUTH_BONUS", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> authbonus;
    @XmlElementRef(name = "AB_EXPIRITY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> abexpirity;
    @XmlElementRef(name = "CRD", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crd;
    @XmlElementRef(name = "CRD_EXPIRY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> crdexpiry;
    @XmlElementRef(name = "ATM_LIMIT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> atmlimit;
    @XmlElementRef(name = "NON_REDUCE_BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> nonreducebal;
    @XmlElementRef(name = "ADJUST_FLAG", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustflag;
    @XmlElementRef(name = "PAY_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paycode;
    @XmlElementRef(name = "PAY_FREQ", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payfreq;
    @XmlElementRef(name = "CALCUL_MODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calculmode;
    @XmlElementRef(name = "PAY_AMNT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> payamnt;
    @XmlElementRef(name = "PAY_INTR", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> payintr;
    @XmlElementRef(name = "LIM_AMNT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> limamnt;
    @XmlElementRef(name = "LIM_INTR", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> limintr;
    @XmlElement(name = "CREATED_DATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createddate;
    @XmlElementRef(name = "STOP_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> stopdate;
    @XmlElementRef(name = "MESSAGE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "U_COD7", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod7;
    @XmlElementRef(name = "U_COD8", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod8;
    @XmlElementRef(name = "UFIELD_5", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield5;
    @XmlElementRef(name = "U_FIELD6", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield6;
    @XmlElementRef(name = "DEPOSIT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> deposit;
    @XmlElementRef(name = "DEPOSIT_COMENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depositcoment;
    @XmlElementRef(name = "DEPOSIT_ACCOUNT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depositaccount;
    @XmlElementRef(name = "AGR_AMOUNT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> agramount;
    @XmlElementRef(name = "DEP_EXP_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> depexpdate;
    @XmlElementRef(name = "DEP_OPEN_F", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depopenf;
    @XmlElementRef(name = "DEP_FRONT_F", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depfrontf;
    @XmlElementRef(name = "DEP_OPER_ACCT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depoperacct;
    @XmlElementRef(name = "DEP_OPER_ACCTB", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depoperacctb;
    @XmlElementRef(name = "DEP_OPER_BACCT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> depoperbacct;
    @XmlElementRef(name = "IN_FILE_NUM", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> infilenum;
    @XmlElementRef(name = "OPEN_INSTL", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> openinstl;
    @XmlElementRef(name = "INSTL_LINE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> instlline;
    @XmlElementRef(name = "INSTL_CONDSET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instlcondset;

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
     * Gets the value of the accprty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACCPRTY() {
        return accprty;
    }

    /**
     * Sets the value of the accprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACCPRTY(JAXBElement<String> value) {
        this.accprty = value;
    }

    /**
     * Gets the value of the caccnttype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCACCNTTYPE() {
        return caccnttype;
    }

    /**
     * Sets the value of the caccnttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCACCNTTYPE(JAXBElement<String> value) {
        this.caccnttype = value;
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
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCCY(JAXBElement<String> value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the tranzacct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRANZACCT() {
        return tranzacct;
    }

    /**
     * Sets the value of the tranzacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRANZACCT(JAXBElement<String> value) {
        this.tranzacct = value;
    }

    /**
     * Gets the value of the cycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCYCLE() {
        return cycle;
    }

    /**
     * Sets the value of the cycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCYCLE(JAXBElement<String> value) {
        this.cycle = value;
    }

    /**
     * Gets the value of the minbal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMINBAL() {
        return minbal;
    }

    /**
     * Sets the value of the minbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMINBAL(JAXBElement<BigDecimal> value) {
        this.minbal = value;
    }

    /**
     * Gets the value of the condset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONDSET() {
        return condset;
    }

    /**
     * Sets the value of the condset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONDSET(JAXBElement<String> value) {
        this.condset = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUS(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the statchange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATCHANGE() {
        return statchange;
    }

    /**
     * Sets the value of the statchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATCHANGE(JAXBElement<String> value) {
        this.statchange = value;
    }

    /**
     * Gets the value of the stacoment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTACOMENT() {
        return stacoment;
    }

    /**
     * Sets the value of the stacoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTACOMENT(JAXBElement<String> value) {
        this.stacoment = value;
    }

    /**
     * Gets the value of the authbonus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAUTHBONUS() {
        return authbonus;
    }

    /**
     * Sets the value of the authbonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAUTHBONUS(JAXBElement<BigDecimal> value) {
        this.authbonus = value;
    }

    /**
     * Gets the value of the abexpirity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getABEXPIRITY() {
        return abexpirity;
    }

    /**
     * Sets the value of the abexpirity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setABEXPIRITY(JAXBElement<XMLGregorianCalendar> value) {
        this.abexpirity = value;
    }

    /**
     * Gets the value of the crd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCRD() {
        return crd;
    }

    /**
     * Sets the value of the crd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCRD(JAXBElement<BigDecimal> value) {
        this.crd = value;
    }

    /**
     * Gets the value of the crdexpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCRDEXPIRY() {
        return crdexpiry;
    }

    /**
     * Sets the value of the crdexpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCRDEXPIRY(JAXBElement<XMLGregorianCalendar> value) {
        this.crdexpiry = value;
    }

    /**
     * Gets the value of the atmlimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getATMLIMIT() {
        return atmlimit;
    }

    /**
     * Sets the value of the atmlimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setATMLIMIT(JAXBElement<BigDecimal> value) {
        this.atmlimit = value;
    }

    /**
     * Gets the value of the nonreducebal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNONREDUCEBAL() {
        return nonreducebal;
    }

    /**
     * Sets the value of the nonreducebal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNONREDUCEBAL(JAXBElement<BigDecimal> value) {
        this.nonreducebal = value;
    }

    /**
     * Gets the value of the adjustflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADJUSTFLAG() {
        return adjustflag;
    }

    /**
     * Sets the value of the adjustflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADJUSTFLAG(JAXBElement<String> value) {
        this.adjustflag = value;
    }

    /**
     * Gets the value of the paycode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAYCODE() {
        return paycode;
    }

    /**
     * Sets the value of the paycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAYCODE(JAXBElement<String> value) {
        this.paycode = value;
    }

    /**
     * Gets the value of the payfreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAYFREQ() {
        return payfreq;
    }

    /**
     * Sets the value of the payfreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAYFREQ(JAXBElement<String> value) {
        this.payfreq = value;
    }

    /**
     * Gets the value of the calculmode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCALCULMODE() {
        return calculmode;
    }

    /**
     * Sets the value of the calculmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCALCULMODE(JAXBElement<String> value) {
        this.calculmode = value;
    }

    /**
     * Gets the value of the payamnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPAYAMNT() {
        return payamnt;
    }

    /**
     * Sets the value of the payamnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPAYAMNT(JAXBElement<BigDecimal> value) {
        this.payamnt = value;
    }

    /**
     * Gets the value of the payintr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPAYINTR() {
        return payintr;
    }

    /**
     * Sets the value of the payintr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPAYINTR(JAXBElement<BigDecimal> value) {
        this.payintr = value;
    }

    /**
     * Gets the value of the limamnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLIMAMNT() {
        return limamnt;
    }

    /**
     * Sets the value of the limamnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLIMAMNT(JAXBElement<BigDecimal> value) {
        this.limamnt = value;
    }

    /**
     * Gets the value of the limintr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLIMINTR() {
        return limintr;
    }

    /**
     * Sets the value of the limintr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLIMINTR(JAXBElement<BigDecimal> value) {
        this.limintr = value;
    }

    /**
     * Gets the value of the createddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATEDDATE() {
        return createddate;
    }

    /**
     * Sets the value of the createddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATEDDATE(XMLGregorianCalendar value) {
        this.createddate = value;
    }

    /**
     * Gets the value of the stopdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSTOPDATE() {
        return stopdate;
    }

    /**
     * Sets the value of the stopdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSTOPDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.stopdate = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMESSAGE(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the ucod7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD7() {
        return ucod7;
    }

    /**
     * Sets the value of the ucod7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD7(JAXBElement<String> value) {
        this.ucod7 = value;
    }

    /**
     * Gets the value of the ucod8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD8() {
        return ucod8;
    }

    /**
     * Sets the value of the ucod8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD8(JAXBElement<String> value) {
        this.ucod8 = value;
    }

    /**
     * Gets the value of the ufield5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD5() {
        return ufield5;
    }

    /**
     * Sets the value of the ufield5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD5(JAXBElement<String> value) {
        this.ufield5 = value;
    }

    /**
     * Gets the value of the ufield6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD6() {
        return ufield6;
    }

    /**
     * Sets the value of the ufield6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD6(JAXBElement<String> value) {
        this.ufield6 = value;
    }

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPOSIT() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPOSIT(JAXBElement<BigDecimal> value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the depositcoment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEPOSITCOMENT() {
        return depositcoment;
    }

    /**
     * Sets the value of the depositcoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEPOSITCOMENT(JAXBElement<String> value) {
        this.depositcoment = value;
    }

    /**
     * Gets the value of the depositaccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEPOSITACCOUNT() {
        return depositaccount;
    }

    /**
     * Sets the value of the depositaccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEPOSITACCOUNT(JAXBElement<String> value) {
        this.depositaccount = value;
    }

    /**
     * Gets the value of the agramount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAGRAMOUNT() {
        return agramount;
    }

    /**
     * Sets the value of the agramount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAGRAMOUNT(JAXBElement<BigDecimal> value) {
        this.agramount = value;
    }

    /**
     * Gets the value of the depexpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDEPEXPDATE() {
        return depexpdate;
    }

    /**
     * Sets the value of the depexpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDEPEXPDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.depexpdate = value;
    }

    /**
     * Gets the value of the depopenf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEPOPENF() {
        return depopenf;
    }

    /**
     * Sets the value of the depopenf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEPOPENF(JAXBElement<String> value) {
        this.depopenf = value;
    }

    /**
     * Gets the value of the depfrontf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEPFRONTF() {
        return depfrontf;
    }

    /**
     * Sets the value of the depfrontf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEPFRONTF(JAXBElement<String> value) {
        this.depfrontf = value;
    }

    /**
     * Gets the value of the depoperacct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPOPERACCT() {
        return depoperacct;
    }

    /**
     * Sets the value of the depoperacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPOPERACCT(JAXBElement<BigDecimal> value) {
        this.depoperacct = value;
    }

    /**
     * Gets the value of the depoperacctb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPOPERACCTB() {
        return depoperacctb;
    }

    /**
     * Sets the value of the depoperacctb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPOPERACCTB(JAXBElement<BigDecimal> value) {
        this.depoperacctb = value;
    }

    /**
     * Gets the value of the depoperbacct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDEPOPERBACCT() {
        return depoperbacct;
    }

    /**
     * Sets the value of the depoperbacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDEPOPERBACCT(JAXBElement<String> value) {
        this.depoperbacct = value;
    }

    /**
     * Gets the value of the infilenum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getINFILENUM() {
        return infilenum;
    }

    /**
     * Sets the value of the infilenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setINFILENUM(JAXBElement<BigDecimal> value) {
        this.infilenum = value;
    }

    /**
     * Gets the value of the openinstl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOPENINSTL() {
        return openinstl;
    }

    /**
     * Sets the value of the openinstl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOPENINSTL(JAXBElement<BigDecimal> value) {
        this.openinstl = value;
    }

    /**
     * Gets the value of the instlline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getINSTLLINE() {
        return instlline;
    }

    /**
     * Sets the value of the instlline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setINSTLLINE(JAXBElement<BigDecimal> value) {
        this.instlline = value;
    }

    /**
     * Gets the value of the instlcondset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINSTLCONDSET() {
        return instlcondset;
    }

    /**
     * Sets the value of the instlcondset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINSTLCONDSET(JAXBElement<String> value) {
        this.instlcondset = value;
    }

}
