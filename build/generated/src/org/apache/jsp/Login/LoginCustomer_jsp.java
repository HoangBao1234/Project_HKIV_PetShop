package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"style.scss\">\n");
      out.write("        <script>\n");
      out.write("            $('#password').focusin(function() {\n");
      out.write("                $('form').addClass('up')\n");
      out.write("            });\n");
      out.write("            $('#password').focusout(function() {\n");
      out.write("                $('form').removeClass('up')\n");
      out.write("            });\n");
      out.write("\n");
      out.write("// Panda Eye move\n");
      out.write("            $(document).on(\"mousemove\", function(event) {\n");
      out.write("                var dw = $(document).width() / 15;\n");
      out.write("                var dh = $(document).height() / 15;\n");
      out.write("                var x = event.pageX / dw;\n");
      out.write("                var y = event.pageY / dh;\n");
      out.write("                $('.eye-ball').css({\n");
      out.write("                    width: x,\n");
      out.write("                    height: y\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("// validation\n");
      out.write("\n");
      out.write("\n");
      out.write("            $('.btn').click(function() {\n");
      out.write("                $('form').addClass('wrong-entry');\n");
      out.write("                setTimeout(function() {\n");
      out.write("                    $('form').removeClass('wrong-entry');\n");
      out.write("                }, 3000);\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"panda\">\n");
      out.write("            <div class=\"ear\"></div>\n");
      out.write("            <div class=\"face\">\n");
      out.write("                <div class=\"eye-shade\"></div>\n");
      out.write("                <div class=\"eye-white\">\n");
      out.write("                    <div class=\"eye-ball\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"eye-shade rgt\"></div>\n");
      out.write("                <div class=\"eye-white rgt\">\n");
      out.write("                    <div class=\"eye-ball\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"nose\"></div>\n");
      out.write("                <div class=\"mouth\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"body\"> </div>\n");
      out.write("            <div class=\"foot\">\n");
      out.write("                <div class=\"finger\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"foot rgt\">\n");
      out.write("                <div class=\"finger\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"hand\"></div>\n");
      out.write("            <div class=\"hand rgt\"></div>\n");
      out.write("            <h1>Pet Login</h1>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input required=\"required\" class=\"form-control\"/>\n");
      out.write("                <label class=\"form-label\">Email    </label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input id=\"password\" type=\"password\" required=\"required\" class=\"form-control\"/>\n");
      out.write("                <label class=\"form-label\">Password</label>\n");
      out.write("                <p class=\"alert\">Invalid Credentials..!!</p>\n");
      out.write("                <button class=\"btn\" name=\"action\">Login </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
