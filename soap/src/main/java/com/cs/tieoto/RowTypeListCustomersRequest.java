
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_ListCustomers_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_ListCustomers_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLIENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="F_NAMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERSON_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="R_STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_PCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_MOB_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A3VTS_COUNTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A3VTS_FLAG1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A3VTS_FLAG2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUPPLEMENTARY_PAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUPPLEMENTARY_CVV2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUPPLEMENTARY_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMP_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BANK_C" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_ListCustomers_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "client",
    "status",
    "clientb",
    "fnames",
    "surname",
    "personcode",
    "bdate",
    "rstreet",
    "rcity",
    "rcntry",
    "rpcode",
    "remails",
    "rmobphone",
    "card",
    "ucod1",
    "a3VTSCOUNTY",
    "a3VTSFLAG1",
    "a3VTSFLAG2",
    "supplementarypan",
    "supplementarycvv2",
    "supplementaryexpiry",
    "notes",
    "empname",
    "bankc"
})
public class RowTypeListCustomersRequest {

    @XmlElementRef(name = "CLIENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> client;
    @XmlElementRef(name = "STATUS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "CLIENT_B", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientb;
    @XmlElementRef(name = "F_NAMES", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fnames;
    @XmlElementRef(name = "SURNAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "PERSON_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personcode;
    @XmlElementRef(name = "B_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> bdate;
    @XmlElementRef(name = "R_STREET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rstreet;
    @XmlElementRef(name = "R_CITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rcity;
    @XmlElementRef(name = "R_CNTRY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rcntry;
    @XmlElementRef(name = "R_PCODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rpcode;
    @XmlElementRef(name = "R_E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remails;
    @XmlElementRef(name = "R_MOB_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rmobphone;
    @XmlElementRef(name = "CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> card;
    @XmlElementRef(name = "U_COD1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod1;
    @XmlElementRef(name = "A3VTS_COUNTY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> a3VTSCOUNTY;
    @XmlElementRef(name = "A3VTS_FLAG1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> a3VTSFLAG1;
    @XmlElementRef(name = "A3VTS_FLAG2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> a3VTSFLAG2;
    @XmlElementRef(name = "SUPPLEMENTARY_PAN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplementarypan;
    @XmlElementRef(name = "SUPPLEMENTARY_CVV2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplementarycvv2;
    @XmlElementRef(name = "SUPPLEMENTARY_EXPIRY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> supplementaryexpiry;
    @XmlElementRef(name = "NOTES", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "EMP_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empname;
    @XmlElement(name = "BANK_C", required = true, nillable = true)
    protected String bankc;

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
     * Gets the value of the personcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPERSONCODE() {
        return personcode;
    }

    /**
     * Sets the value of the personcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPERSONCODE(JAXBElement<String> value) {
        this.personcode = value;
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
     * Gets the value of the empname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPNAME() {
        return empname;
    }

    /**
     * Sets the value of the empname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPNAME(JAXBElement<String> value) {
        this.empname = value;
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

}
