
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_LimitBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_LimitBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limit_value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="limit_balance_value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="limit_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit_date_from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limit_date_to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_LimitBalance", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "limitValue",
    "limitBalanceValue",
    "limitName",
    "limitDateFrom",
    "limitDateTo"
})
public class RowTypeLimitBalance {

    @XmlElement(name = "limit_value", required = true, nillable = true)
    protected BigDecimal limitValue;
    @XmlElement(name = "limit_balance_value", required = true, nillable = true)
    protected BigDecimal limitBalanceValue;
    @XmlElementRef(name = "limit_name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitName;
    @XmlElementRef(name = "limit_date_from", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitDateFrom;
    @XmlElementRef(name = "limit_date_to", type = JAXBElement.class, required = false)
    protected JAXBElement<String> limitDateTo;

    /**
     * Gets the value of the limitValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitValue() {
        return limitValue;
    }

    /**
     * Sets the value of the limitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimitValue(BigDecimal value) {
        this.limitValue = value;
    }

    /**
     * Gets the value of the limitBalanceValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitBalanceValue() {
        return limitBalanceValue;
    }

    /**
     * Sets the value of the limitBalanceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLimitBalanceValue(BigDecimal value) {
        this.limitBalanceValue = value;
    }

    /**
     * Gets the value of the limitName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitName() {
        return limitName;
    }

    /**
     * Sets the value of the limitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitName(JAXBElement<String> value) {
        this.limitName = value;
    }

    /**
     * Gets the value of the limitDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitDateFrom() {
        return limitDateFrom;
    }

    /**
     * Sets the value of the limitDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitDateFrom(JAXBElement<String> value) {
        this.limitDateFrom = value;
    }

    /**
     * Gets the value of the limitDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLimitDateTo() {
        return limitDateTo;
    }

    /**
     * Sets the value of the limitDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLimitDateTo(JAXBElement<String> value) {
        this.limitDateTo = value;
    }

}
