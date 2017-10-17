
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
 * <p>Java class for RowType_Agreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_Agreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGRE_NOM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BINCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="B_BR_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OFFICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OFFICE_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTRACT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISTRIB_MODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ENROLLED" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISURANCE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REP_LANG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RISK_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_CODE5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_CODE6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IN_FILE_NUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="USRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMBI_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="COMBI_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_Agreement", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "agrenom",
    "bincod",
    "bankcode",
    "branch",
    "bbrid",
    "office",
    "officeid",
    "city",
    "client",
    "coment",
    "contract",
    "country",
    "distribmode",
    "enrolled",
    "emails",
    "isurancetype",
    "postind",
    "product",
    "replang",
    "risklevel",
    "street",
    "ucod4",
    "ucode5",
    "ucode6",
    "ufield3",
    "ufield4",
    "infilenum",
    "status",
    "ctime",
    "usrid",
    "combiid",
    "combitype"
})
public class RowTypeAgreement {

    @XmlElementRef(name = "AGRE_NOM", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> agrenom;
    @XmlElementRef(name = "BINCOD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bincod;
    @XmlElementRef(name = "BANK_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankcode;
    @XmlElement(name = "BRANCH", required = true, nillable = true)
    protected String branch;
    @XmlElementRef(name = "B_BR_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> bbrid;
    @XmlElementRef(name = "OFFICE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "OFFICE_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> officeid;
    @XmlElementRef(name = "CITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElement(name = "CLIENT", required = true, nillable = true)
    protected String client;
    @XmlElementRef(name = "COMENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coment;
    @XmlElement(name = "CONTRACT", required = true, nillable = true)
    protected String contract;
    @XmlElementRef(name = "COUNTRY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "DISTRIB_MODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distribmode;
    @XmlElement(name = "ENROLLED", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enrolled;
    @XmlElementRef(name = "E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emails;
    @XmlElementRef(name = "ISURANCE_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isurancetype;
    @XmlElementRef(name = "POST_IND", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postind;
    @XmlElementRef(name = "PRODUCT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product;
    @XmlElementRef(name = "REP_LANG", type = JAXBElement.class, required = false)
    protected JAXBElement<String> replang;
    @XmlElementRef(name = "RISK_LEVEL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> risklevel;
    @XmlElementRef(name = "STREET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "U_COD4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod4;
    @XmlElementRef(name = "U_CODE5", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucode5;
    @XmlElementRef(name = "U_CODE6", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucode6;
    @XmlElementRef(name = "U_FIELD3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield3;
    @XmlElementRef(name = "U_FIELD4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield4;
    @XmlElementRef(name = "IN_FILE_NUM", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> infilenum;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "CTIME", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ctime;
    @XmlElement(name = "USRID", required = true, nillable = true)
    protected String usrid;
    @XmlElementRef(name = "COMBI_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> combiid;
    @XmlElementRef(name = "COMBI_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> combitype;

    /**
     * Gets the value of the agrenom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAGRENOM() {
        return agrenom;
    }

    /**
     * Sets the value of the agrenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAGRENOM(JAXBElement<BigDecimal> value) {
        this.agrenom = value;
    }

    /**
     * Gets the value of the bincod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBINCOD() {
        return bincod;
    }

    /**
     * Sets the value of the bincod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBINCOD(JAXBElement<String> value) {
        this.bincod = value;
    }

    /**
     * Gets the value of the bankcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBANKCODE() {
        return bankcode;
    }

    /**
     * Sets the value of the bankcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBANKCODE(JAXBElement<String> value) {
        this.bankcode = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRANCH(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the bbrid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBBRID() {
        return bbrid;
    }

    /**
     * Sets the value of the bbrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBBRID(JAXBElement<BigDecimal> value) {
        this.bbrid = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFFICE() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFFICE(JAXBElement<String> value) {
        this.office = value;
    }

    /**
     * Gets the value of the officeid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOFFICEID() {
        return officeid;
    }

    /**
     * Sets the value of the officeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOFFICEID(JAXBElement<BigDecimal> value) {
        this.officeid = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCITY(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLIENT() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLIENT(String value) {
        this.client = value;
    }

    /**
     * Gets the value of the coment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMENT() {
        return coment;
    }

    /**
     * Sets the value of the coment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMENT(JAXBElement<String> value) {
        this.coment = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACT() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACT(String value) {
        this.contract = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOUNTRY(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the distribmode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDISTRIBMODE() {
        return distribmode;
    }

    /**
     * Sets the value of the distribmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDISTRIBMODE(JAXBElement<String> value) {
        this.distribmode = value;
    }

    /**
     * Gets the value of the enrolled property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENROLLED() {
        return enrolled;
    }

    /**
     * Sets the value of the enrolled property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENROLLED(XMLGregorianCalendar value) {
        this.enrolled = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMAILS() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMAILS(JAXBElement<String> value) {
        this.emails = value;
    }

    /**
     * Gets the value of the isurancetype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISURANCETYPE() {
        return isurancetype;
    }

    /**
     * Sets the value of the isurancetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISURANCETYPE(JAXBElement<String> value) {
        this.isurancetype = value;
    }

    /**
     * Gets the value of the postind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSTIND() {
        return postind;
    }

    /**
     * Sets the value of the postind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSTIND(JAXBElement<String> value) {
        this.postind = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRODUCT(JAXBElement<String> value) {
        this.product = value;
    }

    /**
     * Gets the value of the replang property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREPLANG() {
        return replang;
    }

    /**
     * Sets the value of the replang property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREPLANG(JAXBElement<String> value) {
        this.replang = value;
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
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTREET() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTREET(JAXBElement<String> value) {
        this.street = value;
    }

    /**
     * Gets the value of the ucod4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD4() {
        return ucod4;
    }

    /**
     * Sets the value of the ucod4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD4(JAXBElement<String> value) {
        this.ucod4 = value;
    }

    /**
     * Gets the value of the ucode5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCODE5() {
        return ucode5;
    }

    /**
     * Sets the value of the ucode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCODE5(JAXBElement<String> value) {
        this.ucode5 = value;
    }

    /**
     * Gets the value of the ucode6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCODE6() {
        return ucode6;
    }

    /**
     * Sets the value of the ucode6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCODE6(JAXBElement<String> value) {
        this.ucode6 = value;
    }

    /**
     * Gets the value of the ufield3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD3() {
        return ufield3;
    }

    /**
     * Sets the value of the ufield3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD3(JAXBElement<String> value) {
        this.ufield3 = value;
    }

    /**
     * Gets the value of the ufield4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD4() {
        return ufield4;
    }

    /**
     * Sets the value of the ufield4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD4(JAXBElement<String> value) {
        this.ufield4 = value;
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
     * Gets the value of the ctime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCTIME() {
        return ctime;
    }

    /**
     * Sets the value of the ctime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCTIME(XMLGregorianCalendar value) {
        this.ctime = value;
    }

    /**
     * Gets the value of the usrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRID() {
        return usrid;
    }

    /**
     * Sets the value of the usrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRID(String value) {
        this.usrid = value;
    }

    /**
     * Gets the value of the combiid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCOMBIID() {
        return combiid;
    }

    /**
     * Sets the value of the combiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCOMBIID(JAXBElement<BigDecimal> value) {
        this.combiid = value;
    }

    /**
     * Gets the value of the combitype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMBITYPE() {
        return combitype;
    }

    /**
     * Sets the value of the combitype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMBITYPE(JAXBElement<String> value) {
        this.combitype = value;
    }

}
