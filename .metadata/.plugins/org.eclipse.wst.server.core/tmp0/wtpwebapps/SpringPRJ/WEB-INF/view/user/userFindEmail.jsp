<%@page import="poly.dto.NoticeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="poly.dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

	UserDTO uDTO = (UserDTO)request.getAttribute("uDTO");
%>

<html>
		<!-- head -->
		<%@ include file="/WEB-INF/view/Head.jsp" %>
		</head>
		<!-- head -->
		
		<!-- top -->
		<%@ include file="/WEB-INF/view/top.jsp" %>
		<div style="height:7%; background-color:#4e4945;">&nbsp;&nbsp;&nbsp;</div>
		<!-- top -->
		
		
		<!-- main -->
		<div class="container">
		
		</div>
		<!--main -->
		
		<!-- bottom -->
		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		<!-- bottom -->
</body>
</html>