
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseAttributeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseAttributeValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseAttributeValue", propOrder = {
    "order",
    "value",
    "valueHint"
})
@XmlSeeAlso({
    BillAttributeValue.class,
    BillerAttributeValue.class
})
public class BaseAttributeValue
    extends BaseEntity
{

    protected Integer order;
    protected String value;
    @XmlElement(name = "value_hint")
    protected String valueHint;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

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
     * Gets the value of the valueHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueHint() {
        return valueHint;
    }

    /**
     * Sets the value of the valueHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueHint(String value) {
        this.valueHint = value;
    }

}
