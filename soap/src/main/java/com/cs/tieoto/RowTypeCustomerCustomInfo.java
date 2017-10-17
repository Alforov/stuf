
package com.cs.tieoto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_CustomerCustomInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_CustomerCustomInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="F_KEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="F_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_CustomerCustomInfo", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "fkey",
    "fvalue"
})
public class RowTypeCustomerCustomInfo {

    @XmlElement(name = "F_KEY", required = true, nillable = true)
    protected String fkey;
    @XmlElement(name = "F_VALUE", required = true, nillable = true)
    protected String fvalue;

    /**
     * Gets the value of the fkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKEY() {
        return fkey;
    }

    /**
     * Sets the value of the fkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKEY(String value) {
        this.fkey = value;
    }

    /**
     * Gets the value of the fvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVALUE() {
        return fvalue;
    }

    /**
     * Sets the value of the fvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVALUE(String value) {
        this.fvalue = value;
    }

}
