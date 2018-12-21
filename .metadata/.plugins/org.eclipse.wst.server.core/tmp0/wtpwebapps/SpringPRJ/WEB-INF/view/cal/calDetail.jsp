<%@page import="java.util.List"%>
<%@page import="poly.dto.LocalDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List<LocalDTO> lList = (List<LocalDTO>)request.getAttribute("lList");

%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>locList</title>
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
	

	<h3>연극상세</h3>
	<hr />
	
	
	<table border="1px solid black" id="DT" style="width:100%;">
	<thead>
		<tr>
			<th></th>
		</tr>
		</thead>
	
		<%for(int i=0; i < lList.size(); i++){ %>
		
		<tr>
			<td class="col-sm-12">
				<div class="col-sm-5">
					<img src="<%=lList.get(i).getPoster() %>" />
				</div>
				<div class="col-sm-7">
					<b><%=lList.get(i).getPrfnm() %></b><small><%=lList.get(i).getPrfstate() %></small><!-- 공연명 -->
					<br>
					<hr/>
					제작사/제작진 : <%=lList.get(i).getEntrpsnm() %> / <%=lList.get(i).getPrfcrew() %>
					<br>
					출연 : <%=lList.get(i).getPrfcast() %>
					<br>
					장르 : <%=lList.get(i).getGenrenm() %>
					<br>
					연령 : <%=lList.get(i).getPrfage() %>
					<br>
					공연시간 :<%=lList.get(i).getPrfruntime() %> /
					<br>
					<%=lList.get(i).getDtguidance() %> 
					<br>
					공연일 : <%=lList.get(i).getPrfpdfrom() %> ~ <%=lList.get(i).getPrfpdto() %>
					<br>
					티켓가격 : <%=lList.get(i).getPcseguidance() %>
					<br>
					공연장 : <%=lList.get(i).getFcltynm() %> <!-- 공연시설명 -->
					<br>
			<!--공연시간 -->
				</div>
		</tr>
	<%} %>
	</table>
	<div style="text-align:center;">
			<img src="<%=lList.get(0).getSty() %>" /><!--줄거리-->
	
	</div>
	
	
	<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		
</body>
</html>