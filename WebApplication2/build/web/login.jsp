<%-- 
    Document   : login
    Created on : Jun 26, 2024, 9:59:41 PM
    Author     : kirikaza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginController"  method="GET">
            <input name="username" type="text">
            <input name="password" type="password">
            <input value="Login" name="action" type="submit">
        </form>
    </body>
</html>
