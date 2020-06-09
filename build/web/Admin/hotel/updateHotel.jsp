<%-- 
    Document   : updateHotel
    Created on : Jun 3, 2020, 5:29:16 PM
    Author     : NGUYEN HOANG BAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${sessionScope.admin.mail == null}">
    <c:redirect url="/Admins/Login"/>
</c:if>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
