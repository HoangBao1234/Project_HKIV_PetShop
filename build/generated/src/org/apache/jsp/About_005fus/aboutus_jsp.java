package org.apache.jsp.About_005fus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/0644aaed0c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- add icon link -->\n");
      out.write("        <link rel = \"icon\" href =\"https://png.pngtree.com/png-clipart/20190916/original/pngtree-pet-icon-png-image_4584897.jpg\" type = \"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/animate.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/bootstrap-datepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        .container1{\n");
      out.write("            display: flex;\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 4% 2%;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("        .box{\n");
      out.write("            flex: 1;\n");
      out.write("            overflow: hidden;\n");
      out.write("           transition: 0.5s;\n");
      out.write("           margin: 0 2%;\n");
      out.write("           box-shadow: 0 20px 30px rgba(0,0,0,0.1);\n");
      out.write("           line-height: 0; \n");
      out.write("        }\n");
      out.write("        .box > img{\n");
      out.write("            width: 200%;\n");
      out.write("            height: calc(100% - 10vh);\n");
      out.write("            object-fit: cover;\n");
      out.write("            transition: 0.5s;\n");
      out.write("        }\n");
      out.write("        .box > span{\n");
      out.write("            font-size: 3vh;\n");
      out.write("            display: block;\n");
      out.write("            text-align: center;\n");
      out.write("            height: 10vh;\n");
      out.write("            line-height: 2.5s;\n");
      out.write("            font-family: tahoma;\n");
      out.write("            color: #ff9999;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("        .box:hover{\n");
      out.write("            flex: 1 1 50%;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .box:hover > img{\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     <div class=\"wrap\">\n");
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
      out.write("                <a class=\"navbar-brand\" href=\"index.html\"><span class=\"flaticon-pawprint-1 mr-2\"></span>Pet Shop</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"fa fa-bars\"></span> Menu\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item active\"><a href=\"index.html\" class=\"nav-link\">Home</a></li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item dropdown\" ><a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">Product</a>\n");
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
      out.write("                        <li class=\"nav-item\"><a href=\"services.html\" class=\"nav-link\">PetHotel</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"About_us/aboutus.jsp\" class=\"nav-link\">About</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Order/View\" class=\"nav-link\"><i class=\"fas fa-shopping-cart\"></i></a></li>\n");
      out.write("                                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <li class=\"nav-item dropdown\" >\n");
      out.write("                                <a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\n");
      out.write("                                    <li><a href=\"#\">Profile</a></li>\n");
      out.write("                                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Customers/Logout?logout=ok\">Logout</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </c:if>\n");
      out.write("                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <li class=\"nav-item\" >\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Customers/Login\" class=\"nav-link\">\n");
      out.write("                                    Login\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </c:if>\n");
      out.write("                            <li class=\"nav-item dropdown\" ><a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">Language</a>\n");
      out.write("                            <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\n");
      out.write("                                <li><a href=\"#\">Vietnamese</a></li>\n");
      out.write("                                <li><a href=\"#\">English</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- END nav -->\n");
      out.write("    <div class=\"container1\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <img src=\"../ImageItems/103306787_2685307088420205_2140847627820034488_o.jpg\" alt=\"\">\n");
      out.write("            <span>NGUYEN HOANG BAO</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <img src=\"../ImageItems/15726706_222626308186911_4992976810070775594_n.jpg\" alt=\"\">\n");
      out.write("            <span>PHAM HUU NHAN</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <img src=\"../ImageItems/103587739_140932717570549_2479435794499285162_o.jpg\" alt=\"\">\n");
      out.write("            <span>DO KHANH DUY</span>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
}
