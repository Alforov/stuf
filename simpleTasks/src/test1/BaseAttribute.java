
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="type" type="{http://upbs.cs.com/}attributeType" minOccurs="0"/>
 *         &lt;element name="valueType" type="{http://upbs.cs.com/}attributeValueType" minOccurs="0"/>
 *         &lt;element name="valueLinkType" type="{http://upbs.cs.com/}attributeValueLinkType" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parent_attrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dependent_attrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="params" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sourceType" type="{http://upbs.cs.com/}attributeSourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseAttribute", propOrder = {
    "order",
    "name",
    "title",
    "titleHint",
    "value",
    "minValue",
    "maxValue",
    "size",
    "type",
    "valueType",
    "valueLinkType",
    "format",
    "mandatory",
    "editable",
    "visible",
    "parentAttrs",
    "dependentAttrs",
    "condition",
    "params",
    "groupId",
    "parentGroupId",
    "groupOrder",
    "sourceType"
})
@XmlSeeAlso({
    BillerAttribute.class,
    BillAttribute.class
})
public class BaseAttribute
    extends BaseEntity
{

    protected Integer order;
    protected String name;
    protected String title;
    @XmlElement(name = "title_hint")
    protected String titleHint;
    protected String value;
    protected String minValue;
    protected String maxValue;
    protected Integer size;
    @XmlElement(defaultValue = "SIMPLE_VALUE")
    @XmlSchemaType(name = "string")
    protected AttributeType type;
    @XmlElement(defaultValue = "STRING")
    @XmlSchemaType(name = "string")
    protected AttributeValueType valueType;
    @XmlElement(defaultValue = "OWN")
    @XmlSchemaType(name = "string")
    protected AttributeValueLinkType valueLinkType;
    protected String format;
    protected boolean mandatory;
    protected boolean editable;
    protected boolean visible;
    @XmlElement(name = "parent_attrs")
    protected String parentAttrs;
    @XmlElement(name = "dependent_attrs")
    protected String dependentAttrs;
    protected String condition;
    protected String params;
    protected String groupId;
    protected String parentGroupId;
    protected Integer groupOrder;
    @XmlSchemaType(name = "string")
    protected AttributeSourceType sourceType;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleHint() {
        return titleHint;
    }

    /**
     * Sets the value of the titleHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleHint(String value) {
        this.titleHint = value;
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
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxValue(String value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType }
     *     
     */
    public AttributeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType }
     *     
     */
    public void setType(AttributeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueType }
     *     
     */
    public AttributeValueType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueType }
     *     
     */
    public void setValueType(AttributeValueType value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the valueLinkType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeValueLinkType }
     *     
     */
    public AttributeValueLinkType getValueLinkType() {
        return valueLinkType;
    }

    /**
     * Sets the value of the valueLinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeValueLinkType }
     *     
     */
    public void setValueLinkType(AttributeValueLinkType value) {
        this.valueLinkType = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     */
    public boolean isMandatory() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     */
    public void setMandatory(boolean value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     */
    public void setEditable(boolean value) {
        this.editable = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the parentAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAttrs() {
        return parentAttrs;
    }

    /**
     * Sets the value of the parentAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAttrs(String value) {
        this.parentAttrs = value;
    }

    /**
     * Gets the value of the dependentAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentAttrs() {
        return dependentAttrs;
    }

    /**
     * Sets the value of the dependentAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentAttrs(String value) {
        this.dependentAttrs = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParams(String value) {
        this.params = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the parentGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGroupId() {
        return parentGroupId;
    }

    /**
     * Sets the value of the parentGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGroupId(String value) {
        this.parentGroupId = value;
    }

    /**
     * Gets the value of the groupOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupOrder() {
        return groupOrder;
    }

    /**
     * Sets the value of the groupOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupOrder(Integer value) {
        this.groupOrder = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeSourceType }
     *     
     */
    public AttributeSourceType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeSourceType }
     *     
     */
    public void setSourceType(AttributeSourceType value) {
        this.sourceType = value;
    }

}
