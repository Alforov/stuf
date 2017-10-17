
package com.cs.tieoto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_GetRealCard_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_GetRealCard_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RCARD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_GetRealCard_Response", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "rcard"
})
public class RowTypeGetRealCardResponse {

    @XmlElement(name = "RCARD", required = true, nillable = true)
    protected String rcard;

    /**
     * Gets the value of the rcard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRCARD() {
        return rcard;
    }

    /**
     * Sets the value of the rcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRCARD(String value) {
        this.rcard = value;
    }

}
