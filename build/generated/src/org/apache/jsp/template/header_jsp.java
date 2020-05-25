package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\">\n");
      out.write("        <head>\n");
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
      out.write("        <div class=\"container-fluid fh5co_header_bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 fh5co_mediya_center\"><a href=\"#\" class=\"color_fff fh5co_mediya_setting\"><i\n");
      out.write("                                class=\"fa fa-clock-o\"></i>&nbsp;&nbsp;&nbsp;Friday, 5 January 2018</a>\n");
      out.write("                        <div class=\"d-inline-block fh5co_trading_posotion_relative\"><a href=\"#\" class=\"treding_btn\">Trending</a>\n");
      out.write("                            <div class=\"fh5co_treding_position_absolute\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <a href=\"#\" class=\"color_fff fh5co_mediya_setting\">Instagram’s big redesign goes live with black-and-white app</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12 col-md-3 fh5co_padding_menu\">\n");
      out.write("                        <img src=\"../images/logo.png\" alt=\"img\" class=\"fh5co_logo_width\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-12 col-md-9 align-self-center fh5co_mediya_right\">\n");
      out.write("                        <div class=\"text-center d-inline-block\">\n");
      out.write("                            <a class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-search\"></i></div></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center d-inline-block\">\n");
      out.write("                            <a class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-linkedin\"></i></div></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center d-inline-block\">\n");
      out.write("                            <a class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-google-plus\"></i></div></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center d-inline-block\">\n");
      out.write("                            <a href=\"https://twitter.com/fh5co\" target=\"_blank\" class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-twitter\"></i></div></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-center d-inline-block\">\n");
      out.write("                            <a href=\"https://fb.com/fh5co\" target=\"_blank\" class=\"fh5co_display_table\"><div class=\"fh5co_verticle_middle\"><i class=\"fa fa-facebook\"></i></div></a>\n");
      out.write("                        </div>\n");
      out.write("                        <!--<div class=\"d-inline-block text-center\"><img src=\"images/country.png\" alt=\"img\" class=\"fh5co_country_width\"/></div>-->\n");
      out.write("                        <div class=\"d-inline-block text-center dd_position_relative \">\n");
      out.write("                            <select class=\"form-control fh5co_text_select_option\">\n");
      out.write("                                <option>English </option>\n");
      out.write("                                <option>French </option>\n");
      out.write("                                <option>German </option>\n");
      out.write("                                <option>Spanish </option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid bg-faded fh5co_padd_mediya padding_786\">\n");
      out.write("            <div class=\"container padding_786\">\n");
      out.write("                <nav class=\"navbar navbar-toggleable-md navbar-light \">\n");
      out.write("                    <button class=\"navbar-toggler navbar-toggler-right mt-3\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("                            data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("                            aria-label=\"Toggle navigation\"><span class=\"fa fa-bars\"></span></button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><img src=\"images/logo.png\" alt=\"img\" class=\"mobile_logo_width\"/></a>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"../index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link\" href=\"../blog.jsp\">Blog <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link\" href=\"../single.jsp\">Single <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdownMenuButton2\" data-toggle=\"dropdown\"\n");
      out.write("                                   aria-haspopup=\"true\" aria-expanded=\"false\">World <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink_1\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Action in</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdownMenuButton3\" data-toggle=\"dropdown\"\n");
      out.write("                                   aria-haspopup=\"true\" aria-expanded=\"false\">Community<span class=\"sr-only\">(current)</span></a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuLink_1\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Action in</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item \">\n");
      out.write("                                <a class=\"nav-link\" href=\"../Contact_us.jsp\">Contact <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
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
      out.write("\n");
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
