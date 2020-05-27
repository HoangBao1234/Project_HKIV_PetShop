<%-- 
    Document   : hihi
    Created on : May 26, 2020, 2:35:55 PM
    Author     : DUY
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach var="i" items="${test}">
            <p>${i.name}</p>
        </c:forEach>
    </body>
</html>
