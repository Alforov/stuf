
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vocabularyWithErrors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vocabularyWithErrors">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueUa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueMd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vocabularyWithErrors", propOrder = {
    "value",
    "valueRu",
    "valueUa",
    "valueEn",
    "valueMd",
    "source",
    "version"
})
public class VocabularyWithErrors
    extends BaseEntity
{

    protected String value;
    protected String valueRu;
    protected String valueUa;
    protected String valueEn;
    protected String valueMd;
    protected String source;
    protected Long version;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueRu() {
        return valueRu;
    }

    /**
     * Sets the value of the valueRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueRu(String value) {
        this.valueRu = value;
    }

    /**
     * Gets the value of the valueUa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueUa() {
        return valueUa;
    }

    /**
     * Sets the value of the valueUa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueUa(String value) {
        this.valueUa = value;
    }

    /**
     * Gets the value of the valueEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueEn() {
        return valueEn;
    }

    /**
     * Sets the value of the valueEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueEn(String value) {
        this.valueEn = value;
    }

    /**
     * Gets the value of the valueMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueMd() {
        return valueMd;
    }

    /**
     * Sets the value of the valueMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueMd(String value) {
        this.valueMd = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
