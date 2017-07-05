
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attributeValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTEGER"/>
 *     &lt;enumeration value="DECIMAL"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="CHAR"/>
 *     &lt;enumeration value="DATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attributeValueType")
@XmlEnum
public enum AttributeValueType {

    INTEGER,
    DECIMAL,
    BOOLEAN,
    STRING,
    CHAR,
    DATE;

    public String value() {
        return name();
    }

    public static AttributeValueType fromValue(String v) {
        return valueOf(v);
    }

}
