
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attributeSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPBS"/>
 *     &lt;enumeration value="FEE"/>
 *     &lt;enumeration value="PAYMENT_MANUAL"/>
 *     &lt;enumeration value="PAYMENT_BILLS"/>
 *     &lt;enumeration value="BILL"/>
 *     &lt;enumeration value="CONSTRUCTOR"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="CUSTOM_BILLS"/>
 *     &lt;enumeration value="CUSTOM_MANUAL"/>
 *     &lt;enumeration value="EXT_SYSTEM"/>
 *     &lt;enumeration value="CUSTOM_USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attributeSourceType")
@XmlEnum
public enum AttributeSourceType {

    UPBS("UPBS"),
    FEE("FEE"),
    PAYMENT_MANUAL("PAYMENT_MANUAL"),
    PAYMENT_BILLS("PAYMENT_BILLS"),
    BILL("BILL"),
    CONSTRUCTOR("CONSTRUCTOR"),
    @XmlEnumValue("B2")
    B_2("B2"),
    CUSTOM_BILLS("CUSTOM_BILLS"),
    CUSTOM_MANUAL("CUSTOM_MANUAL"),
    EXT_SYSTEM("EXT_SYSTEM"),
    CUSTOM_USER("CUSTOM_USER");
    private final String value;

    AttributeSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttributeSourceType fromValue(String v) {
        for (AttributeSourceType c: AttributeSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
