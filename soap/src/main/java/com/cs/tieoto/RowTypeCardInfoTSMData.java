
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_CardInfo_TSM_Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_CardInfo_TSM_Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TSM_CLIENT_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSM_AUTH_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSM_AUTH_EXPIRY" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_CardInfo_TSM_Data", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "tsmclientid",
    "tsmauthcode",
    "tsmauthexpiry"
})
public class RowTypeCardInfoTSMData {

    @XmlElementRef(name = "TSM_CLIENT_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tsmclientid;
    @XmlElementRef(name = "TSM_AUTH_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tsmauthcode;
    @XmlElementRef(name = "TSM_AUTH_EXPIRY", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> tsmauthexpiry;

    /**
     * Gets the value of the tsmclientid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTSMCLIENTID() {
        return tsmclientid;
    }

    /**
     * Sets the value of the tsmclientid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTSMCLIENTID(JAXBElement<String> value) {
        this.tsmclientid = value;
    }

    /**
     * Gets the value of the tsmauthcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTSMAUTHCODE() {
        return tsmauthcode;
    }

    /**
     * Sets the value of the tsmauthcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTSMAUTHCODE(JAXBElement<String> value) {
        this.tsmauthcode = value;
    }

    /**
     * Gets the value of the tsmauthexpiry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTSMAUTHEXPIRY() {
        return tsmauthexpiry;
    }

    /**
     * Sets the value of the tsmauthexpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTSMAUTHEXPIRY(JAXBElement<XMLGregorianCalendar> value) {
        this.tsmauthexpiry = value;
    }

}
