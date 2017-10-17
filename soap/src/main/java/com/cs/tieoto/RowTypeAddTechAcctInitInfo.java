
package com.cs.tieoto;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RowType_AddTechAcctInitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RowType_AddTechAcctInitInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACCOUNT_NO" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="ACCNT_SCHEME" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TA_TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="GL_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowType_AddTechAcctInitInfo", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "accountno",
    "accntscheme",
    "tatype",
    "glcode"
})
public class RowTypeAddTechAcctInitInfo {

    @XmlElement(name = "ACCOUNT_NO", required = true, nillable = true)
    protected BigInteger accountno;
    @XmlElement(name = "ACCNT_SCHEME", required = true, nillable = true)
    protected BigInteger accntscheme;
    @XmlElement(name = "TA_TYPE", required = true, nillable = true)
    protected BigInteger tatype;
    @XmlElement(name = "GL_CODE", required = true, nillable = true)
    protected String glcode;

    /**
     * Gets the value of the accountno property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACCOUNTNO() {
        return accountno;
    }

    /**
     * Sets the value of the accountno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACCOUNTNO(BigInteger value) {
        this.accountno = value;
    }

    /**
     * Gets the value of the accntscheme property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getACCNTSCHEME() {
        return accntscheme;
    }

    /**
     * Sets the value of the accntscheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setACCNTSCHEME(BigInteger value) {
        this.accntscheme = value;
    }

    /**
     * Gets the value of the tatype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTATYPE() {
        return tatype;
    }

    /**
     * Sets the value of the tatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTATYPE(BigInteger value) {
        this.tatype = value;
    }

    /**
     * Gets the value of the glcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGLCODE() {
        return glcode;
    }

    /**
     * Sets the value of the glcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGLCODE(String value) {
        this.glcode = value;
    }

}
