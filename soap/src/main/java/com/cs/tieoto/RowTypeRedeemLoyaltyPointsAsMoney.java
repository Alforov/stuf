
package com.cs.tieoto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_RedeemLoyaltyPointsAsMoney complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_RedeemLoyaltyPointsAsMoney">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LS_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KEY_TYPE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KEY_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="DEST_TYPE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_RedeemLoyaltyPointsAsMoney", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "lscode",
    "keytype",
    "keyvalue",
    "amount",
    "desttype"
})
public class RowTypeRedeemLoyaltyPointsAsMoney {

    @XmlElement(name = "LS_CODE", required = true, nillable = true)
    protected String lscode;
    @XmlElement(name = "KEY_TYPE", required = true, nillable = true)
    protected BigDecimal keytype;
    @XmlElement(name = "KEY_VALUE", required = true, nillable = true)
    protected String keyvalue;
    @XmlElement(name = "AMOUNT", required = true, nillable = true)
    protected BigInteger amount;
    @XmlElement(name = "DEST_TYPE", required = true, nillable = true)
    protected BigDecimal desttype;

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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAMOUNT(BigInteger value) {
        this.amount = value;
    }

    /**
     * Gets the value of the desttype property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDESTTYPE() {
        return desttype;
    }

    /**
     * Sets the value of the desttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDESTTYPE(BigDecimal value) {
        this.desttype = value;
    }

}
