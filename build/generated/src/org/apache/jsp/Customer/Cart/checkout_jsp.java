package org.apache.jsp.Customer.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Members;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>PetShop</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/0644aaed0c.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- add icon link -->\r\n");
      out.write("        <link rel = \"icon\" href =\"https://png.pngtree.com/png-clipart/20190916/original/pngtree-pet-icon-png-image_4584897.jpg\" type = \"image/x-icon\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/animate.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/owl.theme.default.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/bootstrap-datepicker.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/jquery.timepicker.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/flaticon.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                font-family: cursive;\r\n");
      out.write("                font-size: 17px;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            * {\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("                font-family: cursive;\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .row {\r\n");
      out.write("                display: -ms-flexbox; /* IE10 */\r\n");
      out.write("                display: flex;\r\n");
      out.write("                -ms-flex-wrap: wrap; /* IE10 */\r\n");
      out.write("                flex-wrap: wrap;\r\n");
      out.write("                margin: 0 -16px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .col-25 {\r\n");
      out.write("                -ms-flex: 25%; /* IE10 */\r\n");
      out.write("                flex: 25%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .col-50 {\r\n");
      out.write("                -ms-flex: 50%; /* IE10 */\r\n");
      out.write("                flex: 50%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .col-75 {\r\n");
      out.write("                -ms-flex: 75%; /* IE10 */\r\n");
      out.write("                flex: 75%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .col-25,\r\n");
      out.write("            .col-50,\r\n");
      out.write("            .col-75 {\r\n");
      out.write("                padding: 0 16px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            input[type=text] {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("                padding: 12px;\r\n");
      out.write("                border: 0.5px solid black;\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            label {\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                display: block;\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .icon-container {\r\n");
      out.write("                margin-bottom: 20px;\r\n");
      out.write("                padding: 7px 0;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn {\r\n");
      out.write("                background-color: #4CAF50;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 12px;\r\n");
      out.write("                margin: 10px 0;\r\n");
      out.write("                border: none;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                font-size: 17px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn:hover {\r\n");
      out.write("                background-color: #45a049;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            a {\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            hr {\r\n");
      out.write("                border: 1px solid lightgrey;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            span.price {\r\n");
      out.write("                float: right;\r\n");
      out.write("                color: grey;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the \"cart\" column go on top) */\r\n");
      out.write("            @media (max-width: 800px) {\r\n");
      out.write("                .row {\r\n");
      out.write("                    flex-direction: column-reverse;\r\n");
      out.write("                }\r\n");
      out.write("                .col-25 {\r\n");
      out.write("                    margin-bottom: 20px;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            function test() {\r\n");
      out.write("                console.log(\"ok\");\r\n");
      out.write("                var selectTran = document.getElementById(\"selectTran\").value;\r\n");
      out.write("                var total = document.getElementById(\"total\").textContent;\r\n");
      out.write("                var html;\r\n");
      out.write("                if (selectTran.localeCompare(\"Fast\") === 0) {\r\n");
      out.write("                    html = parseInt(total) + 10;\r\n");
      out.write("                    document.getElementById(\"total\").innerHTML = html;\r\n");
      out.write("                    document.getElementById(\"msg\").innerHTML = \"(*) Fast shipping 10 $\";\r\n");
      out.write("                }\r\n");
      out.write("                if (selectTran.localeCompare(\"Normal\") === 0) {\r\n");
      out.write("                    html = parseInt(total) - 10;\r\n");
      out.write("                    document.getElementById(\"total\").innerHTML = html;\r\n");
      out.write("                    document.getElementById(\"msg\").innerHTML = \"\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 d-flex align-items-center\">\r\n");
      out.write("                        <p class=\"mb-0 phone pl-md-2\">\r\n");
      out.write("                            <a href=\"#\" class=\"mr-2\"><span class=\"fa fa-phone mr-1\"></span> +00 1234 567</a> \r\n");
      out.write("                            <a href=\"#\"><span class=\"fa fa-paper-plane mr-1\"></span> youremail@email.com</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 d-flex justify-content-md-end\">\r\n");
      out.write("                        <div class=\"social-media\">\r\n");
      out.write("                            <p class=\"mb-0 d-flex\">\r\n");
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\"><span class=\"flaticon-pawprint-1 mr-2\"></span>Pet Shop</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"fa fa-bars\"></span> Menu\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/index.jsp\" class=\"nav-link\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"nav-item dropdown\" ><a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">Product</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/PetProduct/All\">Pet</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/FoodProduct/All\">Food</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AccessoriesProduct/All\">Accessoreis</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Customer/petHotel/colorlib-regform-3/index.jsp\" class=\"nav-link\">PetHotel</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/aboutus.jsp\" class=\"nav-link\">About</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Order/View\" class=\"nav-link\"><i class=\"fas fa-shopping-cart\"><sub><span class=\"badge\">\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                                        </span></sub></i> </a></li>\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <li class=\"nav-item dropdown\" ><a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">Language</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\r\n");
      out.write("                                <li><a href=\"#\">Vietnamese</a></li>\r\n");
      out.write("                                <li><a href=\"#\">English</a></li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"row\" style=\"padding: 10px 25px\">\r\n");
      out.write("            <div class=\"col-75\">\r\n");
      out.write("                <div class=\"container\" style=\"background-color: #f1f1f1f1\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-25\">\r\n");
      out.write("                <div class=\"container\" style=\"background-color: #f1f1f1f1\">\r\n");
      out.write("                    <h4><b>Cart</b><span class=\"price\" style=\"color:black\"><i class=\"fa fa-shopping-cart\"></i> <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.order.odersDetailsCollection.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></span></h4>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <hr>\r\n");
      out.write("                    <p>Total <span class=\"price\" style=\"color:black; font-weight: bold\" ><span id=\"total\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.order.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span> $</span></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Petsitting</h2>\r\n");
      out.write("                        <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\r\n");
      out.write("                        <ul class=\"ftco-footer-social p-0\">\r\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Twitter\"><span class=\"fa fa-twitter\"></span></a></li>\r\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Facebook\"><span class=\"fa fa-facebook\"></span></a></li>\r\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Instagram\"><span class=\"fa fa-instagram\"></span></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Latest News</h2>\r\n");
      out.write("                        <div class=\"block-21 mb-4 d-flex\">\r\n");
      out.write("                            <a class=\"img mr-4 rounded\" style=\"background-image: url(petsitting/images/image_1.jpg);\"></a>\r\n");
      out.write("                            <div class=\"text\">\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\r\n");
      out.write("                                <div class=\"meta\">\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 7, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"block-21 mb-4 d-flex\">\r\n");
      out.write("                            <a class=\"img mr-4 rounded\" style=\"background-image: url(petsitting/images/image_2.jpg);\"></a>\r\n");
      out.write("                            <div class=\"text\">\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\r\n");
      out.write("                                <div class=\"meta\">\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 7, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 pl-lg-5 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Quick Links</h2>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">About</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Services</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Works</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Blog</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Contact</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Have a Questions?</h2>\r\n");
      out.write("                        <div class=\"block-23 mb-3\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><span class=\"icon fa fa-map\"></span><span class=\"text\">203 Fake St. Mountain View, San Francisco, California, USA</span></li>\r\n");
      out.write("                                <li><a href=\"#\"><span class=\"icon fa fa-phone\"></span><span class=\"text\">+2 392 3929 210</span></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><span class=\"icon fa fa-paper-plane\"></span><span class=\"text\">info@yourdomain.com</span></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row mt-5\">\r\n");
      out.write("                    <div class=\"col-md-12 text-center\">\r\n");
      out.write("\r\n");
      out.write("                        <p class=\"copyright\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib.com</a>\r\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- loader -->\r\n");
      out.write("        <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery-migrate-3.0.1.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.stellar.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.animateNumber.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.timepicker.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/scrollax.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/google-map.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/petsitting/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.order != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.order.odersDetailsCollection.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.order == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                0\r\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li class=\"nav-item dropdown\" >\r\n");
        out.write("                                <a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Member/ListProfile?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username.getMId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"> <fmt:message key=\"home.textfied.profile\"/></a></li>\r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Customers/Logout?logout=ok\"> <fmt:message key=\"home.textfied.logout\"/></a></li>\r\n");
        out.write("                                </ul>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li class=\"nav-item\" >\r\n");
        out.write("                                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Customers/Login\" class=\"nav-link\">\r\n");
        out.write("                                    Login\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <form action=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Order/CheckOut\" method=\"post\">\r\n");
        out.write("                            <div class=\"row\">\r\n");
        out.write("                                <div class=\"col-50\">\r\n");
        out.write("                                    <label for=\"fname\"><i class=\"fa fa-user\"></i> Full Name</label>\r\n");
        out.write("                                    <input type=\"text\" id=\"fname\" name=\"name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Your name \">\r\n");
        out.write("                                    <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\r\n");
        out.write("                                    <input type=\"text\" id=\"email\" name=\"email\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.mail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"john@example.com\">\r\n");
        out.write("                                    <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Address</label>\r\n");
        out.write("                                    <input type=\"text\" id=\"adr\" name=\"address\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Your Address\">   \r\n");
        out.write("                                    <label for=\"adr\"><i class=\"fa fa-phone\"></i> Phone</label>\r\n");
        out.write("                                    <input type=\"text\" id=\"adr\" name=\"phone\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Your Phone\">   \r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-50\">\r\n");
        out.write("                                    <label for=\"fname\">Accepted Cards</label>\r\n");
        out.write("                                    <div class=\"icon-container\">\r\n");
        out.write("                                        <h4><input type=\"radio\" checked=\"true\" name=\"payment\" value=\"Cash\"/> &nbsp;Cash&nbsp;<i class=\"fa fa-money\"></i></h4>\r\n");
        out.write("                                        <h4><input type=\"radio\" name=\"payment\" value=\"Cards\"/> &nbsp;Cards&nbsp;<i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i></h4>\r\n");
        out.write("                                        <label for=\"fname\">Transport</label>\r\n");
        out.write("                                        <select name=\"transport\" id=\"selectTran\" onchange=\"test();\" style=\"text-align: center\">\r\n");
        out.write("                                            <option value=\"Fast\">Fast Shipping</option>\r\n");
        out.write("                                            <option value=\"Normal\" selected=\"true\">Normal</option>\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                        <span id=\"msg\" style=\"font-size: 13px\"></span>\r\n");
        out.write("                                    </div>\r\n");
        out.write("\r\n");
        out.write("                                    <div class=\"row\">\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\r\n");
        out.write("                        </form>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <form action=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Order/CheckOut\" method=\"post\">\r\n");
        out.write("                            <div class=\"row\">\r\n");
        out.write("                                <div class=\"col-50\">\r\n");
        out.write("                                    <label for=\"fname\"><i class=\"fa fa-user\"></i> Full Name</label>\r\n");
        out.write("                                    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your name \">\r\n");
        out.write("                                    <label for=\"email\"><i class=\"fa fa-envelope\"></i> Email</label>\r\n");
        out.write("                                    <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"john@example.com\">\r\n");
        out.write("                                    <label for=\"adr\"><i class=\"fa fa-address-card-o\"></i> Address</label>\r\n");
        out.write("                                    <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"Your Address\">   \r\n");
        out.write("                                </div>\r\n");
        out.write("                                <div class=\"col-50\">\r\n");
        out.write("                                    <label for=\"fname\">Accepted Cards</label>\r\n");
        out.write("                                    <div class=\"icon-container\">\r\n");
        out.write("                                        <h4><input type=\"radio\" checked=\"true\" name=\"payment\" value=\"Cash\"/> &nbsp;Cash&nbsp;<i class=\"fa fa-money\"></i></h4>\r\n");
        out.write("                                        <h4><input type=\"radio\" name=\"payment\" value=\"Cards\"/> &nbsp;Cards&nbsp;<i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i></h4>\r\n");
        out.write("                                        <label for=\"fname\">Transport</label>\r\n");
        out.write("                                        <select name=\"transport\" id=\"selectTran\" onchange=\"test();\" style=\"text-align: center\">\r\n");
        out.write("                                            <option value=\"Fast\">Fast Shipping</option>\r\n");
        out.write("                                            <option value=\"Normal\" selected=\"true\">Normal</option>\r\n");
        out.write("                                        </select>\r\n");
        out.write("                                        <span id=\"msg\" style=\"font-size: 13px\"></span>\r\n");
        out.write("                                    </div>\r\n");
        out.write("\r\n");
        out.write("                                    <div class=\"row\">\r\n");
        out.write("                                    </div>\r\n");
        out.write("                                </div>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\r\n");
        out.write("                        </form>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.order.odersDetailsCollection}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <p><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a><span class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" x ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.productPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</span></p>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
