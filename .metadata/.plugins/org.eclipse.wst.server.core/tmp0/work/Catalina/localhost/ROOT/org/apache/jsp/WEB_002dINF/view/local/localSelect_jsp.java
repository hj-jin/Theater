/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-11-16 04:55:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.local;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class localSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("<img src=\"/assets/images/locMap.gif\" usemap=\"#LeftAreaMap\">\r\n");
      out.write("\t<map name=\"LeftAreaMap\" id=\"LeftAreaMap\">\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"97,112,117,121\" href=\"/local/localSelect.do?sidoCode=11\"><!-- 서울11 -->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"171,100,246,144\" href=\"/local/localSelect.do?sidoCode=32\"><!-- 강원 32-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"58,101,83,118\" href=\"/local/localSelect.do?sidoCode=23\"><!-- 인천 23-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"98,135,139,152\" href=\"/local/localSelect.do?sidoCode=31\"><!-- 경기 31-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"134,171,181,191\" href=\"#\"><!-- 충북 33 -->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"70,187,117,203\" href=\"#\"><!-- 충남 34-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"121,209,145,226\" href=\"#\"><!-- 대전25 -->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"194,183,255,210\" href=\"#\"><!-- 경북 37-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"196,246,221,265\" href=\"#\"><!-- 대구 22-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"243,270,269,288\" href=\"#\"><!-- 울산26 -->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"224,296,253,320\" href=\"#\"><!-- 부산21 -->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"163,286,209,305\" href=\"#\"><!-- 경남 38-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"93,260,144,283\" href=\"#\"><!-- 전북 35-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"83,303,108,320\" href=\"#\"><!-- 광주 24-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"54,335,110,370\" href=\"#\"><!-- 전남 36-->\r\n");
      out.write("\t\t<area name=\"rect\" coords=\"55,410,101,427\" href=\"#\"><!-- 제주 39-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t</map>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
