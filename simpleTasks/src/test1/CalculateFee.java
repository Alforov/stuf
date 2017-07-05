
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for calculateFee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateFee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paymentInputChannel" type="{http://upbs.cs.com/}paymentInputChannel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateFee", propOrder = {
    "billerId",
    "amount",
    "date",
    "currency",
    "paymentInputChannel"
})
public class CalculateFee {

    protected long billerId;
    protected long amount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected int currency;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PaymentInputChannel paymentInputChannel;

    /**
     * Gets the value of the billerId property.
     * 
     */
    public long getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     */
    public void setBillerId(long value) {
        this.billerId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     */
    public int getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     */
    public void setCurrency(int value) {
        this.currency = value;
    }

    /**
     * Gets the value of the paymentInputChannel property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInputChannel }
     *     
     */
    public PaymentInputChannel getPaymentInputChannel() {
        return paymentInputChannel;
    }

    /**
     * Sets the value of the paymentInputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInputChannel }
     *     
     */
    public void setPaymentInputChannel(PaymentInputChannel value) {
        this.paymentInputChannel = value;
    }

}
