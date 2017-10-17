
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
 * <p>Java class for RowType_EditCard_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_EditCard_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BASE_SUPP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COND_SET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RISK_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_SERVICES_SET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REC_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="M_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RELATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CALL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_NAMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_NAME1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIDLE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERIAL_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOC_SINCE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CMPG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSURANC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INSURANC_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CRD_HOLD_MSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IN_FILE_NUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OUT_FILE_NUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HINT_QUESTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HINT_ANSWER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PVV_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PVV_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PVV2_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PVV2_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COND_SET_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COND_CHANGE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CHANGE_BACK_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVV1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RENEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_EditCard_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "card",
    "cardtype",
    "basesupp",
    "condset",
    "risklevel",
    "cardservicesset",
    "recdate",
    "mname",
    "relation",
    "idcard",
    "bdate",
    "callid",
    "fnames",
    "surname",
    "fname1",
    "midlename",
    "serialno",
    "docsince",
    "cmpgname",
    "insuranctype",
    "insurancdate",
    "crdholdmsg",
    "ucod9",
    "ucod10",
    "ufield7",
    "ufield8",
    "infilenum",
    "outfilenum",
    "hintquestion",
    "hintanswer",
    "pvv1",
    "pvv2",
    "pvv21",
    "pvv22",
    "cardname",
    "mcname",
    "condset2",
    "condchangedate",
    "changebackdate",
    "branch",
    "ufield11",
    "ufield12",
    "ufield13",
    "ufield14",
    "cvv1",
    "cvv2",
    "renew"
})
public class RowTypeEditCardRequest {

    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElementRef(name = "CARD_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardtype;
    @XmlElementRef(name = "BASE_SUPP", type = JAXBElement.class, required = false)
    protected JAXBElement<String> basesupp;
    @XmlElementRef(name = "COND_SET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condset;
    @XmlElementRef(name = "RISK_LEVEL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> risklevel;
    @XmlElementRef(name = "CARD_SERVICES_SET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardservicesset;
    @XmlElementRef(name = "REC_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> recdate;
    @XmlElementRef(name = "M_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mname;
    @XmlElementRef(name = "RELATION", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relation;
    @XmlElementRef(name = "ID_CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idcard;
    @XmlElementRef(name = "B_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> bdate;
    @XmlElementRef(name = "CALL_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callid;
    @XmlElementRef(name = "F_NAMES", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fnames;
    @XmlElementRef(name = "SURNAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "F_NAME1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fname1;
    @XmlElementRef(name = "MIDLE_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> midlename;
    @XmlElementRef(name = "SERIAL_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialno;
    @XmlElementRef(name = "DOC_SINCE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> docsince;
    @XmlElementRef(name = "CMPG_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpgname;
    @XmlElementRef(name = "INSURANC_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insuranctype;
    @XmlElementRef(name = "INSURANC_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> insurancdate;
    @XmlElementRef(name = "CRD_HOLD_MSG", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crdholdmsg;
    @XmlElementRef(name = "U_COD9", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod9;
    @XmlElementRef(name = "U_COD10", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod10;
    @XmlElementRef(name = "U_FIELD7", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield7;
    @XmlElementRef(name = "U_FIELD8", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield8;
    @XmlElementRef(name = "IN_FILE_NUM", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> infilenum;
    @XmlElementRef(name = "OUT_FILE_NUM", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> outfilenum;
    @XmlElementRef(name = "HINT_QUESTION", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hintquestion;
    @XmlElementRef(name = "HINT_ANSWER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hintanswer;
    @XmlElementRef(name = "PVV_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvv1;
    @XmlElementRef(name = "PVV_2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvv2;
    @XmlElementRef(name = "PVV2_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvv21;
    @XmlElementRef(name = "PVV2_2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pvv22;
    @XmlElementRef(name = "CARD_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardname;
    @XmlElementRef(name = "MC_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mcname;
    @XmlElementRef(name = "COND_SET_2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> condset2;
    @XmlElementRef(name = "COND_CHANGE_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> condchangedate;
    @XmlElementRef(name = "CHANGE_BACK_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> changebackdate;
    @XmlElementRef(name = "BRANCH", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branch;
    @XmlElementRef(name = "U_FIELD11", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield11;
    @XmlElementRef(name = "U_FIELD12", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield12;
    @XmlElementRef(name = "U_FIELD13", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield13;
    @XmlElementRef(name = "U_FIELD14", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield14;
    @XmlElementRef(name = "CVV1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cvv1;
    @XmlElementRef(name = "CVV2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cvv2;
    @XmlElementRef(name = "RENEW", type = JAXBElement.class, required = false)
    protected JAXBElement<String> renew;

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARD() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARD(String value) {
        this.card = value;
    }

    /**
     * Gets the value of the cardtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDTYPE() {
        return cardtype;
    }

    /**
     * Sets the value of the cardtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDTYPE(JAXBElement<String> value) {
        this.cardtype = value;
    }

    /**
     * Gets the value of the basesupp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBASESUPP() {
        return basesupp;
    }

    /**
     * Sets the value of the basesupp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBASESUPP(JAXBElement<String> value) {
        this.basesupp = value;
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
     * Gets the value of the risklevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRISKLEVEL() {
        return risklevel;
    }

    /**
     * Sets the value of the risklevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRISKLEVEL(JAXBElement<String> value) {
        this.risklevel = value;
    }

    /**
     * Gets the value of the cardservicesset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDSERVICESSET() {
        return cardservicesset;
    }

    /**
     * Sets the value of the cardservicesset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDSERVICESSET(JAXBElement<String> value) {
        this.cardservicesset = value;
    }

    /**
     * Gets the value of the recdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRECDATE() {
        return recdate;
    }

    /**
     * Sets the value of the recdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRECDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.recdate = value;
    }

    /**
     * Gets the value of the mname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNAME() {
        return mname;
    }

    /**
     * Sets the value of the mname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNAME(JAXBElement<String> value) {
        this.mname = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRELATION() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRELATION(JAXBElement<String> value) {
        this.relation = value;
    }

    /**
     * Gets the value of the idcard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDCARD() {
        return idcard;
    }

    /**
     * Sets the value of the idcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDCARD(JAXBElement<String> value) {
        this.idcard = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the callid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCALLID() {
        return callid;
    }

    /**
     * Sets the value of the callid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCALLID(JAXBElement<String> value) {
        this.callid = value;
    }

    /**
     * Gets the value of the fnames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFNAMES() {
        return fnames;
    }

    /**
     * Sets the value of the fnames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFNAMES(JAXBElement<String> value) {
        this.fnames = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSURNAME() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSURNAME(JAXBElement<String> value) {
        this.surname = value;
    }

    /**
     * Gets the value of the fname1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFNAME1() {
        return fname1;
    }

    /**
     * Sets the value of the fname1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFNAME1(JAXBElement<String> value) {
        this.fname1 = value;
    }

    /**
     * Gets the value of the midlename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMIDLENAME() {
        return midlename;
    }

    /**
     * Sets the value of the midlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMIDLENAME(JAXBElement<String> value) {
        this.midlename = value;
    }

    /**
     * Gets the value of the serialno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSERIALNO() {
        return serialno;
    }

    /**
     * Sets the value of the serialno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSERIALNO(JAXBElement<String> value) {
        this.serialno = value;
    }

    /**
     * Gets the value of the docsince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDOCSINCE() {
        return docsince;
    }

    /**
     * Sets the value of the docsince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDOCSINCE(JAXBElement<XMLGregorianCalendar> value) {
        this.docsince = value;
    }

    /**
     * Gets the value of the cmpgname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCMPGNAME() {
        return cmpgname;
    }

    /**
     * Sets the value of the cmpgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCMPGNAME(JAXBElement<String> value) {
        this.cmpgname = value;
    }

    /**
     * Gets the value of the insuranctype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINSURANCTYPE() {
        return insuranctype;
    }

    /**
     * Sets the value of the insuranctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINSURANCTYPE(JAXBElement<String> value) {
        this.insuranctype = value;
    }

    /**
     * Gets the value of the insurancdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getINSURANCDATE() {
        return insurancdate;
    }

    /**
     * Sets the value of the insurancdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setINSURANCDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.insurancdate = value;
    }

    /**
     * Gets the value of the crdholdmsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRDHOLDMSG() {
        return crdholdmsg;
    }

    /**
     * Sets the value of the crdholdmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRDHOLDMSG(JAXBElement<String> value) {
        this.crdholdmsg = value;
    }

    /**
     * Gets the value of the ucod9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD9() {
        return ucod9;
    }

    /**
     * Sets the value of the ucod9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD9(JAXBElement<String> value) {
        this.ucod9 = value;
    }

    /**
     * Gets the value of the ucod10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD10() {
        return ucod10;
    }

    /**
     * Sets the value of the ucod10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD10(JAXBElement<String> value) {
        this.ucod10 = value;
    }

    /**
     * Gets the value of the ufield7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD7() {
        return ufield7;
    }

    /**
     * Sets the value of the ufield7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD7(JAXBElement<String> value) {
        this.ufield7 = value;
    }

    /**
     * Gets the value of the ufield8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD8() {
        return ufield8;
    }

    /**
     * Sets the value of the ufield8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD8(JAXBElement<String> value) {
        this.ufield8 = value;
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
     * Gets the value of the outfilenum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOUTFILENUM() {
        return outfilenum;
    }

    /**
     * Sets the value of the outfilenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOUTFILENUM(JAXBElement<BigDecimal> value) {
        this.outfilenum = value;
    }

    /**
     * Gets the value of the hintquestion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHINTQUESTION() {
        return hintquestion;
    }

    /**
     * Sets the value of the hintquestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHINTQUESTION(JAXBElement<String> value) {
        this.hintquestion = value;
    }

    /**
     * Gets the value of the hintanswer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHINTANSWER() {
        return hintanswer;
    }

    /**
     * Sets the value of the hintanswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHINTANSWER(JAXBElement<String> value) {
        this.hintanswer = value;
    }

    /**
     * Gets the value of the pvv1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVV1() {
        return pvv1;
    }

    /**
     * Sets the value of the pvv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVV1(JAXBElement<String> value) {
        this.pvv1 = value;
    }

    /**
     * Gets the value of the pvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVV2() {
        return pvv2;
    }

    /**
     * Sets the value of the pvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVV2(JAXBElement<String> value) {
        this.pvv2 = value;
    }

    /**
     * Gets the value of the pvv21 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVV21() {
        return pvv21;
    }

    /**
     * Sets the value of the pvv21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVV21(JAXBElement<String> value) {
        this.pvv21 = value;
    }

    /**
     * Gets the value of the pvv22 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPVV22() {
        return pvv22;
    }

    /**
     * Sets the value of the pvv22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPVV22(JAXBElement<String> value) {
        this.pvv22 = value;
    }

    /**
     * Gets the value of the cardname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDNAME() {
        return cardname;
    }

    /**
     * Sets the value of the cardname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDNAME(JAXBElement<String> value) {
        this.cardname = value;
    }

    /**
     * Gets the value of the mcname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCNAME() {
        return mcname;
    }

    /**
     * Sets the value of the mcname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCNAME(JAXBElement<String> value) {
        this.mcname = value;
    }

    /**
     * Gets the value of the condset2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONDSET2() {
        return condset2;
    }

    /**
     * Sets the value of the condset2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONDSET2(JAXBElement<String> value) {
        this.condset2 = value;
    }

    /**
     * Gets the value of the condchangedate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCONDCHANGEDATE() {
        return condchangedate;
    }

    /**
     * Sets the value of the condchangedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCONDCHANGEDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.condchangedate = value;
    }

    /**
     * Gets the value of the changebackdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCHANGEBACKDATE() {
        return changebackdate;
    }

    /**
     * Sets the value of the changebackdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCHANGEBACKDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.changebackdate = value;
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
     * Gets the value of the ufield11 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD11() {
        return ufield11;
    }

    /**
     * Sets the value of the ufield11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD11(JAXBElement<String> value) {
        this.ufield11 = value;
    }

    /**
     * Gets the value of the ufield12 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD12() {
        return ufield12;
    }

    /**
     * Sets the value of the ufield12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD12(JAXBElement<String> value) {
        this.ufield12 = value;
    }

    /**
     * Gets the value of the ufield13 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD13() {
        return ufield13;
    }

    /**
     * Sets the value of the ufield13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD13(JAXBElement<String> value) {
        this.ufield13 = value;
    }

    /**
     * Gets the value of the ufield14 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD14() {
        return ufield14;
    }

    /**
     * Sets the value of the ufield14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD14(JAXBElement<String> value) {
        this.ufield14 = value;
    }

    /**
     * Gets the value of the cvv1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCVV1() {
        return cvv1;
    }

    /**
     * Sets the value of the cvv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCVV1(JAXBElement<String> value) {
        this.cvv1 = value;
    }

    /**
     * Gets the value of the cvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCVV2() {
        return cvv2;
    }

    /**
     * Sets the value of the cvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCVV2(JAXBElement<String> value) {
        this.cvv2 = value;
    }

    /**
     * Gets the value of the renew property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRENEW() {
        return renew;
    }

    /**
     * Sets the value of the renew property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRENEW(JAXBElement<String> value) {
        this.renew = value;
    }

}
