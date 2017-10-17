
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_CardInfo_EMV_Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_CardInfo_EMV_Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SEQUENCE_NR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LAST_SEQ_NR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DESIGN_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CHIP_APP_ID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="INDIVIDUALIZED_PREV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DKI_0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DKI_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DKI_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRACK2_EQUIV_DATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INDIVIDUALIZED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_CardInfo_EMV_Data", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "sequencenr",
    "lastseqnr",
    "designid",
    "chipappid",
    "individualizedprev",
    "dki0",
    "dki1",
    "dki2",
    "track2EQUIVDATA",
    "individualized"
})
public class RowTypeCardInfoEMVData {

    @XmlElementRef(name = "SEQUENCE_NR", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sequencenr;
    @XmlElementRef(name = "LAST_SEQ_NR", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastseqnr;
    @XmlElementRef(name = "DESIGN_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> designid;
    @XmlElementRef(name = "CHIP_APP_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> chipappid;
    @XmlElementRef(name = "INDIVIDUALIZED_PREV", type = JAXBElement.class, required = false)
    protected JAXBElement<String> individualizedprev;
    @XmlElementRef(name = "DKI_0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dki0;
    @XmlElementRef(name = "DKI_1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dki1;
    @XmlElementRef(name = "DKI_2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dki2;
    @XmlElementRef(name = "TRACK2_EQUIV_DATA", type = JAXBElement.class, required = false)
    protected JAXBElement<String> track2EQUIVDATA;
    @XmlElementRef(name = "INDIVIDUALIZED", type = JAXBElement.class, required = false)
    protected JAXBElement<String> individualized;

    /**
     * Gets the value of the sequencenr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSEQUENCENR() {
        return sequencenr;
    }

    /**
     * Sets the value of the sequencenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSEQUENCENR(JAXBElement<String> value) {
        this.sequencenr = value;
    }

    /**
     * Gets the value of the lastseqnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLASTSEQNR() {
        return lastseqnr;
    }

    /**
     * Sets the value of the lastseqnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLASTSEQNR(JAXBElement<String> value) {
        this.lastseqnr = value;
    }

    /**
     * Gets the value of the designid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDESIGNID() {
        return designid;
    }

    /**
     * Sets the value of the designid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDESIGNID(JAXBElement<BigDecimal> value) {
        this.designid = value;
    }

    /**
     * Gets the value of the chipappid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCHIPAPPID() {
        return chipappid;
    }

    /**
     * Sets the value of the chipappid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCHIPAPPID(JAXBElement<BigDecimal> value) {
        this.chipappid = value;
    }

    /**
     * Gets the value of the individualizedprev property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDIVIDUALIZEDPREV() {
        return individualizedprev;
    }

    /**
     * Sets the value of the individualizedprev property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDIVIDUALIZEDPREV(JAXBElement<String> value) {
        this.individualizedprev = value;
    }

    /**
     * Gets the value of the dki0 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDKI0() {
        return dki0;
    }

    /**
     * Sets the value of the dki0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDKI0(JAXBElement<String> value) {
        this.dki0 = value;
    }

    /**
     * Gets the value of the dki1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDKI1() {
        return dki1;
    }

    /**
     * Sets the value of the dki1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDKI1(JAXBElement<String> value) {
        this.dki1 = value;
    }

    /**
     * Gets the value of the dki2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDKI2() {
        return dki2;
    }

    /**
     * Sets the value of the dki2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDKI2(JAXBElement<String> value) {
        this.dki2 = value;
    }

    /**
     * Gets the value of the track2EQUIVDATA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRACK2EQUIVDATA() {
        return track2EQUIVDATA;
    }

    /**
     * Sets the value of the track2EQUIVDATA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRACK2EQUIVDATA(JAXBElement<String> value) {
        this.track2EQUIVDATA = value;
    }

    /**
     * Gets the value of the individualized property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDIVIDUALIZED() {
        return individualized;
    }

    /**
     * Sets the value of the individualized property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDIVIDUALIZED(JAXBElement<String> value) {
        this.individualized = value;
    }

}
