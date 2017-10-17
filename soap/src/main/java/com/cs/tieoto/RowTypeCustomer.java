
package com.cs.tieoto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RowType_Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_Customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CLIENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLIENT_B" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CL_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CLN_CAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REC_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="F_NAMES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SURNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="M_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="B_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RESIDENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_CARD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOC_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMP_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POSITION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMP_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WORK_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_PCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="C_SINCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMP_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMPG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CO_POSITON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNT_TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNT_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNT_FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNG_POSIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNG_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNG_TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNG_FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REG_NR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CR_STREET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CR_CITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CR_CNTRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CR_PCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PERSON_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RESIDENT_SINCE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="YEAR_INC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CCY_FOR_INCOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMM_PROP_VALUE" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SEARCH_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MARITAL_STATUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CO_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMP_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SERIAL_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOC_SINCE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ISSUED_BY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMP_ADR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMP_FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EMP_E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_MOB_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R_FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNT_E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CNT_MOB_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNG_MOB_PHONE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNG_E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CR_E_MAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IN_FILE_NUM" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="U_COD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_COD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="U_FIELD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CALL_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HOME_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUILDING" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STREET1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APARTMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIDLE_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USRID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AMEX_MEMBER_SINCE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DCI_MEMBER_SINCE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="REWARD_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NATIONALITY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_Customer", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "client",
    "clientb",
    "cltype",
    "clncat",
    "recdate",
    "fnames",
    "surname",
    "title",
    "mname",
    "bdate",
    "resident",
    "idcard",
    "doctype",
    "rphone",
    "empname",
    "position",
    "empdate",
    "workphone",
    "rstreet",
    "rcity",
    "rcntry",
    "rpcode",
    "csince",
    "cmpname",
    "cmpgname",
    "copositon",
    "contact",
    "cnttitle",
    "cntphone",
    "cntfax",
    "mngposit",
    "mngname",
    "mngphone",
    "mngtitle",
    "mngfax",
    "regnr",
    "crstreet",
    "crcity",
    "crcntry",
    "crpcode",
    "coment",
    "region",
    "personcode",
    "residentsince",
    "yearinc",
    "ccyforincom",
    "immpropvalue",
    "searchname",
    "maritalstatus",
    "cocode",
    "empcode",
    "sex",
    "serialno",
    "docsince",
    "issuedby",
    "empadr",
    "empfax",
    "empemails",
    "remails",
    "rmobphone",
    "rfax",
    "cntemails",
    "cntmobphone",
    "mngmobphone",
    "mngemails",
    "cremails",
    "infilenum",
    "ucod1",
    "ucod2",
    "ucod3",
    "ufield1",
    "ufield2",
    "callid",
    "homenumber",
    "building",
    "street1",
    "apartment",
    "midlename",
    "status",
    "usrid",
    "ctime",
    "amexmembersince",
    "dcimembersince",
    "rewardno",
    "nationality"
})
public class RowTypeCustomer {

    @XmlElementRef(name = "CLIENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> client;
    @XmlElementRef(name = "CLIENT_B", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientb;
    @XmlElement(name = "CL_TYPE", required = true, nillable = true)
    protected String cltype;
    @XmlElementRef(name = "CLN_CAT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clncat;
    @XmlElementRef(name = "REC_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> recdate;
    @XmlElementRef(name = "F_NAMES", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fnames;
    @XmlElementRef(name = "SURNAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "TITLE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "M_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mname;
    @XmlElementRef(name = "B_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> bdate;
    @XmlElement(name = "RESIDENT", required = true, nillable = true)
    protected String resident;
    @XmlElementRef(name = "ID_CARD", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idcard;
    @XmlElementRef(name = "DOC_TYPE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doctype;
    @XmlElementRef(name = "R_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rphone;
    @XmlElementRef(name = "EMP_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empname;
    @XmlElementRef(name = "POSITION", type = JAXBElement.class, required = false)
    protected JAXBElement<String> position;
    @XmlElementRef(name = "EMP_DATE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> empdate;
    @XmlElementRef(name = "WORK_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workphone;
    @XmlElementRef(name = "R_STREET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rstreet;
    @XmlElementRef(name = "R_CITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rcity;
    @XmlElementRef(name = "R_CNTRY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rcntry;
    @XmlElementRef(name = "R_PCODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rpcode;
    @XmlElementRef(name = "C_SINCE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> csince;
    @XmlElementRef(name = "CMP_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpname;
    @XmlElementRef(name = "CMPG_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cmpgname;
    @XmlElementRef(name = "CO_POSITON", type = JAXBElement.class, required = false)
    protected JAXBElement<String> copositon;
    @XmlElementRef(name = "CONTACT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contact;
    @XmlElementRef(name = "CNT_TITLE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnttitle;
    @XmlElementRef(name = "CNT_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cntphone;
    @XmlElementRef(name = "CNT_FAX", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cntfax;
    @XmlElementRef(name = "MNG_POSIT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngposit;
    @XmlElementRef(name = "MNG_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngname;
    @XmlElementRef(name = "MNG_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngphone;
    @XmlElementRef(name = "MNG_TITLE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngtitle;
    @XmlElementRef(name = "MNG_FAX", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngfax;
    @XmlElementRef(name = "REG_NR", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regnr;
    @XmlElementRef(name = "CR_STREET", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crstreet;
    @XmlElementRef(name = "CR_CITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crcity;
    @XmlElementRef(name = "CR_CNTRY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crcntry;
    @XmlElementRef(name = "CR_PCODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> crpcode;
    @XmlElementRef(name = "COMENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coment;
    @XmlElementRef(name = "REGION", type = JAXBElement.class, required = false)
    protected JAXBElement<String> region;
    @XmlElementRef(name = "PERSON_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personcode;
    @XmlElementRef(name = "RESIDENT_SINCE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> residentsince;
    @XmlElementRef(name = "YEAR_INC", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> yearinc;
    @XmlElementRef(name = "CCY_FOR_INCOM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ccyforincom;
    @XmlElementRef(name = "IMM_PROP_VALUE", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> immpropvalue;
    @XmlElementRef(name = "SEARCH_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> searchname;
    @XmlElementRef(name = "MARITAL_STATUS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalstatus;
    @XmlElementRef(name = "CO_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cocode;
    @XmlElementRef(name = "EMP_CODE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empcode;
    @XmlElementRef(name = "SEX", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sex;
    @XmlElementRef(name = "SERIAL_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialno;
    @XmlElementRef(name = "DOC_SINCE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> docsince;
    @XmlElementRef(name = "ISSUED_BY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> issuedby;
    @XmlElementRef(name = "EMP_ADR", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empadr;
    @XmlElementRef(name = "EMP_FAX", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empfax;
    @XmlElementRef(name = "EMP_E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empemails;
    @XmlElementRef(name = "R_E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remails;
    @XmlElementRef(name = "R_MOB_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rmobphone;
    @XmlElementRef(name = "R_FAX", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rfax;
    @XmlElementRef(name = "CNT_E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cntemails;
    @XmlElementRef(name = "CNT_MOB_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cntmobphone;
    @XmlElementRef(name = "MNG_MOB_PHONE", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngmobphone;
    @XmlElementRef(name = "MNG_E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mngemails;
    @XmlElementRef(name = "CR_E_MAILS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cremails;
    @XmlElementRef(name = "IN_FILE_NUM", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> infilenum;
    @XmlElementRef(name = "U_COD1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod1;
    @XmlElementRef(name = "U_COD2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod2;
    @XmlElementRef(name = "U_COD3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ucod3;
    @XmlElementRef(name = "U_FIELD1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield1;
    @XmlElementRef(name = "U_FIELD2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ufield2;
    @XmlElementRef(name = "CALL_ID", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callid;
    @XmlElementRef(name = "HOME_NUMBER", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homenumber;
    @XmlElementRef(name = "BUILDING", type = JAXBElement.class, required = false)
    protected JAXBElement<String> building;
    @XmlElementRef(name = "STREET1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street1;
    @XmlElementRef(name = "APARTMENT", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apartment;
    @XmlElementRef(name = "MIDLE_NAME", type = JAXBElement.class, required = false)
    protected JAXBElement<String> midlename;
    @XmlElement(name = "STATUS", required = true, nillable = true)
    protected String status;
    @XmlElement(name = "USRID", required = true, nillable = true)
    protected String usrid;
    @XmlElement(name = "CTIME", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ctime;
    @XmlElementRef(name = "AMEX_MEMBER_SINCE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> amexmembersince;
    @XmlElementRef(name = "DCI_MEMBER_SINCE", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dcimembersince;
    @XmlElementRef(name = "REWARD_NO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rewardno;
    @XmlElementRef(name = "NATIONALITY", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nationality;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENT() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENT(JAXBElement<String> value) {
        this.client = value;
    }

    /**
     * Gets the value of the clientb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLIENTB() {
        return clientb;
    }

    /**
     * Sets the value of the clientb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLIENTB(JAXBElement<String> value) {
        this.clientb = value;
    }

    /**
     * Gets the value of the cltype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLTYPE() {
        return cltype;
    }

    /**
     * Sets the value of the cltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLTYPE(String value) {
        this.cltype = value;
    }

    /**
     * Gets the value of the clncat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLNCAT() {
        return clncat;
    }

    /**
     * Sets the value of the clncat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLNCAT(JAXBElement<String> value) {
        this.clncat = value;
    }

    /**
     * Gets the value of the recdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRECDATE() {
        return recdate;
    }

    /**
     * Sets the value of the recdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRECDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.recdate = value;
    }

    /**
     * Gets the value of the fnames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFNAMES() {
        return fnames;
    }

    /**
     * Sets the value of the fnames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFNAMES(JAXBElement<String> value) {
        this.fnames = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSURNAME() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSURNAME(JAXBElement<String> value) {
        this.surname = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTITLE() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTITLE(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the mname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNAME() {
        return mname;
    }

    /**
     * Sets the value of the mname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNAME(JAXBElement<String> value) {
        this.mname = value;
    }

    /**
     * Gets the value of the bdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBDATE() {
        return bdate;
    }

    /**
     * Sets the value of the bdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.bdate = value;
    }

    /**
     * Gets the value of the resident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESIDENT() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESIDENT(String value) {
        this.resident = value;
    }

    /**
     * Gets the value of the idcard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDCARD() {
        return idcard;
    }

    /**
     * Sets the value of the idcard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDCARD(JAXBElement<String> value) {
        this.idcard = value;
    }

    /**
     * Gets the value of the doctype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOCTYPE() {
        return doctype;
    }

    /**
     * Sets the value of the doctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOCTYPE(JAXBElement<String> value) {
        this.doctype = value;
    }

    /**
     * Gets the value of the rphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRPHONE() {
        return rphone;
    }

    /**
     * Sets the value of the rphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRPHONE(JAXBElement<String> value) {
        this.rphone = value;
    }

    /**
     * Gets the value of the empname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPNAME() {
        return empname;
    }

    /**
     * Sets the value of the empname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPNAME(JAXBElement<String> value) {
        this.empname = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSITION() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSITION(JAXBElement<String> value) {
        this.position = value;
    }

    /**
     * Gets the value of the empdate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEMPDATE() {
        return empdate;
    }

    /**
     * Sets the value of the empdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEMPDATE(JAXBElement<XMLGregorianCalendar> value) {
        this.empdate = value;
    }

    /**
     * Gets the value of the workphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWORKPHONE() {
        return workphone;
    }

    /**
     * Sets the value of the workphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWORKPHONE(JAXBElement<String> value) {
        this.workphone = value;
    }

    /**
     * Gets the value of the rstreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRSTREET() {
        return rstreet;
    }

    /**
     * Sets the value of the rstreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRSTREET(JAXBElement<String> value) {
        this.rstreet = value;
    }

    /**
     * Gets the value of the rcity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRCITY() {
        return rcity;
    }

    /**
     * Sets the value of the rcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRCITY(JAXBElement<String> value) {
        this.rcity = value;
    }

    /**
     * Gets the value of the rcntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRCNTRY() {
        return rcntry;
    }

    /**
     * Sets the value of the rcntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRCNTRY(JAXBElement<String> value) {
        this.rcntry = value;
    }

    /**
     * Gets the value of the rpcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRPCODE() {
        return rpcode;
    }

    /**
     * Sets the value of the rpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRPCODE(JAXBElement<String> value) {
        this.rpcode = value;
    }

    /**
     * Gets the value of the csince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCSINCE() {
        return csince;
    }

    /**
     * Sets the value of the csince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCSINCE(JAXBElement<String> value) {
        this.csince = value;
    }

    /**
     * Gets the value of the cmpname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCMPNAME() {
        return cmpname;
    }

    /**
     * Sets the value of the cmpname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCMPNAME(JAXBElement<String> value) {
        this.cmpname = value;
    }

    /**
     * Gets the value of the cmpgname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCMPGNAME() {
        return cmpgname;
    }

    /**
     * Sets the value of the cmpgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCMPGNAME(JAXBElement<String> value) {
        this.cmpgname = value;
    }

    /**
     * Gets the value of the copositon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOPOSITON() {
        return copositon;
    }

    /**
     * Sets the value of the copositon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOPOSITON(JAXBElement<String> value) {
        this.copositon = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONTACT() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONTACT(JAXBElement<String> value) {
        this.contact = value;
    }

    /**
     * Gets the value of the cnttitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNTTITLE() {
        return cnttitle;
    }

    /**
     * Sets the value of the cnttitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNTTITLE(JAXBElement<String> value) {
        this.cnttitle = value;
    }

    /**
     * Gets the value of the cntphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNTPHONE() {
        return cntphone;
    }

    /**
     * Sets the value of the cntphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNTPHONE(JAXBElement<String> value) {
        this.cntphone = value;
    }

    /**
     * Gets the value of the cntfax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNTFAX() {
        return cntfax;
    }

    /**
     * Sets the value of the cntfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNTFAX(JAXBElement<String> value) {
        this.cntfax = value;
    }

    /**
     * Gets the value of the mngposit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNGPOSIT() {
        return mngposit;
    }

    /**
     * Sets the value of the mngposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNGPOSIT(JAXBElement<String> value) {
        this.mngposit = value;
    }

    /**
     * Gets the value of the mngname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNGNAME() {
        return mngname;
    }

    /**
     * Sets the value of the mngname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNGNAME(JAXBElement<String> value) {
        this.mngname = value;
    }

    /**
     * Gets the value of the mngphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNGPHONE() {
        return mngphone;
    }

    /**
     * Sets the value of the mngphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNGPHONE(JAXBElement<String> value) {
        this.mngphone = value;
    }

    /**
     * Gets the value of the mngtitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNGTITLE() {
        return mngtitle;
    }

    /**
     * Sets the value of the mngtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNGTITLE(JAXBElement<String> value) {
        this.mngtitle = value;
    }

    /**
     * Gets the value of the mngfax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNGFAX() {
        return mngfax;
    }

    /**
     * Sets the value of the mngfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNGFAX(JAXBElement<String> value) {
        this.mngfax = value;
    }

    /**
     * Gets the value of the regnr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREGNR() {
        return regnr;
    }

    /**
     * Sets the value of the regnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREGNR(JAXBElement<String> value) {
        this.regnr = value;
    }

    /**
     * Gets the value of the crstreet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRSTREET() {
        return crstreet;
    }

    /**
     * Sets the value of the crstreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRSTREET(JAXBElement<String> value) {
        this.crstreet = value;
    }

    /**
     * Gets the value of the crcity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRCITY() {
        return crcity;
    }

    /**
     * Sets the value of the crcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRCITY(JAXBElement<String> value) {
        this.crcity = value;
    }

    /**
     * Gets the value of the crcntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRCNTRY() {
        return crcntry;
    }

    /**
     * Sets the value of the crcntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRCNTRY(JAXBElement<String> value) {
        this.crcntry = value;
    }

    /**
     * Gets the value of the crpcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRPCODE() {
        return crpcode;
    }

    /**
     * Sets the value of the crpcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRPCODE(JAXBElement<String> value) {
        this.crpcode = value;
    }

    /**
     * Gets the value of the coment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOMENT() {
        return coment;
    }

    /**
     * Sets the value of the coment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOMENT(JAXBElement<String> value) {
        this.coment = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREGION() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREGION(JAXBElement<String> value) {
        this.region = value;
    }

    /**
     * Gets the value of the personcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPERSONCODE() {
        return personcode;
    }

    /**
     * Sets the value of the personcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPERSONCODE(JAXBElement<String> value) {
        this.personcode = value;
    }

    /**
     * Gets the value of the residentsince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRESIDENTSINCE() {
        return residentsince;
    }

    /**
     * Sets the value of the residentsince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRESIDENTSINCE(JAXBElement<XMLGregorianCalendar> value) {
        this.residentsince = value;
    }

    /**
     * Gets the value of the yearinc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getYEARINC() {
        return yearinc;
    }

    /**
     * Sets the value of the yearinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setYEARINC(JAXBElement<BigDecimal> value) {
        this.yearinc = value;
    }

    /**
     * Gets the value of the ccyforincom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCCYFORINCOM() {
        return ccyforincom;
    }

    /**
     * Sets the value of the ccyforincom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCCYFORINCOM(JAXBElement<String> value) {
        this.ccyforincom = value;
    }

    /**
     * Gets the value of the immpropvalue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIMMPROPVALUE() {
        return immpropvalue;
    }

    /**
     * Sets the value of the immpropvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIMMPROPVALUE(JAXBElement<BigDecimal> value) {
        this.immpropvalue = value;
    }

    /**
     * Gets the value of the searchname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSEARCHNAME() {
        return searchname;
    }

    /**
     * Sets the value of the searchname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSEARCHNAME(JAXBElement<String> value) {
        this.searchname = value;
    }

    /**
     * Gets the value of the maritalstatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMARITALSTATUS() {
        return maritalstatus;
    }

    /**
     * Sets the value of the maritalstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMARITALSTATUS(JAXBElement<String> value) {
        this.maritalstatus = value;
    }

    /**
     * Gets the value of the cocode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCOCODE() {
        return cocode;
    }

    /**
     * Sets the value of the cocode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCOCODE(JAXBElement<String> value) {
        this.cocode = value;
    }

    /**
     * Gets the value of the empcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPCODE() {
        return empcode;
    }

    /**
     * Sets the value of the empcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPCODE(JAXBElement<String> value) {
        this.empcode = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSEX() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSEX(JAXBElement<String> value) {
        this.sex = value;
    }

    /**
     * Gets the value of the serialno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSERIALNO() {
        return serialno;
    }

    /**
     * Sets the value of the serialno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSERIALNO(JAXBElement<String> value) {
        this.serialno = value;
    }

    /**
     * Gets the value of the docsince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDOCSINCE() {
        return docsince;
    }

    /**
     * Sets the value of the docsince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDOCSINCE(JAXBElement<XMLGregorianCalendar> value) {
        this.docsince = value;
    }

    /**
     * Gets the value of the issuedby property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getISSUEDBY() {
        return issuedby;
    }

    /**
     * Sets the value of the issuedby property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setISSUEDBY(JAXBElement<String> value) {
        this.issuedby = value;
    }

    /**
     * Gets the value of the empadr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPADR() {
        return empadr;
    }

    /**
     * Sets the value of the empadr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPADR(JAXBElement<String> value) {
        this.empadr = value;
    }

    /**
     * Gets the value of the empfax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPFAX() {
        return empfax;
    }

    /**
     * Sets the value of the empfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPFAX(JAXBElement<String> value) {
        this.empfax = value;
    }

    /**
     * Gets the value of the empemails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEMPEMAILS() {
        return empemails;
    }

    /**
     * Sets the value of the empemails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEMPEMAILS(JAXBElement<String> value) {
        this.empemails = value;
    }

    /**
     * Gets the value of the remails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREMAILS() {
        return remails;
    }

    /**
     * Sets the value of the remails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREMAILS(JAXBElement<String> value) {
        this.remails = value;
    }

    /**
     * Gets the value of the rmobphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRMOBPHONE() {
        return rmobphone;
    }

    /**
     * Sets the value of the rmobphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRMOBPHONE(JAXBElement<String> value) {
        this.rmobphone = value;
    }

    /**
     * Gets the value of the rfax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRFAX() {
        return rfax;
    }

    /**
     * Sets the value of the rfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRFAX(JAXBElement<String> value) {
        this.rfax = value;
    }

    /**
     * Gets the value of the cntemails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNTEMAILS() {
        return cntemails;
    }

    /**
     * Sets the value of the cntemails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNTEMAILS(JAXBElement<String> value) {
        this.cntemails = value;
    }

    /**
     * Gets the value of the cntmobphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNTMOBPHONE() {
        return cntmobphone;
    }

    /**
     * Sets the value of the cntmobphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNTMOBPHONE(JAXBElement<String> value) {
        this.cntmobphone = value;
    }

    /**
     * Gets the value of the mngmobphone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNGMOBPHONE() {
        return mngmobphone;
    }

    /**
     * Sets the value of the mngmobphone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNGMOBPHONE(JAXBElement<String> value) {
        this.mngmobphone = value;
    }

    /**
     * Gets the value of the mngemails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMNGEMAILS() {
        return mngemails;
    }

    /**
     * Sets the value of the mngemails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMNGEMAILS(JAXBElement<String> value) {
        this.mngemails = value;
    }

    /**
     * Gets the value of the cremails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCREMAILS() {
        return cremails;
    }

    /**
     * Sets the value of the cremails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCREMAILS(JAXBElement<String> value) {
        this.cremails = value;
    }

    /**
     * Gets the value of the infilenum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getINFILENUM() {
        return infilenum;
    }

    /**
     * Sets the value of the infilenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setINFILENUM(JAXBElement<BigDecimal> value) {
        this.infilenum = value;
    }

    /**
     * Gets the value of the ucod1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD1() {
        return ucod1;
    }

    /**
     * Sets the value of the ucod1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD1(JAXBElement<String> value) {
        this.ucod1 = value;
    }

    /**
     * Gets the value of the ucod2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD2() {
        return ucod2;
    }

    /**
     * Sets the value of the ucod2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD2(JAXBElement<String> value) {
        this.ucod2 = value;
    }

    /**
     * Gets the value of the ucod3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUCOD3() {
        return ucod3;
    }

    /**
     * Sets the value of the ucod3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUCOD3(JAXBElement<String> value) {
        this.ucod3 = value;
    }

    /**
     * Gets the value of the ufield1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD1() {
        return ufield1;
    }

    /**
     * Sets the value of the ufield1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD1(JAXBElement<String> value) {
        this.ufield1 = value;
    }

    /**
     * Gets the value of the ufield2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUFIELD2() {
        return ufield2;
    }

    /**
     * Sets the value of the ufield2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUFIELD2(JAXBElement<String> value) {
        this.ufield2 = value;
    }

    /**
     * Gets the value of the callid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCALLID() {
        return callid;
    }

    /**
     * Sets the value of the callid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCALLID(JAXBElement<String> value) {
        this.callid = value;
    }

    /**
     * Gets the value of the homenumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHOMENUMBER() {
        return homenumber;
    }

    /**
     * Sets the value of the homenumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHOMENUMBER(JAXBElement<String> value) {
        this.homenumber = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUILDING() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUILDING(JAXBElement<String> value) {
        this.building = value;
    }

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTREET1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTREET1(JAXBElement<String> value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAPARTMENT() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAPARTMENT(JAXBElement<String> value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the midlename property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMIDLENAME() {
        return midlename;
    }

    /**
     * Sets the value of the midlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMIDLENAME(JAXBElement<String> value) {
        this.midlename = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the usrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSRID() {
        return usrid;
    }

    /**
     * Sets the value of the usrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSRID(String value) {
        this.usrid = value;
    }

    /**
     * Gets the value of the ctime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCTIME() {
        return ctime;
    }

    /**
     * Sets the value of the ctime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCTIME(XMLGregorianCalendar value) {
        this.ctime = value;
    }

    /**
     * Gets the value of the amexmembersince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAMEXMEMBERSINCE() {
        return amexmembersince;
    }

    /**
     * Sets the value of the amexmembersince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAMEXMEMBERSINCE(JAXBElement<XMLGregorianCalendar> value) {
        this.amexmembersince = value;
    }

    /**
     * Gets the value of the dcimembersince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDCIMEMBERSINCE() {
        return dcimembersince;
    }

    /**
     * Sets the value of the dcimembersince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDCIMEMBERSINCE(JAXBElement<XMLGregorianCalendar> value) {
        this.dcimembersince = value;
    }

    /**
     * Gets the value of the rewardno property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREWARDNO() {
        return rewardno;
    }

    /**
     * Sets the value of the rewardno property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREWARDNO(JAXBElement<String> value) {
        this.rewardno = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNATIONALITY() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNATIONALITY(JAXBElement<String> value) {
        this.nationality = value;
    }

}
