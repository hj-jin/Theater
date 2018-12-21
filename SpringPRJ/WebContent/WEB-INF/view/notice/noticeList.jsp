<%@page import="poly.util.RestoreScript"%>
<%@page import="poly.dto.NoticeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="poly.dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List<NoticeDTO> nList = (List<NoticeDTO>)request.getAttribute("nList");


	//게시판 조회 결과 보여주기
	if (nList==null){
		nList = new ArrayList<NoticeDTO>();
		
	}

%>

<html>
		<!-- head -->
		<%@ include file="/WEB-INF/view/Head.jsp" %>
			<style>
			@-moz-document url-prefix() {
	 		 fieldset { display: table-cell; }
			}
			</style>
			<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />
		
		</head>
		<!-- head -->
		
		<!-- top -->
		<%@ include file="/WEB-INF/view/top.jsp" %>
		<div style="height:7%; background-color:#4e4945;">&nbsp;&nbsp;&nbsp;</div>
		<!-- top -->
		
		<script type="text/javascript" src="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
		<script>
		$(document).ready( function () {
		    $('#DT').DataTable();
		} );
		
		</script>
		
		<!-- main -->
		<div class="table-responsive">
		 	<table class="table" id="DT">
		 		<thead>
		 			<tr>
		 				<th>번호</th>
		 				<th>제목</th>
		 				<th>조회수</th>
		 				<th>작성일</th>
		 				<th>작성자</th>
		 			</tr>
			 	</thead>
			 	<tbody>
					 <% for(int i=0; i< nList.size(); i++){ %>
					<tr> 
						<td><%=nList.get(i).getNoticeSeq()%></td>
						<td><a href="/notice/noticeDetail.do?noticeSeq=<%=nList.get(i).getNoticeSeq()%>"><%=RestoreScript.doRestore(nList.get(i).getTitle())%></a></td>
						<td><%=nList.get(i).getCnt()%></td>
						<td><%=nList.get(i).getUpdDate()%></td>
						<td><%=nList.get(i).getUpdNo()%></td>
					</tr>	 		
					 <%} %>
			 	</tbody>
			 </table>
		</div>	
		<div align="right">
			<button type="button" class="btn btn-default" onclick="location.href='/notice/noticeWrite.do'">글쓰기</button>
		</div>
		 	
		 	
		<!--main -->
		
		<!-- bottom -->
		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		<!-- bottom -->
</body>
</html>