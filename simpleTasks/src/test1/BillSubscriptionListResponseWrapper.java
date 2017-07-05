
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billSubscriptionListResponseWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billSubscriptionListResponseWrapper">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}listResponseWrapper">
 *       &lt;sequence>
 *         &lt;element ref="{http://upbs.cs.com/}billSubscription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billSubscriptionListResponseWrapper", propOrder = {
    "billSubscription"
})
public class BillSubscriptionListResponseWrapper
    extends ListResponseWrapper
{

    protected List<BillSubscription> billSubscription;

    /**
     * Gets the value of the billSubscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billSubscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillSubscription }
     * 
     * 
     */
    public List<BillSubscription> getBillSubscription() {
        if (billSubscription == null) {
            billSubscription = new ArrayList<BillSubscription>();
        }
        return this.billSubscription;
    }

}
