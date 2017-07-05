
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGercDictionaryByTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGercDictionaryByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://upbs.cs.com/}gercDictionaryEntity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGercDictionaryByTypeResponse", propOrder = {
    "gercDictionaryEntity"
})
public class GetGercDictionaryByTypeResponse {

    protected List<GercDictionaryEntity> gercDictionaryEntity;

    /**
     * Gets the value of the gercDictionaryEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gercDictionaryEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGercDictionaryEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GercDictionaryEntity }
     * 
     * 
     */
    public List<GercDictionaryEntity> getGercDictionaryEntity() {
        if (gercDictionaryEntity == null) {
            gercDictionaryEntity = new ArrayList<GercDictionaryEntity>();
        }
        return this.gercDictionaryEntity;
    }

}
