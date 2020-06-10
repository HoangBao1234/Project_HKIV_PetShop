<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Members"%>
<c:set var="context" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>PetShop</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/0644aaed0c.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- add icon link -->
        <link rel = "icon" href ="https://png.pngtree.com/png-clipart/20190916/original/pngtree-pet-icon-png-image_4584897.jpg" type = "image/x-icon">
        <link rel="stylesheet" href="${context}/petsitting/css/animate.css">

        <link rel="stylesheet" href="${context}/petsitting/css/owl.carousel.min.css">
        <link rel="stylesheet" href="${context}/petsitting/css/owl.theme.default.min.css">
        <link rel="stylesheet" href="${context}/petsitting/css/magnific-popup.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="${context}/petsitting/css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="${context}/petsitting/css/jquery.timepicker.css">

        <link rel="stylesheet" href="${context}/petsitting/css/flaticon.css">
        <link rel="stylesheet" href="${context}/petsitting/css/style.css">


        <script src="https://use.fontawesome.com/c560c025cf.js"></script>

        <style>
            img {
                image-rendering: pixelated;
            }
            /* CSS c?n id pagination ra gi?a màn hình */
            #pagination {
                display: flex;
                display: -webkit-flex; /* Safari 8 */
                flex-wrap: wrap;
                -webkit-flex-wrap: wrap; /* Safari 8 */
                justify-content: center;
                -webkit-justify-content: center;
            }


            .quantity {
                float: left;
                margin-right: 15px;
                background-color: #eee;
                position: relative;
                width: 80px;
                overflow: hidden
            }

            .quantity input {
                margin: 0;
                text-align: center;
                width: 15px;
                height: 15px;
                padding: 0;
                float: right;
                color: #000;
                font-size: 20px;
                border: 0;
                outline: 0;
                background-color: #F6F6F6
            }

            .quantity input.qty {
                position: relative;
                border: 0;
                width: 100%;
                height: 40px;
                padding: 10px 25px 10px 10px;
                text-align: center;
                font-weight: 400;
                font-size: 15px;
                border-radius: 0;
                background-clip: padding-box
            }

            .quantity .minus, .quantity .plus {
                line-height: 0;
                background-clip: padding-box;
                -webkit-border-radius: 0;
                -moz-border-radius: 0;
                border-radius: 0;
                -webkit-background-size: 6px 30px;
                -moz-background-size: 6px 30px;
                color: #bbb;
                font-size: 20px;
                position: absolute;
                height: 50%;
                border: 0;
                right: 0;
                padding: 0;
                width: 25px;
                z-index: 3
            }

            .quantity .minus:hover, .quantity .plus:hover {
                background-color: #dad8da
            }

            .quantity .minus {
                bottom: 0
            }
            .shopping-cart {
                margin-top: 20px;
            }
            img {
                display: block;
                max-width:50px;
                max-height:50px;
                width: 50px;
                height: 50px;
            }
        </style>
    </head>
    <body>

        <div class="wrap">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 d-flex align-items-center">
                        <p class="mb-0 phone pl-md-2">
                            <a href="#" class="mr-2"><span class="fa fa-phone mr-1"></span> +00 1234 567</a> 
                            <a href="#"><span class="fa fa-paper-plane mr-1"></span> youremail@email.com</a>
                        </p>
                    </div>
                    <div class="col-md-6 d-flex justify-content-md-end">
                        <div class="social-media">
                            <p class="mb-0 d-flex">

                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
            <div class="container">
                <a class="navbar-brand" href="index.html"><span class="flaticon-pawprint-1 mr-2"></span><span style="color: #000">PetShop</span></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="fa fa-bars"></span> Menu
                </button>
                <div class="collapse navbar-collapse" id="ftco-nav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a href="index.html" class="nav-link">Home</a></li>

                        <li class="nav-item dropdown" ><a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Product</a>
                            <ul class="dropdown-menu" style="font-size: 14px; width: 200px">
                                <li><a href="${context}/PetProduct/All">Pet</a></li>
                                <li><a href="#">Food</a></li>
                                <li><a href="#">Accessoreis</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a href="services.html" class="nav-link">PetHotel</a></li>
                        <li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
                        <li class="nav-item"><a href="${context}/Order/View" class="nav-link"><i class="fas fa-shopping-cart"></i></a></li>
                                <c:if test="${sessionScope.username != null}">
                            <li class="nav-item dropdown" >
                                <a href="about.html" class="nav-link  dropdown-toggle" data-toggle="dropdown">
                                    <c:out value="${sessionScope.username.name}" />
                                </a>
                                <ul class="dropdown-menu" style="font-size: 14px; width: 200px">
                                    <li><a href="#">Profile</a></li>
                                    <li><a href="${context}/Customer/Logout?logout=ok">Logout</a></li>
                                </ul>
                            </li>
                        </c:if>
                        <c:if test="${sessionScope.username == null}">
                            <li class="nav-item" >
                                <a href="${context}/Customer/Login" class="nav-link">
                                    Login
                                </a>
                            </li>
                        </c:if>
                        <li class="nav-item dropdown" ><a href="about.html" class="nav-link  dropdown-toggle" data-toggle="dropdown">Language</a>
                            <ul class="dropdown-menu" style="font-size: 14px; width: 200px">
                                <li><a href="#">Vietnamese</a></li>
                                <li><a href="#">English</a></li>

                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="card shopping-cart">
                <div class="card-header bg-dark text-light">
                    <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                    Shipping cart
                    <a href="" class="btn btn-outline-info btn-sm pull-right">Continiu shopping</a>
                    <div class="clearfix"></div>
                </div>
                <div class="card-body">
                    <c:if test="${sessionScope.order != null}">
                        <c:forEach var="i" items="${list}">
                            <!-- PRODUCT -->
                            <div class="row">
                                <div class="col-12 col-sm-12 col-md-2 text-center">
                                    <img class="img-responsive" src="${context}/ImageItems/${i.image}" alt="prewiew" width="120" height="80">
                                </div>
                                <div class="col-12 text-sm-center col-sm-12 text-md-left col-md-6">
                                    <h4 class="product-name"><strong>${i.productName}</strong></h4>
                                    <h4>
                                        <small>Product description</small>
                                    </h4>
                                </div>
                                <div class="col-12 col-sm-12 text-sm-center col-md-4 text-md-right row">
                                    <div class="col-3 col-sm-3 col-md-6 text-md-right" style="padding-top: 5px">
                                        <h6><strong>${i.productPrice} <span class="text-muted">x</span></strong></h6>
                                    </div>
                                    <div class="col-4 col-sm-4 col-md-4">
                                        <div class="quantity">
                                            <input type="button" value="+" class="plus">
                                            <input type="number" step="1" max="99" min="1" value="${i.quantity}" title="Qty" class="qty"
                                                   size="4">
                                            <input type="button" value="-" class="minus">
                                        </div>
                                    </div>
                                    <div class="col-2 col-sm-2 col-md-2 text-right">
                                        <button type="button" class="btn btn-outline-danger btn-xs">
                                            <a href="${context}/Order/Delete?productId=${i.productId}"><i class="fa fa-trash" aria-hidden="true"></i></a>
                                        </button>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <!-- END PRODUCT -->
                        </c:forEach>
                    </c:if>
                    <c:if test="${sessionScope.order == null}">
                        <h1>Nothing</h1>
                    </c:if>
                    <div class="pull-right">
                        <a href="" class="btn btn-outline-secondary pull-right">
                            Update shopping cart
                        </a>
                    </div>
                </div>
                <div class="card-footer">
                    <div class="pull-right" style="margin: 10px">
                        <a href="" class="btn btn-success pull-right">Checkout</a>
                        <div class="pull-right" style="margin: 5px">
                                Total: ${sessionScope.order.getTotal()} $
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
