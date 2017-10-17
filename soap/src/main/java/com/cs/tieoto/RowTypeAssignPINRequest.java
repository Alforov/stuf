
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_AssignPIN_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_AssignPIN_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXPIRY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PINBLOCK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRANSACTION_DATETIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CARD_SECURE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACQUIRER_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TERMINAL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MERCHANT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TERMINAL_LOCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_AssignPIN_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "card",
    "expiry",
    "pinblock",
    "stan",
    "transactiondatetime",
    "cardsecurecode",
    "acquirerid",
    "terminalid",
    "merchantid",
    "terminallocation"
})
public class RowTypeAssignPINRequest {

    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElement(name = "EXPIRY", required = true, nillable = true)
    protected String expiry;
    @XmlElement(name = "PINBLOCK", required = true, nillable = true)
    protected String pinblock;
    @XmlElement(name = "STAN", required = true, nillable = true)
    protected String stan;
    @XmlElementRef(name = "TRANSACTION_DATETIME", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> transactiondatetime;
    @XmlElementRef(name = "CARD_SECURE_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardsecurecode;
    @XmlElementRef(name = "ACQUIRER_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acquirerid;
    @XmlElementRef(name = "TERMINAL_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> terminalid;
    @XmlElementRef(name = "MERCHANT_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantid;
    @XmlElementRef(name = "TERMINAL_LOCATION", type = JAXBElement.class, required = false)
    protected JAXBElement<String> terminallocation;

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
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPIRY() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPIRY(String value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the pinblock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINBLOCK() {
        return pinblock;
    }

    /**
     * Sets the value of the pinblock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINBLOCK(String value) {
        this.pinblock = value;
    }

    /**
     * Gets the value of the stan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAN() {
        return stan;
    }

    /**
     * Sets the value of the stan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAN(String value) {
        this.stan = value;
    }

    /**
     * Gets the value of the transactiondatetime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTRANSACTIONDATETIME() {
        return transactiondatetime;
    }

    /**
     * Sets the value of the transactiondatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTRANSACTIONDATETIME(JAXBElement<XMLGregorianCalendar> value) {
        this.transactiondatetime = value;
    }

    /**
     * Gets the value of the cardsecurecode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDSECURECODE() {
        return cardsecurecode;
    }

    /**
     * Sets the value of the cardsecurecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDSECURECODE(JAXBElement<String> value) {
        this.cardsecurecode = value;
    }

    /**
     * Gets the value of the acquirerid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACQUIRERID() {
        return acquirerid;
    }

    /**
     * Sets the value of the acquirerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACQUIRERID(JAXBElement<String> value) {
        this.acquirerid = value;
    }

    /**
     * Gets the value of the terminalid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTERMINALID() {
        return terminalid;
    }

    /**
     * Sets the value of the terminalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTERMINALID(JAXBElement<String> value) {
        this.terminalid = value;
    }

    /**
     * Gets the value of the merchantid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMERCHANTID() {
        return merchantid;
    }

    /**
     * Sets the value of the merchantid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMERCHANTID(JAXBElement<String> value) {
        this.merchantid = value;
    }

    /**
     * Gets the value of the terminallocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTERMINALLOCATION() {
        return terminallocation;
    }

    /**
     * Sets the value of the terminallocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTERMINALLOCATION(JAXBElement<String> value) {
        this.terminallocation = value;
    }

}
