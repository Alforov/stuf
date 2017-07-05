
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kassActionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kassActionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="idKass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="loginKassir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="nameKass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ndnKass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="smenaKass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="statusKass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="summKomis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="summTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dCloseKass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dOpenKass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kassActionResponse", propOrder = {
    "error",
    "idKass",
    "loginKassir",
    "nameKass",
    "ndnKass",
    "smenaKass",
    "statusKass",
    "summKomis",
    "summTotal",
    "dCloseKass",
    "dOpenKass"
})
public class KassActionResponse {

    @XmlElement(namespace = "")
    protected String error;
    @XmlElement(namespace = "")
    protected String idKass;
    @XmlElement(namespace = "")
    protected String loginKassir;
    @XmlElement(namespace = "")
    protected String nameKass;
    @XmlElement(namespace = "")
    protected String ndnKass;
    @XmlElement(namespace = "")
    protected String smenaKass;
    @XmlElement(namespace = "")
    protected String statusKass;
    @XmlElement(namespace = "")
    protected String summKomis;
    @XmlElement(namespace = "")
    protected String summTotal;
    @XmlElement(namespace = "")
    protected String dCloseKass;
    @XmlElement(namespace = "")
    protected String dOpenKass;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the idKass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdKass() {
        return idKass;
    }

    /**
     * Sets the value of the idKass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdKass(String value) {
        this.idKass = value;
    }

    /**
     * Gets the value of the loginKassir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginKassir() {
        return loginKassir;
    }

    /**
     * Sets the value of the loginKassir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginKassir(String value) {
        this.loginKassir = value;
    }

    /**
     * Gets the value of the nameKass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameKass() {
        return nameKass;
    }

    /**
     * Sets the value of the nameKass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameKass(String value) {
        this.nameKass = value;
    }

    /**
     * Gets the value of the ndnKass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdnKass() {
        return ndnKass;
    }

    /**
     * Sets the value of the ndnKass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdnKass(String value) {
        this.ndnKass = value;
    }

    /**
     * Gets the value of the smenaKass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmenaKass() {
        return smenaKass;
    }

    /**
     * Sets the value of the smenaKass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmenaKass(String value) {
        this.smenaKass = value;
    }

    /**
     * Gets the value of the statusKass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusKass() {
        return statusKass;
    }

    /**
     * Sets the value of the statusKass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusKass(String value) {
        this.statusKass = value;
    }

    /**
     * Gets the value of the summKomis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummKomis() {
        return summKomis;
    }

    /**
     * Sets the value of the summKomis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummKomis(String value) {
        this.summKomis = value;
    }

    /**
     * Gets the value of the summTotal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummTotal() {
        return summTotal;
    }

    /**
     * Sets the value of the summTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummTotal(String value) {
        this.summTotal = value;
    }

    /**
     * Gets the value of the dCloseKass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDCloseKass() {
        return dCloseKass;
    }

    /**
     * Sets the value of the dCloseKass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDCloseKass(String value) {
        this.dCloseKass = value;
    }

    /**
     * Gets the value of the dOpenKass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOpenKass() {
        return dOpenKass;
    }

    /**
     * Sets the value of the dOpenKass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOpenKass(String value) {
        this.dOpenKass = value;
    }

}
