
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGercHouseDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGercHouseDictionary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streetId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGercHouseDictionary", propOrder = {
    "streetId"
})
public class GetGercHouseDictionary {

    protected long streetId;

    /**
     * Gets the value of the streetId property.
     * 
     */
    public long getStreetId() {
        return streetId;
    }

    /**
     * Sets the value of the streetId property.
     * 
     */
    public void setStreetId(long value) {
        this.streetId = value;
    }

}
