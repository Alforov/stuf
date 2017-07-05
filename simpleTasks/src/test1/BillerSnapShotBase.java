
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for billerSnapShotBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billerSnapShotBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="checkBillDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="providerGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billerStateId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportsSubscrs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="processAlgorithm" type="{http://upbs.cs.com/}processAlgorithm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billerSnapShotBase", propOrder = {
    "checkBillDate",
    "id",
    "name",
    "imageFile",
    "imageUrl",
    "providerGroupId",
    "providerGroupName",
    "billerStateId",
    "regionId",
    "supportsSubscrs",
    "mobile",
    "processAlgorithm"
})
@XmlSeeAlso({
    BillerSnapShot.class,
    BaseBiller.class
})
public abstract class BillerSnapShotBase
    extends BaseEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkBillDate;
    protected Long id;
    protected String name;
    protected String imageFile;
    protected String imageUrl;
    protected Long providerGroupId;
    protected String providerGroupName;
    protected Integer billerStateId;
    @XmlElement(type = Long.class)
    protected List<Long> regionId;
    protected Boolean supportsSubscrs;
    protected Boolean mobile;
    @XmlSchemaType(name = "string")
    protected List<ProcessAlgorithm> processAlgorithm;

    /**
     * Gets the value of the checkBillDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckBillDate() {
        return checkBillDate;
    }

    /**
     * Sets the value of the checkBillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckBillDate(XMLGregorianCalendar value) {
        this.checkBillDate = value;
    }

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the imageFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFile() {
        return imageFile;
    }

    /**
     * Sets the value of the imageFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFile(String value) {
        this.imageFile = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the providerGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProviderGroupId() {
        return providerGroupId;
    }

    /**
     * Sets the value of the providerGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProviderGroupId(Long value) {
        this.providerGroupId = value;
    }

    /**
     * Gets the value of the providerGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderGroupName() {
        return providerGroupName;
    }

    /**
     * Sets the value of the providerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderGroupName(String value) {
        this.providerGroupName = value;
    }

    /**
     * Gets the value of the billerStateId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillerStateId() {
        return billerStateId;
    }

    /**
     * Sets the value of the billerStateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillerStateId(Integer value) {
        this.billerStateId = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getRegionId() {
        if (regionId == null) {
            regionId = new ArrayList<Long>();
        }
        return this.regionId;
    }

    /**
     * Gets the value of the supportsSubscrs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupportsSubscrs() {
        return supportsSubscrs;
    }

    /**
     * Sets the value of the supportsSubscrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupportsSubscrs(Boolean value) {
        this.supportsSubscrs = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobile(Boolean value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the processAlgorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processAlgorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessAlgorithm }
     * 
     * 
     */
    public List<ProcessAlgorithm> getProcessAlgorithm() {
        if (processAlgorithm == null) {
            processAlgorithm = new ArrayList<ProcessAlgorithm>();
        }
        return this.processAlgorithm;
    }

}
