
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dictionaryListWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dictionaryListWrapper">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}listResponseWrapper">
 *       &lt;sequence>
 *         &lt;element name="row" type="{http://upbs.cs.com/}vocabularyWithErrors" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dictionaryListWrapper", propOrder = {
    "row"
})
public class DictionaryListWrapper
    extends ListResponseWrapper
{

    protected List<VocabularyWithErrors> row;

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VocabularyWithErrors }
     * 
     * 
     */
    public List<VocabularyWithErrors> getRow() {
        if (row == null) {
            row = new ArrayList<VocabularyWithErrors>();
        }
        return this.row;
    }

}
