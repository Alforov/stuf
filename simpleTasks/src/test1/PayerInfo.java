
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for payerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toboId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payerInfo", propOrder = {
    "payer",
    "clientUserId",
    "siteId",
    "accountNo",
    "toboId",
    "clientAccountNo",
    "currencyId",
    "valueDate"
})
public class PayerInfo {

    protected String payer;
    protected String clientUserId;
    protected Long siteId;
    protected String accountNo;
    protected Long toboId;
    protected String clientAccountNo;
    protected Integer currencyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valueDate;

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayer(String value) {
        this.payer = value;
    }

    /**
     * Gets the value of the clientUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUserId() {
        return clientUserId;
    }

    /**
     * Sets the value of the clientUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUserId(String value) {
        this.clientUserId = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteId(Long value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Gets the value of the toboId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToboId() {
        return toboId;
    }

    /**
     * Sets the value of the toboId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToboId(Long value) {
        this.toboId = value;
    }

    /**
     * Gets the value of the clientAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientAccountNo() {
        return clientAccountNo;
    }

    /**
     * Sets the value of the clientAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientAccountNo(String value) {
        this.clientAccountNo = value;
    }

    /**
     * Gets the value of the currencyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyId() {
        return currencyId;
    }

    /**
     * Sets the value of the currencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyId(Integer value) {
        this.currencyId = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

}
