
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeValueLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attributeValueLinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OWN"/>
 *     &lt;enumeration value="BY_PARENT_INDEX"/>
 *     &lt;enumeration value="PARENT_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attributeValueLinkType")
@XmlEnum
public enum AttributeValueLinkType {

    OWN,
    BY_PARENT_INDEX,
    PARENT_VALUE;

    public String value() {
        return name();
    }

    public static AttributeValueLinkType fromValue(String v) {
        return valueOf(v);
    }

}
