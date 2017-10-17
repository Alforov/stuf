
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_RestoreFromArchive_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_RestoreFromArchive_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANK_C" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GROUPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGRENOM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CONTRACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CARD_ACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRANZ_ACCT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLAG_RESTORE_ALL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FLAG_ACTIVATE_ALL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_RestoreFromArchive_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "bankc",
    "groupc",
    "client",
    "clientb",
    "agrenom",
    "contract",
    "accountno",
    "cardacct",
    "tranzacct",
    "flagrestoreall",
    "flagactivateall"
})
public class RowTypeRestoreFromArchiveRequest {

    @XmlElement(name = "BANK_C", required = true, nillable = true)
    protected String bankc;
    @XmlElementRef(name = "GROUPC", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupc;
    @XmlElementRef(name = "CLIENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> client;
    @XmlElementRef(name = "CLIENT_B", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientb;
    @XmlElementRef(name = "AGRENOM", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> agrenom;
    @XmlElementRef(name = "CONTRACT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contract;
    @XmlElementRef(name = "ACCOUNT_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> accountno;
    @XmlElementRef(name = "CARD_ACCT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardacct;
    @XmlElementRef(name = "TRANZ_ACCT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tranzacct;
    @XmlElementRef(name = "FLAG_RESTORE_ALL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagrestoreall;
    @XmlElementRef(name = "FLAG_ACTIVATE_ALL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flagactivateall;

    /**
     * Gets the value of the bankc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANKC() {
        return bankc;
    }

    /**
     * Sets the value of the bankc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANKC(String value) {
        this.bankc = value;
    }

    /**
     * Gets the value of the groupc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGROUPC() {
        return groupc;
    }

    /**
     * Sets the value of the groupc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGROUPC(JAXBElement<String> value) {
        this.groupc = value;
    }

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENT() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENT(JAXBElement<String> value) {
        this.client = value;
    }

    /**
     * Gets the value of the clientb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENTB() {
        return clientb;
    }

    /**
     * Sets the value of the clientb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENTB(JAXBElement<String> value) {
        this.clientb = value;
    }

    /**
     * Gets the value of the agrenom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAGRENOM() {
        return agrenom;
    }

    /**
     * Sets the value of the agrenom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAGRENOM(JAXBElement<BigDecimal> value) {
        this.agrenom = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONTRACT() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONTRACT(JAXBElement<String> value) {
        this.contract = value;
    }

    /**
     * Gets the value of the accountno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getACCOUNTNO() {
        return accountno;
    }

    /**
     * Sets the value of the accountno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setACCOUNTNO(JAXBElement<BigDecimal> value) {
        this.accountno = value;
    }

    /**
     * Gets the value of the cardacct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDACCT() {
        return cardacct;
    }

    /**
     * Sets the value of the cardacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDACCT(JAXBElement<String> value) {
        this.cardacct = value;
    }

    /**
     * Gets the value of the tranzacct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRANZACCT() {
        return tranzacct;
    }

    /**
     * Sets the value of the tranzacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRANZACCT(JAXBElement<String> value) {
        this.tranzacct = value;
    }

    /**
     * Gets the value of the flagrestoreall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLAGRESTOREALL() {
        return flagrestoreall;
    }

    /**
     * Sets the value of the flagrestoreall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLAGRESTOREALL(JAXBElement<String> value) {
        this.flagrestoreall = value;
    }

    /**
     * Gets the value of the flagactivateall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLAGACTIVATEALL() {
        return flagactivateall;
    }

    /**
     * Sets the value of the flagactivateall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLAGACTIVATEALL(JAXBElement<String> value) {
        this.flagactivateall = value;
    }

}
