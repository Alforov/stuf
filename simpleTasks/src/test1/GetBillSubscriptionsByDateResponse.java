
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBillSubscriptionsByDateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBillSubscriptionsByDateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billSubscriptions" type="{http://upbs.cs.com/}billSubscriptionListResponseWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBillSubscriptionsByDateResponse", propOrder = {
    "billSubscriptions"
})
public class GetBillSubscriptionsByDateResponse {

    protected BillSubscriptionListResponseWrapper billSubscriptions;

    /**
     * Gets the value of the billSubscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link BillSubscriptionListResponseWrapper }
     *     
     */
    public BillSubscriptionListResponseWrapper getBillSubscriptions() {
        return billSubscriptions;
    }

    /**
     * Sets the value of the billSubscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillSubscriptionListResponseWrapper }
     *     
     */
    public void setBillSubscriptions(BillSubscriptionListResponseWrapper value) {
        this.billSubscriptions = value;
    }

}
