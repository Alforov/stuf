
package com.cs.tieoto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_CardInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_CardInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LogicalCard" type="{urn:issuing_v_01_02_xsd}RowType_CardInfo_LogicalCard"/>
 *         &lt;element name="PhysicalCard" type="{urn:issuing_v_01_02_xsd}RowType_CardInfo_PhysicalCard" minOccurs="0"/>
 *         &lt;element name="EMV_Data" type="{urn:issuing_v_01_02_xsd}RowType_CardInfo_EMV_Data" minOccurs="0"/>
 *         &lt;element name="AddServInfo" type="{urn:issuing_v_01_02_xsd}ListType_AddServInfo" minOccurs="0"/>
 *         &lt;element name="TSM_Data" type="{urn:issuing_v_01_02_xsd}RowType_CardInfo_TSM_Data" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_CardInfo", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "logicalCard",
    "physicalCard",
    "emvData",
    "addServInfo",
    "tsmData"
})
public class RowTypeCardInfo {

    @XmlElement(name = "LogicalCard", required = true, nillable = true)
    protected RowTypeCardInfoLogicalCard logicalCard;
    @XmlElementRef(name = "PhysicalCard", type = JAXBElement.class, required = false)
    protected JAXBElement<RowTypeCardInfoPhysicalCard> physicalCard;
    @XmlElementRef(name = "EMV_Data", type = JAXBElement.class, required = false)
    protected JAXBElement<RowTypeCardInfoEMVData> emvData;
    @XmlElementRef(name = "AddServInfo", type = JAXBElement.class, required = false)
    protected JAXBElement<ListTypeAddServInfo> addServInfo;
    @XmlElementRef(name = "TSM_Data", type = JAXBElement.class, required = false)
    protected JAXBElement<RowTypeCardInfoTSMData> tsmData;

    /**
     * Gets the value of the logicalCard property.
     * 
     * @return
     *     possible object is
     *     {@link RowTypeCardInfoLogicalCard }
     *     
     */
    public RowTypeCardInfoLogicalCard getLogicalCard() {
        return logicalCard;
    }

    /**
     * Sets the value of the logicalCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowTypeCardInfoLogicalCard }
     *     
     */
    public void setLogicalCard(RowTypeCardInfoLogicalCard value) {
        this.logicalCard = value;
    }

    /**
     * Gets the value of the physicalCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RowTypeCardInfoPhysicalCard }{@code >}
     *     
     */
    public JAXBElement<RowTypeCardInfoPhysicalCard> getPhysicalCard() {
        return physicalCard;
    }

    /**
     * Sets the value of the physicalCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RowTypeCardInfoPhysicalCard }{@code >}
     *     
     */
    public void setPhysicalCard(JAXBElement<RowTypeCardInfoPhysicalCard> value) {
        this.physicalCard = value;
    }

    /**
     * Gets the value of the emvData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RowTypeCardInfoEMVData }{@code >}
     *     
     */
    public JAXBElement<RowTypeCardInfoEMVData> getEMVData() {
        return emvData;
    }

    /**
     * Sets the value of the emvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RowTypeCardInfoEMVData }{@code >}
     *     
     */
    public void setEMVData(JAXBElement<RowTypeCardInfoEMVData> value) {
        this.emvData = value;
    }

    /**
     * Gets the value of the addServInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListTypeAddServInfo }{@code >}
     *     
     */
    public JAXBElement<ListTypeAddServInfo> getAddServInfo() {
        return addServInfo;
    }

    /**
     * Sets the value of the addServInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListTypeAddServInfo }{@code >}
     *     
     */
    public void setAddServInfo(JAXBElement<ListTypeAddServInfo> value) {
        this.addServInfo = value;
    }

    /**
     * Gets the value of the tsmData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RowTypeCardInfoTSMData }{@code >}
     *     
     */
    public JAXBElement<RowTypeCardInfoTSMData> getTSMData() {
        return tsmData;
    }

    /**
     * Sets the value of the tsmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RowTypeCardInfoTSMData }{@code >}
     *     
     */
    public void setTSMData(JAXBElement<RowTypeCardInfoTSMData> value) {
        this.tsmData = value;
    }

}
