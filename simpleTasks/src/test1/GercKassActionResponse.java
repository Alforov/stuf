
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gercKassActionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gercKassActionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gercKassAction" type="{http://upbs.cs.com/}kassActionResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gercKassActionResponse", propOrder = {
    "gercKassAction"
})
public class GercKassActionResponse {

    protected KassActionResponse gercKassAction;

    /**
     * Gets the value of the gercKassAction property.
     * 
     * @return
     *     possible object is
     *     {@link KassActionResponse }
     *     
     */
    public KassActionResponse getGercKassAction() {
        return gercKassAction;
    }

    /**
     * Sets the value of the gercKassAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link KassActionResponse }
     *     
     */
    public void setGercKassAction(KassActionResponse value) {
        this.gercKassAction = value;
    }

}
