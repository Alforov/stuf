
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billerGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billerGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}baseDictionaryEntity">
 *       &lt;sequence>
 *         &lt;element ref="{http://upbs.cs.com/}biller" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billerGroup", propOrder = {
    "biller"
})
public class BillerGroup
    extends BaseDictionaryEntity
{

    protected List<Biller> biller;

    /**
     * Gets the value of the biller property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biller property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Biller }
     * 
     * 
     */
    public List<Biller> getBiller() {
        if (biller == null) {
            biller = new ArrayList<Biller>();
        }
        return this.biller;
    }

}
