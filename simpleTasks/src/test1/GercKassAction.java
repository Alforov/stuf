
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gercKassAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gercKassAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="smena" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gercKassAction", propOrder = {
    "action",
    "smena"
})
public class GercKassAction {

    protected int action;
    protected Integer smena;

    /**
     * Gets the value of the action property.
     * 
     */
    public int getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     */
    public void setAction(int value) {
        this.action = value;
    }

    /**
     * Gets the value of the smena property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSmena() {
        return smena;
    }

    /**
     * Sets the value of the smena property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSmena(Integer value) {
        this.smena = value;
    }

}
