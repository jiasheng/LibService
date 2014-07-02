
package sg.gov.nlb.ws.catalogueservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sg.gov.nlb.ws.catalogueservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTitleDetailsRequest_QNAME = new QName("http://www.nlb.gov.sg/ws/CatalogueService", "GetTitleDetailsRequest");
    private final static QName _GetTitleDetailsResponse_QNAME = new QName("http://www.nlb.gov.sg/ws/CatalogueService", "GetTitleDetailsResponse");
    private final static QName _SearchRequest_QNAME = new QName("http://www.nlb.gov.sg/ws/CatalogueService", "SearchRequest");
    private final static QName _GetAvailabilityInfoResponse_QNAME = new QName("http://www.nlb.gov.sg/ws/CatalogueService", "GetAvailabilityInfoResponse");
    private final static QName _GetAvailabilityInfoRequest_QNAME = new QName("http://www.nlb.gov.sg/ws/CatalogueService", "GetAvailabilityInfoRequest");
    private final static QName _SearchResponse_QNAME = new QName("http://www.nlb.gov.sg/ws/CatalogueService", "SearchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sg.gov.nlb.ws.catalogueservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link GetTitleDetailsResponse }
     * 
     */
    public GetTitleDetailsResponse createGetTitleDetailsResponse() {
        return new GetTitleDetailsResponse();
    }

    /**
     * Create an instance of {@link GetTitleDetailsRequest }
     * 
     */
    public GetTitleDetailsRequest createGetTitleDetailsRequest() {
        return new GetTitleDetailsRequest();
    }

    /**
     * Create an instance of {@link GetAvailabilityInfoRequest }
     * 
     */
    public GetAvailabilityInfoRequest createGetAvailabilityInfoRequest() {
        return new GetAvailabilityInfoRequest();
    }

    /**
     * Create an instance of {@link GetAvailabilityInfoResponse }
     * 
     */
    public GetAvailabilityInfoResponse createGetAvailabilityInfoResponse() {
        return new GetAvailabilityInfoResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSearchItem }
     * 
     */
    public ArrayOfSearchItem createArrayOfSearchItem() {
        return new ArrayOfSearchItem();
    }

    /**
     * Create an instance of {@link ArrayOfTitle }
     * 
     */
    public ArrayOfTitle createArrayOfTitle() {
        return new ArrayOfTitle();
    }

    /**
     * Create an instance of {@link TitleDetail }
     * 
     */
    public TitleDetail createTitleDetail() {
        return new TitleDetail();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Modifiers }
     * 
     */
    public Modifiers createModifiers() {
        return new Modifiers();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link ArrayOfItem }
     * 
     */
    public ArrayOfItem createArrayOfItem() {
        return new ArrayOfItem();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link SearchItem }
     * 
     */
    public SearchItem createSearchItem() {
        return new SearchItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitleDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nlb.gov.sg/ws/CatalogueService", name = "GetTitleDetailsRequest")
    public JAXBElement<GetTitleDetailsRequest> createGetTitleDetailsRequest(GetTitleDetailsRequest value) {
        return new JAXBElement<GetTitleDetailsRequest>(_GetTitleDetailsRequest_QNAME, GetTitleDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitleDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nlb.gov.sg/ws/CatalogueService", name = "GetTitleDetailsResponse")
    public JAXBElement<GetTitleDetailsResponse> createGetTitleDetailsResponse(GetTitleDetailsResponse value) {
        return new JAXBElement<GetTitleDetailsResponse>(_GetTitleDetailsResponse_QNAME, GetTitleDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nlb.gov.sg/ws/CatalogueService", name = "SearchRequest")
    public JAXBElement<SearchRequest> createSearchRequest(SearchRequest value) {
        return new JAXBElement<SearchRequest>(_SearchRequest_QNAME, SearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailabilityInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nlb.gov.sg/ws/CatalogueService", name = "GetAvailabilityInfoResponse")
    public JAXBElement<GetAvailabilityInfoResponse> createGetAvailabilityInfoResponse(GetAvailabilityInfoResponse value) {
        return new JAXBElement<GetAvailabilityInfoResponse>(_GetAvailabilityInfoResponse_QNAME, GetAvailabilityInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailabilityInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nlb.gov.sg/ws/CatalogueService", name = "GetAvailabilityInfoRequest")
    public JAXBElement<GetAvailabilityInfoRequest> createGetAvailabilityInfoRequest(GetAvailabilityInfoRequest value) {
        return new JAXBElement<GetAvailabilityInfoRequest>(_GetAvailabilityInfoRequest_QNAME, GetAvailabilityInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nlb.gov.sg/ws/CatalogueService", name = "SearchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

}
