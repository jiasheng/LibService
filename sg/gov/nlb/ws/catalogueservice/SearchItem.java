
package sg.gov.nlb.ws.catalogueservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchItem", propOrder = {
    "searchField",
    "searchTerms"
})
public class SearchItem {

    @XmlElement(name = "SearchField")
    protected String searchField;
    @XmlElement(name = "SearchTerms")
    protected String searchTerms;

    /**
     * Gets the value of the searchField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField() {
        return searchField;
    }

    /**
     * Sets the value of the searchField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField(String value) {
        this.searchField = value;
    }

    /**
     * Gets the value of the searchTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * Sets the value of the searchTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

}
