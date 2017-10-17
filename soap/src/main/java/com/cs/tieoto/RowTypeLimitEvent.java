
package com.cs.tieoto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_LimitEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_LimitEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KEY_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODE_OWNER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KEY_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Limit" type="{urn:issuing_v_01_02_xsd}RowType_LimitEvent_Limit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_LimitEvent", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "keytype",
    "codeowner",
    "keyvalue",
    "limit"
})
public class RowTypeLimitEvent {

    @XmlElement(name = "KEY_TYPE", required = true, nillable = true)
    protected String keytype;
    @XmlElement(name = "CODE_OWNER", required = true, nillable = true)
    protected String codeowner;
    @XmlElement(name = "KEY_VALUE", required = true, nillable = true)
    protected String keyvalue;
    @XmlElement(name = "Limit", nillable = true)
    protected List<RowTypeLimitEventLimit> limit;

    /**
     * Gets the value of the keytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYTYPE() {
        return keytype;
    }

    /**
     * Sets the value of the keytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYTYPE(String value) {
        this.keytype = value;
    }

    /**
     * Gets the value of the codeowner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEOWNER() {
        return codeowner;
    }

    /**
     * Sets the value of the codeowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEOWNER(String value) {
        this.codeowner = value;
    }

    /**
     * Gets the value of the keyvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKEYVALUE() {
        return keyvalue;
    }

    /**
     * Sets the value of the keyvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKEYVALUE(String value) {
        this.keyvalue = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowTypeLimitEventLimit }
     * 
     * 
     */
    public List<RowTypeLimitEventLimit> getLimit() {
        if (limit == null) {
            limit = new ArrayList<RowTypeLimitEventLimit>();
        }
        return this.limit;
    }

}
