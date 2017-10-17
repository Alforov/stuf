
package com.cs.tieoto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_GetCardPinTryCounter_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_GetCardPinTryCounter_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PIN_TRY_COUNT" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="UPDATE_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_GetCardPinTryCounter_Response", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "card",
    "pintrycount",
    "updatedate"
})
public class RowTypeGetCardPinTryCounterResponse {

    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElement(name = "PIN_TRY_COUNT", required = true, nillable = true)
    protected BigInteger pintrycount;
    @XmlElement(name = "UPDATE_DATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedate;

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
     * Gets the value of the pintrycount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPINTRYCOUNT() {
        return pintrycount;
    }

    /**
     * Sets the value of the pintrycount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPINTRYCOUNT(BigInteger value) {
        this.pintrycount = value;
    }

    /**
     * Gets the value of the updatedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUPDATEDATE() {
        return updatedate;
    }

    /**
     * Sets the value of the updatedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUPDATEDATE(XMLGregorianCalendar value) {
        this.updatedate = value;
    }

}
