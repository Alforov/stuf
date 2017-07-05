
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flatGerc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flatGerc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="nFlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flatGerc", propOrder = {
    "id",
    "nFlat"
})
public class FlatGerc {

    @XmlElement(namespace = "")
    protected Long id;
    @XmlElement(namespace = "")
    protected String nFlat;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nFlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNFlat() {
        return nFlat;
    }

    /**
     * Sets the value of the nFlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNFlat(String value) {
        this.nFlat = value;
    }

}
