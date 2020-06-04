package org.apache.jsp.Admin.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>SB Admin 2 - Dashboard</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"../vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"../css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("                <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                    <div class=\"container my-auto\">\r\n");
      out.write("                        <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                            <span>Copyright &copy; Your Website 2019</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>                \r\n");
      out.write("            </div>           \r\n");
      out.write("        </div>\r\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("       \r\n");
      out.write("        <script src=\"../vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"../vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core plugin JavaScript-->\r\n");
      out.write("        <script src=\"../vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom scripts for all pages-->\r\n");
      out.write("        <script src=\"../js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level plugins -->\r\n");
      out.write("        <script src=\"../vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level custom scripts -->\r\n");
      out.write("        <script src=\"../js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("        <script src=\"../js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
