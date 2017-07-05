
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processBillConstuctorStep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processBillConstuctorStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="stepNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="previousStepAttribute" type="{http://upbs.cs.com/}billAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processBillConstuctorStep", propOrder = {
    "billerId",
    "stepNo",
    "previousStepAttribute"
})
public class ProcessBillConstuctorStep {

    protected long billerId;
    protected long stepNo;
    protected List<BillAttribute> previousStepAttribute;

    /**
     * Gets the value of the billerId property.
     * 
     */
    public long getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     */
    public void setBillerId(long value) {
        this.billerId = value;
    }

    /**
     * Gets the value of the stepNo property.
     * 
     */
    public long getStepNo() {
        return stepNo;
    }

    /**
     * Sets the value of the stepNo property.
     * 
     */
    public void setStepNo(long value) {
        this.stepNo = value;
    }

    /**
     * Gets the value of the previousStepAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousStepAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousStepAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillAttribute }
     * 
     * 
     */
    public List<BillAttribute> getPreviousStepAttribute() {
        if (previousStepAttribute == null) {
            previousStepAttribute = new ArrayList<BillAttribute>();
        }
        return this.previousStepAttribute;
    }

}
