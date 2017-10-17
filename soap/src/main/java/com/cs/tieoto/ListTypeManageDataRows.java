
package com.cs.tieoto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListType_ManageDataRows complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListType_ManageDataRows">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Col" type="{urn:issuing_v_01_02_xsd}RowType_ManageDataCol" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListType_ManageDataRows", namespace = "urn:issuing_v_01_02_xsd", propOrder = {
    "col"
})
public class ListTypeManageDataRows {

    @XmlElement(name = "Col", required = true, nillable = true)
    protected List<RowTypeManageDataCol> col;

    /**
     * Gets the value of the col property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the col property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RowTypeManageDataCol }
     * 
     * 
     */
    public List<RowTypeManageDataCol> getCol() {
        if (col == null) {
            col = new ArrayList<RowTypeManageDataCol>();
        }
        return this.col;
    }

}
