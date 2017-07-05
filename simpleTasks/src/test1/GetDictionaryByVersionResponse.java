
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDictionaryByVersionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDictionaryByVersionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vocabularyWithErrors" type="{http://upbs.cs.com/}dictionaryListWrapper" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDictionaryByVersionResponse", propOrder = {
    "vocabularyWithErrors"
})
public class GetDictionaryByVersionResponse {

    protected DictionaryListWrapper vocabularyWithErrors;

    /**
     * Gets the value of the vocabularyWithErrors property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryListWrapper }
     *     
     */
    public DictionaryListWrapper getVocabularyWithErrors() {
        return vocabularyWithErrors;
    }

    /**
     * Sets the value of the vocabularyWithErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryListWrapper }
     *     
     */
    public void setVocabularyWithErrors(DictionaryListWrapper value) {
        this.vocabularyWithErrors = value;
    }

}
