
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsDictionaryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wsDictionaryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROVIDER"/>
 *     &lt;enumeration value="UPBS_BILL_STATES"/>
 *     &lt;enumeration value="UPBS_ERRORS"/>
 *     &lt;enumeration value="UPBS_TRANSLATIONS"/>
 *     &lt;enumeration value="B2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wsDictionaryTypeEnum")
@XmlEnum
public enum WsDictionaryTypeEnum {

    PROVIDER("PROVIDER"),
    UPBS_BILL_STATES("UPBS_BILL_STATES"),
    UPBS_ERRORS("UPBS_ERRORS"),
    UPBS_TRANSLATIONS("UPBS_TRANSLATIONS"),
    @XmlEnumValue("B2")
    B_2("B2");
    private final String value;

    WsDictionaryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WsDictionaryTypeEnum fromValue(String v) {
        for (WsDictionaryTypeEnum c: WsDictionaryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
