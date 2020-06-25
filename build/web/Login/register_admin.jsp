<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Register</title>
        <c:import url="setLocale.jsp"/>
        <fmt:setBundle basename="app"/>

        <!-- Custom fonts for this template-->
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.2/angular.min.js"></script> 
        <link href="${context}/Admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

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

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                        <div class="col-lg-7">
                            <div class="p-5" ng-app="myApp" ng-controller="myCtrl">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4"><fmt:message key="login.form.titleRe"/></h1>
                                </div>
                                <form class="user" action="${context}/Admins/Store" method="post" name="myForm" ng-submit="checkOnSubmit($event)">
                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="email" ng-model="txtMail" class="form-control form-control-user" id="exampleFirstName" name="admins_mail" placeholder="Emal" ng-required="true">
                                            <br/>
                                            <span  ng-show="myForm.admins_mail.$invalid && myForm.admins_mail.$dirty" class="error-msg">
                                                mail must be (name@gmail.com)!
                                            </span>
                                            <br/>
                                        </div>
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="password" class="form-control form-control-user" id="exampleInputPassword" name="admins_pass" placeholder="Password" 
                                                   ng-model="password"
                                                   ng-minlength= "5" ng-maxlength= "10" ng-required="true">
                                            <span ng-show="myForm.admins_pass.$invalid && myForm.admins_pass.$dirty" class="error-msg">
                                                Password must be(5-10)!
                                            </span>
                                        </div>

                                    </div>
                                    <input type="submit" name="action" class="btn btn-primary btn-user btn-block" value="<fmt:message key="login.textfield.Register"/>"/>


                                    <hr>

                                </form>
                                <hr>

                                <div class="text-center">
                                    <a class="small" href="login.html"> <fmt:message key="login.button.alhaveaccount"/> </a>
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
