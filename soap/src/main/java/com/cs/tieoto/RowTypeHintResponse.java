
package com.cs.tieoto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_Hint_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_Hint_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HINT_QUESTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EXPIRY1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_Hint_Response", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "card",
    "hintquestion",
    "expiry1",
    "status"
})
public class RowTypeHintResponse {

    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElement(name = "HINT_QUESTION", required = true, nillable = true)
    protected String hintquestion;
    @XmlElement(name = "EXPIRY1", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiry1;
    @XmlElement(name = "STATUS", required = true, nillable = true)
    protected String status;

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
     * Gets the value of the hintquestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHINTQUESTION() {
        return hintquestion;
    }

    /**
     * Sets the value of the hintquestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHINTQUESTION(String value) {
        this.hintquestion = value;
    }

    /**
     * Gets the value of the expiry1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPIRY1() {
        return expiry1;
    }

    /**
     * Sets the value of the expiry1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPIRY1(XMLGregorianCalendar value) {
        this.expiry1 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

}
