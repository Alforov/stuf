
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payBillResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payBillResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://upbs.cs.com/}billSnapShot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payBillResponse", propOrder = {
    "billSnapShot"
})
public class PayBillResponse {

    protected BillSnapShot billSnapShot;

    /**
     * Gets the value of the billSnapShot property.
     * 
     * @return
     *     possible object is
     *     {@link BillSnapShot }
     *     
     */
    public BillSnapShot getBillSnapShot() {
        return billSnapShot;
    }

    /**
     * Sets the value of the billSnapShot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillSnapShot }
     *     
     */
    public void setBillSnapShot(BillSnapShot value) {
        this.billSnapShot = value;
    }

}
