<%--
    Document   : index
    Created on : Jun 18, 2014, 3:30:19 PM
    Author     : jiasheng
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTR's LibService</title>
        <script type="text/javascript">
            /*    function onSubmitForm()
             {
             document.Test.action = "http://linc.nus.edu.sg/search~S17/?searchtype=t&searchscope=17&searcharg=" + document.Test.TextArea1.value;
             }*/

            function validate()
            {
                var a = document.Test.TextArea1;
                var valid = true;
                if (a.value.length <= 0 || a.value == "")
                {
                    alert("Don't leave the field empty!");
                    valid = false;
                }

                return valid;
            }
            ;
        </script>
        <link rel="stylesheet" href="css/bootstrap.css"  type="text/css"/>

    </head>
    <body>
        <div class="container">
            <h2 align="center"><font color='red'>JSTR's LibService</font></h2>
            <hr>
            <div align="center">
                <form role="form "name="Test" class="well" method="post" action="result.jsp" onsubmit="return validate()">
                    <div class="form-group">
                        <h2>Enter keywords of book:</h2><br>
                        <p>
                            <input type="text" class="form-control" name="TextArea1" length="10">
                            <!--p><input type="text" name="t"></p>-->
                    </div>
                    <h3>Search by:</h3>
                    <div class="form-group">
                        <select id="selectbox" class="form-control" name="field">
                            <option value="title">Title</option>
                            <option value="author">Author</option>
                            <option value="isbn">ISBN</option>
                        </select>
                    </div>  

            <p><button type="button" class="btn btn-primary" onclick="document.Test.submit();">Search NUS Libraries</button>
                </form>
        </div>
    </div>
</body>
</html>
