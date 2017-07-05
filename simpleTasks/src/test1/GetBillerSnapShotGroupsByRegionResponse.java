
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBillerSnapShotGroupsByRegionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBillerSnapShotGroupsByRegionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billerGroup" type="{http://upbs.cs.com/}billerSnapShotGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBillerSnapShotGroupsByRegionResponse", propOrder = {
    "billerGroup"
})
public class GetBillerSnapShotGroupsByRegionResponse {

    protected List<BillerSnapShotGroup> billerGroup;

    /**
     * Gets the value of the billerGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billerGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillerGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillerSnapShotGroup }
     * 
     * 
     */
    public List<BillerSnapShotGroup> getBillerGroup() {
        if (billerGroup == null) {
            billerGroup = new ArrayList<BillerSnapShotGroup>();
        }
        return this.billerGroup;
    }

}
