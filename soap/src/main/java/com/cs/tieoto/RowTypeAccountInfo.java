
package com.cs.tieoto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_AccountInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_AccountInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base_info" type="{urn:issuing_v_01_02_xsd}RowType_AccountInfo_Base"/>
 *         &lt;element name="additional_info" type="{urn:issuing_v_01_02_xsd}RowType_AccountInfo_Additional"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_AccountInfo", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "baseInfo",
    "additionalInfo"
})
public class RowTypeAccountInfo {

    @XmlElement(name = "base_info", required = true, nillable = true)
    protected RowTypeAccountInfoBase baseInfo;
    @XmlElement(name = "additional_info", required = true, nillable = true)
    protected RowTypeAccountInfoAdditional additionalInfo;

    /**
     * Gets the value of the baseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RowTypeAccountInfoBase }
     *     
     */
    public RowTypeAccountInfoBase getBaseInfo() {
        return baseInfo;
    }

    /**
     * Sets the value of the baseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowTypeAccountInfoBase }
     *     
     */
    public void setBaseInfo(RowTypeAccountInfoBase value) {
        this.baseInfo = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RowTypeAccountInfoAdditional }
     *     
     */
    public RowTypeAccountInfoAdditional getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowTypeAccountInfoAdditional }
     *     
     */
    public void setAdditionalInfo(RowTypeAccountInfoAdditional value) {
        this.additionalInfo = value;
    }

}
