
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTranslations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTranslations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="translationRequest" type="{http://upbs.cs.com/}translationRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTranslations", propOrder = {
    "translationRequest"
})
public class GetTranslations {

    protected List<TranslationRequest> translationRequest;

    /**
     * Gets the value of the translationRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translationRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslationRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranslationRequest }
     * 
     * 
     */
    public List<TranslationRequest> getTranslationRequest() {
        if (translationRequest == null) {
            translationRequest = new ArrayList<TranslationRequest>();
        }
        return this.translationRequest;
    }

}
