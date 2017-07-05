
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseBiller complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseBiller">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}billerSnapShotBase">
 *       &lt;sequence>
 *         &lt;element name="providerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="merchant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="juridicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payOrderDescriptionFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minPayAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="maxPayAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payRoundAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="partialPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="billMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestBillMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseBiller", propOrder = {
    "providerId",
    "payeeId",
    "merchant",
    "terminal",
    "juridicalName",
    "contactPerson",
    "inn",
    "mfo",
    "bankName",
    "accountNo",
    "payOrderDescriptionFormat",
    "paymentPoint",
    "minPayAmount",
    "maxPayAmount",
    "payRoundAmount",
    "partialPayment",
    "billMessage",
    "requestBillMessage"
})
@XmlSeeAlso({
    Biller.class
})
public abstract class BaseBiller
    extends BillerSnapShotBase
{

    protected Long providerId;
    protected Long payeeId;
    protected String merchant;
    protected String terminal;
    protected String juridicalName;
    protected String contactPerson;
    protected String inn;
    protected String mfo;
    protected String bankName;
    protected String accountNo;
    protected String payOrderDescriptionFormat;
    protected String paymentPoint;
    protected Long minPayAmount;
    protected Long maxPayAmount;
    protected Boolean payRoundAmount;
    protected Boolean partialPayment;
    protected String billMessage;
    protected String requestBillMessage;

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProviderId(Long value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the payeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayeeId() {
        return payeeId;
    }

    /**
     * Sets the value of the payeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayeeId(Long value) {
        this.payeeId = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchant(String value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the juridicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJuridicalName() {
        return juridicalName;
    }

    /**
     * Sets the value of the juridicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJuridicalName(String value) {
        this.juridicalName = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInn() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInn(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the mfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfo() {
        return mfo;
    }

    /**
     * Sets the value of the mfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfo(String value) {
        this.mfo = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
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
     * Gets the value of the payOrderDescriptionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayOrderDescriptionFormat() {
        return payOrderDescriptionFormat;
    }

    /**
     * Sets the value of the payOrderDescriptionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayOrderDescriptionFormat(String value) {
        this.payOrderDescriptionFormat = value;
    }

    /**
     * Gets the value of the paymentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPoint() {
        return paymentPoint;
    }

    /**
     * Sets the value of the paymentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPoint(String value) {
        this.paymentPoint = value;
    }

    /**
     * Gets the value of the minPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinPayAmount() {
        return minPayAmount;
    }

    /**
     * Sets the value of the minPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinPayAmount(Long value) {
        this.minPayAmount = value;
    }

    /**
     * Gets the value of the maxPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPayAmount() {
        return maxPayAmount;
    }

    /**
     * Sets the value of the maxPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPayAmount(Long value) {
        this.maxPayAmount = value;
    }

    /**
     * Gets the value of the payRoundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayRoundAmount() {
        return payRoundAmount;
    }

    /**
     * Sets the value of the payRoundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayRoundAmount(Boolean value) {
        this.payRoundAmount = value;
    }

    /**
     * Gets the value of the partialPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialPayment() {
        return partialPayment;
    }

    /**
     * Sets the value of the partialPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialPayment(Boolean value) {
        this.partialPayment = value;
    }

    /**
     * Gets the value of the billMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillMessage() {
        return billMessage;
    }

    /**
     * Sets the value of the billMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillMessage(String value) {
        this.billMessage = value;
    }

    /**
     * Gets the value of the requestBillMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBillMessage() {
        return requestBillMessage;
    }

    /**
     * Sets the value of the requestBillMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBillMessage(String value) {
        this.requestBillMessage = value;
    }

}
