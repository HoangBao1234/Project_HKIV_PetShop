package org.apache.jsp.Admin.pet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class petList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_import_url_nobody.release();
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
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
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
      out.write("        <title>Pet List</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("                    <div style=\"padding: 50px\">\r\n");
      out.write("                        <h4 style=\"color: #006dcc\">+ Create new Pet</h4>\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <h2 style=\"color: #006dcc\">Pet List</h2>\r\n");
      out.write("                            <table id=\"example\" class=\"display\" style=\"width:100%\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Id</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Name</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Color</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Date of birth</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Gender</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Price</th>\r\n");
      out.write("                                        <th scope=\"col\" style=\"color: #006dcc\">Action</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th scope=\"row\">1</th>\r\n");
      out.write("                                        <td>Mark</td>\r\n");
      out.write("                                        <td>Yellow</td>\r\n");
      out.write("                                        <td>1/1/1111</td>\r\n");
      out.write("                                        <td>Male</td>\r\n");
      out.write("                                        <td>500 $</td>\r\n");
      out.write("                                        <td>Edit || Delete || Details</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th scope=\"row\">2</th>\r\n");
      out.write("                                        <td>Jacob</td>\r\n");
      out.write("                                        <td>Yellow</td>\r\n");
      out.write("                                        <td>1/1/1111</td>\r\n");
      out.write("                                        <td>Male</td>\r\n");
      out.write("                                        <td>500 $</td>\r\n");
      out.write("                                        <td>Edit || Delete || Details</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th scope=\"row\">3</th>\r\n");
      out.write("                                        <td>Jacob</td>\r\n");
      out.write("                                        <td>Yellow</td>\r\n");
      out.write("                                        <td>1/1/1111</td>\r\n");
      out.write("                                        <td>Male</td>\r\n");
      out.write("                                        <td>500 $</td>\r\n");
      out.write("                                        <td>Edit || Delete || Details</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Core plugin JavaScript-->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Custom scripts for all pages-->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Page level plugins -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <!-- Page level custom scripts -->\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("                <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Admin/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("                <script src=\"https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    $(document).ready(function() {\r\n");
      out.write("                        $('#example').DataTable();\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("                </body>\r\n");
      out.write("                </html>\r\n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}/Admin/template/header.jsp", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }
}
