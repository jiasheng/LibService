
package sg.gov.nlb.ws.catalogueservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APIKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchItems" type="{http://www.nlb.gov.sg/ws/CatalogueService}ArrayOfSearchItem" minOccurs="0"/>
 *         &lt;element name="Modifiers" type="{http://www.nlb.gov.sg/ws/CatalogueService}Modifiers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "apiKey",
    "searchItems",
    "modifiers"
})
public class SearchRequest {

    @XmlElement(name = "APIKey")
    protected String apiKey;
    @XmlElement(name = "SearchItems")
    protected ArrayOfSearchItem searchItems;
    @XmlElement(name = "Modifiers")
    protected Modifiers modifiers;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPIKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPIKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the searchItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchItem }
     *     
     */
    public ArrayOfSearchItem getSearchItems() {
        return searchItems;
    }

    /**
     * Sets the value of the searchItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchItem }
     *     
     */
    public void setSearchItems(ArrayOfSearchItem value) {
        this.searchItems = value;
    }

    /**
     * Gets the value of the modifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Modifiers }
     *     
     */
    public Modifiers getModifiers() {
        return modifiers;
    }

    /**
     * Sets the value of the modifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modifiers }
     *     
     */
    public void setModifiers(Modifiers value) {
        this.modifiers = value;
    }

}
