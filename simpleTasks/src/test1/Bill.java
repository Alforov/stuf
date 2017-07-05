
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bill">
 *   &lt;complexContent>
 *     &lt;extension base="{http://upbs.cs.com/}billSnapShot">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attribute" type="{http://upbs.cs.com/}billAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="feeAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="debt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="toPayAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="providerReceiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="externalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerInfo" type="{http://upbs.cs.com/}payerInfo" minOccurs="0"/>
 *         &lt;element name="corrTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corrAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corrBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corrBankMfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extBillerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extPayeeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://upbs.cs.com/}billerSnapShot" minOccurs="0"/>
 *         &lt;element name="documentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputChannel" type="{http://upbs.cs.com/}paymentInputChannel" minOccurs="0"/>
 *         &lt;element name="batchId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processAlgorithm" type="{http://upbs.cs.com/}processAlgorithm" minOccurs="0"/>
 *         &lt;element name="debtOplata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payee_export_flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bill", propOrder = {
    "description",
    "attributes",
    "paidAmount",
    "feeAmount",
    "debt",
    "toPayAmount",
    "providerReceiveDate",
    "date",
    "sendDate",
    "payDate",
    "externalStatus",
    "payerInfo",
    "corrTaxId",
    "corrAccountNo",
    "corrBankName",
    "corrBankMfo",
    "billerId",
    "extBillerId",
    "payeeId",
    "extPayeeId",
    "payeeName",
    "billerSnapShot",
    "documentNo",
    "payMode",
    "extOrderId",
    "inputChannel",
    "batchId",
    "userName",
    "processAlgorithm",
    "debtOplata",
    "payeeExportFlag"
})
public class Bill
    extends BillSnapShot
{

    protected String description;
    protected Bill.Attributes attributes;
    protected Long paidAmount;
    protected Long feeAmount;
    protected Long debt;
    protected Long toPayAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar providerReceiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    protected String externalStatus;
    protected PayerInfo payerInfo;
    protected String corrTaxId;
    protected String corrAccountNo;
    protected String corrBankName;
    protected String corrBankMfo;
    protected Long billerId;
    protected Long extBillerId;
    protected Long payeeId;
    protected Long extPayeeId;
    protected String payeeName;
    protected BillerSnapShot billerSnapShot;
    protected String documentNo;
    protected String payMode;
    protected String extOrderId;
    @XmlSchemaType(name = "string")
    protected PaymentInputChannel inputChannel;
    protected Long batchId;
    protected String userName;
    @XmlSchemaType(name = "string")
    protected ProcessAlgorithm processAlgorithm;
    protected Boolean debtOplata;
    @XmlElement(name = "payee_export_flag")
    protected String payeeExportFlag;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Bill.Attributes }
     *     
     */
    public Bill.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bill.Attributes }
     *     
     */
    public void setAttributes(Bill.Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaidAmount(Long value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeeAmount(Long value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDebt(Long value) {
        this.debt = value;
    }

    /**
     * Gets the value of the toPayAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToPayAmount() {
        return toPayAmount;
    }

    /**
     * Sets the value of the toPayAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToPayAmount(Long value) {
        this.toPayAmount = value;
    }

    /**
     * Gets the value of the providerReceiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProviderReceiveDate() {
        return providerReceiveDate;
    }

    /**
     * Sets the value of the providerReceiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProviderReceiveDate(XMLGregorianCalendar value) {
        this.providerReceiveDate = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the externalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalStatus() {
        return externalStatus;
    }

    /**
     * Sets the value of the externalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalStatus(String value) {
        this.externalStatus = value;
    }

    /**
     * Gets the value of the payerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PayerInfo }
     *     
     */
    public PayerInfo getPayerInfo() {
        return payerInfo;
    }

    /**
     * Sets the value of the payerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerInfo }
     *     
     */
    public void setPayerInfo(PayerInfo value) {
        this.payerInfo = value;
    }

    /**
     * Gets the value of the corrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrTaxId() {
        return corrTaxId;
    }

    /**
     * Sets the value of the corrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrTaxId(String value) {
        this.corrTaxId = value;
    }

    /**
     * Gets the value of the corrAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrAccountNo() {
        return corrAccountNo;
    }

    /**
     * Sets the value of the corrAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrAccountNo(String value) {
        this.corrAccountNo = value;
    }

    /**
     * Gets the value of the corrBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrBankName() {
        return corrBankName;
    }

    /**
     * Sets the value of the corrBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrBankName(String value) {
        this.corrBankName = value;
    }

    /**
     * Gets the value of the corrBankMfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrBankMfo() {
        return corrBankMfo;
    }

    /**
     * Sets the value of the corrBankMfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrBankMfo(String value) {
        this.corrBankMfo = value;
    }

    /**
     * Gets the value of the billerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillerId() {
        return billerId;
    }

    /**
     * Sets the value of the billerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillerId(Long value) {
        this.billerId = value;
    }

    /**
     * Gets the value of the extBillerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtBillerId() {
        return extBillerId;
    }

    /**
     * Sets the value of the extBillerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtBillerId(Long value) {
        this.extBillerId = value;
    }

    /**
     * Gets the value of the payeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayeeId() {
        return payeeId;
    }

    /**
     * Sets the value of the payeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayeeId(Long value) {
        this.payeeId = value;
    }

    /**
     * Gets the value of the extPayeeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtPayeeId() {
        return extPayeeId;
    }

    /**
     * Sets the value of the extPayeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtPayeeId(Long value) {
        this.extPayeeId = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the billerSnapShot property.
     * 
     * @return
     *     possible object is
     *     {@link BillerSnapShot }
     *     
     */
    public BillerSnapShot getBillerSnapShot() {
        return billerSnapShot;
    }

    /**
     * Sets the value of the billerSnapShot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillerSnapShot }
     *     
     */
    public void setBillerSnapShot(BillerSnapShot value) {
        this.billerSnapShot = value;
    }

    /**
     * Gets the value of the documentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNo() {
        return documentNo;
    }

    /**
     * Sets the value of the documentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNo(String value) {
        this.documentNo = value;
    }

    /**
     * Gets the value of the payMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * Sets the value of the payMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * Gets the value of the extOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtOrderId() {
        return extOrderId;
    }

    /**
     * Sets the value of the extOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtOrderId(String value) {
        this.extOrderId = value;
    }

    /**
     * Gets the value of the inputChannel property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInputChannel }
     *     
     */
    public PaymentInputChannel getInputChannel() {
        return inputChannel;
    }

    /**
     * Sets the value of the inputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInputChannel }
     *     
     */
    public void setInputChannel(PaymentInputChannel value) {
        this.inputChannel = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBatchId(Long value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the processAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessAlgorithm }
     *     
     */
    public ProcessAlgorithm getProcessAlgorithm() {
        return processAlgorithm;
    }

    /**
     * Sets the value of the processAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessAlgorithm }
     *     
     */
    public void setProcessAlgorithm(ProcessAlgorithm value) {
        this.processAlgorithm = value;
    }

    /**
     * Gets the value of the debtOplata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDebtOplata() {
        return debtOplata;
    }

    /**
     * Sets the value of the debtOplata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDebtOplata(Boolean value) {
        this.debtOplata = value;
    }

    /**
     * Gets the value of the payeeExportFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeExportFlag() {
        return payeeExportFlag;
    }

    /**
     * Sets the value of the payeeExportFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeExportFlag(String value) {
        this.payeeExportFlag = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="attribute" type="{http://upbs.cs.com/}billAttribute" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attribute"
    })
    public static class Attributes {

        protected List<BillAttribute> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BillAttribute }
         * 
         * 
         */
        public List<BillAttribute> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<BillAttribute>();
            }
            return this.attribute;
        }

    }

}
