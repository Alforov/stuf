
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGercFlatDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGercFlatDictionary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGercFlatDictionary", propOrder = {
    "houseId"
})
public class GetGercFlatDictionary {

    protected long houseId;

    /**
     * Gets the value of the houseId property.
     * 
     */
    public long getHouseId() {
        return houseId;
    }

    /**
     * Sets the value of the houseId property.
     * 
     */
    public void setHouseId(long value) {
        this.houseId = value;
    }

}
