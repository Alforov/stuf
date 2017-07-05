
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for houseGerc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="houseGerc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="nDom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "houseGerc", propOrder = {
    "id",
    "nDom"
})
public class HouseGerc {

    @XmlElement(namespace = "")
    protected Long id;
    @XmlElement(namespace = "")
    protected String nDom;

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
     * Gets the value of the nDom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDom() {
        return nDom;
    }

    /**
     * Sets the value of the nDom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDom(String value) {
        this.nDom = value;
    }

}
