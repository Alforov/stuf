
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBillerSnapShotsByVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBillerSnapShotsByVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="activeBillersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="visibleBillersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mobileBillersOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBillerSnapShotsByVersion", propOrder = {
    "version",
    "activeBillersOnly",
    "visibleBillersOnly",
    "mobileBillersOnly"
})
public class GetBillerSnapShotsByVersion {

    protected long version;
    protected Boolean activeBillersOnly;
    protected Boolean visibleBillersOnly;
    protected Boolean mobileBillersOnly;

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the activeBillersOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveBillersOnly() {
        return activeBillersOnly;
    }

    /**
     * Sets the value of the activeBillersOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveBillersOnly(Boolean value) {
        this.activeBillersOnly = value;
    }

    /**
     * Gets the value of the visibleBillersOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibleBillersOnly() {
        return visibleBillersOnly;
    }

    /**
     * Sets the value of the visibleBillersOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibleBillersOnly(Boolean value) {
        this.visibleBillersOnly = value;
    }

    /**
     * Gets the value of the mobileBillersOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileBillersOnly() {
        return mobileBillersOnly;
    }

    /**
     * Sets the value of the mobileBillersOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileBillersOnly(Boolean value) {
        this.mobileBillersOnly = value;
    }

}
