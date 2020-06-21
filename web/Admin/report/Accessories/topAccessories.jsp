<%-- 
    Document   : topPet
    Created on : Jun 18, 2020, 7:28:58 PM
    Author     : DUY
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report Pet</title>
        <link rel="shortcut icon" href=http://www.freshdesignweb.com/wp-content/themes/fv24/images/icon.ico />
        <link rel="stylesheet" type="text/css" href="${context}/Admin/report/Pet/styles.css" media="all" />
        <link rel="stylesheet" type="text/css" href="${context}/Admin/report/Pet/demo.css" media="all" />
        <style>
            h2{
                text-indent: 30px;
                font-weight: bold;
            }
            h3{   
                text-indent: 30px;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
        <div class="container">

            <header>
                <h1><span>Report</span>Top 5 Accessories</h1>

            </header>  
            <hr>
            <h2>S2 Pet Admin</h2>
            <h3>590 Cách Mạng tháng Tám.</h3>
            <h3>Quận 3, TP Hồ Chí Minh.</h3>
            <h3>Phone: 0387278015.
                <h3>Email:dokhanhduy123abc@gmail.com</h3>


                <!-- start header here-->
                <header>
                    <div id="fdw-pricing-table">
                        <c:forEach var="i" items="${list}">
                            <div class="plan plan1">
                                <div class="header"><img src="${context}/ImageItems/${i.image}" width="110" height="100"/></div>
                                <div class="price">${i.price}</div>  
                                <div class="monthly">${i.name}</div>  
                                <ul>
                                    <li><b>Loại</b> ${i.CPId.name}</li>

                                </ul>
                                <a class="signup" href="http://www.freshdesignweb.com">Add Cart</a>         
                            </div>
                        </c:forEach>
                    </div>
                </header><!-- end header -->

        </div>
    </body>
</html>
