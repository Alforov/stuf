
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGercStreetDictionaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGercStreetDictionaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gercStreetDictionary" type="{http://upbs.cs.com/}streetGerc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGercStreetDictionaryResponse", propOrder = {
    "gercStreetDictionary"
})
public class GetGercStreetDictionaryResponse {

    protected List<StreetGerc> gercStreetDictionary;

    /**
     * Gets the value of the gercStreetDictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gercStreetDictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGercStreetDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreetGerc }
     * 
     * 
     */
    public List<StreetGerc> getGercStreetDictionary() {
        if (gercStreetDictionary == null) {
            gercStreetDictionary = new ArrayList<StreetGerc>();
        }
        return this.gercStreetDictionary;
    }

}
