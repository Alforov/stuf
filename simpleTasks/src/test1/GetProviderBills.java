
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProviderBills complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProviderBills">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="attribute" type="{http://upbs.cs.com/}simpleAttribute" maxOccurs="unbounded"/>
 *         &lt;element name="createSubscriptionOnSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="subscriptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProviderBills", propOrder = {
    "billerId",
    "attribute",
    "createSubscriptionOnSuccess",
    "subscriptionName"
})
public class GetProviderBills {

    protected long billerId;
    @XmlElement(required = true)
    protected List<SimpleAttribute> attribute;
    protected Boolean createSubscriptionOnSuccess;
    protected String subscriptionName;

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
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleAttribute }
     * 
     * 
     */
    public List<SimpleAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<SimpleAttribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the createSubscriptionOnSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateSubscriptionOnSuccess() {
        return createSubscriptionOnSuccess;
    }

    /**
     * Sets the value of the createSubscriptionOnSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateSubscriptionOnSuccess(Boolean value) {
        this.createSubscriptionOnSuccess = value;
    }

    /**
     * Gets the value of the subscriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Sets the value of the subscriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionName(String value) {
        this.subscriptionName = value;
    }

}
