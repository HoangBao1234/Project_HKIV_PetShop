package org.apache.jsp.Admin.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topPet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Report Pet</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=http://www.freshdesignweb.com/wp-content/themes/fv24/images/icon.ico />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" media=\"all\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\" media=\"all\" />\n");
      out.write("        <style>\n");
      out.write("            h2{\n");
      out.write("                text-indent: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            h3{   \n");
      out.write("                text-indent: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <h1><span>Report</span>Top 5 bestselling Pet</h1>\n");
      out.write("\n");
      out.write("            </header>  \n");
      out.write("            <hr>\n");
      out.write("            <h2>S2 Pet Admin</h2>\n");
      out.write("            <h3>590 Cách Mạng tháng Tám.</h3>\n");
      out.write("            <h3>Quận 3, TP Hồ Chí Minh.</h3>\n");
      out.write("            <h3>Phone: 0387278015.\n");
      out.write("                <h3>Email:dokhanhduy123abc@gmail.com</h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- start header here-->\n");
      out.write("                <header>\n");
      out.write("                    <div id=\"fdw-pricing-table\">\n");
      out.write("                        <div class=\"plan plan1\">\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\n");
      out.write("                            <div class=\"price\">$59</div>  \n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \n");
      out.write("                            <ul>\n");
      out.write("                                <li><b>Loại</b> Dog</li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>         \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"plan plan2 popular-plan\">\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\n");
      out.write("                            <div class=\"price\">$29</div>\n");
      out.write("                            <div class=\"monthly\">Nhân gà</div>  \n");
      out.write("                            <ul>\n");
      out.write("                                <li><b>Loại</b>Gà</li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"plan plan3\">\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\n");
      out.write("                            <div class=\"price\">$29</div>\n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \n");
      out.write("                            <ul>\n");
      out.write("                                <li><b>Loại</b> Dog</li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>        \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"plan plan2 popular-plan\">\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\n");
      out.write("                            <div class=\"price\">$9</div>\n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \n");
      out.write("                            <ul>\n");
      out.write("                                <li><b>Loại</b> Dog</li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>       \n");
      out.write("                        </div> \t\n");
      out.write("                        <div class=\"plan plan5\">\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\n");
      out.write("                            <div class=\"price\">$9</div>\n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \n");
      out.write("                            <ul>\n");
      out.write("                                <li><b>Loại</b> Dog</li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>\n");
      out.write("                        </div> \t\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </header><!-- end header -->\n");
      out.write("\n");
      out.write("        </div>\n");
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
