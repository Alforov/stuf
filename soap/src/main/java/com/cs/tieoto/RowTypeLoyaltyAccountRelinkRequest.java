
package com.cs.tieoto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_LoyaltyAccountRelinkRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_LoyaltyAccountRelinkRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOURCE_CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LS_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESTINATION_CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_LoyaltyAccountRelinkRequest", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "sourcecard",
    "lscode",
    "destinationcard"
})
public class RowTypeLoyaltyAccountRelinkRequest {

    @XmlElement(name = "SOURCE_CARD", required = true, nillable = true)
    protected String sourcecard;
    @XmlElement(name = "LS_CODE", required = true, nillable = true)
    protected String lscode;
    @XmlElement(name = "DESTINATION_CARD", required = true, nillable = true)
    protected String destinationcard;

    /**
     * Gets the value of the sourcecard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCECARD() {
        return sourcecard;
    }

    /**
     * Sets the value of the sourcecard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCECARD(String value) {
        this.sourcecard = value;
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
     * Gets the value of the destinationcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATIONCARD() {
        return destinationcard;
    }

    /**
     * Sets the value of the destinationcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATIONCARD(String value) {
        this.destinationcard = value;
    }

}
