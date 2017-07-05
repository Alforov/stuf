
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSimpleDictionaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSimpleDictionaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dictRes" type="{http://upbs.cs.com/}wsDictionaryResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSimpleDictionaryResponse", propOrder = {
    "dictRes"
})
public class GetSimpleDictionaryResponse {

    protected WsDictionaryResponse dictRes;

    /**
     * Gets the value of the dictRes property.
     * 
     * @return
     *     possible object is
     *     {@link WsDictionaryResponse }
     *     
     */
    public WsDictionaryResponse getDictRes() {
        return dictRes;
    }

    /**
     * Sets the value of the dictRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDictionaryResponse }
     *     
     */
    public void setDictRes(WsDictionaryResponse value) {
        this.dictRes = value;
    }

}
