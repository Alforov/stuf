
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_TransferLoyaltyPoints_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_TransferLoyaltyPoints_Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRANSFERED_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_TransferLoyaltyPoints_Response", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "transferedamount"
})
public class RowTypeTransferLoyaltyPointsResponse {

    @XmlElement(name = "TRANSFERED_AMOUNT", required = true, nillable = true)
    protected BigDecimal transferedamount;

    /**
     * Gets the value of the transferedamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTRANSFEREDAMOUNT() {
        return transferedamount;
    }

    /**
     * Sets the value of the transferedamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTRANSFEREDAMOUNT(BigDecimal value) {
        this.transferedamount = value;
    }

}
