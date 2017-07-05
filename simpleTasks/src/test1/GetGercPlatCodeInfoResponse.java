
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGercPlatCodeInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGercPlatCodeInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gercPlatCodeInfo" type="{http://upbs.cs.com/}platCodeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGercPlatCodeInfoResponse", propOrder = {
    "gercPlatCodeInfo"
})
public class GetGercPlatCodeInfoResponse {

    protected List<PlatCodeInfo> gercPlatCodeInfo;

    /**
     * Gets the value of the gercPlatCodeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gercPlatCodeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGercPlatCodeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlatCodeInfo }
     * 
     * 
     */
    public List<PlatCodeInfo> getGercPlatCodeInfo() {
        if (gercPlatCodeInfo == null) {
            gercPlatCodeInfo = new ArrayList<PlatCodeInfo>();
        }
        return this.gercPlatCodeInfo;
    }

}
