
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getServerVersionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServerVersionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServerVersionResponse", propOrder = {
    "serverVersion"
})
public class GetServerVersionResponse {

    protected String serverVersion;

    /**
     * Gets the value of the serverVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerVersion() {
        return serverVersion;
    }

    /**
     * Sets the value of the serverVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerVersion(String value) {
        this.serverVersion = value;
    }

}
