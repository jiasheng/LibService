<%-- 
    Document   : result
    Created on : Jun 25, 2014, 5:01:13 PM
    Author     : jiasheng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="org.jsoup.*" %>
<%@page import="org.jsoup.nodes.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTR's LibService</title>
        <script src="/js/spin.js"></script>
        <link rel="stylesheet" href="css/bootstrap.css"  type="text/css"/>

    </head>
    <body>
        <div class="container">
        <h2 align="center"><font color='red'>JSTR's LibService</font></h2>
        <hr>
        <h2><a href="index.jsp">New search</a></h2>
        <form name="Test" method="post" action="LibServlet">
            <h3>Didn't find what you need? Click <a href="javascript:;" onclick="document.Test.submit();">here</a>
                to search NLB's collection with the same keyword!</h3>
            <input type="hidden" name="TextArea1" value="<%=request.getParameter("TextArea1")%>">
            <input type="hidden" name="field" value="<%=request.getParameter("field")%>">
        </form>
        <b>Search keyword: </b>"<%=request.getParameter("TextArea1")%>"<p>
        <b>Search by: </b><%=request.getParameter("field")%><p>
        <hr>
        <%
            String str = request.getParameter("TextArea1");
            Document doc = Jsoup.connect("http://linc.nus.edu.sg/search/Y?SEARCH="+str+"&searchscope=17&SORT=D").get();
            String title = doc.body().toString();
            title = title.replaceFirst("<body bgcolor=\"#FFFFFF\" link=\"blue\" vlink=\"#275AAO\">", "");
            title = title.replaceAll("/search~S17", "http://linc.nus.edu.sg/search~S17");
            title = title.replaceAll("/screens", "http://linc.nus.edu.sg/screens");
            title = title.replaceAll("</body>", "");
            title = title + "</div></body>";
            out.println(title);
        %>
</html>
