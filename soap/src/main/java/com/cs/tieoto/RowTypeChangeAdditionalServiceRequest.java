
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_ChangeAdditionalService_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_ChangeAdditionalService_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SERV_TYPE_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SERV_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_ChangeAdditionalService_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "operation",
    "card",
    "servtypeid",
    "servnumber"
})
public class RowTypeChangeAdditionalServiceRequest {

    @XmlElement(name = "OPERATION", required = true, nillable = true)
    protected String operation;
    @XmlElement(name = "CARD", required = true, nillable = true)
    protected String card;
    @XmlElement(name = "SERV_TYPE_ID", required = true, nillable = true)
    protected String servtypeid;
    @XmlElementRef(name = "SERV_NUMBER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servnumber;

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
     * Gets the value of the servtypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVTYPEID() {
        return servtypeid;
    }

    /**
     * Sets the value of the servtypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVTYPEID(String value) {
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

}
