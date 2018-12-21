<%@page import="poly.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	UserDTO uDTO = (UserDTO)request.getAttribute("uDTO");
	
	if(uDTO ==null){
		uDTO = new UserDTO();
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<!-- head -->
		<%@ include file="/WEB-INF/view/Head.jsp" %>
			<style>
			@-moz-document url-prefix() {
	 		 fieldset { display: table-cell; }
			}
			</style>
		
		</head>
		<!-- head -->
		
		<!-- top -->
		<%@ include file="/WEB-INF/view/top.jsp" %>
		<div style="height:7%; background-color:#4e4945;">&nbsp;&nbsp;&nbsp;</div>
		<!-- top -->
		
 		<h3>회원 상세</h3>
		<hr/>
 
 	<div class="table-responsive">
		 	<table class="table">
		 		<thead>
		 			<tr>
		 			<th></th>
		 			<th></th>
		 			</tr>
			 	</thead>
			 	<tbody>
					
					<tr> 
						<td>회원번호</td>
						<td><%= uDTO.getUserSeq() %></td>
					</tr>	 
					<tr>
						<td>이메일</td>
						<td><%= uDTO.getEmail() %></td>
					
					</tr>		
					<tr>
						<td>이름</td>
						<td><%= uDTO.getName() %></td>
					
					</tr>		
					<tr>
						<td>전화번호</td>
						<td><%= uDTO.getHp() %></td>
					
					</tr>		
					<tr>
						<td>생년월일</td>
						<td><%= uDTO.getBirth() %></td>
					
					</tr>		
					<tr>
						<td>성별</td>
						<td>
							<%= uDTO.getBirthSec() %>
						</td>
					</tr>		
					<tr>
						<td>가입일</td>
						<td><%= uDTO.getRegDate() %></td>
					</tr>		
					 
			 	</tbody>
			 </table>
		</div>	
		<div align="right">
			<button type="button" class="btn btn-default" onclick="javascript:location.href='/user/userUpdateView.do?userSeq=<%=uDTO.getUserSeq()%>'">수정</button>
			<button type="button" class="btn btn-default" onclick="javascript:location.href='/user/deleteUserInfo.do?userSeq=<%=uDTO.getUserSeq()%>'">탈퇴</button>
		</div>
		 	
		 	
		<!--main -->
		
		<!-- bottom -->
		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		<!-- bottom -->
</body>
</html>