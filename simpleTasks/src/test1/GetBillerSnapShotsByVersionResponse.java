
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBillerSnapShotsByVersionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBillerSnapShotsByVersionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billerShapShots" type="{http://upbs.cs.com/}listResponseBillerShapShotsByVersionWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBillerSnapShotsByVersionResponse", propOrder = {
    "billerShapShots"
})
public class GetBillerSnapShotsByVersionResponse {

    protected ListResponseBillerShapShotsByVersionWrapper billerShapShots;

    /**
     * Gets the value of the billerShapShots property.
     * 
     * @return
     *     possible object is
     *     {@link ListResponseBillerShapShotsByVersionWrapper }
     *     
     */
    public ListResponseBillerShapShotsByVersionWrapper getBillerShapShots() {
        return billerShapShots;
    }

    /**
     * Sets the value of the billerShapShots property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListResponseBillerShapShotsByVersionWrapper }
     *     
     */
    public void setBillerShapShots(ListResponseBillerShapShotsByVersionWrapper value) {
        this.billerShapShots = value;
    }

}
