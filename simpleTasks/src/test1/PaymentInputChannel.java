
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentInputChannel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentInputChannel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="IFOBS_WEB"/>
 *     &lt;enumeration value="IFOBS_24x7"/>
 *     &lt;enumeration value="IFOBS_MOB"/>
 *     &lt;enumeration value="IFOBS_SIEBEL"/>
 *     &lt;enumeration value="SUBSCRIPTION"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="WINBANK"/>
 *     &lt;enumeration value="WINBANK_B2"/>
 *     &lt;enumeration value="EXT_1"/>
 *     &lt;enumeration value="EXT_2"/>
 *     &lt;enumeration value="EXT_3"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentInputChannel")
@XmlEnum
public enum PaymentInputChannel {

    DEFAULT("DEFAULT"),
    IFOBS_WEB("IFOBS_WEB"),
    @XmlEnumValue("IFOBS_24x7")
    IFOBS_24_X_7("IFOBS_24x7"),
    IFOBS_MOB("IFOBS_MOB"),
    IFOBS_SIEBEL("IFOBS_SIEBEL"),
    SUBSCRIPTION("SUBSCRIPTION"),
    @XmlEnumValue("B2")
    B_2("B2"),
    WINBANK("WINBANK"),
    @XmlEnumValue("WINBANK_B2")
    WINBANK_B_2("WINBANK_B2"),
    EXT_1("EXT_1"),
    EXT_2("EXT_2"),
    EXT_3("EXT_3"),
    OTHER("OTHER");
    private final String value;

    PaymentInputChannel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInputChannel fromValue(String v) {
        for (PaymentInputChannel c: PaymentInputChannel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
