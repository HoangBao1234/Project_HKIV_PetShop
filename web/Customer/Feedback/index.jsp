<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="entity.Members"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<style>
    body{
        margin: 0;
        padding: 0;
        background: url(${context}/ImageItems/bg.jfif);
        background-size: cover;
    }
    .contact-form{
        width: 85%;
        max-width: 600px;
        background: #f1f1f1;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%,-50%);
        padding: 30px 40px;
        box-sizing: border-box;
        border-radius: 8px;
        text-align: center;
        box-shadow: 0 0 20px #000000b3;
        font-family: "Montserrat",sans-serif;
    }
    .contact-form h1{
        margin-top: 0;
        font-weight: 200;
    }
    .txtb{
        border:1px solid gray;
        margin: 8px 0;
        padding: 12px 18px;
        border-radius: 8px;
    }
    .txtb label{
        display: block;
        text-align: left;
        color: #333;
        text-transform: uppercase;
        font-size: 14px;
    }
    .txtb input,.txtb textarea{
        width: 100%;
        border: none;
        background: none;
        outline: none;
        font-size: 18px;
        margin-top: 6px;
    }
    .btn{
        display: inline-block;
        background: #9b59b6;
        padding: 14px 0;
        color: white;
        text-transform: uppercase;
        cursor: pointer;
        margin-top: 8px;
        width: 100%;
    }
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="contact-form">
            <h1>Contact Us</h1>
            <form action="${context}/Cusfeedback/Store" method="post">
            <div class="txtb">
                <label>Full Name :</label>
                <input type="text" name="username" value="${sessionScope.username.name}">
            </div>

            <div class="txtb">
                <label>Email :</label>
                <input type="email" name="email" value="${sessionScope.username.mail}">
            </div>

            <div class="txtb">
                <label>Phone Number :</label>
                <input type="text" name="phone" value="${sessionScope.username.phone}" >
            </div>

            <div class="txtb">
                <label>Message :</label>
                <textarea name="mess"></textarea>
            </div>
            
            <input class="btn" type="submit" value="Sent"/>
            </form>
        </div>
    </body>
</html>
