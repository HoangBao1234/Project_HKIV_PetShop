<!DOCTYPE html>
<html lang="en">
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <c:set var="context" value="${pageContext.request.contextPath}"/>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Login</title>
        <c:import url="setLocale.jsp"/>
        <fmt:setBundle basename="app"/>
        <!-- Custom fonts for this template-->
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.2/angular.min.js"></script> 
        <link href="${context}/Admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
        <!--Custom multilanguage  -->

        <!-- Custom styles for this template-->
        <link href="${context}/Admin/css/sb-admin-2.min.css" rel="stylesheet">
        <style>
            .error-msg {
                font-size: 90%;
                font-style: italic;
                color: red;
            }
        </style>

    </head>

    <body class="bg-gradient-primary">


        <div class="container">

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-10 col-lg-12 col-md-9">

                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row">
                                <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                                <div class="col-lg-6">
                                    <div class="p-5" ng-app="myApp" ng-controller="myCtrl">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4"><fmt:message key="login.form.title"/></h1>
                                        </div>
                                        <%
                                            Cookie[] listCookie = request.getCookies();
                                            String user = "";
                                            String pass = "";
                                            int co = 0;
                                            if (listCookie != null) {
                                                while (co < listCookie.length) {
                                                    if (listCookie[co].getName().equals("user")) {
                                                        user = listCookie[co].getValue();
                                                    }
                                                    if (listCookie[co].getName().equals("pass")) {
                                                        pass = listCookie[co].getValue();
                                                    }
                                                    co++;
                                                }

                                            }
                                        %>
                                        ${error}
                                        <form class="user" action="${context}/Admins/Check" method="post" name="myForm" ng-submit="checkOnSubmit($event)">
                                            <div class="form-group">
                                                <input type="email" ng-model="txtMail" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" name="txtMail" value="<%out.print(user);%>" placeholder="<fmt:message key="login.textfield.mail"/>" ng-required="true">
                                            
                                                <span  ng-show="myForm.txtMail.$invalid && myForm.txtMail.$dirty" class="error-msg">
                                                    mail must be (name@gmail.com)!
                                                </span>
                                              
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control form-control-user" id="exampleInputPassword" name="txtPassword" value="<%out.print(pass);%>"  placeholder="<fmt:message key="login.textfield.password"/>"
                                                       ng-model="password"
                                                   ng-minlength= "5" ng-maxlength= "10" ng-required="true">
                                                <span ng-show="myForm.txtPassword.$invalid && myForm.txtPassword.$dirty" class="error-msg">
                                                Password must be(5-10)!
                                            </span>
                                            </div>
                                            <div class="form-group">
                                                <div class="custom-control custom-checkbox small">
                                                    <input type="checkbox" class="custom-control-input" id="customCheck" name="chkRemember">
                                                    <label class="custom-control-label" for="customCheck"><fmt:message key="login.textfield.checkbox"/></label>
                                                </div>
                                            </div>
                                            <input type="submit" class="btn btn-primary btn-user btn-block" value="<fmt:message key="login.button.submit"/>"/>
                                        </form>
                                        <hr>

                                        <div class="text-center">
                                            <a class="small" href="${context}/Admins/Create">Create an Account!</a>
                                        </div>
                                        <div class="text-center">
                                            <a class="small" href="?locale=en">
                                                English |
                                            </a>
                                            <a class="small" href="?locale=vi">
                                                Vietnamese
                                            </a>

                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>
   <script>
            var app = angular.module("myApp", []);

            app.controller("myCtrl", function($scope) {

                $scope.password = "";
                $scope.username = "";
                $scope.phone = "";
                // Show more error infos.
                function printErrorInfo() {
                    console.log($scope.myForm.$error);
                    if ($scope.myForm.$error.minlength) {
                        console.log('$error.minlength? ' + $scope.myForm.$error.minlength[0].$invalid);
                    }
                    if ($scope.myForm.$error.maxlength) {
                        console.log('$error.maxlength? ' + $scope.myForm.$error.maxlength[0].$invalid);
                    }

                }

                $scope.checkOnSubmit = function(event) {
                    if ($scope.myForm.$invalid) {
                        alert("Something invalid!");

                        printErrorInfo();

                        // Cancel submit
                        event.preventDefault();
                        return false;
                    }

                    return true;
                }

            });

        </script>
        <!-- Bootstrap core JavaScript-->
        <script src="${context}/Admin/vendor/jquery/jquery.min.js"></script>
        <script src="${context}/Admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="${context}/Admin/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="${context}/Admin/js/sb-admin-2.min.js"></script>

    </body>

</html>
