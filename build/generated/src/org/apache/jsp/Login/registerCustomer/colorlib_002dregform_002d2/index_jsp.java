package org.apache.jsp.Login.registerCustomer.colorlib_002dregform_002d2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags-->\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\r\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Title Page-->\r\n");
      out.write("    <title>Au Register Forms by Colorlib</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Icons font CSS-->\r\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <!-- Font special for pages-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor CSS-->\r\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("    <link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Main CSS-->\r\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"page-wrapper bg-red p-t-180 p-b-100 font-robo\">\r\n");
      out.write("        <div class=\"wrapper wrapper--w960\">\r\n");
      out.write("            <div class=\"card card-2\">\r\n");
      out.write("                <div class=\"card-heading\"></div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h2 class=\"title\">Registration Info</h2>\r\n");
      out.write("                    <form method=\"POST\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input class=\"input--style-2\" type=\"text\" placeholder=\"Name\" name=\"name\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row row-space\">\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-2\" type=\"password\" placeholder=\"Password\" name=\"password\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <div class=\"rs-select2 js-select-simple select--no-search\">\r\n");
      out.write("                                        <input class=\"input--style-2\" type=\"text\" placeholder=\"Phone\" name=\"phone\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <div class=\"rs-select2 js-select-simple select--no-search\">\r\n");
      out.write("                                <input class=\"input--style-2\" type=\"email\" placeholder=\"Email\" name=\"Email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row row-space\">\r\n");
      out.write("                            <div class=\"col-2\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <input class=\"input--style-2\" type=\"text\" placeholder=\"Address\" name=\"address\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"p-t-30\">\r\n");
      out.write("                            <button class=\"btn btn--radius btn--green\"  type=\"submit\">Register</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Jquery JS-->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Vendor JS-->\r\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/datepicker/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/datepicker/daterangepicker.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Main JS-->\r\n");
      out.write("    <script src=\"js/global.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<!-- end document-->");
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
