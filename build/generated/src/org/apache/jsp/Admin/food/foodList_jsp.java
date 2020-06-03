package org.apache.jsp.Admin.food;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class foodList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Food List</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Custom fonts for this template-->\n");
      out.write("        <link href=\"../vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom styles for this template-->\n");
      out.write("        <link href=\"../css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("                <!-- Sidebar - Brand -->\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index.html\">\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                        <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">SB Admin <sup>2</sup></div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Dashboard -->\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("                        <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                        <span>Dashboard</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("                        <span>Pet Components</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Pet Components:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"../pet/addPet.jsp\">Add Pet</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"cards.html\">Pet manement</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#foods\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("                        <span>Foods Components</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"foods\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Foods Components:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"../food/addFood.jsp\">Add Food</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"cards.html\">Food manement</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#animals\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("                        <span>Animals Components</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"animals\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Animals Components:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"../animals/addAnimals.jsp\">Add Animals</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"cards.html\">Animals manement</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#accessories\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("                        <span style=\"font-size: 12px\">Accessories Components</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"accessories\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Accessories Components:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"../accessories/addAccessories.jsp\">Add Accessories</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"cards.html\">Accessories manement</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#breed\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                        <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("                        <span style=\"font-size: 12px\">Breed Components</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"breed\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">breed Components:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"addBreeds.jsp\">Add Breed</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"cards.html\">Breed manement</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Utilities Collapse Menu -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("                        <i class=\"fas fa-fw fa-wrench\"></i>\n");
      out.write("                        <span>Utilities</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Custom Utilities:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"utilities-color.html\">Colors</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"utilities-border.html\">Borders</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"utilities-animation.html\">Animations</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"utilities-other.html\">Other</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("                <!-- Heading -->\n");
      out.write("                <div class=\"sidebar-heading\">\n");
      out.write("                    Addons\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\" aria-expanded=\"true\" aria-controls=\"collapsePages\">\n");
      out.write("                        <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                        <span>Pages</span>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\n");
      out.write("                        <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                            <h6 class=\"collapse-header\">Login Screens:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"login.html\">Login</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"register.html\">Register</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"forgot-password.html\">Forgot Password</a>\n");
      out.write("                            <div class=\"collapse-divider\"></div>\n");
      out.write("                            <h6 class=\"collapse-header\">Other Pages:</h6>\n");
      out.write("                            <a class=\"collapse-item\" href=\"404.html\">404 Page</a>\n");
      out.write("                            <a class=\"collapse-item\" href=\"blank.html\">Blank Page</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Charts -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"charts.html\">\n");
      out.write("                        <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                        <span>Charts</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Nav Item - Tables -->\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"tables.html\">\n");
      out.write("                        <i class=\"fas fa-fw fa-table\"></i>\n");
      out.write("                        <span>Tables</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <!-- Divider -->\n");
      out.write("                <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("                <div id=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Topbar -->\n");
      out.write("                    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                        <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                        <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <!-- Topbar Search -->\n");
      out.write("                        <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                                <div class=\"input-group-append\">\n");
      out.write("                                    <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                        <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <!-- Topbar Navbar -->\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - Messages -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\" aria-labelledby=\"searchDropdown\">\n");
      out.write("                                    <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                                            <div class=\"input-group-append\">\n");
      out.write("                                                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Alerts -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                                    <!-- Counter - Alerts -->\n");
      out.write("                                    <span class=\"badge badge-danger badge-counter\">3+</span>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - Alerts -->\n");
      out.write("                                <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("                                    <h6 class=\"dropdown-header\">\n");
      out.write("                                        Alerts Center\n");
      out.write("                                    </h6>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"mr-3\">\n");
      out.write("                                            <div class=\"icon-circle bg-primary\">\n");
      out.write("                                                <i class=\"fas fa-file-alt text-white\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"small text-gray-500\">December 12, 2019</div>\n");
      out.write("                                            <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"mr-3\">\n");
      out.write("                                            <div class=\"icon-circle bg-success\">\n");
      out.write("                                                <i class=\"fas fa-donate text-white\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"small text-gray-500\">December 7, 2019</div>\n");
      out.write("                                            $290.29 has been deposited into your account!\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"mr-3\">\n");
      out.write("                                            <div class=\"icon-circle bg-warning\">\n");
      out.write("                                                <i class=\"fas fa-exclamation-triangle text-white\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"small text-gray-500\">December 2, 2019</div>\n");
      out.write("                                            Spending Alert: We've noticed unusually high spending for your account.\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - Messages -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                                    <!-- Counter - Messages -->\n");
      out.write("                                    <span class=\"badge badge-danger badge-counter\">7</span>\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - Messages -->\n");
      out.write("                                <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"messagesDropdown\">\n");
      out.write("                                    <h6 class=\"dropdown-header\">\n");
      out.write("                                        Message Center\n");
      out.write("                                    </h6>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/fn_BT9fwg_E/60x60\" alt=\"\">\n");
      out.write("                                            <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"font-weight-bold\">\n");
      out.write("                                            <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a problem I've been having.</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Emily Fowler Â· 58m</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/AU4VPcFN4LE/60x60\" alt=\"\">\n");
      out.write("                                            <div class=\"status-indicator\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"text-truncate\">I have the photos that you ordered last month, how would you like them sent to you?</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Jae Chun Â· 1d</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/CS2uCrpNzJY/60x60\" alt=\"\">\n");
      out.write("                                            <div class=\"status-indicator bg-warning\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"text-truncate\">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Morgan Alvarez Â· 2d</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                        <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                            <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\" alt=\"\">\n");
      out.write("                                            <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>\n");
      out.write("                                            <div class=\"small text-gray-500\">Chicken the Dog Â· 2w</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("                            <!-- Nav Item - User Information -->\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Valerie Luna</span>\n");
      out.write("                                    <img class=\"img-profile rounded-circle\" src=\"https://source.unsplash.com/QAB-WJcbgJk/60x60\">\n");
      out.write("                                </a>\n");
      out.write("                                <!-- Dropdown - User Information -->\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Profile\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Settings\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                        <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Activity Log\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                        Logout\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                        <div style=\"padding: 50px\">\n");
      out.write("                            <h4 style=\"color: #006dcc\">+ Create new food</h4>\n");
      out.write("                            <center>\n");
      out.write("                                <h2 style=\"color: #006dcc\">Foods List</h2>\n");
      out.write("                                <table class=\"table table-hover\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"col\" style=\"color: #006dcc\">Id</th>\n");
      out.write("                                            <th scope=\"col\" style=\"color: #006dcc\">Name</th>\n");
      out.write("                                            <th scope=\"col\" style=\"color: #006dcc\">Price</th>\n");
      out.write("                                            <th scope=\"col\" style=\"color: #006dcc\">Action</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">1</th>\n");
      out.write("                                            <td>Mark</td>\n");
      out.write("                                            <td>500 $</td>\n");
      out.write("                                            <td>Edit || Delete || Details</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">2</th>\n");
      out.write("                                            <td>Jacob</td>\n");
      out.write("                                            <td>500 $</td>\n");
      out.write("                                            <td>Edit || Delete || Details</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th scope=\"row\">3</th>\n");
      out.write("                                            <td>Jacob</td>\n");
      out.write("                                            <td>500 $</td>\n");
      out.write("                                            <td>Edit || Delete || Details</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                <script src=\"../vendor/jquery/jquery.min.js\"></script>\n");
      out.write("                <script src=\"../vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Core plugin JavaScript-->\n");
      out.write("                <script src=\"../vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Custom scripts for all pages-->\n");
      out.write("                <script src=\"../js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Page level plugins -->\n");
      out.write("                <script src=\"../vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("                <!-- Page level custom scripts -->\n");
      out.write("                <script src=\"../js/demo/chart-area-demo.js\"></script>\n");
      out.write("                <script src=\"../js/demo/chart-pie-demo.js\"></script>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
