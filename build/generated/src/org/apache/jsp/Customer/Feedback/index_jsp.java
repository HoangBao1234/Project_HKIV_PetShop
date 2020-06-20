package org.apache.jsp.Customer.Feedback;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Members;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<style>\r\n");
      out.write("    body{\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        background: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ImageItems/bg.jfif);\r\n");
      out.write("        background-size: cover;\r\n");
      out.write("    }\r\n");
      out.write("    .contact-form{\r\n");
      out.write("        width: 85%;\r\n");
      out.write("        max-width: 600px;\r\n");
      out.write("        background: #f1f1f1;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        top: 50%;\r\n");
      out.write("        left: 50%;\r\n");
      out.write("        transform: translate(-50%,-50%);\r\n");
      out.write("        padding: 30px 40px;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        border-radius: 8px;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        box-shadow: 0 0 20px #000000b3;\r\n");
      out.write("        font-family: \"Montserrat\",sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    .contact-form h1{\r\n");
      out.write("        margin-top: 0;\r\n");
      out.write("        font-weight: 200;\r\n");
      out.write("    }\r\n");
      out.write("    .txtb{\r\n");
      out.write("        border:1px solid gray;\r\n");
      out.write("        margin: 8px 0;\r\n");
      out.write("        padding: 12px 18px;\r\n");
      out.write("        border-radius: 8px;\r\n");
      out.write("    }\r\n");
      out.write("    .txtb label{\r\n");
      out.write("        display: block;\r\n");
      out.write("        text-align: left;\r\n");
      out.write("        color: #333;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("    }\r\n");
      out.write("    .txtb input,.txtb textarea{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        border: none;\r\n");
      out.write("        background: none;\r\n");
      out.write("        outline: none;\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        margin-top: 6px;\r\n");
      out.write("    }\r\n");
      out.write("    .btn{\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        background: #9b59b6;\r\n");
      out.write("        padding: 14px 0;\r\n");
      out.write("        color: white;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("        margin-top: 8px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"contact-form\">\r\n");
      out.write("            <h1>Contact Us</h1>\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cusfeedback/store\" method=\"post\">\r\n");
      out.write("            <div class=\"txtb\">\r\n");
      out.write("                <label>Full Name :</label>\r\n");
      out.write("                <input type=\"text\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"txtb\">\r\n");
      out.write("                <label>Email :</label>\r\n");
      out.write("                <input type=\"email\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.mail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"txtb\">\r\n");
      out.write("                <label>Phone Number :</label>\r\n");
      out.write("                <input type=\"text\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"txtb\">\r\n");
      out.write("                <label>Message :</label>\r\n");
      out.write("                <textarea name=\"mess\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <input class=\"btn\" type=\"submit\" value=\"Sent\"/>\r\n");
      out.write("            </form>\r\n");
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
}
