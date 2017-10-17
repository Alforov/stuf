
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_LimitEvent_Limit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_LimitEvent_Limit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIMIT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LIMIT_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LIMIT_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUBJECT_VALUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIMIT_DATE_FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIMIT_DATE_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_LimitEvent_Limit", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "limittype",
    "limitvalue",
    "limitname",
    "subjectvalue",
    "limitdatefrom",
    "limitdateto"
})
public class RowTypeLimitEventLimit {

    @XmlElement(name = "LIMIT_TYPE", required = true, nillable = true)
    protected String limittype;
    @XmlElementRef(name = "LIMIT_VALUE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> limitvalue;
    @XmlElementRef(name = "LIMIT_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitname;
    @XmlElementRef(name = "SUBJECT_VALUE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subjectvalue;
    @XmlElementRef(name = "LIMIT_DATE_FROM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitdatefrom;
    @XmlElementRef(name = "LIMIT_DATE_TO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitdateto;

    /**
     * Gets the value of the limittype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIMITTYPE() {
        return limittype;
    }

    /**
     * Sets the value of the limittype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIMITTYPE(String value) {
        this.limittype = value;
    }

    /**
     * Gets the value of the limitvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLIMITVALUE() {
        return limitvalue;
    }

    /**
     * Sets the value of the limitvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLIMITVALUE(JAXBElement<BigDecimal> value) {
        this.limitvalue = value;
    }

    /**
     * Gets the value of the limitname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLIMITNAME() {
        return limitname;
    }

    /**
     * Sets the value of the limitname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLIMITNAME(JAXBElement<String> value) {
        this.limitname = value;
    }

    /**
     * Gets the value of the subjectvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUBJECTVALUE() {
        return subjectvalue;
    }

    /**
     * Sets the value of the subjectvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUBJECTVALUE(JAXBElement<String> value) {
        this.subjectvalue = value;
    }

    /**
     * Gets the value of the limitdatefrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLIMITDATEFROM() {
        return limitdatefrom;
    }

    /**
     * Sets the value of the limitdatefrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLIMITDATEFROM(JAXBElement<String> value) {
        this.limitdatefrom = value;
    }

    /**
     * Gets the value of the limitdateto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLIMITDATETO() {
        return limitdateto;
    }

    /**
     * Sets the value of the limitdateto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLIMITDATETO(JAXBElement<String> value) {
        this.limitdateto = value;
    }

}
