package org.apache.jsp.Admin.report.Pet;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Report Pet</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=http://www.freshdesignweb.com/wp-content/themes/fv24/images/icon.ico />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" media=\"all\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"demo.css\" media=\"all\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            h2{\r\n");
      out.write("                text-indent: 30px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("            h3{   \r\n");
      out.write("                text-indent: 30px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <header>\r\n");
      out.write("                <h1><span>Report</span>Top 5 bestselling Pet</h1>\r\n");
      out.write("\r\n");
      out.write("            </header>  \r\n");
      out.write("            <hr>\r\n");
      out.write("            <h2>S2 Pet Admin</h2>\r\n");
      out.write("            <h3>590 Cách Mạng tháng Tám.</h3>\r\n");
      out.write("            <h3>Quận 3, TP Hồ Chí Minh.</h3>\r\n");
      out.write("            <h3>Phone: 0387278015.\r\n");
      out.write("                <h3>Email:dokhanhduy123abc@gmail.com</h3>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- start header here-->\r\n");
      out.write("                <header>\r\n");
      out.write("                    <div id=\"fdw-pricing-table\">\r\n");
      out.write("                        <div class=\"plan plan1\">\r\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\r\n");
      out.write("                            <div class=\"price\">$59</div>  \r\n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><b>Loại</b> Dog</li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>         \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"plan plan2 popular-plan\">\r\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\r\n");
      out.write("                            <div class=\"price\">$29</div>\r\n");
      out.write("                            <div class=\"monthly\">Nhân gà</div>  \r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><b>Loại</b>Gà</li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"plan plan3\">\r\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\r\n");
      out.write("                            <div class=\"price\">$29</div>\r\n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><b>Loại</b> Dog</li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>        \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"plan plan2 popular-plan\">\r\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\r\n");
      out.write("                            <div class=\"price\">$9</div>\r\n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><b>Loại</b> Dog</li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>       \r\n");
      out.write("                        </div> \t\r\n");
      out.write("                        <div class=\"plan plan5\">\r\n");
      out.write("                            <div class=\"header\"><img src=\"../Hình-ảnh-cún-con-dễ-thương-cute-làm-hình-nền-đẹp-1.jpg\" width=\"110\" height=\"100\"/></div>\r\n");
      out.write("                            <div class=\"price\">$9</div>\r\n");
      out.write("                            <div class=\"monthly\">Bảo</div>  \r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><b>Loại</b> Dog</li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <a class=\"signup\" href=\"http://www.freshdesignweb.com\">Add Cart</a>\r\n");
      out.write("                        </div> \t\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header><!-- end header -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
