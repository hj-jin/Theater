/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.52
 * Generated at: 2018-12-12 04:13:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>로그인/회원가입</title>\r\n");
      out.write("\t<!-- Meta tag Keywords -->\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"Validify Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\"\r\n");
      out.write("\t/>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\taddEventListener(\"load\", function () {\r\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\r\n");
      out.write("\t\t}, false);\r\n");
      out.write("\r\n");
      out.write("\t\tfunction hideURLbar() {\r\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- Meta tag Keywords -->\r\n");
      out.write("\t<!-- css files -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/assets/css/logstyle.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\t<!-- Style-CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/assets/css/fontawesome-all.css\">\r\n");
      out.write("\t<!-- Font-Awesome-Icons-CSS -->\r\n");
      out.write("\t<!-- //css files -->\r\n");
      out.write("\t<!-- web-fonts -->\r\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Nova+Round\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- //web-fonts -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!--부트스트랩 합쳐지고 최소화된 최신 CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("\t<!--부트스트랩 부가적인 테마 -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("\t<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- 부트스트랩  합쳐지고 최소화된 최신 자바스크립트 -->\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t// 이메일 중복 확인 \r\n");
      out.write("\t\r\n");
      out.write("\t<!--이메일 체크js -->\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$('#emailCk').on('click',function(){\r\n");
      out.write("\t\t\t//alert(\"test\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($('#email').val() == \"\") {\r\n");
      out.write("\t\t\t\talert(\"이메일을 입력해주세요.\");\r\n");
      out.write("\t\t\t\treturn null;\r\n");
      out.write("\t\t\t}\r\n");
      out.write(" \t\t\t$.ajax({\r\n");
      out.write(" \t\t\t\ttype:'POST',\r\n");
      out.write(" \t\t\t\turl:'/user/emailCheck.do',\r\n");
      out.write(" \t\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\t\"email\" : $('#email').val()\t \t\t\t\t\t\r\n");
      out.write(" \t\t\t\t},\r\n");
      out.write(" \t\t\t\tsuccess : function(data){\r\n");
      out.write("\t \t\t\t\tif(data > 0 ){\r\n");
      out.write("\t \t\t\t\t\t$('#emailCk').val('사용중인 이메일');\r\n");
      out.write("\t \t\t\t\t\t$('#count').val('0');\r\n");
      out.write("\t \t\t\t\t\t$('#emailCk').removeClass('btn-primary')\r\n");
      out.write("\t \t\t\t\t\t$('#emailCk').addClass('btn-danger');\r\n");
      out.write("\t \t\t\t\t}else{\r\n");
      out.write("\t \t\t\t\t\t$('#emailCk').val('사용가능 이메일');\r\n");
      out.write("\t \t\t\t\t\t$('#emailCk').removeClass('btn-danger')\r\n");
      out.write("\t \t\t\t\t\t$('#emailCk').css('background-color','#555')\r\n");
      out.write("\t \t\t\t\t\t$('#emailCk').addClass('btn-primary');\r\n");
      out.write("\t \t\t\t\t\t//$('#emailCheck').addClass('active');\r\n");
      out.write("\t \t\t\t\t\t$('#count').val('1');\r\n");
      out.write("\t \t\t\t\t}\r\n");
      out.write("\t \t\t\t\t\r\n");
      out.write("\t \t\t\t},//success\r\n");
      out.write("\t \t\t\terror:function(x,e){\r\n");
      out.write("\t\t\t\t\tif(x.status==0){\r\n");
      out.write("\t\t\t            alert('네트워크가 정상적으로 동작하지 않습니다.');\r\n");
      out.write("\t\t\t            alert('네트워크 상태를 확인 하거나 업체에게 문의해 주세요.')\r\n");
      out.write("\t\t\t            }else if(x.status==404){\r\n");
      out.write("\t\t\t            alert('페이지를 찾을수가 없습니다. 지금은 주문을 받을 수 없습니다. 업체에게 문의하세요.');\r\n");
      out.write("\t\t\t            }else if(x.status==500){\r\n");
      out.write("\t\t\t            alert('서버에서 오류가 발생했습니다. 지금은 주문을 받을 수 없습니다. 업체에게 문의하세요.');\r\n");
      out.write("\t\t\t            }else if(e=='parsererror'){\r\n");
      out.write("\t\t\t            alert('json파싱에 실패했습니다.');\r\n");
      out.write("\t\t\t            }else if(e=='timeout'){\r\n");
      out.write("\t\t\t            alert('응답 요청 시간이 지났습니다.');\r\n");
      out.write("\t\t\t            }else {\r\n");
      out.write("\t\t\t            alert('Unknow Error.n'+x.responseText);\r\n");
      out.write("\t\t\t            }\r\n");
      out.write("\t\t\t    }\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\t})//ajax\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t});//on click\r\n");
      out.write(" \t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t//비밀번호 조합\r\n");
      out.write("\t   function checkUnion(str){\r\n");
      out.write("\t      var reg1=/^[a-zA-Z0-9]{8,20}$/;//대문자 소만자 8 -20 자리 허용\r\n");
      out.write("\t      var reg2=/[a-zA-Z]/g;\r\n");
      out.write("\t      var reg3=/[0-9]/g;\r\n");
      out.write("\t      return(reg1.test(str) && reg2.test(str) &&reg3.test(str))\r\n");
      out.write("\t   }\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//비밀번호 일치 여부 확인 \r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar password = $('#password');\r\n");
      out.write("\t\t$('#password').keyup(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('font[id=check]').text('');\r\n");
      out.write("\t\t\tif(!checkUnion(password.val())){\r\n");
      out.write("\t\t\t   \r\n");
      out.write("\t\t\t\t$('font[id=length]').text('');\r\n");
      out.write("\t\t\t\t$('font[id=length]').html(\"8자리 이상 20자리 이하의 [영문+숫자] 조합\");\t\t\t\t\t\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$('font[id=length]').css('color','green');\r\n");
      out.write("\t\t\t\t$('font[id=length]').html(\"적합\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#passwordSec').keyup(function(){\r\n");
      out.write("\t\t\tif($('#password').val() != $('#passwordSec').val()){\r\n");
      out.write("\t\t\t\t$('font[id=check]').text('');\r\n");
      out.write("\t\t\t\t$('font[id=check]').css('color','red');\r\n");
      out.write("\t\t\t\t$('font[id=check]').html(\"암호 틀림\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$('font[id=check]').text('');\r\n");
      out.write("\t\t\t\t$('font[id=check]').css('color','white');\r\n");
      out.write("\t\t\t\t$('font[id=check]').html(\"암호 일치\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});//confirm keyup\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//빈칸 확인 시작 \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#RegBtn').on('click',function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t if($('#password').val() ==''){\r\n");
      out.write("\t\t\t\t$('#password').focus();\r\n");
      out.write("\t\t\t\talert('비밀번호 확인 해주세요');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\tif($('#passwordSec').val() ==''){\r\n");
      out.write("\t\t\t\t$('#passwordSec').focus();\r\n");
      out.write("\t\t\t\talert('비밀번호 확인 해주세요');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t//비밀번호 유효성 검사\r\n");
      out.write("\t\t\tif(!checkUnion($('#password').val())){\r\n");
      out.write("\t\t         alert(\"비밀번호 유효성검사에 어긋남\");\r\n");
      out.write("\t\t         $('#password').focus();\r\n");
      out.write("\t\t         return false;\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- title -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h1 onclick=\"javacript:location.href='/main.do'\">\r\n");
      out.write("\t\t\t<span>L</span>oGo\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //title -->\r\n");
      out.write("\t<!-- content -->\r\n");
      out.write("\t<div class=\"sub-main-w3\">\r\n");
      out.write("\t\t<form id=\"demo\" novalidate action=\"/user/userRegProc.do\" method=\"post\">\r\n");
      out.write("\t\t\t<h2>회원가입</h2>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-8\" style=\"padding:0;\">\r\n");
      out.write("\t\t\t\t\t<input style=\"width:100%;\" type=\"email\" class=\"form-control textbox\" name=\"email\" id=\"email\" placeholder=\"이메일입력\" required=\"\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t<input class=\"btn btn-default\" type=\"button\" id=\"emailCk\" value=\"중복확인\" style=\"margin:0;\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"form-control textbox\" name=\"password\" id=\"password\" placeholder=\"비밀번호입력\" required=\"\">\r\n");
      out.write("\t\t\t\t<font id=\"length\" size=\"2\" color=\"red\"></font>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"form-control textbox\" name=\"passwordSec\" id=\"passwordSec\" placeholder=\"비밀번호 확인\" required=\"\">\r\n");
      out.write("\t\t\t\t<font id=\"check\" size=\"2\" color=\"red\"></font>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control textbox\" name=\"name\" placeholder=\"이름 입력\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control textbox\" name=\"hp\" placeholder=\"핸드폰번호 입력\" required=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-8\" style=\"padding:0;\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control textbox\" name=\"birth\" placeholder=\"생년월일\" required=\"\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-1\" style=\"color:white;\"><b style=\"font-size:2em; color:black;\">-</b></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control textbox\" name=\"birthSec\" placeholder=\"\" required=\"\">\r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group-2\">\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-default btn-osx btn-lg\" type=\"submit\" id=\"RegBtn\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-long-arrow-alt-right\">회원가입</i>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!-- //switch -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- //content -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- copyright -->\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("\t\t<p>&copy; 2018 Validify Login Form. All rights reserved | Design by\r\n");
      out.write("\t\t\t<a href=\"http://w3layouts.com\">W3layouts</a>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
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
