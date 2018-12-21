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
	<title>locList</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
			
	<link rel="stylesheet" href="/assets/css/main.css" />
	<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />
	
	<!-- 부트스트랩 -->
	<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<!-- 부트스트랩 -->
	
	

</head>
<body>
	<!-- top -->
	<%@ include file="/WEB-INF/view/top.jsp" %>
	<!-- top -->
	
	<script type="text/javascript" src="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script>
	
	$(document).ready( function () {
	    $('#DT').DataTable();
	} );
	
	</script>
	

	<h3>지역별</h3>
	<table id="DT" border="1px solid black" style="width:100%;">
		<thead>
		<tr>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
		</tr>
		</thead>
	<%for(int i=0; i < lList.size();){ %>
		
		<tr>
			<td>
				<div>
					<img src="<%=lList.get(i).getPoster() %>" style="width:200px; height:200px;"/> <!-- 포스터경로 -->
				</div>
				<div>
					
					장르 : <%=lList.get(i).getGenrenm() %><br> <!-- 공연장르명 -->
					제목 : <a href="/local/localDetail.do?id=<%=lList.get(i).getMt20id()%>"><%=lList.get(i).getPrfnm() %></a><br><!-- 공연명 -->
					장소 : <%=lList.get(i).getFcltynm() %><br><!-- 공연시설명 -->
					공연일 : <%=lList.get(i).getPrfpdfrom() %> ~ <!-- 공연 시작일 -->
					<%=lList.get(i).getPrfpdto() %><br><!-- 공연 종료일 -->
				</div>
			</td> <!-- 공연ID -->
			<% i++; %>
			<td>
				<div>
					<img src="<%=lList.get(i).getPoster() %>" style="width:200px; height:200px;"/> <!-- 포스터경로 -->
				</div>
				<div>
					
					장르 : <%=lList.get(i).getGenrenm() %><br> <!-- 공연장르명 -->
					제목 : <a href="/local/localDetail.do?id=<%=lList.get(i).getMt20id()%>"><%=lList.get(i).getPrfnm() %></a><br><!-- 공연명 -->
					장소 : <%=lList.get(i).getFcltynm() %><br><!-- 공연시설명 -->
					공연일 : <%=lList.get(i).getPrfpdfrom() %> ~ <!-- 공연 시작일 -->
					<%=lList.get(i).getPrfpdto() %><br><!-- 공연 종료일 -->
				</div>
			</td> <!-- 공연ID -->
			<% i++; %>
			<td>
				<div>
					<img src="<%=lList.get(i).getPoster() %>" style="width:200px; height:200px;"/> <!-- 포스터경로 -->
				</div>
				<div>
					
					장르 : <%=lList.get(i).getGenrenm() %><br> <!-- 공연장르명 -->
					제목 : <a href="/local/localDetail.do?id=<%=lList.get(i).getMt20id()%>"><%=lList.get(i).getPrfnm() %></a><br><!-- 공연명 -->
					장소 : <%=lList.get(i).getFcltynm() %><br><!-- 공연시설명 -->
					공연일 : <%=lList.get(i).getPrfpdfrom() %> ~ <!-- 공연 시작일 -->
					<%=lList.get(i).getPrfpdto() %><br><!-- 공연 종료일 -->
				</div>
			</td> <!-- 공연ID -->
			<% i++; %>
			<td>
				<div>
					<img src="<%=lList.get(i).getPoster() %>" style="width:200px; height:200px;"/> <!-- 포스터경로 -->
				</div>
				<div>
					
					장르 : <%=lList.get(i).getGenrenm() %><br> <!-- 공연장르명 -->
					제목 : <a href="/local/localDetail.do?id=<%=lList.get(i).getMt20id()%>"><%=lList.get(i).getPrfnm() %></a><br><!-- 공연명 -->
					장소 : <%=lList.get(i).getFcltynm() %><br><!-- 공연시설명 -->
					공연일 : <%=lList.get(i).getPrfpdfrom() %> ~ <!-- 공연 시작일 -->
					<%=lList.get(i).getPrfpdto() %><br><!-- 공연 종료일 -->
				</div>
			</td> <!-- 공연ID -->
			<% i++; %>
			<td>
				<div>
					<img src="<%=lList.get(i).getPoster() %>" style="width:200px; height:200px;"/> <!-- 포스터경로 -->
				</div>
				<div>
					
					장르 : <%=lList.get(i).getGenrenm() %><br> <!-- 공연장르명 -->
					제목 : <a href="/local/localDetail.do?id=<%=lList.get(i).getMt20id()%>"><%=lList.get(i).getPrfnm() %></a><br><!-- 공연명 -->
					장소 : <%=lList.get(i).getFcltynm() %><br><!-- 공연시설명 -->
					공연일 : <%=lList.get(i).getPrfpdfrom() %> ~ <!-- 공연 시작일 -->
					<%=lList.get(i).getPrfpdto() %><br><!-- 공연 종료일 -->
				</div>
			</td> <!-- 공연ID -->
			<% i++; %>
		</tr>
	<%} %>
	</table>
	
	<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		

</body>
</html>