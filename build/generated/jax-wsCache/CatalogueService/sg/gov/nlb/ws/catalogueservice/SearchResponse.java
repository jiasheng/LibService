
package sg.gov.nlb.ws.catalogueservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NextRecordPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titles" type="{http://www.nlb.gov.sg/ws/CatalogueService}ArrayOfTitle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponse", propOrder = {
    "status",
    "message",
    "errorMessage",
    "totalRecords",
    "nextRecordPosition",
    "setId",
    "titles"
})
public class SearchResponse {

    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "TotalRecords")
    protected int totalRecords;
    @XmlElement(name = "NextRecordPosition")
    protected int nextRecordPosition;
    @XmlElement(name = "SetId")
    protected String setId;
    @XmlElement(name = "Titles")
    protected ArrayOfTitle titles;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
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
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public int getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(int value) {
        this.totalRecords = value;
    }

    /**
     * Gets the value of the nextRecordPosition property.
     * 
     */
    public int getNextRecordPosition() {
        return nextRecordPosition;
    }

    /**
     * Sets the value of the nextRecordPosition property.
     * 
     */
    public void setNextRecordPosition(int value) {
        this.nextRecordPosition = value;
    }

    /**
     * Gets the value of the setId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetId() {
        return setId;
    }

    /**
     * Sets the value of the setId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetId(String value) {
        this.setId = value;
    }

    /**
     * Gets the value of the titles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTitle }
     *     
     */
    public ArrayOfTitle getTitles() {
        return titles;
    }

    /**
     * Sets the value of the titles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTitle }
     *     
     */
    public void setTitles(ArrayOfTitle value) {
        this.titles = value;
    }

}
