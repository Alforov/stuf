
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processBillConstuctorStepResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processBillConstuctorStepResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billStep" type="{http://upbs.cs.com/}billConstuctorStepsWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processBillConstuctorStepResponse", propOrder = {
    "billStep"
})
public class ProcessBillConstuctorStepResponse {

    protected BillConstuctorStepsWrapper billStep;

    /**
     * Gets the value of the billStep property.
     * 
     * @return
     *     possible object is
     *     {@link BillConstuctorStepsWrapper }
     *     
     */
    public BillConstuctorStepsWrapper getBillStep() {
        return billStep;
    }

    /**
     * Sets the value of the billStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillConstuctorStepsWrapper }
     *     
     */
    public void setBillStep(BillConstuctorStepsWrapper value) {
        this.billStep = value;
    }

}
