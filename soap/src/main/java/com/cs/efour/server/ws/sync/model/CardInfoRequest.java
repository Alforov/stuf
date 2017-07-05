
package com.cs.efour.server.ws.sync.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siteid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "login",
    "siteid",
    "cardno"
})
@XmlRootElement(name = "CardInfoRequest")
public class CardInfoRequest {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String siteid;
    @XmlElement(required = true)
    protected String cardno;

    /**
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the siteid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * Sets the value of the siteid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteid(String value) {
        this.siteid = value;
    }

    /**
     * Gets the value of the cardno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * Sets the value of the cardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardno(String value) {
        this.cardno = value;
    }

}
