
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_manageTSMWallet_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_manageTSMWallet_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPERATION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WALLET_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TSM_SERVICE_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_manageTSMWallet_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "operation",
    "walletid",
    "card",
    "tsmserviceid"
})
public class RowTypeManageTSMWalletRequest {

    @XmlElement(name = "OPERATION", required = true, nillable = true)
    protected String operation;
    @XmlElement(name = "WALLET_ID", required = true, nillable = true)
    protected String walletid;
    @XmlElementRef(name = "CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> card;
    @XmlElementRef(name = "TSM_SERVICE_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tsmserviceid;

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
     * Gets the value of the walletid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWALLETID() {
        return walletid;
    }

    /**
     * Sets the value of the walletid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWALLETID(String value) {
        this.walletid = value;
    }

    /**
     * Gets the value of the card property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARD() {
        return card;
    }

    /**
     * Sets the value of the card property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARD(JAXBElement<String> value) {
        this.card = value;
    }

    /**
     * Gets the value of the tsmserviceid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTSMSERVICEID() {
        return tsmserviceid;
    }

    /**
     * Sets the value of the tsmserviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTSMSERVICEID(JAXBElement<String> value) {
        this.tsmserviceid = value;
    }

}
