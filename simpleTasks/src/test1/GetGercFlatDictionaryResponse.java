
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGercFlatDictionaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGercFlatDictionaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gercFlatDictionary" type="{http://upbs.cs.com/}flatGerc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGercFlatDictionaryResponse", propOrder = {
    "gercFlatDictionary"
})
public class GetGercFlatDictionaryResponse {

    protected List<FlatGerc> gercFlatDictionary;

    /**
     * Gets the value of the gercFlatDictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gercFlatDictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGercFlatDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlatGerc }
     * 
     * 
     */
    public List<FlatGerc> getGercFlatDictionary() {
        if (gercFlatDictionary == null) {
            gercFlatDictionary = new ArrayList<FlatGerc>();
        }
        return this.gercFlatDictionary;
    }

}
