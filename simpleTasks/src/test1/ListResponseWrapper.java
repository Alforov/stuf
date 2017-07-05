
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listResponseWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listResponseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="hasNextPage" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listResponseWrapper")
@XmlSeeAlso({
    ListResponseBillerShapShotsByVersionWrapper.class,
    EntryListResponseWrapper.class,
    BillConstuctorStepsWrapper.class,
    DictionaryListWrapper.class,
    BillSubscriptionListResponseWrapper.class
})
public abstract class ListResponseWrapper {

    @XmlAttribute(name = "hasNextPage", required = true)
    protected boolean hasNextPage;

    /**
     * Gets the value of the hasNextPage property.
     * 
     */
    public boolean isHasNextPage() {
        return hasNextPage;
    }

    /**
     * Sets the value of the hasNextPage property.
     * 
     */
    public void setHasNextPage(boolean value) {
        this.hasNextPage = value;
    }

}
