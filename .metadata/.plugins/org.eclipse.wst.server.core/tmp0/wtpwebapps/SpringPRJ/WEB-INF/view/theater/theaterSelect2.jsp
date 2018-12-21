<%@page import="poly.dto.TheaterDTO"%>
<%@page import="java.util.List"%>
<%@page import="poly.dto.LocalDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List<TheaterDTO> tList = (List<TheaterDTO>)request.getAttribute("tList");

%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>theaterDetail</title>
	
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
	
	
	
	
</head>
<body>
	<!-- top -->
	<%@ include file="/WEB-INF/view/top.jsp" %>
	<!-- top -->

	<h3>Theater Select</h3>
	<hr/>
	test
	<div>
		<ul style="list-style:none;">
			<li><a href="JavaScript:theaterSelect('11');">서울</a></li>
			<li><a href="JavaScript:theaterSelect('42');">강원도</a></li>
			<li><a href="JavaScript:theaterSelect('28');">인천</a></li>
			<li><a href="JavaScript:theaterSelect('41');">경기도</a></li>
			<li><a href="JavaScript:theaterSelect('43');">충천북도</a></li>
			<li><a href="JavaScript:theaterSelect('44');">충청남도</a></li>
			<li><a href="JavaScript:theaterSelect('30');">대전</a></li>
			<li><a href="JavaScript:theaterSelect('47');">경상북도</a></li>
			<li><a href="JavaScript:theaterSelect('28');">대구</a></li>
			<li><a href="JavaScript:theaterSelect('31');">울산</a></li>
			<li><a href="JavaScript:theaterSelect('26');">부산</a></li>
			<li><a href="JavaScript:theaterSelect('48');">경상남도</a></li>
			<li><a href="JavaScript:theaterSelect('45');">전라북도</a></li>
			<li><a href="JavaScript:theaterSelect('29');">광주</a></li>
			<li><a href="JavaScript:theaterSelect('46');">전라남도</a></li>
			<li><a href="JavaScript:theaterSelect('50');">제주도</a></li>
		</ul>
		&nbsp;
	</div>
	
	<div style="text-align:center;">
		<hr>
			<img src="http://img.cgv.co.kr/R2014/images/title/h3_theater.gif"  />
		<hr>
	</div>
	<div id="list" style="height:30%;">
		
		<div>
			<img src="http://img.cgv.co.kr/Theater/Theater/2015/1027/대학로문화극장04.jpg"/>
		</div>
		<div>
			chart
		</div>
		
	</div>
		
	
	
	<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>

</body>
</html>