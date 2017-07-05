
package test1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for billSnapShot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="billSnapShot">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientPaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billState" type="{http://upbs.cs.com/}billState" minOccurs="0"/>
 *         &lt;element name="rejectComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rejectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billSnapShot", propOrder = {
    "id",
    "billId",
    "clientPaymentId",
    "version",
    "billState",
    "rejectComment",
    "rejectCode"
})
@XmlSeeAlso({
    Bill.class
})
public class BillSnapShot
    extends BaseEntity
{

    protected Long id;
    protected Long billId;
    protected String clientPaymentId;
    protected Long version;
    @XmlSchemaType(name = "string")
    protected BillState billState;
    protected String rejectComment;
    protected String rejectCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the billId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillId() {
        return billId;
    }

    /**
     * Sets the value of the billId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillId(Long value) {
        this.billId = value;
    }

    /**
     * Gets the value of the clientPaymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPaymentId() {
        return clientPaymentId;
    }

    /**
     * Sets the value of the clientPaymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPaymentId(String value) {
        this.clientPaymentId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the billState property.
     * 
     * @return
     *     possible object is
     *     {@link BillState }
     *     
     */
    public BillState getBillState() {
        return billState;
    }

    /**
     * Sets the value of the billState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillState }
     *     
     */
    public void setBillState(BillState value) {
        this.billState = value;
    }

    /**
     * Gets the value of the rejectComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectComment() {
        return rejectComment;
    }

    /**
     * Sets the value of the rejectComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectComment(String value) {
        this.rejectComment = value;
    }

    /**
     * Gets the value of the rejectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectCode() {
        return rejectCode;
    }

    /**
     * Sets the value of the rejectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectCode(String value) {
        this.rejectCode = value;
    }

}
