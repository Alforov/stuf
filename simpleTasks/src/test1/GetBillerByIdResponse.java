
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBillerByIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBillerByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://upbs.cs.com/}biller" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBillerByIdResponse", propOrder = {
    "biller"
})
public class GetBillerByIdResponse {

    protected Biller biller;

    /**
     * Gets the value of the biller property.
     * 
     * @return
     *     possible object is
     *     {@link Biller }
     *     
     */
    public Biller getBiller() {
        return biller;
    }

    /**
     * Sets the value of the biller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Biller }
     *     
     */
    public void setBiller(Biller value) {
        this.biller = value;
    }

}
