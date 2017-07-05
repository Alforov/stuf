
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBillersByGroupId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBillersByGroupId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billerGroupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="onlyActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBillersByGroupId", propOrder = {
    "billerGroupId",
    "regionId",
    "onlyActive"
})
public class GetBillersByGroupId {

    protected long billerGroupId;
    protected Long regionId;
    protected Boolean onlyActive;

    /**
     * Gets the value of the billerGroupId property.
     * 
     */
    public long getBillerGroupId() {
        return billerGroupId;
    }

    /**
     * Sets the value of the billerGroupId property.
     * 
     */
    public void setBillerGroupId(long value) {
        this.billerGroupId = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRegionId(Long value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the onlyActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyActive() {
        return onlyActive;
    }

    /**
     * Sets the value of the onlyActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyActive(Boolean value) {
        this.onlyActive = value;
    }

}
