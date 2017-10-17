
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_RedeemLoyaltyPoints4Fusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_RedeemLoyaltyPoints4Fusion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LS_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KEY_TYPE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KEY_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="REDEEM_ALGO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FUSION_PARTNER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FUSION_CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_RedeemLoyaltyPoints4Fusion", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "lscode",
    "keytype",
    "keyvalue",
    "amount",
    "redeemalgo",
    "fusionpartnerid",
    "fusioncustomerid"
})
public class RowTypeRedeemLoyaltyPoints4Fusion {

    @XmlElement(name = "LS_CODE", required = true, nillable = true)
    protected String lscode;
    @XmlElement(name = "KEY_TYPE", required = true, nillable = true)
    protected BigDecimal keytype;
    @XmlElement(name = "KEY_VALUE", required = true, nillable = true)
    protected String keyvalue;
    @XmlElement(name = "AMOUNT", required = true, nillable = true)
    protected BigDecimal amount;
    @XmlElement(name = "REDEEM_ALGO", required = true, nillable = true)
    protected BigDecimal redeemalgo;
    @XmlElement(name = "FUSION_PARTNER_ID", required = true, nillable = true)
    protected String fusionpartnerid;
    @XmlElement(name = "FUSION_CUSTOMER_ID", required = true, nillable = true)
    protected String fusioncustomerid;

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
     * Gets the value of the keytype property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKEYTYPE() {
        return keytype;
    }

    /**
     * Sets the value of the keytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKEYTYPE(BigDecimal value) {
        this.keytype = value;
    }

    /**
     * Gets the value of the keyvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYVALUE() {
        return keyvalue;
    }

    /**
     * Sets the value of the keyvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYVALUE(String value) {
        this.keyvalue = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAMOUNT(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the redeemalgo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREDEEMALGO() {
        return redeemalgo;
    }

    /**
     * Sets the value of the redeemalgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREDEEMALGO(BigDecimal value) {
        this.redeemalgo = value;
    }

    /**
     * Gets the value of the fusionpartnerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUSIONPARTNERID() {
        return fusionpartnerid;
    }

    /**
     * Sets the value of the fusionpartnerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUSIONPARTNERID(String value) {
        this.fusionpartnerid = value;
    }

    /**
     * Gets the value of the fusioncustomerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUSIONCUSTOMERID() {
        return fusioncustomerid;
    }

    /**
     * Sets the value of the fusioncustomerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUSIONCUSTOMERID(String value) {
        this.fusioncustomerid = value;
    }

}
