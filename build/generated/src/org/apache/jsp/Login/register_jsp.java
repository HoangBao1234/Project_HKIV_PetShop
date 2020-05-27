package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("  <title>SB Admin 2 - Register</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom fonts for this template-->\r\n");
      out.write("  <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom styles for this template-->\r\n");
      out.write("  <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"bg-gradient-primary\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("      <div class=\"card-body p-0\">\r\n");
      out.write("        <!-- Nested Row within Card Body -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("          <div class=\"col-lg-5 d-none d-lg-block bg-register-image\"></div>\r\n");
      out.write("          <div class=\"col-lg-7\">\r\n");
      out.write("            <div class=\"p-5\">\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <h1 class=\"h4 text-gray-900 mb-4\">Create an Account!</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("              <form class=\"user\">\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                  <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control form-control-user\" id=\"exampleFirstName\" placeholder=\"First Name\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-sm-6\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control form-control-user\" id=\"exampleLastName\" placeholder=\"Last Name\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"email\" class=\"form-control form-control-user\" id=\"exampleInputEmail\" placeholder=\"Email Address\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group row\">\r\n");
      out.write("                  <div class=\"col-sm-6 mb-3 mb-sm-0\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control form-control-user\" id=\"exampleInputPassword\" placeholder=\"Password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-sm-6\">\r\n");
      out.write("                    <input type=\"password\" class=\"form-control form-control-user\" id=\"exampleRepeatPassword\" placeholder=\"Repeat Password\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"login.html\" class=\"btn btn-primary btn-user btn-block\">\r\n");
      out.write("                  Register Account\r\n");
      out.write("                </a>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <a href=\"index.html\" class=\"btn btn-google btn-user btn-block\">\r\n");
      out.write("                  <i class=\"fab fa-google fa-fw\"></i> Register with Google\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"index.html\" class=\"btn btn-facebook btn-user btn-block\">\r\n");
      out.write("                  <i class=\"fab fa-facebook-f fa-fw\"></i> Register with Facebook\r\n");
      out.write("                </a>\r\n");
      out.write("              </form>\r\n");
      out.write("              <hr>\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <a class=\"small\" href=\"forgot-password.html\">Forgot Password?</a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"text-center\">\r\n");
      out.write("                <a class=\"small\" href=\"login.html\">Already have an account? Login!</a>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Bootstrap core JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Core plugin JavaScript-->\r\n");
      out.write("  <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  <!-- Custom scripts for all pages-->\r\n");
      out.write("  <script src=\"js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
