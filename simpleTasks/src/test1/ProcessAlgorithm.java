
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="processAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BILLS"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="CONSTRUCTOR"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "processAlgorithm")
@XmlEnum
public enum ProcessAlgorithm {

    BILLS,
    MANUAL,
    CONSTRUCTOR,
    OTHER;

    public String value() {
        return name();
    }

    public static ProcessAlgorithm fromValue(String v) {
        return valueOf(v);
    }

}
