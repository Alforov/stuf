
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGercOwnerDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGercOwnerDictionary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flatId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGercOwnerDictionary", propOrder = {
    "flatId"
})
public class GetGercOwnerDictionary {

    protected long flatId;

    /**
     * Gets the value of the flatId property.
     * 
     */
    public long getFlatId() {
        return flatId;
    }

    /**
     * Sets the value of the flatId property.
     * 
     */
    public void setFlatId(long value) {
        this.flatId = value;
    }

}
