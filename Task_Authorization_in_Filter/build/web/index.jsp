<%-- 
    Document   : index
    Created on : Feb 7, 2020, 10:50:35 AM
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
        <form method="post" action="KITPointServlet">
            <select value="roles">
                <option value="management">Management</option>
                <option value="student">Students</option>
                <option value="intern">Interns</option>
            </select>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
