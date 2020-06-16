<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<html lang="en">

    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="Colorlib Templates">
        <meta name="author" content="Colorlib">
        <meta name="keywords" content="Colorlib Templates">

        <!-- Title Page-->
        <title>Register</title>
        <c:import url="setLocale.jsp"/>
        <fmt:setBundle basename="app"/>

        <!-- Icons font CSS-->
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
        <!-- Font special for pages-->
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

        <!-- Vendor CSS-->
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/select2/select2.min.css" rel="stylesheet" media="all">
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

        <!-- Main CSS-->
        <link href="${context}/Login/registerCustomer/colorlib-regform-2/css/main.css" rel="stylesheet" media="all">
    </head>

    <body>
        <div class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
            <div class="wrapper wrapper--w960">
                <div class="card card-2">
                    <div class="card-heading"></div>
                    <div class="card-body">
                        <h2 class="title">Registration Info</h2>
                        <form action="${context}/Customers/Store" method="post">
                            <div class="input-group">
                                <input class="input--style-3" type="text" id="exampleFirstName" name="regis_name" placeholder="<fmt:message key="login.textfield.name"/>">
                            </div>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <input class="input--style-3" type="password" id="exampleInputPassword" name="regis_pass" placeholder="<fmt:message key="login.textfield.password"/>" >
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <div class="rs-select2 js-select-simple select--no-search">
                                            <input class="input--style-3" type="text" id="exampleLastName" name="regis_phone" placeholder="<fmt:message key="login.textfield.phone"/>">
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="input-group">
                                <div class="rs-select2 js-select-simple select--no-search">
                                    <input class="input--style-3" type="email" id="exampleInputEmail" name="regis_mail" placeholder="<fmt:message key="login.textfield.mail"/>">
                                </div>
                            </div>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <input class="input--style-3" type="text" id="exampleRepeatPassword" name="regis_address" placeholder="<fmt:message key="login.textfield.address"/>">
                                    </div>
                                </div>
                            </div>
                            <div class="p-t-30">
                                <button class="btn btn--radius btn--green"  type="submit">Register</button>
                            </div>
                            <div class="p-t-30">
                                <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/Project_HKIV_PetShop/loginGoogle&response_type=code
                           &client_id=520939530095-juad1qmkst71lhl963fqck8mibnocbhu.apps.googleusercontent.com&approval_prompt=force" style="color: #007bff;">
                                      <fmt:message key="login.button.submitGoogle"/>
                                </a>
                            </div>
                                <div class="p-t-30">
                                <a class="small" href="${context}/Login/loginCustomer/Login_v11"> <fmt:message key="login.button.alhaveaccount"/> </a>
                            </div>
                                <div class="p-t-30">
                                <a class="small" href="?locale=en">
                                        English |
                                    </a>
                                    <a class="small" href="?locale=vi">
                                        Vietnamese
                                    </a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Jquery JS-->
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/jquery/jquery.min.js"></script>
        <!-- Vendor JS-->
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/select2/select2.min.js"></script>
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/moment.min.js"></script>
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/vendor/datepicker/daterangepicker.js"></script>

        <!-- Main JS-->
        <script src="${context}/Login/registerCustomer/colorlib-regform-2/js/global.js"></script>

    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->