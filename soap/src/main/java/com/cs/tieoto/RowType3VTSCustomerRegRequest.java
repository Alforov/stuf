
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_3VTSCustomerReg_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_3VTSCustomerReg_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLN_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_NAMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="R_E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_MOB_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_PCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A3VTS_COUNTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A3VTS_FLAG1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A3VTS_FLAG2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HINT_QUESTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HINT_ANSWER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PASSWORD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDITIONAL_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDITIONAL_CVV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADDITIONAL_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SUPPLEMENTARY_PAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUPPLEMENTARY_CVV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUPPLEMENTARY_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_C" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GROUPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_3VTSCustomerReg_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "card",
    "cardtype",
    "client",
    "status",
    "clientb",
    "clncat",
    "fnames",
    "surname",
    "nationality",
    "bdate",
    "remails",
    "rmobphone",
    "ucod1",
    "rstreet",
    "rcity",
    "rcntry",
    "rpcode",
    "a3VTSCOUNTY",
    "a3VTSFLAG1",
    "a3VTSFLAG2",
    "hintquestion",
    "hintanswer",
    "password",
    "additionalcard",
    "additionalcvv2",
    "additionalexpiry",
    "supplementarypan",
    "supplementarycvv2",
    "supplementaryexpiry",
    "notes",
    "bankc",
    "groupc"
})
public class RowType3VTSCustomerRegRequest {

    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElementRef(name = "CARD_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardtype;
    @XmlElementRef(name = "CLIENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> client;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "CLIENT_B", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientb;
    @XmlElementRef(name = "CLN_CAT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clncat;
    @XmlElementRef(name = "F_NAMES", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fnames;
    @XmlElementRef(name = "SURNAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "NATIONALITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;
    @XmlElementRef(name = "B_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> bdate;
    @XmlElementRef(name = "R_E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remails;
    @XmlElementRef(name = "R_MOB_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rmobphone;
    @XmlElementRef(name = "U_COD1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod1;
    @XmlElementRef(name = "R_STREET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rstreet;
    @XmlElementRef(name = "R_CITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rcity;
    @XmlElementRef(name = "R_CNTRY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rcntry;
    @XmlElementRef(name = "R_PCODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rpcode;
    @XmlElementRef(name = "A3VTS_COUNTY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> a3VTSCOUNTY;
    @XmlElementRef(name = "A3VTS_FLAG1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> a3VTSFLAG1;
    @XmlElementRef(name = "A3VTS_FLAG2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> a3VTSFLAG2;
    @XmlElementRef(name = "HINT_QUESTION", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hintquestion;
    @XmlElementRef(name = "HINT_ANSWER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hintanswer;
    @XmlElementRef(name = "PASSWORD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "ADDITIONAL_CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalcard;
    @XmlElementRef(name = "ADDITIONAL_CVV2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalcvv2;
    @XmlElementRef(name = "ADDITIONAL_EXPIRY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> additionalexpiry;
    @XmlElementRef(name = "SUPPLEMENTARY_PAN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplementarypan;
    @XmlElementRef(name = "SUPPLEMENTARY_CVV2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplementarycvv2;
    @XmlElementRef(name = "SUPPLEMENTARY_EXPIRY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> supplementaryexpiry;
    @XmlElementRef(name = "NOTES", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "BANK_C", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankc;
    @XmlElementRef(name = "GROUPC", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupc;

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
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENT() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENT(JAXBElement<String> value) {
        this.client = value;
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
     * Gets the value of the clientb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENTB() {
        return clientb;
    }

    /**
     * Sets the value of the clientb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENTB(JAXBElement<String> value) {
        this.clientb = value;
    }

    /**
     * Gets the value of the clncat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLNCAT() {
        return clncat;
    }

    /**
     * Sets the value of the clncat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLNCAT(JAXBElement<String> value) {
        this.clncat = value;
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
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNATIONALITY() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNATIONALITY(JAXBElement<String> value) {
        this.nationality = value;
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
     * Gets the value of the remails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREMAILS() {
        return remails;
    }

    /**
     * Sets the value of the remails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREMAILS(JAXBElement<String> value) {
        this.remails = value;
    }

    /**
     * Gets the value of the rmobphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRMOBPHONE() {
        return rmobphone;
    }

    /**
     * Sets the value of the rmobphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRMOBPHONE(JAXBElement<String> value) {
        this.rmobphone = value;
    }

    /**
     * Gets the value of the ucod1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD1() {
        return ucod1;
    }

    /**
     * Sets the value of the ucod1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD1(JAXBElement<String> value) {
        this.ucod1 = value;
    }

    /**
     * Gets the value of the rstreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRSTREET() {
        return rstreet;
    }

    /**
     * Sets the value of the rstreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRSTREET(JAXBElement<String> value) {
        this.rstreet = value;
    }

    /**
     * Gets the value of the rcity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRCITY() {
        return rcity;
    }

    /**
     * Sets the value of the rcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRCITY(JAXBElement<String> value) {
        this.rcity = value;
    }

    /**
     * Gets the value of the rcntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRCNTRY() {
        return rcntry;
    }

    /**
     * Sets the value of the rcntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRCNTRY(JAXBElement<String> value) {
        this.rcntry = value;
    }

    /**
     * Gets the value of the rpcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRPCODE() {
        return rpcode;
    }

    /**
     * Sets the value of the rpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRPCODE(JAXBElement<String> value) {
        this.rpcode = value;
    }

    /**
     * Gets the value of the a3VTSCOUNTY property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getA3VTSCOUNTY() {
        return a3VTSCOUNTY;
    }

    /**
     * Sets the value of the a3VTSCOUNTY property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setA3VTSCOUNTY(JAXBElement<String> value) {
        this.a3VTSCOUNTY = value;
    }

    /**
     * Gets the value of the a3VTSFLAG1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getA3VTSFLAG1() {
        return a3VTSFLAG1;
    }

    /**
     * Sets the value of the a3VTSFLAG1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setA3VTSFLAG1(JAXBElement<String> value) {
        this.a3VTSFLAG1 = value;
    }

    /**
     * Gets the value of the a3VTSFLAG2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getA3VTSFLAG2() {
        return a3VTSFLAG2;
    }

    /**
     * Sets the value of the a3VTSFLAG2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setA3VTSFLAG2(JAXBElement<String> value) {
        this.a3VTSFLAG2 = value;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPASSWORD(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the additionalcard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDITIONALCARD() {
        return additionalcard;
    }

    /**
     * Sets the value of the additionalcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDITIONALCARD(JAXBElement<String> value) {
        this.additionalcard = value;
    }

    /**
     * Gets the value of the additionalcvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADDITIONALCVV2() {
        return additionalcvv2;
    }

    /**
     * Sets the value of the additionalcvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADDITIONALCVV2(JAXBElement<String> value) {
        this.additionalcvv2 = value;
    }

    /**
     * Gets the value of the additionalexpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getADDITIONALEXPIRY() {
        return additionalexpiry;
    }

    /**
     * Sets the value of the additionalexpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setADDITIONALEXPIRY(JAXBElement<XMLGregorianCalendar> value) {
        this.additionalexpiry = value;
    }

    /**
     * Gets the value of the supplementarypan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUPPLEMENTARYPAN() {
        return supplementarypan;
    }

    /**
     * Sets the value of the supplementarypan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUPPLEMENTARYPAN(JAXBElement<String> value) {
        this.supplementarypan = value;
    }

    /**
     * Gets the value of the supplementarycvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUPPLEMENTARYCVV2() {
        return supplementarycvv2;
    }

    /**
     * Sets the value of the supplementarycvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUPPLEMENTARYCVV2(JAXBElement<String> value) {
        this.supplementarycvv2 = value;
    }

    /**
     * Gets the value of the supplementaryexpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSUPPLEMENTARYEXPIRY() {
        return supplementaryexpiry;
    }

    /**
     * Sets the value of the supplementaryexpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSUPPLEMENTARYEXPIRY(JAXBElement<XMLGregorianCalendar> value) {
        this.supplementaryexpiry = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNOTES() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNOTES(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the bankc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBANKC() {
        return bankc;
    }

    /**
     * Sets the value of the bankc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBANKC(JAXBElement<String> value) {
        this.bankc = value;
    }

    /**
     * Gets the value of the groupc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGROUPC() {
        return groupc;
    }

    /**
     * Sets the value of the groupc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGROUPC(JAXBElement<String> value) {
        this.groupc = value;
    }

}
