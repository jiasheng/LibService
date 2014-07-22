/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.tempuri.CatalogueService;
import sg.gov.nlb.ws.catalogueservice.*;

/**
 *
 * @author jiasheng
 */
@WebServlet(name = "LibServlet", urlPatterns = {"/LibServlet"})
public class LibServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        long startTime = System.currentTimeMillis();

        try (PrintWriter out = response.getWriter()) {
            //grab param from results.jsp
            String TextArea1 = request.getParameter("TextArea1");
            String field = request.getParameter("field");

            //Initialize WS operation arguments
            java.lang.String bodyText = TextArea1;
            GetAvailabilityInfoResponse res1;

            //Process result
            if (!field.equals("isbn")) { //when not searching by isbn (keyword/author)
                //calls genRequest() which calls search()
                SearchResponse res = genRequest(bodyText, field);

                //generate webpage
                out.println("<html>");
                out.println("<head>");

                out.println("<title>JSTR's LibService</title>");
                out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.css\"  type=\"text/css\"/>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class=\"container\">");

                out.println("<h2 align=\"center\"><font color='red'>JSTR's LibService</font></h2><hr>");
                out.println("<h2><a href=\"index.jsp\">New search</a></h2>");

                //display search params
                out.println("<b>Search keyword:</b> \"" + bodyText + "\"" + "<p>");
                out.println("<b>Search by: </b>" + field + "<p><hr>");

                Title t;

                if (res.getStatus().equals("OK")) {
                    out.println("<h2>Total records: " + res.getTotalRecords() + "</h2>");
                    out.println("<table class=\"table table-hover\">");
                    out.println("<tr><h3><th>#</th><th>Title</th><th>ISBN</th><th>Author</th><th>Type</th><th>Location</th><th>Status</th></h3></tr>");
                    int j = 1;
                    for (int i = 0; i < res.getTitles().getTitle().size(); i++) {
                        t = res.getTitles().getTitle().get(i);
                        res1 = genAvailRequest(t.getISBN());
                        try {
                            if (t.getMediaDesc().equals("Books") && res1 != null) { //prevent nullpointer
                                if (!t.getISBN().equals("") && !t.getAuthor().equals("") && !t.getMediaDesc().equals("") && !res1.getItems().getItem().get(0).getBranchName().equals("") && !res1.getItems().getItem().get(0).getStatusDesc().equals("")) {
                                    out.println("<tr><td>" + i + "</td><td>" + t.getTitleName() + "</td><td>" + t.getISBN() + "</td><td>" + t.getAuthor() + "</td><td>" + t.getMediaDesc() + "</td>");
                                    out.println("<td>" + res1.getItems().getItem().get(0).getBranchName() + "</td><td>" + res1.getItems().getItem().get(0).getStatusDesc() + "</td></tr>");
                                    j++;
                                }

                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("ERR  " + i + " " + t.getTitleName());
                        }

                    }
                    out.println("</table>");
                } else {
                    out.println("<h2>NOT OK: " + res.getStatus() + "<br>" + res.getErrorMessage() + "/<h2>");
                }

                out.println("</font>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");

            } else {
                GetTitleDetailsResponse res = genISBNRequest(bodyText);
                out.println("<html>");
                out.println("<head>");

                //Display the report's name as a title in the browser's titlebar:
                out.println("<title>JSTR's LibService</title>");
                out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.css\"  type=\"text/css\"/>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div class=\"container\">");

                //Display the report's name as a header within the body of the report:
                out.println("<h2 align=\"center\"><font color='red'>JSTR's LibService</font></h2><hr>");
                out.println("<h2><a href=\"index.jsp\">New search</a></h2>");

                //Display all the content (correct as well as incorrectly spelled) between quotation marks:
                out.println("<b>Search keyword:</b> \"" + bodyText + "\"" + "<p>");
                out.println("<b>Search by:</b> \"" + field + "\"" + "<p>");
                if (res.getStatus().equals("OK")) {
                    //out.println("<h2>Total records: " + res. + "</h2>");
                    out.println("<table class=\"table table-hover\">");
                    out.println("<tr><h3><th>Title</th><th>ISBN</th><th>Author</th><th>Physical Desc</th><th>Location</th><th>Status</th></h3></tr>");
                    sg.gov.nlb.ws.catalogueservice.TitleDetail t = res.getTitleDetail();
                    out.println("<tr><td>" + t.getTitleName() + "</td><td>" + t.getISBN() + "</td><td>" + t.getAuthor() + "</td><td>" + t.getPhysicalDesc() + "</td>");
                    res1 = genAvailRequest(t.getISBN());
                    out.println("<td>" + res1.getItems().getItem().get(0).getBranchName() + "</td><td>" + res1.getItems().getItem().get(0).getStatusDesc() + "</td></tr>");
                    out.println("</table>");
                } else {
                    out.println("<h2>NOT OK: " + res.getStatus() + "<br>" + res.getErrorMessage() + "<h2>");
                }

                out.println("</font>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static SearchResponse search(SearchRequest searchRequest) {
        org.tempuri.CatalogueService service = new org.tempuri.CatalogueService();
        org.tempuri.ICatalogueService port = service.getBasicHttpBindingICatalogueService();
        return port.search(searchRequest);
    }

    private static SearchResponse genRequest(String str, String field) {
        SearchRequest request = new SearchRequest();
        SearchItem searchItem = new SearchItem();
        request.setAPIKey("TGltVG93Um9uZzpsIW0yUjBuajU1"); //the NLB assigned Key
        if (field.equals("title")) {
            searchItem.setSearchField("Keywords");
        } else if (field.equals("author")) {
            searchItem.setSearchField("Author");
        }

        searchItem.setSearchTerms(str);
        ArrayOfSearchItem searchItemList = new ArrayOfSearchItem();
        searchItemList.getSearchItem().add(searchItem);
        request.setSearchItems(searchItemList);
        Modifiers mod = new Modifiers();
        mod.setStartRecordPosition(1);
        mod.setMaximumRecords(25);
        request.setModifiers(mod);
        return search(request);
    }

    private static GetAvailabilityInfoResponse genAvailRequest(String isbn) {
        GetAvailabilityInfoRequest request = new GetAvailabilityInfoRequest();
        request.setAPIKey("TGltVG93Um9uZzpsIW0yUjBuajU1");
        request.setISBN(isbn);
        Modifiers mod = new Modifiers();
        mod.setStartRecordPosition(1);
        mod.setMaximumRecords(25);
        request.setModifiers(mod);
        return getAvailabilityInfo(request);
    }

    private static GetAvailabilityInfoResponse getAvailabilityInfo(GetAvailabilityInfoRequest getAvailabilityInfoRequest) {
        org.tempuri.CatalogueService service = new org.tempuri.CatalogueService();
        org.tempuri.ICatalogueService port = service.getBasicHttpBindingICatalogueService();
        return port.getAvailabilityInfo(getAvailabilityInfoRequest);
    }

    private static GetTitleDetailsResponse genISBNRequest(String isbn) {
        GetTitleDetailsRequest request = new GetTitleDetailsRequest();
        request.setAPIKey("TGltVG93Um9uZzpsIW0yUjBuajU1");
        request.setISBN(isbn);
        return getTitleDetails(request);
    }

    private static GetTitleDetailsResponse getTitleDetails(sg.gov.nlb.ws.catalogueservice.GetTitleDetailsRequest getTitleDetailsRequest) {
        org.tempuri.CatalogueService service = new org.tempuri.CatalogueService();
        org.tempuri.ICatalogueService port = service.getBasicHttpBindingICatalogueService();
        return port.getTitleDetails(getTitleDetailsRequest);
    }

}
