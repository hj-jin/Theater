/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-11-26 07:49:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import poly.dto.NoticeDTO;
import java.util.ArrayList;
import poly.dto.UserDTO;
import java.util.List;
import poly.util.CmmUtil;

public final class userFindEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/view/Head.jsp", Long.valueOf(1542896332283L));
    _jspx_dependants.put("/WEB-INF/view/top.jsp", Long.valueOf(1543208838365L));
    _jspx_dependants.put("/WEB-INF/view/bottom.jsp", Long.valueOf(1541637981528L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("poly.dto.UserDTO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("poly.util.CmmUtil");
    _jspx_imports_classes.add("poly.dto.NoticeDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");


	UserDTO uDTO = (UserDTO)request.getAttribute("uDTO");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t\t<!-- head -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<head>\r\n");
      out.write("\t\t\t<title>main</title>\r\n");
      out.write("\t\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/assets/css/main.css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t \t<!-- 부트스트랩 -->\r\n");
      out.write("\t\t\t<!-- 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("\t\t\t<!-- 부가적인 테마 -->\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t\t\t<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->\r\n");
      out.write("\t\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\">\r\n");
      out.write("\t\t\t<!-- 합쳐지고 최소화된 최신 자바스크립트 -->\r\n");
      out.write("\t\t\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t\t<!-- 부트스트랩 -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

				String userSeq = CmmUtil.nvl((String)session.getAttribute("userSeq"));
				String email = CmmUtil.nvl((String)session.getAttribute("email"));
				String name = CmmUtil.nvl((String)session.getAttribute("name"));
				String hp = CmmUtil.nvl((String)session.getAttribute("hp"));
				String birth = CmmUtil.nvl((String)session.getAttribute("birth"));
				String gender = CmmUtil.nvl((String)session.getAttribute("gender"));
			
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t</head>\r\n");
      out.write("\t\t<!-- head -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- top -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<body class=\"is-preload\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t\t<div id=\"header\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"top\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\" onclick=\"location.href='/main.do'\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image avatar48\"><img src=\"/assets/images/avatar.jpg\" alt=\"\" /></span>\r\n");
      out.write("\t\t\t\t\t\t\t<h1 id=\"title\">LOGO</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Hyperspace Engineer</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Nav -->\r\n");
      out.write("\t\t\t\t\t\t<nav id=\"nav\" style=\"position:relative;\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"height:50px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if(session.getAttribute("userSeq") != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p>");
      out.print(session.getAttribute("name") );
      out.write("님 \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"location.href='/user/Logout.do'\">로그아웃</button></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"\" id=\"contact-link\"><span class=\"icon fa-envelope\">로그인</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- 로그인 클릭  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; top:0px;\" onclick=\"location.href='/user/userLogin.do'\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"height:50px;\"><a href=\"#top\" id=\"top-link\"><span class=\"icon fa-home\">지역/날짜별 검색</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"height:50px;\"><a href=\"\" id=\"portfolio-link\"><span class=\"icon fa-th\">자막제공</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"height:50px;\"><a href=\"#about\" id=\"about-link\"><span class=\"icon fa-user\">공연장</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"height:50px;\"><a href=\"\" id=\"contact-link\"><span class=\"icon fa-user\">게시판</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li style=\"height:50px;\"><a href=\"\" id=\"contact-link\"><span class=\"icon fa-user\">회원목록</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 지역/날짜 별 클릭  -->\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:200px;\" onclick=\"location.href='#portfolio'\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 자막제공 클릭  -->\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:150px;\" onclick=\"location.href='/speech/speechGetText.do'\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 공연장 클릭  -->\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:100px;\" onclick=\"location.href='/theater/theaterSelect.do'\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 게시판 클릭  -->\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:50px;\" onclick=\"location.href='/notice/noticeList.do'\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 회원목록 클릭  -->\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:0px;\" onclick=\"location.href='/user/userList.do'\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"bottom\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Social Icons -->\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"icons\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-twitter\"><span class=\"label\">Twitter</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-facebook\"><span class=\"label\">Facebook</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-github\"><span class=\"label\">Github</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-dribbble\"><span class=\"label\">Dribbble</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"icon fa-envelope\"><span class=\"label\">Email</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t <!-- Scripts -->\r\n");
      out.write("\t\t\t<script src=\"/assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"/assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"/assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"/assets/js/browser.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"/assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"/assets/js/util.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"/assets/js/main.js\"></script> \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<div style=\"height:7%; background-color:#4e4945;\">&nbsp;&nbsp;&nbsp;</div>\r\n");
      out.write("\t\t<!-- top -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- main -->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t회원님의 이메일은 <br/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<b>\r\n");
      out.write("\t\t\t\t");
      out.print( uDTO.getEmail() );
      out.write("\r\n");
      out.write("\t\t\t\t</b> \t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t입니다.\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--main -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- bottom -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("   \t <!-- Footer -->\r\n");
      out.write("\t\t\t<div id=\"footer\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Copyright -->\r\n");
      out.write("\t\t\t\t\t<ul class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t<li>&copy; Untitled. All rights reserved.</li><li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>");
      out.write("\r\n");
      out.write("\t\t<!-- bottom -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
