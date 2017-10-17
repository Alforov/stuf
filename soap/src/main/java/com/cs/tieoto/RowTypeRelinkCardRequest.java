
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_RelinkCard_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_RelinkCard_Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CARD_FOR_LINK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TARGET_CARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BANK_C" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GROUPC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DEST_ACCNT_TYPE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DEST_ACCNT_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RELINK_MODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COND_SET" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FEE_CALC_MODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRODUCT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LINK_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MOMENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOCKS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONTRACT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KS_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_RelinkCard_Request", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "cardforlink",
    "targetcard",
    "bankc",
    "groupc",
    "destaccnttype",
    "destaccntnumber",
    "relinkmode",
    "condset",
    "feecalcmode",
    "product",
    "linktype",
    "moment",
    "locks",
    "contract",
    "ksdate"
})
public class RowTypeRelinkCardRequest {

    @XmlElement(name = "CARD_FOR_LINK", required = true, nillable = true)
    protected String cardforlink;
    @XmlElement(name = "TARGET_CARD", required = true, nillable = true)
    protected String targetcard;
    @XmlElement(name = "BANK_C", required = true, nillable = true)
    protected String bankc;
    @XmlElement(name = "GROUPC", required = true, nillable = true)
    protected String groupc;
    @XmlElement(name = "DEST_ACCNT_TYPE", required = true, nillable = true)
    protected BigDecimal destaccnttype;
    @XmlElement(name = "DEST_ACCNT_NUMBER", required = true, nillable = true)
    protected String destaccntnumber;
    @XmlElement(name = "RELINK_MODE", required = true, nillable = true)
    protected String relinkmode;
    @XmlElement(name = "COND_SET", required = true, nillable = true)
    protected String condset;
    @XmlElement(name = "FEE_CALC_MODE", required = true, nillable = true)
    protected String feecalcmode;
    @XmlElement(name = "PRODUCT", required = true, nillable = true)
    protected String product;
    @XmlElement(name = "LINK_TYPE", required = true, nillable = true)
    protected String linktype;
    @XmlElement(name = "MOMENT", required = true, nillable = true)
    protected String moment;
    @XmlElement(name = "LOCKS", required = true, nillable = true)
    protected String locks;
    @XmlElement(name = "CONTRACT", required = true, nillable = true)
    protected String contract;
    @XmlElement(name = "KS_DATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ksdate;

    /**
     * Gets the value of the cardforlink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARDFORLINK() {
        return cardforlink;
    }

    /**
     * Sets the value of the cardforlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARDFORLINK(String value) {
        this.cardforlink = value;
    }

    /**
     * Gets the value of the targetcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTARGETCARD() {
        return targetcard;
    }

    /**
     * Sets the value of the targetcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTARGETCARD(String value) {
        this.targetcard = value;
    }

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
     * Gets the value of the destaccnttype property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDESTACCNTTYPE() {
        return destaccnttype;
    }

    /**
     * Sets the value of the destaccnttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDESTACCNTTYPE(BigDecimal value) {
        this.destaccnttype = value;
    }

    /**
     * Gets the value of the destaccntnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTACCNTNUMBER() {
        return destaccntnumber;
    }

    /**
     * Sets the value of the destaccntnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTACCNTNUMBER(String value) {
        this.destaccntnumber = value;
    }

    /**
     * Gets the value of the relinkmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELINKMODE() {
        return relinkmode;
    }

    /**
     * Sets the value of the relinkmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELINKMODE(String value) {
        this.relinkmode = value;
    }

    /**
     * Gets the value of the condset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDSET() {
        return condset;
    }

    /**
     * Sets the value of the condset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDSET(String value) {
        this.condset = value;
    }

    /**
     * Gets the value of the feecalcmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEECALCMODE() {
        return feecalcmode;
    }

    /**
     * Sets the value of the feecalcmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEECALCMODE(String value) {
        this.feecalcmode = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRODUCT() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRODUCT(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the linktype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLINKTYPE() {
        return linktype;
    }

    /**
     * Sets the value of the linktype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLINKTYPE(String value) {
        this.linktype = value;
    }

    /**
     * Gets the value of the moment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMOMENT() {
        return moment;
    }

    /**
     * Sets the value of the moment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMOMENT(String value) {
        this.moment = value;
    }

    /**
     * Gets the value of the locks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCKS() {
        return locks;
    }

    /**
     * Sets the value of the locks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCKS(String value) {
        this.locks = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTRACT() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTRACT(String value) {
        this.contract = value;
    }

    /**
     * Gets the value of the ksdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKSDATE() {
        return ksdate;
    }

    /**
     * Sets the value of the ksdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKSDATE(XMLGregorianCalendar value) {
        this.ksdate = value;
    }

}
