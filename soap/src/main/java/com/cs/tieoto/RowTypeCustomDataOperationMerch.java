
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_CustomDataOperationMerch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_CustomDataOperationMerch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MERCHANT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MCC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROC_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_CustomDataOperationMerch", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "operation",
    "merchant",
    "mcc",
    "proccode"
})
public class RowTypeCustomDataOperationMerch {

    @XmlElement(name = "OPERATION", required = true, nillable = true)
    protected String operation;
    @XmlElement(name = "MERCHANT", required = true, nillable = true)
    protected String merchant;
    @XmlElement(name = "MCC", required = true, nillable = true)
    protected String mcc;
    @XmlElementRef(name = "PROC_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proccode;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERATION() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERATION(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMERCHANT() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMERCHANT(String value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCC(String value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the proccode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROCCODE() {
        return proccode;
    }

    /**
     * Sets the value of the proccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROCCODE(JAXBElement<String> value) {
        this.proccode = value;
    }

}
