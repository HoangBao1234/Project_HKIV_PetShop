package org.apache.jsp.Customer.petHotel.colorlib_002dregform_002d3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Members;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>PetShop</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/0644aaed0c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- add icon link -->\n");
      out.write("        <link rel = \"icon\" href =\"https://png.pngtree.com/png-clipart/20190916/original/pngtree-pet-icon-png-image_4584897.jpg\" type = \"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/animate.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/bootstrap-datepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/style.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <!-- Font special for pages-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Vendor CSS-->\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            img {\n");
      out.write("                image-rendering: pixelated;\n");
      out.write("            }\n");
      out.write("            /* CSS c?n id pagination ra gi?a màn hình */\n");
      out.write("            #pagination {\n");
      out.write("                display: flex;\n");
      out.write("                display: -webkit-flex; /* Safari 8 */\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                -webkit-flex-wrap: wrap; /* Safari 8 */\n");
      out.write("                justify-content: center;\n");
      out.write("                -webkit-justify-content: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 d-flex align-items-center\">\n");
      out.write("                        <p class=\"mb-0 phone pl-md-2\">\n");
      out.write("                            <a href=\"#\" class=\"mr-2\"><span class=\"fa fa-phone mr-1\"></span> +00 1234 567</a> \n");
      out.write("                            <a href=\"#\"><span class=\"fa fa-paper-plane mr-1\"></span> youremail@email.com</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 d-flex justify-content-md-end\">\n");
      out.write("                        <div class=\"social-media\">\n");
      out.write("                            <p class=\"mb-0 d-flex\">\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\"><span class=\"flaticon-pawprint-1 mr-2\"></span><span style=\"color: #000\">PetShop</span>></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"fa fa-bars\"></span> Menu\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item\"><a href=\"index.html\" class=\"nav-link\">Home</a></li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item dropdown\" ><a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Product</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PetProduct/All\">Pet</a></li>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/FoodProduct/All\">Food</a></li>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AccessoriesProduct/All\">Accessoreis</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"../colorlib-regform-3/index.jsp\" class=\"nav-link\">PetHotel</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Order/View\" class=\"nav-link\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <li class=\"nav-item dropdown\" ><a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">Language</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\n");
      out.write("                                <li><a href=\"#\">Vietnamese</a></li>\n");
      out.write("                                <li><a href=\"#\">English</a></li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- END nav -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("           <div class=\"page-wrapper bg-gra-01 p-t-180 p-b-100 font-poppins\">\n");
      out.write("        <div class=\"wrapper wrapper--w780\">\n");
      out.write("            <div class=\"card card-3\">\n");
      out.write("                <div class=\"card-heading\"></div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h2 class=\"title\">Pet Hotel</h2>\n");
      out.write("                    <form method=\"POST\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"Name Pet\" name=\"name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3 js-datepicker\" type=\"text\" placeholder=\"Date Start\" name=\"dateStart\">\n");
      out.write("                            <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3 js-datepicker\" type=\"text\" placeholder=\"Date End\" name=\"dateEnd\">\n");
      out.write("                            <i class=\"zmdi zmdi-calendar-note input-icon js-btn-calendar\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"Price\" name=\"price\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input class=\"input--style-3\" type=\"text\" placeholder=\"Status\" name=\"status\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"p-t-10\">\n");
      out.write("                            <button class=\"btn btn--pill btn--green\" type=\"submit\" name=\"action\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\n");
      out.write("                        <h2 class=\"footer-heading\">Petsitting</h2>\n");
      out.write("                        <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\n");
      out.write("                        <ul class=\"ftco-footer-social p-0\">\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Twitter\"><span class=\"fa fa-twitter\"></span></a></li>\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Facebook\"><span class=\"fa fa-facebook\"></span></a></li>\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Instagram\"><span class=\"fa fa-instagram\"></span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\n");
      out.write("                        <h2 class=\"footer-heading\">Latest News</h2>\n");
      out.write("                        <div class=\"block-21 mb-4 d-flex\">\n");
      out.write("                            <a class=\"img mr-4 rounded\" style=\"background-image: url(images/image_1.jpg);\"></a>\n");
      out.write("                            <div class=\"text\">\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\n");
      out.write("                                <div class=\"meta\">\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 7, 2020</a></div>\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"block-21 mb-4 d-flex\">\n");
      out.write("                            <a class=\"img mr-4 rounded\" style=\"background-image: url(images/image_2.jpg);\"></a>\n");
      out.write("                            <div class=\"text\">\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\n");
      out.write("                                <div class=\"meta\">\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 7, 2020</a></div>\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 pl-lg-5 mb-4 mb-md-0\">\n");
      out.write("                        <h2 class=\"footer-heading\">Quick Links</h2>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Home</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">About</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Services</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Works</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Blog</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\n");
      out.write("                        <h2 class=\"footer-heading\">Have a Questions?</h2>\n");
      out.write("                        <div class=\"block-23 mb-3\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><span class=\"icon fa fa-map\"></span><span class=\"text\">203 Fake St. Mountain View, San Francisco, California, USA</span></li>\n");
      out.write("                                <li><a href=\"#\"><span class=\"icon fa fa-phone\"></span><span class=\"text\">+2 392 3929 210</span></a></li>\n");
      out.write("                                <li><a href=\"#\"><span class=\"icon fa fa-paper-plane\"></span><span class=\"text\">info@yourdomain.com</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row mt-5\">\n");
      out.write("                    <div class=\"col-md-12 text-center\">\n");
      out.write("\n");
      out.write("                        <p class=\"copyright\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib.com</a>\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <!-- Vendor JS-->\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/moment.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/global.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.stellar.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.animateNumber.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.timepicker.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/scrollax.min.js\"></script>\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/google-map.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.js\" ></script>\n");
      out.write("        <!-- JS t?o nút b?m di chuy?n trang start -->\n");
      out.write("        <script src=\"http://1892.yn.lt/blogger/JQuery/Pagging/js/jquery.twbsPagination.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- JS t?o nút b?m di chuy?n trang end -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("                                $(function() {\n");
      out.write("                                    var pageSize = 3; // Hi?n th? 6 s?n ph?m trên 1 trang\n");
      out.write("                                    showPage = function(page) {\n");
      out.write("                                        $(\".contentPage\").hide();\n");
      out.write("                                        $(\".contentPage\").each(function(n) {\n");
      out.write("                                            if (n >= pageSize * (page - 1) && n < pageSize * page)\n");
      out.write("                                                $(this).show();\n");
      out.write("                                        });\n");
      out.write("                                    };\n");
      out.write("                                    showPage(1);\n");
      out.write("                                    ///** C?n truy?n giá tr? vào ?ây **///\n");
      out.write("                                    var totalRows = 10; // T?ng s? s?n ph?m hi?n th?\n");
      out.write("                                    var btnPage = Math.ceil(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" / pageSize); // S? nút b?m hi?n th? di chuy?n trang\n");
      out.write("                                    var iTotalPages = Math.ceil(totalRows / pageSize);\n");
      out.write("\n");
      out.write("                                    var obj = $('#pagination').twbsPagination({\n");
      out.write("                                        totalPages: iTotalPages,\n");
      out.write("                                        visiblePages: btnPage,\n");
      out.write("                                        onPageClick: function(event, page) {\n");
      out.write("                                            /* console.info(page); */\n");
      out.write("                                            showPage(page);\n");
      out.write("                                        }\n");
      out.write("                                    });\n");
      out.write("                                    /*console.info(obj.data());*/\n");
      out.write("                                });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("context");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item dropdown\" >\n");
        out.write("                                <a href=\"aboutus.jsp\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">\n");
        out.write("                                    ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                </a>\n");
        out.write("                                <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\n");
        out.write("                                    <li><a href=\"#\">Profile</a></li>\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Customer/Logout?logout=ok\">Logout</a></li>\n");
        out.write("                                </ul>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\" >\n");
        out.write("                                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Customer/Login\" class=\"nav-link\">\n");
        out.write("                                    Login\n");
        out.write("                                </a>\n");
        out.write("                            </li>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
