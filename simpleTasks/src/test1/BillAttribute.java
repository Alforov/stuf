
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}baseAttribute">
 *       &lt;sequence>
 *         &lt;element name="attributeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="attributeValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributeValue" type="{http://upbs.cs.com/}billAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billAttribute", propOrder = {
    "attributeId",
    "attributeValues"
})
public class BillAttribute
    extends BaseAttribute
{

    protected Long attributeId;
    protected BillAttribute.AttributeValues attributeValues;

    /**
     * Gets the value of the attributeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAttributeId() {
        return attributeId;
    }

    /**
     * Sets the value of the attributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAttributeId(Long value) {
        this.attributeId = value;
    }

    /**
     * Gets the value of the attributeValues property.
     * 
     * @return
     *     possible object is
     *     {@link BillAttribute.AttributeValues }
     *     
     */
    public BillAttribute.AttributeValues getAttributeValues() {
        return attributeValues;
    }

    /**
     * Sets the value of the attributeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillAttribute.AttributeValues }
     *     
     */
    public void setAttributeValues(BillAttribute.AttributeValues value) {
        this.attributeValues = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="attributeValue" type="{http://upbs.cs.com/}billAttributeValue" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attributeValue"
    })
    public static class AttributeValues {

        protected List<BillAttributeValue> attributeValue;

        /**
         * Gets the value of the attributeValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BillAttributeValue }
         * 
         * 
         */
        public List<BillAttributeValue> getAttributeValue() {
            if (attributeValue == null) {
                attributeValue = new ArrayList<BillAttributeValue>();
            }
            return this.attributeValue;
        }

    }

}
