
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_CustomDataOperationMerch_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_CustomDataOperationMerch_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AFFECTED_ROWS" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_CustomDataOperationMerch_Response", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "affectedrows"
})
public class RowTypeCustomDataOperationMerchResponse {

    @XmlElement(name = "AFFECTED_ROWS", required = true, nillable = true)
    protected BigDecimal affectedrows;

    /**
     * Gets the value of the affectedrows property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAFFECTEDROWS() {
        return affectedrows;
    }

    /**
     * Sets the value of the affectedrows property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAFFECTEDROWS(BigDecimal value) {
        this.affectedrows = value;
    }

}
