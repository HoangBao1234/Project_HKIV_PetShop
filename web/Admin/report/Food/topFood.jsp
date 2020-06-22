<%-- 
    Document   : topPet
    Created on : Jun 18, 2020, 7:28:58 PM
    Author     : DUY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report Food</title>
        <link rel="shortcut icon" href=http://www.freshdesignweb.com/wp-content/themes/fv24/images/icon.ico />
        <link rel="stylesheet" type="text/css" href="styles.css" media="all" />
        <link rel="stylesheet" type="text/css" href="demo.css" media="all" />
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
                <h1><span>Report</span>Top 5 bestselling Food</h1>

            </header>  
            <hr>
            <h2>S2 Food Admin</h2>
            <h3>590 Cách Mạng tháng Tám.</h3>
            <h3>Quận 3, TP Hồ Chí Minh.</h3>
            <h3>Phone: 0387278015.
                <h3>Email:dokhanhduy123abc@gmail.com</h3>


                <!-- start header here-->
                <header>
                    <div id="fdw-pricing-table">

                        <table border="1" width="80%">
                            <tr style="text-align: center">
                                <th>Pet Id</th>
                                <th>Name</th>
                                <th>Breed</th>
                                <th>Price</th>
                            </tr>
                            <c:forEach var="i" items="${list}">
                                <tr>
                                    <td>${i.PId}</td>
                                    <td>${i.PName}</td>
                                    <td>${i.CPId.name}</td>
                                    <td>${i.price}</td>
                                </tr>
                            </c:forEach>
                        </table>

                    </div>
                </header><!-- end header -->

        </div>
    </body>
</html>
