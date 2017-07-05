
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIMPLE_VALUE"/>
 *     &lt;enumeration value="ARRAY"/>
 *     &lt;enumeration value="DICTIONARY"/>
 *     &lt;enumeration value="DICTIONARY_ARRAY"/>
 *     &lt;enumeration value="FORMULA"/>
 *     &lt;enumeration value="INCREMENT"/>
 *     &lt;enumeration value="ACCRUAL"/>
 *     &lt;enumeration value="SIMPLE_COUNTER"/>
 *     &lt;enumeration value="COUNTER"/>
 *     &lt;enumeration value="COMBO_COUNTERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attributeType")
@XmlEnum
public enum AttributeType {

    SIMPLE_VALUE,
    ARRAY,
    DICTIONARY,
    DICTIONARY_ARRAY,
    FORMULA,
    INCREMENT,
    ACCRUAL,
    SIMPLE_COUNTER,
    COUNTER,
    COMBO_COUNTERS;

    public String value() {
        return name();
    }

    public static AttributeType fromValue(String v) {
        return valueOf(v);
    }

}
