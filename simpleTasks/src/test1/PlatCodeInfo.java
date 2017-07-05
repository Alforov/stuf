
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for platCodeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="platCodeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="nameFirm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="namePlat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="adderss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="platCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "platCodeInfo", propOrder = {
    "dateD",
    "nameFirm",
    "namePlat",
    "account",
    "adderss",
    "fio",
    "platCode"
})
public class PlatCodeInfo {

    @XmlElement(namespace = "")
    protected String dateD;
    @XmlElement(namespace = "")
    protected String nameFirm;
    @XmlElement(namespace = "")
    protected String namePlat;
    @XmlElement(namespace = "")
    protected String account;
    @XmlElement(namespace = "")
    protected String adderss;
    @XmlElement(namespace = "")
    protected String fio;
    @XmlElement(namespace = "")
    protected String platCode;

    /**
     * Gets the value of the dateD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateD() {
        return dateD;
    }

    /**
     * Sets the value of the dateD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateD(String value) {
        this.dateD = value;
    }

    /**
     * Gets the value of the nameFirm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFirm() {
        return nameFirm;
    }

    /**
     * Sets the value of the nameFirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFirm(String value) {
        this.nameFirm = value;
    }

    /**
     * Gets the value of the namePlat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePlat() {
        return namePlat;
    }

    /**
     * Sets the value of the namePlat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePlat(String value) {
        this.namePlat = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the adderss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdderss() {
        return adderss;
    }

    /**
     * Sets the value of the adderss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdderss(String value) {
        this.adderss = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFio(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the platCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatCode() {
        return platCode;
    }

    /**
     * Sets the value of the platCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatCode(String value) {
        this.platCode = value;
    }

}
