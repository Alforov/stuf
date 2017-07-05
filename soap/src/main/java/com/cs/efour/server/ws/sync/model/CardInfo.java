
package com.cs.efour.server.ws.sync.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="svaccountno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountstate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cardstate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secondname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardInfo", propOrder = {
    "cardno",
    "svaccountno",
    "accountstate",
    "currencyid",
    "cardstate",
    "expirationdate",
    "accountno",
    "firstname",
    "secondname",
    "surname",
    "birthdate",
    "identifycode",
    "documentno"
})
public class CardInfo {

    @XmlElement(required = true)
    protected String cardno;
    @XmlElement(required = true)
    protected String svaccountno;
    @XmlElement(required = true)
    protected String accountstate;
    @XmlElement(required = true)
    protected String currencyid;
    @XmlElement(required = true)
    protected String cardstate;
    @XmlElement(required = true)
    protected String expirationdate;
    @XmlElement(required = true)
    protected String accountno;
    @XmlElement(required = true)
    protected String firstname;
    protected String secondname;
    @XmlElement(required = true)
    protected String surname;
    protected String birthdate;
    protected String identifycode;
    protected String documentno;

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

    /**
     * Gets the value of the svaccountno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvaccountno() {
        return svaccountno;
    }

    /**
     * Sets the value of the svaccountno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvaccountno(String value) {
        this.svaccountno = value;
    }

    /**
     * Gets the value of the accountstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountstate() {
        return accountstate;
    }

    /**
     * Sets the value of the accountstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountstate(String value) {
        this.accountstate = value;
    }

    /**
     * Gets the value of the currencyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyid() {
        return currencyid;
    }

    /**
     * Sets the value of the currencyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyid(String value) {
        this.currencyid = value;
    }

    /**
     * Gets the value of the cardstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardstate() {
        return cardstate;
    }

    /**
     * Sets the value of the cardstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardstate(String value) {
        this.cardstate = value;
    }

    /**
     * Gets the value of the expirationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationdate() {
        return expirationdate;
    }

    /**
     * Sets the value of the expirationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationdate(String value) {
        this.expirationdate = value;
    }

    /**
     * Gets the value of the accountno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountno() {
        return accountno;
    }

    /**
     * Sets the value of the accountno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountno(String value) {
        this.accountno = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the secondname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondname() {
        return secondname;
    }

    /**
     * Sets the value of the secondname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondname(String value) {
        this.secondname = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the identifycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifycode() {
        return identifycode;
    }

    /**
     * Sets the value of the identifycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifycode(String value) {
        this.identifycode = value;
    }

    /**
     * Gets the value of the documentno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentno() {
        return documentno;
    }

    /**
     * Sets the value of the documentno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentno(String value) {
        this.documentno = value;
    }

}
