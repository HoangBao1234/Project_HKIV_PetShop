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

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css"/>
        
        
        
        
        <link href="${context}/Customer/petHotel/colorlib-regform-3/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="${context}/Customer/petHotel/colorlib-regform-3/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="${context}/Customer/petHotel/colorlib-regform-3/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="${context}/Customer/petHotel/colorlib-regform-3/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="${context}/Customer/petHotel/colorlib-regform-3/css/main.css" rel="stylesheet" media="all">


        <style>
            img {
                image-rendering: pixelated;
            }
            /* CSS c?n id pagination ra gi?a m�n h�nh */
            #pagination {
                display: flex;
                display: -webkit-flex; /* Safari 8 */
                flex-wrap: wrap;
                -webkit-flex-wrap: wrap; /* Safari 8 */
                justify-content: center;
                -webkit-justify-content: center;
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
                <a class="navbar-brand" href="index.html"><span class="flaticon-pawprint-1 mr-2"></span><span style="color: #000">PetShop</span>></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="fa fa-bars"></span> Menu
                </button>
                <div class="collapse navbar-collapse" id="ftco-nav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a href="index.html" class="nav-link">Home</a></li>

                        <li class="nav-item dropdown" ><a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Product</a>
                            <ul class="dropdown-menu" style="font-size: 14px; width: 200px">
                                <li><a href="${context}/PetProduct/All">Pet</a></li>
                                <li><a href="${context}/FoodProduct/All">Food</a></li>
                                <li><a href="${context}/AccessoriesProduct/All">Accessoreis</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a href="../colorlib-regform-3/index.jsp" class="nav-link">PetHotel</a></li>
                        <li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
                        <li class="nav-item"><a href="${context}/Order/View" class="nav-link"><i class="fas fa-shopping-cart"></i></a></li>
                                <c:if test="${sessionScope.username != null}">
                            <li class="nav-item dropdown" >
                                <a href="aboutus.jsp" class="nav-link  dropdown-toggle" data-toggle="dropdown">
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
        <!-- END nav -->


        
            
           <div class="page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins">
        <div class="wrapper wrapper--w780">
            <div class="card card-3">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Pet Hotel</h2>
                    <form method="POST">
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Name Pet" name="name">
                        </div>
                        <div class="input-group">
                            <input class="input--style-3 js-datepicker" type="text" placeholder="Date Start" name="dateStart">
                            <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                        </div>
                        <div class="input-group">
                            <input class="input--style-3 js-datepicker" type="text" placeholder="Date End" name="dateEnd">
                            <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                        </div>
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Price" name="price">
                        </div>
                        <div class="input-group">
                            <input class="input--style-3" type="text" placeholder="Status" name="status">
                        </div>
                        <div class="p-t-10">
                            <button class="btn btn--pill btn--green" type="submit" name="action">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

        <footer class="footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-lg-3 mb-4 mb-md-0">
                        <h2 class="footer-heading">Petsitting</h2>
                        <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>
                        <ul class="ftco-footer-social p-0">
                            <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Twitter"><span class="fa fa-twitter"></span></a></li>
                            <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Facebook"><span class="fa fa-facebook"></span></a></li>
                            <li class="ftco-animate"><a href="#" data-toggle="tooltip" data-placement="top" title="Instagram"><span class="fa fa-instagram"></span></a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 col-lg-3 mb-4 mb-md-0">
                        <h2 class="footer-heading">Latest News</h2>
                        <div class="block-21 mb-4 d-flex">
                            <a class="img mr-4 rounded" style="background-image: url(images/image_1.jpg);"></a>
                            <div class="text">
                                <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about</a></h3>
                                <div class="meta">
                                    <div><a href="#"><span class="icon-calendar"></span> April 7, 2020</a></div>
                                    <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                                    <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                                </div>
                            </div>
                        </div>
                        <div class="block-21 mb-4 d-flex">
                            <a class="img mr-4 rounded" style="background-image: url(images/image_2.jpg);"></a>
                            <div class="text">
                                <h3 class="heading"><a href="#">Even the all-powerful Pointing has no control about</a></h3>
                                <div class="meta">
                                    <div><a href="#"><span class="icon-calendar"></span> April 7, 2020</a></div>
                                    <div><a href="#"><span class="icon-person"></span> Admin</a></div>
                                    <div><a href="#"><span class="icon-chat"></span> 19</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3 pl-lg-5 mb-4 mb-md-0">
                        <h2 class="footer-heading">Quick Links</h2>
                        <ul class="list-unstyled">
                            <li><a href="#" class="py-2 d-block">Home</a></li>
                            <li><a href="#" class="py-2 d-block">About</a></li>
                            <li><a href="#" class="py-2 d-block">Services</a></li>
                            <li><a href="#" class="py-2 d-block">Works</a></li>
                            <li><a href="#" class="py-2 d-block">Blog</a></li>
                            <li><a href="#" class="py-2 d-block">Contact</a></li>
                        </ul>
                    </div>
                    <div class="col-md-6 col-lg-3 mb-4 mb-md-0">
                        <h2 class="footer-heading">Have a Questions?</h2>
                        <div class="block-23 mb-3">
                            <ul>
                                <li><span class="icon fa fa-map"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                                <li><a href="#"><span class="icon fa fa-phone"></span><span class="text">+2 392 3929 210</span></a></li>
                                <li><a href="#"><span class="icon fa fa-paper-plane"></span><span class="text">info@yourdomain.com</span></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row mt-5">
                    <div class="col-md-12 text-center">

                        <p class="copyright"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib.com</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                </div>
            </div>
        </footer>
        
        <script src="${context}/Customer/petHotel/colorlib-regform-3/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="${context}/Customer/petHotel/colorlib-regform-3/vendor/select2/select2.min.js"></script>
    <script src="${context}/Customer/petHotel/colorlib-regform-3/vendor/datepicker/moment.min.js"></script>
    <script src="${context}/Customer/petHotel/colorlib-regform-3/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="${context}/Customer/petHotel/colorlib-regform-3/js/global.js"></script>





        <script src="${context}/petsitting/js/jquery.min.js"></script>
        <script src="${context}/petsitting/js/jquery-migrate-3.0.1.min.js"></script>
        <script src="${context}/petsitting/js/popper.min.js"></script>
        <script src="${context}/petsitting/js/bootstrap.min.js"></script>
        <script src="${context}/petsitting/js/jquery.easing.1.3.js"></script>
        <script src="${context}/petsitting/js/jquery.waypoints.min.js"></script>
        <script src="${context}/petsitting/js/jquery.stellar.min.js"></script>
        <script src="${context}/petsitting/js/jquery.animateNumber.min.js"></script>
        <script src="${context}/petsitting/js/bootstrap-datepicker.js"></script>
        <script src="${context}/petsitting/js/jquery.timepicker.min.js"></script>
        <script src="${context}/petsitting/js/owl.carousel.min.js"></script>
        <script src="${context}/petsitting/js/jquery.magnific-popup.min.js"></script>
        <script src="${context}/petsitting/js/scrollax.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
        <script src="${context}/petsitting/js/google-map.js"></script>
        <script src="${context}/petsitting/js/main.js"></script>

        <script src="https://code.jquery.com/jquery-3.2.1.js" ></script>
        <!-- JS t?o n�t b?m di chuy?n trang start -->
        <script src="http://1892.yn.lt/blogger/JQuery/Pagging/js/jquery.twbsPagination.js" type="text/javascript"></script>
        <!-- JS t?o n�t b?m di chuy?n trang end -->
        <script type="text/javascript">
                                $(function() {
                                    var pageSize = 3; // Hi?n th? 6 s?n ph?m tr�n 1 trang
                                    showPage = function(page) {
                                        $(".contentPage").hide();
                                        $(".contentPage").each(function(n) {
                                            if (n >= pageSize * (page - 1) && n < pageSize * page)
                                                $(this).show();
                                        });
                                    };
                                    showPage(1);
                                    ///** C?n truy?n gi� tr? v�o ?�y **///
                                    var totalRows = 10; // T?ng s? s?n ph?m hi?n th?
                                    var btnPage = Math.ceil(${list.size()} / pageSize); // S? n�t b?m hi?n th? di chuy?n trang
                                    var iTotalPages = Math.ceil(totalRows / pageSize);

                                    var obj = $('#pagination').twbsPagination({
                                        totalPages: iTotalPages,
                                        visiblePages: btnPage,
                                        onPageClick: function(event, page) {
                                            /* console.info(page); */
                                            showPage(page);
                                        }
                                    });
                                    /*console.info(obj.data());*/
                                });
        </script>

    </body>
</html>