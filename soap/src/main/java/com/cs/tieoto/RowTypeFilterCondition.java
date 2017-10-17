
package com.cs.tieoto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_FilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_FilterCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MatchingRule" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="MatchingRuleOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_FilterCondition", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "key",
    "value",
    "matchingRule",
    "matchingRuleOption"
})
public class RowTypeFilterCondition {

    @XmlElement(name = "Key", required = true, nillable = true)
    protected String key;
    @XmlElement(name = "Value", required = true, nillable = true)
    protected String value;
    @XmlElement(name = "MatchingRule", required = true, nillable = true)
    protected BigInteger matchingRule;
    @XmlElement(name = "MatchingRuleOption", required = true, nillable = true)
    protected String matchingRuleOption;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
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
     * Gets the value of the matchingRule property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchingRule() {
        return matchingRule;
    }

    /**
     * Sets the value of the matchingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchingRule(BigInteger value) {
        this.matchingRule = value;
    }

    /**
     * Gets the value of the matchingRuleOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchingRuleOption() {
        return matchingRuleOption;
    }

    /**
     * Sets the value of the matchingRuleOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchingRuleOption(String value) {
        this.matchingRuleOption = value;
    }

}
