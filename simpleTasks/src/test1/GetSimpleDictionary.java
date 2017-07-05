
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimpleDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSimpleDictionary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dictionaryType" type="{http://upbs.cs.com/}wsDictionaryTypeEnum"/>
 *         &lt;element name="dictionaryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dictionaryParams" type="{http://upbs.cs.com/}wsDictionaryParams" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rowsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimpleDictionary", propOrder = {
    "billerId",
    "dictionaryType",
    "dictionaryId",
    "dictionaryParams",
    "version",
    "page",
    "rowsPerPage"
})
public class GetSimpleDictionary {

    protected long billerId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected WsDictionaryTypeEnum dictionaryType;
    protected String dictionaryId;
    protected WsDictionaryParams dictionaryParams;
    protected Integer version;
    protected Integer page;
    protected Integer rowsPerPage;

    /**
     * Gets the value of the billerId property.
     * 
     */
    public long getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     */
    public void setBillerId(long value) {
        this.billerId = value;
    }

    /**
     * Gets the value of the dictionaryType property.
     * 
     * @return
     *     possible object is
     *     {@link WsDictionaryTypeEnum }
     *     
     */
    public WsDictionaryTypeEnum getDictionaryType() {
        return dictionaryType;
    }

    /**
     * Sets the value of the dictionaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDictionaryTypeEnum }
     *     
     */
    public void setDictionaryType(WsDictionaryTypeEnum value) {
        this.dictionaryType = value;
    }

    /**
     * Gets the value of the dictionaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryId() {
        return dictionaryId;
    }

    /**
     * Sets the value of the dictionaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryId(String value) {
        this.dictionaryId = value;
    }

    /**
     * Gets the value of the dictionaryParams property.
     * 
     * @return
     *     possible object is
     *     {@link WsDictionaryParams }
     *     
     */
    public WsDictionaryParams getDictionaryParams() {
        return dictionaryParams;
    }

    /**
     * Sets the value of the dictionaryParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDictionaryParams }
     *     
     */
    public void setDictionaryParams(WsDictionaryParams value) {
        this.dictionaryParams = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Gets the value of the rowsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowsPerPage() {
        return rowsPerPage;
    }

    /**
     * Sets the value of the rowsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowsPerPage(Integer value) {
        this.rowsPerPage = value;
    }

}
