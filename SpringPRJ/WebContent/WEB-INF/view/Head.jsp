<%@page import="poly.util.CmmUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		
		<head>
			<title>main</title>
			<meta charset="utf-8" />
			<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
			<link rel="stylesheet" href="/assets/css/main.css" />
		
		 	<!-- 부트스트랩 -->
			<!-- 합쳐지고 최소화된 최신 CSS -->
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
			<!-- 부가적인 테마 -->
			<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
			<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
			<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
			<!-- 부트스트랩 -->
			
			<%
				String userSeq = CmmUtil.nvl((String)session.getAttribute("userSeq"));
				String email = CmmUtil.nvl((String)session.getAttribute("email"));
				String name = CmmUtil.nvl((String)session.getAttribute("name"));
				String hp = CmmUtil.nvl((String)session.getAttribute("hp"));
				String birth = CmmUtil.nvl((String)session.getAttribute("birth"));
				String gender = CmmUtil.nvl((String)session.getAttribute("gender"));
			%>
	
		