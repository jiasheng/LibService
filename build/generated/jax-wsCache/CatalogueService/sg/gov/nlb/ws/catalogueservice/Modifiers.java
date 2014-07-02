
package sg.gov.nlb.ws.catalogueservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Modifiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Modifiers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartRecordPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaximumRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Modifiers", propOrder = {
    "sortSchema",
    "startRecordPosition",
    "maximumRecords",
    "setId"
})
public class Modifiers {

    @XmlElement(name = "SortSchema")
    protected String sortSchema;
    @XmlElement(name = "StartRecordPosition")
    protected int startRecordPosition;
    @XmlElement(name = "MaximumRecords")
    protected int maximumRecords;
    @XmlElement(name = "SetId")
    protected String setId;

    /**
     * Gets the value of the sortSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortSchema() {
        return sortSchema;
    }

    /**
     * Sets the value of the sortSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortSchema(String value) {
        this.sortSchema = value;
    }

    /**
     * Gets the value of the startRecordPosition property.
     * 
     */
    public int getStartRecordPosition() {
        return startRecordPosition;
    }

    /**
     * Sets the value of the startRecordPosition property.
     * 
     */
    public void setStartRecordPosition(int value) {
        this.startRecordPosition = value;
    }

    /**
     * Gets the value of the maximumRecords property.
     * 
     */
    public int getMaximumRecords() {
        return maximumRecords;
    }

    /**
     * Sets the value of the maximumRecords property.
     * 
     */
    public void setMaximumRecords(int value) {
        this.maximumRecords = value;
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

}
