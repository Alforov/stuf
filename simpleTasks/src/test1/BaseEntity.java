
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseEntity")
@XmlSeeAlso({
    BillSubscription.class,
    BillSnapShot.class,
    Vocabulary.class,
    BaseAttributeValue.class,
    BaseDictionaryEntity.class,
    BillerSnapShotBase.class,
    Entry.class,
    Region.class,
    VocabularyWithErrors.class,
    BaseAttribute.class
})
public abstract class BaseEntity {


}
