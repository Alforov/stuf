
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_AccountInfo_Additional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_AccountInfo_Additional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD_NUMB" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IC_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LOST_CARD" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="POST_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BEGIN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="END_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AVAIL_AMT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DEBT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DEBT1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PREV_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MBEGIN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MDEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MCREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MEND_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MPREV_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BRUTTO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="USED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DBEGIN_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DDEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DCREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DEND_BAL" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DEP_CAP_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DEP_INT_CUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_INT_LAST" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_INT_TOT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_INT_GTOT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_CUR_TRNSF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_INT_TRNSF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DEP_LPER_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="REVERS_SUM" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="END_BAL1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PAYM_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PAYM_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PAYM_INTERNAL_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TA_OTB" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MPREV_DEBIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MPREV_CREDIT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PROC_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CRD_CHANGE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_AccountInfo_Additional", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "cardnumb",
    "icdate",
    "lostcard",
    "postdate",
    "beginbal",
    "debit",
    "credit",
    "endbal",
    "availamt",
    "debt",
    "debt1",
    "prevdate",
    "mbeginbal",
    "mdebit",
    "mcredit",
    "mendbal",
    "mprevbal",
    "brutto",
    "usedamount",
    "dbeginbal",
    "ddebit",
    "dcredit",
    "dendbal",
    "depcapdate",
    "depintcur",
    "depintlast",
    "depinttot",
    "depintgtot",
    "depcurtrnsf",
    "depinttrnsf",
    "deplperdate",
    "reverssum",
    "endbal1",
    "paymamount",
    "paymdate",
    "payminternalno",
    "taotb",
    "mprevdebit",
    "mprevcredit",
    "procid",
    "crdchangedate"
})
public class RowTypeAccountInfoAdditional {

    @XmlElement(name = "CARD_NUMB", required = true, nillable = true)
    protected BigDecimal cardnumb;
    @XmlElementRef(name = "IC_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> icdate;
    @XmlElement(name = "LOST_CARD", required = true, nillable = true)
    protected BigDecimal lostcard;
    @XmlElementRef(name = "POST_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> postdate;
    @XmlElement(name = "BEGIN_BAL", required = true, nillable = true)
    protected BigDecimal beginbal;
    @XmlElement(name = "DEBIT", required = true, nillable = true)
    protected BigDecimal debit;
    @XmlElement(name = "CREDIT", required = true, nillable = true)
    protected BigDecimal credit;
    @XmlElement(name = "END_BAL", required = true, nillable = true)
    protected BigDecimal endbal;
    @XmlElement(name = "AVAIL_AMT", required = true, nillable = true)
    protected BigDecimal availamt;
    @XmlElement(name = "DEBT", required = true, nillable = true)
    protected BigDecimal debt;
    @XmlElement(name = "DEBT1", required = true, nillable = true)
    protected BigDecimal debt1;
    @XmlElementRef(name = "PREV_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> prevdate;
    @XmlElement(name = "MBEGIN_BAL", required = true, nillable = true)
    protected BigDecimal mbeginbal;
    @XmlElement(name = "MDEBIT", required = true, nillable = true)
    protected BigDecimal mdebit;
    @XmlElement(name = "MCREDIT", required = true, nillable = true)
    protected BigDecimal mcredit;
    @XmlElement(name = "MEND_BAL", required = true, nillable = true)
    protected BigDecimal mendbal;
    @XmlElement(name = "MPREV_BAL", required = true, nillable = true)
    protected BigDecimal mprevbal;
    @XmlElement(name = "BRUTTO", required = true, nillable = true)
    protected BigDecimal brutto;
    @XmlElement(name = "USED_AMOUNT", required = true, nillable = true)
    protected BigDecimal usedamount;
    @XmlElement(name = "DBEGIN_BAL", required = true, nillable = true)
    protected BigDecimal dbeginbal;
    @XmlElement(name = "DDEBIT", required = true, nillable = true)
    protected BigDecimal ddebit;
    @XmlElement(name = "DCREDIT", required = true, nillable = true)
    protected BigDecimal dcredit;
    @XmlElement(name = "DEND_BAL", required = true, nillable = true)
    protected BigDecimal dendbal;
    @XmlElementRef(name = "DEP_CAP_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> depcapdate;
    @XmlElementRef(name = "DEP_INT_CUR", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depintcur;
    @XmlElementRef(name = "DEP_INT_LAST", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depintlast;
    @XmlElementRef(name = "DEP_INT_TOT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depinttot;
    @XmlElementRef(name = "DEP_INT_GTOT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depintgtot;
    @XmlElementRef(name = "DEP_CUR_TRNSF", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depcurtrnsf;
    @XmlElementRef(name = "DEP_INT_TRNSF", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> depinttrnsf;
    @XmlElementRef(name = "DEP_LPER_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> deplperdate;
    @XmlElement(name = "REVERS_SUM", required = true, nillable = true)
    protected BigDecimal reverssum;
    @XmlElementRef(name = "END_BAL1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> endbal1;
    @XmlElementRef(name = "PAYM_AMOUNT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> paymamount;
    @XmlElementRef(name = "PAYM_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> paymdate;
    @XmlElementRef(name = "PAYM_INTERNAL_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> payminternalno;
    @XmlElement(name = "TA_OTB", required = true, nillable = true)
    protected BigDecimal taotb;
    @XmlElementRef(name = "MPREV_DEBIT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mprevdebit;
    @XmlElementRef(name = "MPREV_CREDIT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> mprevcredit;
    @XmlElementRef(name = "PROC_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> procid;
    @XmlElementRef(name = "CRD_CHANGE_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> crdchangedate;

    /**
     * Gets the value of the cardnumb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCARDNUMB() {
        return cardnumb;
    }

    /**
     * Sets the value of the cardnumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCARDNUMB(BigDecimal value) {
        this.cardnumb = value;
    }

    /**
     * Gets the value of the icdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getICDATE() {
        return icdate;
    }

    /**
     * Sets the value of the icdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setICDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.icdate = value;
    }

    /**
     * Gets the value of the lostcard property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLOSTCARD() {
        return lostcard;
    }

    /**
     * Sets the value of the lostcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLOSTCARD(BigDecimal value) {
        this.lostcard = value;
    }

    /**
     * Gets the value of the postdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPOSTDATE() {
        return postdate;
    }

    /**
     * Sets the value of the postdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPOSTDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.postdate = value;
    }

    /**
     * Gets the value of the beginbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBEGINBAL() {
        return beginbal;
    }

    /**
     * Sets the value of the beginbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBEGINBAL(BigDecimal value) {
        this.beginbal = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDEBIT() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDEBIT(BigDecimal value) {
        this.debit = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCREDIT() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCREDIT(BigDecimal value) {
        this.credit = value;
    }

    /**
     * Gets the value of the endbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getENDBAL() {
        return endbal;
    }

    /**
     * Sets the value of the endbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setENDBAL(BigDecimal value) {
        this.endbal = value;
    }

    /**
     * Gets the value of the availamt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAVAILAMT() {
        return availamt;
    }

    /**
     * Sets the value of the availamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAVAILAMT(BigDecimal value) {
        this.availamt = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDEBT() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDEBT(BigDecimal value) {
        this.debt = value;
    }

    /**
     * Gets the value of the debt1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDEBT1() {
        return debt1;
    }

    /**
     * Sets the value of the debt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDEBT1(BigDecimal value) {
        this.debt1 = value;
    }

    /**
     * Gets the value of the prevdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPREVDATE() {
        return prevdate;
    }

    /**
     * Sets the value of the prevdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPREVDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.prevdate = value;
    }

    /**
     * Gets the value of the mbeginbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMBEGINBAL() {
        return mbeginbal;
    }

    /**
     * Sets the value of the mbeginbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMBEGINBAL(BigDecimal value) {
        this.mbeginbal = value;
    }

    /**
     * Gets the value of the mdebit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMDEBIT() {
        return mdebit;
    }

    /**
     * Sets the value of the mdebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMDEBIT(BigDecimal value) {
        this.mdebit = value;
    }

    /**
     * Gets the value of the mcredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMCREDIT() {
        return mcredit;
    }

    /**
     * Sets the value of the mcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMCREDIT(BigDecimal value) {
        this.mcredit = value;
    }

    /**
     * Gets the value of the mendbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMENDBAL() {
        return mendbal;
    }

    /**
     * Sets the value of the mendbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMENDBAL(BigDecimal value) {
        this.mendbal = value;
    }

    /**
     * Gets the value of the mprevbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMPREVBAL() {
        return mprevbal;
    }

    /**
     * Sets the value of the mprevbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMPREVBAL(BigDecimal value) {
        this.mprevbal = value;
    }

    /**
     * Gets the value of the brutto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBRUTTO() {
        return brutto;
    }

    /**
     * Sets the value of the brutto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBRUTTO(BigDecimal value) {
        this.brutto = value;
    }

    /**
     * Gets the value of the usedamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUSEDAMOUNT() {
        return usedamount;
    }

    /**
     * Sets the value of the usedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUSEDAMOUNT(BigDecimal value) {
        this.usedamount = value;
    }

    /**
     * Gets the value of the dbeginbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDBEGINBAL() {
        return dbeginbal;
    }

    /**
     * Sets the value of the dbeginbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDBEGINBAL(BigDecimal value) {
        this.dbeginbal = value;
    }

    /**
     * Gets the value of the ddebit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDDEBIT() {
        return ddebit;
    }

    /**
     * Sets the value of the ddebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDDEBIT(BigDecimal value) {
        this.ddebit = value;
    }

    /**
     * Gets the value of the dcredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDCREDIT() {
        return dcredit;
    }

    /**
     * Sets the value of the dcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDCREDIT(BigDecimal value) {
        this.dcredit = value;
    }

    /**
     * Gets the value of the dendbal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDENDBAL() {
        return dendbal;
    }

    /**
     * Sets the value of the dendbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDENDBAL(BigDecimal value) {
        this.dendbal = value;
    }

    /**
     * Gets the value of the depcapdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDEPCAPDATE() {
        return depcapdate;
    }

    /**
     * Sets the value of the depcapdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDEPCAPDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.depcapdate = value;
    }

    /**
     * Gets the value of the depintcur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPINTCUR() {
        return depintcur;
    }

    /**
     * Sets the value of the depintcur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPINTCUR(JAXBElement<BigDecimal> value) {
        this.depintcur = value;
    }

    /**
     * Gets the value of the depintlast property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPINTLAST() {
        return depintlast;
    }

    /**
     * Sets the value of the depintlast property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPINTLAST(JAXBElement<BigDecimal> value) {
        this.depintlast = value;
    }

    /**
     * Gets the value of the depinttot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPINTTOT() {
        return depinttot;
    }

    /**
     * Sets the value of the depinttot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPINTTOT(JAXBElement<BigDecimal> value) {
        this.depinttot = value;
    }

    /**
     * Gets the value of the depintgtot property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPINTGTOT() {
        return depintgtot;
    }

    /**
     * Sets the value of the depintgtot property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPINTGTOT(JAXBElement<BigDecimal> value) {
        this.depintgtot = value;
    }

    /**
     * Gets the value of the depcurtrnsf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPCURTRNSF() {
        return depcurtrnsf;
    }

    /**
     * Sets the value of the depcurtrnsf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPCURTRNSF(JAXBElement<BigDecimal> value) {
        this.depcurtrnsf = value;
    }

    /**
     * Gets the value of the depinttrnsf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDEPINTTRNSF() {
        return depinttrnsf;
    }

    /**
     * Sets the value of the depinttrnsf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDEPINTTRNSF(JAXBElement<BigDecimal> value) {
        this.depinttrnsf = value;
    }

    /**
     * Gets the value of the deplperdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDEPLPERDATE() {
        return deplperdate;
    }

    /**
     * Sets the value of the deplperdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDEPLPERDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.deplperdate = value;
    }

    /**
     * Gets the value of the reverssum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREVERSSUM() {
        return reverssum;
    }

    /**
     * Sets the value of the reverssum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREVERSSUM(BigDecimal value) {
        this.reverssum = value;
    }

    /**
     * Gets the value of the endbal1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getENDBAL1() {
        return endbal1;
    }

    /**
     * Sets the value of the endbal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setENDBAL1(JAXBElement<BigDecimal> value) {
        this.endbal1 = value;
    }

    /**
     * Gets the value of the paymamount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPAYMAMOUNT() {
        return paymamount;
    }

    /**
     * Sets the value of the paymamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPAYMAMOUNT(JAXBElement<BigDecimal> value) {
        this.paymamount = value;
    }

    /**
     * Gets the value of the paymdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPAYMDATE() {
        return paymdate;
    }

    /**
     * Sets the value of the paymdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPAYMDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.paymdate = value;
    }

    /**
     * Gets the value of the payminternalno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPAYMINTERNALNO() {
        return payminternalno;
    }

    /**
     * Sets the value of the payminternalno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPAYMINTERNALNO(JAXBElement<BigDecimal> value) {
        this.payminternalno = value;
    }

    /**
     * Gets the value of the taotb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAOTB() {
        return taotb;
    }

    /**
     * Sets the value of the taotb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAOTB(BigDecimal value) {
        this.taotb = value;
    }

    /**
     * Gets the value of the mprevdebit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMPREVDEBIT() {
        return mprevdebit;
    }

    /**
     * Sets the value of the mprevdebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMPREVDEBIT(JAXBElement<BigDecimal> value) {
        this.mprevdebit = value;
    }

    /**
     * Gets the value of the mprevcredit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMPREVCREDIT() {
        return mprevcredit;
    }

    /**
     * Sets the value of the mprevcredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMPREVCREDIT(JAXBElement<BigDecimal> value) {
        this.mprevcredit = value;
    }

    /**
     * Gets the value of the procid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPROCID() {
        return procid;
    }

    /**
     * Sets the value of the procid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPROCID(JAXBElement<BigDecimal> value) {
        this.procid = value;
    }

    /**
     * Gets the value of the crdchangedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCRDCHANGEDATE() {
        return crdchangedate;
    }

    /**
     * Sets the value of the crdchangedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCRDCHANGEDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.crdchangedate = value;
    }

}
