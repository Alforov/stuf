
package com.cs.tieoto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplexType_RetrieveDataParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplexType_RetrieveDataParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QueryVariant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilterCondition" type="{urn:issuing_v_01_02_xsd}RowType_FilterCondition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplexType_RetrieveDataParameters", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "queryName",
    "queryVariant",
    "filterCondition"
})
public class ComplexTypeRetrieveDataParameters {

    @XmlElement(name = "QueryName", required = true, nillable = true)
    protected String queryName;
    @XmlElementRef(name = "QueryVariant", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queryVariant;
    @XmlElement(name = "FilterCondition", nillable = true)
    protected List<RowTypeFilterCondition> filterCondition;

    /**
     * Gets the value of the queryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * Gets the value of the queryVariant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueryVariant() {
        return queryVariant;
    }

    /**
     * Sets the value of the queryVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueryVariant(JAXBElement<String> value) {
        this.queryVariant = value;
    }

    /**
     * Gets the value of the filterCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowTypeFilterCondition }
     * 
     * 
     */
    public List<RowTypeFilterCondition> getFilterCondition() {
        if (filterCondition == null) {
            filterCondition = new ArrayList<RowTypeFilterCondition>();
        }
        return this.filterCondition;
    }

}
