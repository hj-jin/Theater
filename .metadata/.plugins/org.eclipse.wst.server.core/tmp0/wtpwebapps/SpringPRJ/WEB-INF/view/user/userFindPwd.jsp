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
		<div style="height:20%; background-color:#4e4945;">&nbsp;<br/><br/><br/><br/>&nbsp;&nbsp;</div>
		<!-- top -->
		
		
		<!-- main -->
		
		<div class="container">
		
			<div class="sub-main-w3">
			<form id="demo" novalidate action="/user/updatePwd.do" method="post">
				<h2>비밀번호 변경</h2>
			
				<div class="form-group">
					<input type="password" class="form-control textbox" name="password" id="password" placeholder="비밀번호입력" required="">
					<font id="length" size="2" color="red"></font>
				</div>
				<div class="form-group">
					<input type="password" class="form-control textbox" name="passwordSec" id="passwordSec" placeholder="비밀번호 확인" required="">
					<font id="check" size="2" color="red"></font>
				</div>
				
				<input type="hidden" name="userSeq" value="<%=uDTO.getUserSeq()%>" />
				
				
				
				<div class="form-group-2" align="right">
					<button class="btn btn-default btn-osx btn-lg" type="submit" id="RegBtn">
						<i class="fas fa-long-arrow-alt-right">비밀번호 변경</i>
					</button>
				</div>
			</form>
			<!-- //switch -->
		</div>
		</div>
		<!--main -->
		
		<!-- bottom -->
		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		<!-- bottom -->
</body>
</html>