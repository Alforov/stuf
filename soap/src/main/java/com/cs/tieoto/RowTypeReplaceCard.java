
package com.cs.tieoto;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_ReplaceCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_ReplaceCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NEW_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NO_CHARGE" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NO_EMB_SESSION" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NEW_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NEW_RISK_LEVEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHIP_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DESIGN_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OFF_COND_SET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NEW_BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_ReplaceCard", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "card",
    "newcard",
    "nocharge",
    "noembsession",
    "newexpiry",
    "newrisklevel",
    "chipid",
    "designid",
    "offcondset",
    "newbin"
})
public class RowTypeReplaceCard {

    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElementRef(name = "NEW_CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newcard;
    @XmlElementRef(name = "NO_CHARGE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> nocharge;
    @XmlElementRef(name = "NO_EMB_SESSION", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> noembsession;
    @XmlElementRef(name = "NEW_EXPIRY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> newexpiry;
    @XmlElementRef(name = "NEW_RISK_LEVEL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newrisklevel;
    @XmlElementRef(name = "CHIP_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> chipid;
    @XmlElementRef(name = "DESIGN_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> designid;
    @XmlElementRef(name = "OFF_COND_SET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> offcondset;
    @XmlElementRef(name = "NEW_BIN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newbin;

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
     * Gets the value of the newcard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNEWCARD() {
        return newcard;
    }

    /**
     * Sets the value of the newcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNEWCARD(JAXBElement<String> value) {
        this.newcard = value;
    }

    /**
     * Gets the value of the nocharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNOCHARGE() {
        return nocharge;
    }

    /**
     * Sets the value of the nocharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNOCHARGE(JAXBElement<BigInteger> value) {
        this.nocharge = value;
    }

    /**
     * Gets the value of the noembsession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNOEMBSESSION() {
        return noembsession;
    }

    /**
     * Sets the value of the noembsession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNOEMBSESSION(JAXBElement<BigInteger> value) {
        this.noembsession = value;
    }

    /**
     * Gets the value of the newexpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNEWEXPIRY() {
        return newexpiry;
    }

    /**
     * Sets the value of the newexpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNEWEXPIRY(JAXBElement<XMLGregorianCalendar> value) {
        this.newexpiry = value;
    }

    /**
     * Gets the value of the newrisklevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNEWRISKLEVEL() {
        return newrisklevel;
    }

    /**
     * Sets the value of the newrisklevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNEWRISKLEVEL(JAXBElement<String> value) {
        this.newrisklevel = value;
    }

    /**
     * Gets the value of the chipid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCHIPID() {
        return chipid;
    }

    /**
     * Sets the value of the chipid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCHIPID(JAXBElement<BigDecimal> value) {
        this.chipid = value;
    }

    /**
     * Gets the value of the designid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDESIGNID() {
        return designid;
    }

    /**
     * Sets the value of the designid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDESIGNID(JAXBElement<BigDecimal> value) {
        this.designid = value;
    }

    /**
     * Gets the value of the offcondset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFFCONDSET() {
        return offcondset;
    }

    /**
     * Sets the value of the offcondset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFFCONDSET(JAXBElement<String> value) {
        this.offcondset = value;
    }

    /**
     * Gets the value of the newbin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNEWBIN() {
        return newbin;
    }

    /**
     * Sets the value of the newbin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNEWBIN(JAXBElement<String> value) {
        this.newbin = value;
    }

}
