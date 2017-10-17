
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_AddServData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_AddServData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SERV_TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERV_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPIRY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RENEW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_AddServData", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "servtypeid",
    "servnumber",
    "expiry",
    "renew"
})
public class RowTypeAddServData {

    @XmlElementRef(name = "SERV_TYPE_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servtypeid;
    @XmlElementRef(name = "SERV_NUMBER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servnumber;
    @XmlElementRef(name = "EXPIRY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiry;
    @XmlElementRef(name = "RENEW", type = JAXBElement.class, required = false)
    protected JAXBElement<String> renew;

    /**
     * Gets the value of the servtypeid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSERVTYPEID() {
        return servtypeid;
    }

    /**
     * Sets the value of the servtypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSERVTYPEID(JAXBElement<String> value) {
        this.servtypeid = value;
    }

    /**
     * Gets the value of the servnumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSERVNUMBER() {
        return servnumber;
    }

    /**
     * Sets the value of the servnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSERVNUMBER(JAXBElement<String> value) {
        this.servnumber = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEXPIRY() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEXPIRY(JAXBElement<XMLGregorianCalendar> value) {
        this.expiry = value;
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

}
