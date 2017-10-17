
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_ExecTransaction_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_ExecTransaction_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INTERNAL_NO" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_ExecTransaction_Response", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "internalno"
})
public class RowTypeExecTransactionResponse {

    @XmlElement(name = "INTERNAL_NO", required = true, nillable = true)
    protected BigDecimal internalno;

    /**
     * Gets the value of the internalno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getINTERNALNO() {
        return internalno;
    }

    /**
     * Sets the value of the internalno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setINTERNALNO(BigDecimal value) {
        this.internalno = value;
    }

}
