
package test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsDictionaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsDictionaryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selectedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pagesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rowsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dictionaryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="row" type="{http://upbs.cs.com/}wsDictionaryRowResponse" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsDictionaryResponse", propOrder = {
    "totalCount",
    "selectedCount",
    "pagesTotalCount",
    "currentPage",
    "rowsPerPage",
    "dictionaryId",
    "rows"
})
public class WsDictionaryResponse {

    protected int totalCount;
    protected int selectedCount;
    protected int pagesTotalCount;
    protected int currentPage;
    protected int rowsPerPage;
    protected String dictionaryId;
    protected WsDictionaryResponse.Rows rows;

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the selectedCount property.
     * 
     */
    public int getSelectedCount() {
        return selectedCount;
    }

    /**
     * Sets the value of the selectedCount property.
     * 
     */
    public void setSelectedCount(int value) {
        this.selectedCount = value;
    }

    /**
     * Gets the value of the pagesTotalCount property.
     * 
     */
    public int getPagesTotalCount() {
        return pagesTotalCount;
    }

    /**
     * Sets the value of the pagesTotalCount property.
     * 
     */
    public void setPagesTotalCount(int value) {
        this.pagesTotalCount = value;
    }

    /**
     * Gets the value of the currentPage property.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

    /**
     * Gets the value of the rowsPerPage property.
     * 
     */
    public int getRowsPerPage() {
        return rowsPerPage;
    }

    /**
     * Sets the value of the rowsPerPage property.
     * 
     */
    public void setRowsPerPage(int value) {
        this.rowsPerPage = value;
    }

    /**
     * Gets the value of the dictionaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryId() {
        return dictionaryId;
    }

    /**
     * Sets the value of the dictionaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryId(String value) {
        this.dictionaryId = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link WsDictionaryResponse.Rows }
     *     
     */
    public WsDictionaryResponse.Rows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsDictionaryResponse.Rows }
     *     
     */
    public void setRows(WsDictionaryResponse.Rows value) {
        this.rows = value;
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
     *         &lt;element name="row" type="{http://upbs.cs.com/}wsDictionaryRowResponse" maxOccurs="unbounded" minOccurs="0"/>
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
        "row"
    })
    public static class Rows {

        protected List<WsDictionaryRowResponse> row;

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WsDictionaryRowResponse }
         * 
         * 
         */
        public List<WsDictionaryRowResponse> getRow() {
            if (row == null) {
                row = new ArrayList<WsDictionaryRowResponse>();
            }
            return this.row;
        }

    }

}
