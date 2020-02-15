<%-- 
    Document   : index
    Created on : Feb 12, 2020, 8:44:13 AM
    Author     : vi5a7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="LoginServlet">
            Name: <input type="text" name="name"> <br>
            Password: <input type="password" name="password"> <br>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
