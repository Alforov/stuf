
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_NewInstantCards_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_NewInstantCards_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BANK_C" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GROUPC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="G_PROFILE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="P_PROFILE_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AGR_COUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PRODUCT_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BRANCH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OFFICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="A_COND_SET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="C_COND_SET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CL_CATEGORY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_FNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OBJ_TREE_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT_NUM_ALGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACCOUNT_NUM_ALGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CARD_NUM_ALGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BIN_RANGE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WITH_MONEY_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXECUTION_TYPE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LOCKED_FLAG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_NewInstantCards_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "bankc",
    "groupc",
    "gprofilecode",
    "pprofilecode",
    "count",
    "agrcount",
    "productcode",
    "branch",
    "office",
    "bin",
    "ccy",
    "acondset",
    "ccondset",
    "clcategory",
    "cardfname",
    "street",
    "city",
    "objtreetype",
    "clientnumalgo",
    "accountnumalgo",
    "cardnumalgo",
    "binrange",
    "withmoneyflag",
    "amount",
    "trtype",
    "executiontype",
    "lockedflag"
})
public class RowTypeNewInstantCardsRequest {

    @XmlElement(name = "BANK_C", required = true, nillable = true)
    protected String bankc;
    @XmlElement(name = "GROUPC", required = true, nillable = true)
    protected String groupc;
    @XmlElementRef(name = "G_PROFILE_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gprofilecode;
    @XmlElementRef(name = "P_PROFILE_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pprofilecode;
    @XmlElementRef(name = "COUNT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> count;
    @XmlElementRef(name = "AGR_COUNT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> agrcount;
    @XmlElementRef(name = "PRODUCT_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productcode;
    @XmlElementRef(name = "BRANCH", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branch;
    @XmlElementRef(name = "OFFICE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> office;
    @XmlElementRef(name = "BIN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bin;
    @XmlElementRef(name = "CCY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccy;
    @XmlElementRef(name = "A_COND_SET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acondset;
    @XmlElementRef(name = "C_COND_SET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccondset;
    @XmlElementRef(name = "CL_CATEGORY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clcategory;
    @XmlElementRef(name = "CARD_FNAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardfname;
    @XmlElementRef(name = "STREET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "CITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "OBJ_TREE_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objtreetype;
    @XmlElementRef(name = "CLIENT_NUM_ALGO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientnumalgo;
    @XmlElementRef(name = "ACCOUNT_NUM_ALGO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountnumalgo;
    @XmlElementRef(name = "CARD_NUM_ALGO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardnumalgo;
    @XmlElementRef(name = "BIN_RANGE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> binrange;
    @XmlElementRef(name = "WITH_MONEY_FLAG", type = JAXBElement.class, required = false)
    protected JAXBElement<String> withmoneyflag;
    @XmlElementRef(name = "AMOUNT", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amount;
    @XmlElementRef(name = "TR_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trtype;
    @XmlElementRef(name = "EXECUTION_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> executiontype;
    @XmlElementRef(name = "LOCKED_FLAG", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lockedflag;

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
     *     {@link String }
     *     
     */
    public String getGROUPC() {
        return groupc;
    }

    /**
     * Sets the value of the groupc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPC(String value) {
        this.groupc = value;
    }

    /**
     * Gets the value of the gprofilecode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGPROFILECODE() {
        return gprofilecode;
    }

    /**
     * Sets the value of the gprofilecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGPROFILECODE(JAXBElement<String> value) {
        this.gprofilecode = value;
    }

    /**
     * Gets the value of the pprofilecode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPPROFILECODE() {
        return pprofilecode;
    }

    /**
     * Sets the value of the pprofilecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPPROFILECODE(JAXBElement<String> value) {
        this.pprofilecode = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCOUNT() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCOUNT(JAXBElement<BigDecimal> value) {
        this.count = value;
    }

    /**
     * Gets the value of the agrcount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAGRCOUNT() {
        return agrcount;
    }

    /**
     * Sets the value of the agrcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAGRCOUNT(JAXBElement<BigDecimal> value) {
        this.agrcount = value;
    }

    /**
     * Gets the value of the productcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRODUCTCODE() {
        return productcode;
    }

    /**
     * Sets the value of the productcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRODUCTCODE(JAXBElement<String> value) {
        this.productcode = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBRANCH() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBRANCH(JAXBElement<String> value) {
        this.branch = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFFICE() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFFICE(JAXBElement<String> value) {
        this.office = value;
    }

    /**
     * Gets the value of the bin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBIN() {
        return bin;
    }

    /**
     * Sets the value of the bin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBIN(JAXBElement<String> value) {
        this.bin = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCCY() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCCY(JAXBElement<String> value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the acondset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACONDSET() {
        return acondset;
    }

    /**
     * Sets the value of the acondset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACONDSET(JAXBElement<String> value) {
        this.acondset = value;
    }

    /**
     * Gets the value of the ccondset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCCONDSET() {
        return ccondset;
    }

    /**
     * Sets the value of the ccondset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCCONDSET(JAXBElement<String> value) {
        this.ccondset = value;
    }

    /**
     * Gets the value of the clcategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLCATEGORY() {
        return clcategory;
    }

    /**
     * Sets the value of the clcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLCATEGORY(JAXBElement<String> value) {
        this.clcategory = value;
    }

    /**
     * Gets the value of the cardfname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDFNAME() {
        return cardfname;
    }

    /**
     * Sets the value of the cardfname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDFNAME(JAXBElement<String> value) {
        this.cardfname = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTREET() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTREET(JAXBElement<String> value) {
        this.street = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCITY(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the objtreetype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOBJTREETYPE() {
        return objtreetype;
    }

    /**
     * Sets the value of the objtreetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOBJTREETYPE(JAXBElement<String> value) {
        this.objtreetype = value;
    }

    /**
     * Gets the value of the clientnumalgo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENTNUMALGO() {
        return clientnumalgo;
    }

    /**
     * Sets the value of the clientnumalgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENTNUMALGO(JAXBElement<String> value) {
        this.clientnumalgo = value;
    }

    /**
     * Gets the value of the accountnumalgo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACCOUNTNUMALGO() {
        return accountnumalgo;
    }

    /**
     * Sets the value of the accountnumalgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACCOUNTNUMALGO(JAXBElement<String> value) {
        this.accountnumalgo = value;
    }

    /**
     * Gets the value of the cardnumalgo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCARDNUMALGO() {
        return cardnumalgo;
    }

    /**
     * Sets the value of the cardnumalgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCARDNUMALGO(JAXBElement<String> value) {
        this.cardnumalgo = value;
    }

    /**
     * Gets the value of the binrange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBINRANGE() {
        return binrange;
    }

    /**
     * Sets the value of the binrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBINRANGE(JAXBElement<BigDecimal> value) {
        this.binrange = value;
    }

    /**
     * Gets the value of the withmoneyflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWITHMONEYFLAG() {
        return withmoneyflag;
    }

    /**
     * Sets the value of the withmoneyflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWITHMONEYFLAG(JAXBElement<String> value) {
        this.withmoneyflag = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAMOUNT() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAMOUNT(JAXBElement<BigDecimal> value) {
        this.amount = value;
    }

    /**
     * Gets the value of the trtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRTYPE() {
        return trtype;
    }

    /**
     * Sets the value of the trtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRTYPE(JAXBElement<String> value) {
        this.trtype = value;
    }

    /**
     * Gets the value of the executiontype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEXECUTIONTYPE() {
        return executiontype;
    }

    /**
     * Sets the value of the executiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEXECUTIONTYPE(JAXBElement<BigDecimal> value) {
        this.executiontype = value;
    }

    /**
     * Gets the value of the lockedflag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLOCKEDFLAG() {
        return lockedflag;
    }

    /**
     * Sets the value of the lockedflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLOCKEDFLAG(JAXBElement<String> value) {
        this.lockedflag = value;
    }

}
