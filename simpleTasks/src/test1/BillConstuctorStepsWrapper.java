
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billConstuctorStepsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billConstuctorStepsWrapper">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}listResponseWrapper">
 *       &lt;sequence>
 *         &lt;element name="hasNextStep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stepsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="billAttribute" type="{http://upbs.cs.com/}billAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billConstuctorStepsWrapper", propOrder = {
    "hasNextStep",
    "stepsCount",
    "billAttribute"
})
public class BillConstuctorStepsWrapper
    extends ListResponseWrapper
{

    protected boolean hasNextStep;
    protected int stepsCount;
    protected List<BillAttribute> billAttribute;

    /**
     * Gets the value of the hasNextStep property.
     * 
     */
    public boolean isHasNextStep() {
        return hasNextStep;
    }

    /**
     * Sets the value of the hasNextStep property.
     * 
     */
    public void setHasNextStep(boolean value) {
        this.hasNextStep = value;
    }

    /**
     * Gets the value of the stepsCount property.
     * 
     */
    public int getStepsCount() {
        return stepsCount;
    }

    /**
     * Sets the value of the stepsCount property.
     * 
     */
    public void setStepsCount(int value) {
        this.stepsCount = value;
    }

    /**
     * Gets the value of the billAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillAttribute }
     * 
     * 
     */
    public List<BillAttribute> getBillAttribute() {
        if (billAttribute == null) {
            billAttribute = new ArrayList<BillAttribute>();
        }
        return this.billAttribute;
    }

}
