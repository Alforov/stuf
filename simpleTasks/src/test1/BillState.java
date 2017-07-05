
package test1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="billState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPBS_INPUT"/>
 *     &lt;enumeration value="PAID_BEFORE_PROVIDER"/>
 *     &lt;enumeration value="PAID"/>
 *     &lt;enumeration value="ABS_ERROR"/>
 *     &lt;enumeration value="PROVIDER_REJECTED"/>
 *     &lt;enumeration value="ABS_REJECTION_ERROR"/>
 *     &lt;enumeration value="SENDED_WAITING"/>
 *     &lt;enumeration value="SENDED_WAITING_BEFORE_ABS"/>
 *     &lt;enumeration value="PAID_BEFORE_ABS"/>
 *     &lt;enumeration value="PAID_ABS_ERROR"/>
 *     &lt;enumeration value="ABS_UNAVAILABLE"/>
 *     &lt;enumeration value="ABS_DOCS_ERROR"/>
 *     &lt;enumeration value="PROVIDER_IN_PROCESS"/>
 *     &lt;enumeration value="ABS_PAID_PROVIDER_REJECTED_OPERDAY_CLOSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "billState")
@XmlEnum
public enum BillState {

    UPBS_INPUT,
    PAID_BEFORE_PROVIDER,
    PAID,
    ABS_ERROR,
    PROVIDER_REJECTED,
    ABS_REJECTION_ERROR,
    SENDED_WAITING,
    SENDED_WAITING_BEFORE_ABS,
    PAID_BEFORE_ABS,
    PAID_ABS_ERROR,
    ABS_UNAVAILABLE,
    ABS_DOCS_ERROR,
    PROVIDER_IN_PROCESS,
    ABS_PAID_PROVIDER_REJECTED_OPERDAY_CLOSED;

    public String value() {
        return name();
    }

    public static BillState fromValue(String v) {
        return valueOf(v);
    }

}
