
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listResponseBillerShapShotsByVersionWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listResponseBillerShapShotsByVersionWrapper">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}listResponseWrapper">
 *       &lt;sequence>
 *         &lt;element name="nextVersion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://upbs.cs.com/}billerSnapShot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listResponseBillerShapShotsByVersionWrapper", propOrder = {
    "nextVersion",
    "billerSnapShot"
})
public class ListResponseBillerShapShotsByVersionWrapper
    extends ListResponseWrapper
{

    protected long nextVersion;
    protected List<BillerSnapShot> billerSnapShot;

    /**
     * Gets the value of the nextVersion property.
     * 
     */
    public long getNextVersion() {
        return nextVersion;
    }

    /**
     * Sets the value of the nextVersion property.
     * 
     */
    public void setNextVersion(long value) {
        this.nextVersion = value;
    }

    /**
     * Gets the value of the billerSnapShot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billerSnapShot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillerSnapShot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillerSnapShot }
     * 
     * 
     */
    public List<BillerSnapShot> getBillerSnapShot() {
        if (billerSnapShot == null) {
            billerSnapShot = new ArrayList<BillerSnapShot>();
        }
        return this.billerSnapShot;
    }

}
