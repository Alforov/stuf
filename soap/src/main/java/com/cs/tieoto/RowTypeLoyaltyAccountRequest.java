
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_LoyaltyAccountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_LoyaltyAccountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LS_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LY_INVITED_BY_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_LoyaltyAccountRequest", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "card",
    "lscode",
    "clientid",
    "lyinvitedbyid"
})
public class RowTypeLoyaltyAccountRequest {

    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElement(name = "LS_CODE", required = true, nillable = true)
    protected String lscode;
    @XmlElementRef(name = "CLIENT_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientid;
    @XmlElementRef(name = "LY_INVITED_BY_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lyinvitedbyid;

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
     * Gets the value of the lscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSCODE() {
        return lscode;
    }

    /**
     * Sets the value of the lscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSCODE(String value) {
        this.lscode = value;
    }

    /**
     * Gets the value of the clientid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENTID() {
        return clientid;
    }

    /**
     * Sets the value of the clientid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENTID(JAXBElement<String> value) {
        this.clientid = value;
    }

    /**
     * Gets the value of the lyinvitedbyid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLYINVITEDBYID() {
        return lyinvitedbyid;
    }

    /**
     * Sets the value of the lyinvitedbyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLYINVITEDBYID(JAXBElement<String> value) {
        this.lyinvitedbyid = value;
    }

}
