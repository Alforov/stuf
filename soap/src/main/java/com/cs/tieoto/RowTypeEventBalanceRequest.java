
package com.cs.tieoto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_EventBalanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_EventBalanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code_owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limit_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limit_key_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="limit_key_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_EventBalanceRequest", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "codeOwner",
    "limitType",
    "limitKeyType",
    "limitKeyValue"
})
public class RowTypeEventBalanceRequest {

    @XmlElement(name = "code_owner", required = true, nillable = true)
    protected String codeOwner;
    @XmlElement(name = "limit_type", required = true, nillable = true)
    protected String limitType;
    @XmlElement(name = "limit_key_type", required = true, nillable = true)
    protected String limitKeyType;
    @XmlElement(name = "limit_key_value", required = true, nillable = true)
    protected String limitKeyValue;

    /**
     * Gets the value of the codeOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOwner() {
        return codeOwner;
    }

    /**
     * Sets the value of the codeOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOwner(String value) {
        this.codeOwner = value;
    }

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitType(String value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the limitKeyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitKeyType() {
        return limitKeyType;
    }

    /**
     * Sets the value of the limitKeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitKeyType(String value) {
        this.limitKeyType = value;
    }

    /**
     * Gets the value of the limitKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitKeyValue() {
        return limitKeyValue;
    }

    /**
     * Sets the value of the limitKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitKeyValue(String value) {
        this.limitKeyValue = value;
    }

}
