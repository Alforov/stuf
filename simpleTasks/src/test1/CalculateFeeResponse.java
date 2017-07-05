
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculateFeeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculateFeeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fee" type="{http://upbs.cs.com/}entryListResponseWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateFeeResponse", propOrder = {
    "fee"
})
public class CalculateFeeResponse {

    protected EntryListResponseWrapper fee;

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link EntryListResponseWrapper }
     *     
     */
    public EntryListResponseWrapper getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryListResponseWrapper }
     *     
     */
    public void setFee(EntryListResponseWrapper value) {
        this.fee = value;
    }

}
