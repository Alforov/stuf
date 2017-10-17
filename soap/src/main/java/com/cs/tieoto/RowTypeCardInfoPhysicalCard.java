
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_CardInfo_PhysicalCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_CardInfo_PhysicalCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STATUS1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STOP_CAUSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPIRY1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EXPIRITY2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RENEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RENEWED_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESIGN_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INSTANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_CardInfo_PhysicalCard", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "status1",
    "status2",
    "stopcause",
    "expiry1",
    "expirity2",
    "renew",
    "cardname",
    "mcname",
    "renewedcard",
    "designid",
    "instant"
})
public class RowTypeCardInfoPhysicalCard {

    @XmlElementRef(name = "STATUS1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status1;
    @XmlElementRef(name = "STATUS2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status2;
    @XmlElementRef(name = "STOP_CAUSE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopcause;
    @XmlElementRef(name = "EXPIRY1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiry1;
    @XmlElementRef(name = "EXPIRITY2", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expirity2;
    @XmlElementRef(name = "RENEW", type = JAXBElement.class, required = false)
    protected JAXBElement<String> renew;
    @XmlElementRef(name = "CARD_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardname;
    @XmlElementRef(name = "MC_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mcname;
    @XmlElementRef(name = "RENEWED_CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> renewedcard;
    @XmlElementRef(name = "DESIGN_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> designid;
    @XmlElementRef(name = "INSTANT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instant;

    /**
     * Gets the value of the status1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUS1() {
        return status1;
    }

    /**
     * Sets the value of the status1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUS1(JAXBElement<String> value) {
        this.status1 = value;
    }

    /**
     * Gets the value of the status2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTATUS2() {
        return status2;
    }

    /**
     * Sets the value of the status2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTATUS2(JAXBElement<String> value) {
        this.status2 = value;
    }

    /**
     * Gets the value of the stopcause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTOPCAUSE() {
        return stopcause;
    }

    /**
     * Sets the value of the stopcause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTOPCAUSE(JAXBElement<String> value) {
        this.stopcause = value;
    }

    /**
     * Gets the value of the expiry1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXPIRY1() {
        return expiry1;
    }

    /**
     * Sets the value of the expiry1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXPIRY1(JAXBElement<XMLGregorianCalendar> value) {
        this.expiry1 = value;
    }

    /**
     * Gets the value of the expirity2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXPIRITY2() {
        return expirity2;
    }

    /**
     * Sets the value of the expirity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXPIRITY2(JAXBElement<XMLGregorianCalendar> value) {
        this.expirity2 = value;
    }

    /**
     * Gets the value of the renew property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRENEW() {
        return renew;
    }

    /**
     * Sets the value of the renew property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRENEW(JAXBElement<String> value) {
        this.renew = value;
    }

    /**
     * Gets the value of the cardname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDNAME() {
        return cardname;
    }

    /**
     * Sets the value of the cardname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDNAME(JAXBElement<String> value) {
        this.cardname = value;
    }

    /**
     * Gets the value of the mcname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMCNAME() {
        return mcname;
    }

    /**
     * Sets the value of the mcname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMCNAME(JAXBElement<String> value) {
        this.mcname = value;
    }

    /**
     * Gets the value of the renewedcard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRENEWEDCARD() {
        return renewedcard;
    }

    /**
     * Sets the value of the renewedcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRENEWEDCARD(JAXBElement<String> value) {
        this.renewedcard = value;
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
     * Gets the value of the instant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINSTANT() {
        return instant;
    }

    /**
     * Sets the value of the instant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINSTANT(JAXBElement<String> value) {
        this.instant = value;
    }

}
