package org.apache.jsp.template;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>PET SHOP</title>\n");
      out.write("        <link href=\"../css/media_query.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"../css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/owl.carousel.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../css/owl.theme.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"../css/style_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"../js/modernizr-3.5.0.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid fh5co_footer_bg pb-3\">\n");
      out.write("            <div class=\"container animate-box\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 spdp_right py-5\"><img src=\"../images/white_logo.png\" alt=\"img\" class=\"footer_logo\"/></div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div class=\"col-12 col-md-4 col-lg-3\">\n");
      out.write("                        <div class=\"footer_main_title py-3\"> About</div>\n");
      out.write("                        <div class=\"footer_sub_about pb-3\"> Lorem Ipsum is simply dummy text of the printing and typesetting\n");
      out.write("                            industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an\n");
      out.write("                            unknown printer took a galley of type and scrambled it to make a type specimen book.\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"footer_mediya_icon\">\n");
      out.write("                            <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n");
      out.write("                                    <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-linkedin\"></i></div>\n");
      out.write("                                </a></div>\n");
      out.write("                            <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n");
      out.write("                                    <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-google-plus\"></i></div>\n");
      out.write("                                </a></div>\n");
      out.write("                            <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n");
      out.write("                                    <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-twitter\"></i></div>\n");
      out.write("                                </a></div>\n");
      out.write("                            <div class=\"text-center d-inline-block\"><a class=\"fh5co_display_table_footer\">\n");
      out.write("                                    <div class=\"fh5co_verticle_middle\"><i class=\"fa fa-facebook\"></i></div>\n");
      out.write("                                </a></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-3 col-lg-2\">\n");
      out.write("                        <div class=\"footer_main_title py-3\"> Category</div>\n");
      out.write("                        <ul class=\"footer_menu\">\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Business</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Entertainment</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Environment</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Health</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Life style</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Politics</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; Technology</a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"\"><i class=\"fa fa-angle-right\"></i>&nbsp;&nbsp; World</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-5 col-lg-3 position_footer_relative\">\n");
      out.write("                        <div class=\"footer_main_title py-3\"> Most Viewed Posts</div>\n");
      out.write("                        <div class=\"footer_makes_sub_font\"> Dec 31, 2016</div>\n");
      out.write("                        <a href=\"#\" class=\"footer_post pb-4\"> Success is not a good teacher failure makes you humble </a>\n");
      out.write("                        <div class=\"footer_makes_sub_font\"> Dec 31, 2016</div>\n");
      out.write("                        <a href=\"#\" class=\"footer_post pb-4\"> Success is not a good teacher failure makes you humble </a>\n");
      out.write("                        <div class=\"footer_makes_sub_font\"> Dec 31, 2016</div>\n");
      out.write("                        <a href=\"#\" class=\"footer_post pb-4\"> Success is not a good teacher failure makes you humble </a>\n");
      out.write("                        <div class=\"footer_position_absolute\"><img src=\"../images/footer_sub_tipik.png\" alt=\"img\" class=\"width_footer_sub_img\"/></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-12 col-lg-4 \">\n");
      out.write("                        <div class=\"footer_main_title py-3\"> Last Modified Posts</div>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/allef-vinicius-108153.jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/32-450x260.jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/download (1).jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/science-578x362.jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/vil-son-35490.jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/zack-minor-15104.jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/download.jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/download (2).jpg\" alt=\"img\"/></a>\n");
      out.write("                        <a href=\"#\" class=\"footer_img_post_6\"><img src=\"../images/ryan-moreno-98837.jpg\" alt=\"img\"/></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row justify-content-center pt-2 pb-4\">\n");
      out.write("                    <div class=\"col-12 col-md-8 col-lg-7 \">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <span class=\"input-group-addon fh5co_footer_text_box\" id=\"basic-addon1\"><i class=\"fa fa-envelope\"></i></span>\n");
      out.write("                            <input type=\"text\" class=\"form-control fh5co_footer_text_box\" placeholder=\"Enter your email...\" aria-describedby=\"basic-addon1\">\n");
      out.write("                            <a href=\"#\" class=\"input-group-addon fh5co_footer_subcribe\" id=\"basic-addon12\"> <i class=\"fa fa-paper-plane-o\"></i>&nbsp;&nbsp;Subscribe</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid fh5co_footer_right_reserved\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row  \">\n");
      out.write("                    <div class=\"col-12 col-md-6 py-4 Reserved\"> © Copyright 2018, All rights reserved. Design by <a href=\"https://freehtml5.co\" title=\"Free HTML5 Bootstrap templates\">FreeHTML5.co</a>. </div>\n");
      out.write("                    <div class=\"col-12 col-md-6 spdp_right py-4\">\n");
      out.write("                        <a href=\"../index.jsp\" class=\"footer_last_part_menu\">Home</a>\n");
      out.write("                        <a href=\"../Contact_us.jsp\" class=\"footer_last_part_menu\">About</a>\n");
      out.write("                        <a href=\"../Contact_us.jsp\" class=\"footer_last_part_menu\">Contact</a>\n");
      out.write("                        <a href=\"../blog.jsp\" class=\"footer_last_part_menu\">Latest News</a></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"gototop js-top\">\n");
      out.write("            <a href=\"#\" class=\"js-gotop\"><i class=\"fa fa-arrow-up\"></i></a>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"../js/owl.carousel.min.js\"></script>\n");
      out.write("        <!--<script src=\"https://code.jquery.com/jquery-3.1.1.slim.min.js\" integrity=\"sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n\" crossorigin=\"anonymous\"></script>-->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\"\n");
      out.write("                integrity=\"sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\"\n");
      out.write("                integrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"../js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Main -->\n");
      out.write("        <script src=\"../js/main.js\"></script>\n");
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
}
