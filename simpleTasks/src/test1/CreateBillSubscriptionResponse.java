
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBillSubscriptionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBillSubscriptionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://upbs.cs.com/}billSubscription" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBillSubscriptionResponse", propOrder = {
    "billSubscription"
})
public class CreateBillSubscriptionResponse {

    protected BillSubscription billSubscription;

    /**
     * Gets the value of the billSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link BillSubscription }
     *     
     */
    public BillSubscription getBillSubscription() {
        return billSubscription;
    }

    /**
     * Sets the value of the billSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillSubscription }
     *     
     */
    public void setBillSubscription(BillSubscription value) {
        this.billSubscription = value;
    }

}
