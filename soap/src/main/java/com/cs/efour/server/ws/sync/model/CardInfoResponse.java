
package com.cs.efour.server.ws.sync.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="metaData" type="{http://sync.ws.server.efour.cs.com/}ResponseMetaData"/>
 *         &lt;element name="cardInfo" type="{http://sync.ws.server.efour.cs.com/}CardInfo" minOccurs="0"/>
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
    "metaData",
    "cardInfo"
})
@XmlRootElement(name = "CardInfoResponse")
public class CardInfoResponse {

    @XmlElement(required = true)
    protected ResponseMetaData metaData;
    protected CardInfo cardInfo;

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMetaData }
     *     
     */
    public ResponseMetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMetaData }
     *     
     */
    public void setMetaData(ResponseMetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the cardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CardInfo }
     *     
     */
    public CardInfo getCardInfo() {
        return cardInfo;
    }

    /**
     * Sets the value of the cardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardInfo }
     *     
     */
    public void setCardInfo(CardInfo value) {
        this.cardInfo = value;
    }

}
