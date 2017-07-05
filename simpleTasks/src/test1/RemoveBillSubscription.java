
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for removeBillSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeBillSubscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billSubscriptionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeBillSubscription", propOrder = {
    "billSubscriptionId"
})
public class RemoveBillSubscription {

    protected long billSubscriptionId;

    /**
     * Gets the value of the billSubscriptionId property.
     * 
     */
    public long getBillSubscriptionId() {
        return billSubscriptionId;
    }

    /**
     * Sets the value of the billSubscriptionId property.
     * 
     */
    public void setBillSubscriptionId(long value) {
        this.billSubscriptionId = value;
    }

}
