
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dictionaryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dictionaryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="STREET"/>
 *     &lt;enumeration value="HOUSE"/>
 *     &lt;enumeration value="FLAT"/>
 *     &lt;enumeration value="E_CITY"/>
 *     &lt;enumeration value="E_RECIPIENT"/>
 *     &lt;enumeration value="E_INSTITUTION"/>
 *     &lt;enumeration value="E_GROUP"/>
 *     &lt;enumeration value="E_SCHOLAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dictionaryType")
@XmlEnum
public enum DictionaryType {

    CITY,
    STREET,
    HOUSE,
    FLAT,
    E_CITY,
    E_RECIPIENT,
    E_INSTITUTION,
    E_GROUP,
    E_SCHOLAR;

    public String value() {
        return name();
    }

    public static DictionaryType fromValue(String v) {
        return valueOf(v);
    }

}
