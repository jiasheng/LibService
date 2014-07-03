
package sg.gov.nlb.ws.catalogueservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Title complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Title">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TitleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublishYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MediaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Title", propOrder = {
    "bid",
    "isbn",
    "titleName",
    "author",
    "publishYear",
    "mediaCode",
    "mediaDesc"
})
public class Title {

    @XmlElement(name = "BID")
    protected String bid;
    @XmlElement(name = "ISBN")
    protected String isbn;
    @XmlElement(name = "TitleName")
    protected String titleName;
    @XmlElement(name = "Author")
    protected String author;
    @XmlElement(name = "PublishYear")
    protected String publishYear;
    @XmlElement(name = "MediaCode")
    protected String mediaCode;
    @XmlElement(name = "MediaDesc")
    protected String mediaDesc;

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBID() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBID(String value) {
        this.bid = value;
    }

    /**
     * Gets the value of the isbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Sets the value of the isbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Gets the value of the titleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * Sets the value of the titleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleName(String value) {
        this.titleName = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the publishYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublishYear() {
        return publishYear;
    }

    /**
     * Sets the value of the publishYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublishYear(String value) {
        this.publishYear = value;
    }

    /**
     * Gets the value of the mediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaCode() {
        return mediaCode;
    }

    /**
     * Sets the value of the mediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaCode(String value) {
        this.mediaCode = value;
    }

    /**
     * Gets the value of the mediaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaDesc() {
        return mediaDesc;
    }

    /**
     * Sets the value of the mediaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaDesc(String value) {
        this.mediaDesc = value;
    }

}
