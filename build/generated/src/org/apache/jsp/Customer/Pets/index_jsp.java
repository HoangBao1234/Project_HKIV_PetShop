package org.apache.jsp.Customer.Pets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Members;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>PetShop</title>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Montserrat:200,300,400,500,600,700,800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/0644aaed0c.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <!-- add icon link -->\r\n");
      out.write("        <link rel = \"icon\" href =\"https://png.pngtree.com/png-clipart/20190916/original/pngtree-pet-icon-png-image_4584897.jpg\" type = \"image/x-icon\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/animate.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/owl.carousel.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/owl.theme.default.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/bootstrap-datepicker.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/jquery.timepicker.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/flaticon.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"petsitting/css/style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 d-flex align-items-center\">\r\n");
      out.write("                        <p class=\"mb-0 phone pl-md-2\">\r\n");
      out.write("                            <a href=\"#\" class=\"mr-2\"><span class=\"fa fa-phone mr-1\"></span> +00 1234 567</a> \r\n");
      out.write("                            <a href=\"#\"><span class=\"fa fa-paper-plane mr-1\"></span> youremail@email.com</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 d-flex justify-content-md-end\">\r\n");
      out.write("                        <div class=\"social-media\">\r\n");
      out.write("                            <p class=\"mb-0 d-flex\">\r\n");
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\" id=\"ftco-navbar\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\"><span class=\"flaticon-pawprint-1 mr-2\"></span>Pet Shop</a>\r\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#ftco-nav\" aria-controls=\"ftco-nav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                    <span class=\"fa fa-bars\"></span> Menu\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                        <li class=\"nav-item active\"><a href=\"index.html\" class=\"nav-link\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"nav-item dropdown\" ><a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">Product</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\r\n");
      out.write("                                <li><a href=\"#\">Pet</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Food</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Accessoreis</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"services.html\" class=\"nav-link\">PetHotel</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"about.html\" class=\"nav-link\">About</a></li>\r\n");
      out.write("                        <li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\"><i class=\"fas fa-shopping-cart\"></i></a></li>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <li class=\"nav-item dropdown\" ><a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">Language</a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\r\n");
      out.write("                                <li><a href=\"#\">Vietnamese</a></li>\r\n");
      out.write("                                <li><a href=\"#\">English</a></li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- END nav -->\r\n");
      out.write("        <div class=\"hero-wrap js-fullheight\" style=\"background-image: url('images/bg_1.jpg');\" data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("            <div class=\"overlay\"></div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row no-gutters slider-text js-fullheight align-items-center justify-content-center\" data-scrollax-parent=\"true\">\r\n");
      out.write("                    <div class=\"col-md-11 ftco-animate text-center\">\r\n");
      out.write("                        <h1 class=\"mb-4\">Highest Quality Care For Pets You'll Love </h1>\r\n");
      out.write("                        <p><a href=\"#\" class=\"btn btn-primary mr-md-4 py-3 px-4\">Learn more <span class=\"ion-ios-arrow-forward\"></span></a></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"ftco-section bg-light ftco-no-pt ftco-intro\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4 d-flex align-self-stretch px-4 ftco-animate\">\r\n");
      out.write("                        <div class=\"d-block services active text-center\">\r\n");
      out.write("                            <div class=\"icon d-flex align-items-center justify-content-center\">\r\n");
      out.write("                                <span class=\"flaticon-blind\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"media-body\">\r\n");
      out.write("                                <h3 class=\"heading\" style=\"margin-top: 20px\">Pets</h3>\r\n");
      out.write("                                <p>Carefully selected pets are fully vaccinated, have clear origins, and are reasonably priced in the market</p>\r\n");
      out.write("                                <a href=\"#\" class=\"btn-custom d-flex align-items-center justify-content-center\"><span class=\"fa fa-chevron-right\"></span><i class=\"sr-only\">Read more</i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>      \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 d-flex align-self-stretch px-4 ftco-animate\">\r\n");
      out.write("                        <div class=\"d-block services text-center\">\r\n");
      out.write("                            <div class=\"icon d-flex align-items-center justify-content-center\">\r\n");
      out.write("                                <span class=\"flaticon-dog-eating\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"media-body\">\r\n");
      out.write("                                <h3 class=\"heading\" style=\"margin-top: 20px\">Foods</h3>\r\n");
      out.write("                                <p>PetShop is a leading partner providing pet dogs and domesticated cats for breeding farms, pet dog shops nationwide.</p>\r\n");
      out.write("                                <a href=\"#\" class=\"btn-custom d-flex align-items-center justify-content-center\"><span class=\"fa fa-chevron-right\"></span><i class=\"sr-only\">Read more</i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 d-flex align-self-stretch px-4 ftco-animate\">\r\n");
      out.write("                        <div class=\"d-block services text-center\">\r\n");
      out.write("                            <div class=\"icon d-flex align-items-center justify-content-center\">\r\n");
      out.write("                                <span class=\"flaticon-grooming\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"media-body\">\r\n");
      out.write("                                <h3 class=\"heading\" style=\"margin-top: 20px\">Accessories</h3>\r\n");
      out.write("                                <p>Providing accessories to help take care of your pet better saves time</p>\r\n");
      out.write("                                <a href=\"#\" class=\"btn-custom d-flex align-items-center justify-content-center\"><span class=\"fa fa-chevron-right\"></span><i class=\"sr-only\">Read more</i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>      \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section\r\n");
      out.write("\r\n");
      out.write("        <section class=\"ftco-section bg-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row d-flex\">\r\n");
      out.write("                    <div class=\"col-md-4 d-flex ftco-animate\">\r\n");
      out.write("                        <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("                            <a href=\"blog-single.html\" class=\"block-20 rounded\" style=\"background-image: url('images/image_1.jpg');\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"text p-4\">\r\n");
      out.write("                                <div class=\"meta mb-2\">\r\n");
      out.write("                                    <div><a href=\"#\">April 07, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\" class=\"meta-chat\"><span class=\"fa fa-comment\"></span> 3</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 d-flex ftco-animate\">\r\n");
      out.write("                        <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("                            <a href=\"blog-single.html\" class=\"block-20 rounded\" style=\"background-image: url('images/image_2.jpg');\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"text p-4\">\r\n");
      out.write("                                <div class=\"meta mb-2\">\r\n");
      out.write("                                    <div><a href=\"#\">April 07, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\" class=\"meta-chat\"><span class=\"fa fa-comment\"></span> 3</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 d-flex ftco-animate\">\r\n");
      out.write("                        <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("                            <a href=\"blog-single.html\" class=\"block-20 rounded\" style=\"background-image: url('images/image_3.jpg');\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"text p-4\">\r\n");
      out.write("                                <div class=\"meta mb-2\">\r\n");
      out.write("                                    <div><a href=\"#\">April 07, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\" class=\"meta-chat\"><span class=\"fa fa-comment\"></span> 3</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4 d-flex ftco-animate\">\r\n");
      out.write("                        <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("                            <a href=\"blog-single.html\" class=\"block-20 rounded\" style=\"background-image: url('images/image_4.jpg');\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"text p-4\">\r\n");
      out.write("                                <div class=\"meta mb-2\">\r\n");
      out.write("                                    <div><a href=\"#\">April 07, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\" class=\"meta-chat\"><span class=\"fa fa-comment\"></span> 3</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 d-flex ftco-animate\">\r\n");
      out.write("                        <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("                            <a href=\"blog-single.html\" class=\"block-20 rounded\" style=\"background-image: url('images/image_5.jpg');\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"text p-4\">\r\n");
      out.write("                                <div class=\"meta mb-2\">\r\n");
      out.write("                                    <div><a href=\"#\">April 07, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\" class=\"meta-chat\"><span class=\"fa fa-comment\"></span> 3</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 d-flex ftco-animate\">\r\n");
      out.write("                        <div class=\"blog-entry align-self-stretch\">\r\n");
      out.write("                            <a href=\"blog-single.html\" class=\"block-20 rounded\" style=\"background-image: url('images/image_6.jpg');\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"text p-4\">\r\n");
      out.write("                                <div class=\"meta mb-2\">\r\n");
      out.write("                                    <div><a href=\"#\">April 07, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\">Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\" class=\"meta-chat\"><span class=\"fa fa-comment\"></span> 3</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about the blind texts</a></h3>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row mt-5\">\r\n");
      out.write("                    <div class=\"col text-center\">\r\n");
      out.write("                        <div class=\"block-27\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\">&lt;</a></li>\r\n");
      out.write("                                <li class=\"active\"><span>1</span></li>\r\n");
      out.write("                                <li><a href=\"#\">2</a></li>\r\n");
      out.write("                                <li><a href=\"#\">3</a></li>\r\n");
      out.write("                                <li><a href=\"#\">4</a></li>\r\n");
      out.write("                                <li><a href=\"#\">5</a></li>\r\n");
      out.write("                                <li><a href=\"#\">&gt;</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Petsitting</h2>\r\n");
      out.write("                        <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\r\n");
      out.write("                        <ul class=\"ftco-footer-social p-0\">\r\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Twitter\"><span class=\"fa fa-twitter\"></span></a></li>\r\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Facebook\"><span class=\"fa fa-facebook\"></span></a></li>\r\n");
      out.write("                            <li class=\"ftco-animate\"><a href=\"#\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Instagram\"><span class=\"fa fa-instagram\"></span></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Latest News</h2>\r\n");
      out.write("                        <div class=\"block-21 mb-4 d-flex\">\r\n");
      out.write("                            <a class=\"img mr-4 rounded\" style=\"background-image: url(images/image_1.jpg);\"></a>\r\n");
      out.write("                            <div class=\"text\">\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\r\n");
      out.write("                                <div class=\"meta\">\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 7, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"block-21 mb-4 d-flex\">\r\n");
      out.write("                            <a class=\"img mr-4 rounded\" style=\"background-image: url(images/image_2.jpg);\"></a>\r\n");
      out.write("                            <div class=\"text\">\r\n");
      out.write("                                <h3 class=\"heading\"><a href=\"#\">Even the all-powerful Pointing has no control about</a></h3>\r\n");
      out.write("                                <div class=\"meta\">\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-calendar\"></span> April 7, 2020</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-person\"></span> Admin</a></div>\r\n");
      out.write("                                    <div><a href=\"#\"><span class=\"icon-chat\"></span> 19</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 pl-lg-5 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Quick Links</h2>\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Home</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">About</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Services</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Works</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Blog</a></li>\r\n");
      out.write("                            <li><a href=\"#\" class=\"py-2 d-block\">Contact</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 col-lg-3 mb-4 mb-md-0\">\r\n");
      out.write("                        <h2 class=\"footer-heading\">Have a Questions?</h2>\r\n");
      out.write("                        <div class=\"block-23 mb-3\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><span class=\"icon fa fa-map\"></span><span class=\"text\">203 Fake St. Mountain View, San Francisco, California, USA</span></li>\r\n");
      out.write("                                <li><a href=\"#\"><span class=\"icon fa fa-phone\"></span><span class=\"text\">+2 392 3929 210</span></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><span class=\"icon fa fa-paper-plane\"></span><span class=\"text\">info@yourdomain.com</span></a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row mt-5\">\r\n");
      out.write("                    <div class=\"col-md-12 text-center\">\r\n");
      out.write("\r\n");
      out.write("                        <p class=\"copyright\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib.com</a>\r\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- loader -->\r\n");
      out.write("        <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.animateNumber.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.timepicker.min.js\"></script>\r\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <script src=\"js/scrollax.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\r\n");
      out.write("        <script src=\"js/google-map.js\"></script>\r\n");
      out.write("        <script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("context");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li class=\"nav-item dropdown\" >\r\n");
        out.write("                                <a href=\"about.html\" class=\"nav-link  dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </a>\r\n");
        out.write("                                <ul class=\"dropdown-menu\" style=\"font-size: 14px; width: 200px\">\r\n");
        out.write("                                    <li><a href=\"#\">Profile</a></li>\r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Customer/Logout?logout=ok\">Logout</a></li>\r\n");
        out.write("                                </ul>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <li class=\"nav-item\" >\r\n");
        out.write("                                <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/Customer/Login\" class=\"nav-link\">\r\n");
        out.write("                                    Login\r\n");
        out.write("                                </a>\r\n");
        out.write("                            </li>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
