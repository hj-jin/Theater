<%@page import="poly.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	UserDTO uDTO = (UserDTO)request.getAttribute("uDTO");
	if(uDTO == null){
		uDTO = new UserDTO();
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보 수정하기</title>


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

	<link rel="stylesheet" href="/assets/css/main.css" />
</head>
<body>
	<!-- top -->
	<%@ include file="/WEB-INF/view/top.jsp" %>
	<!-- top -->
	<div class="container" style="background-color:#cccccc">
	 	<form action="/user/userUpdate.do" method="post">
	 		<div class="form-group">
	 			<label for="exampleInputEmail1">이메일 : </label>
	 			<%=uDTO.getEmail()%>
	 		</div>
	 		<div class="form-group">
	 			<label for="exampleInputPassword1">비밀번호 : </label>
	 			<input type="password" class="form-control" name="password" value="<%=uDTO.getPassword() %>" placeholder="<%=uDTO.getPassword() %>">
	 		</div>
	 		<div class="form-group">
	 			<label for="exampleInputPassword1">비밀번호 확인 : </label>
	 			<input type="password" class="form-control" name="passwordSec" value="<%=uDTO.getPassword() %>" placeholder="<%=uDTO.getPassword() %>">
	 		</div>
	 		<div class="form-group">
	 			<label for="">전화번호</label>
	 			<input type="text" class="form-control" name="hp" value="<%=uDTO.getHp()%>" placeholder="<%=uDTO.getHp()%>">
	 		</div>
	 		<div class="form-group">
	 			<label for="">성별</label>
	 			<input type="text" class="form-control" name="birthSec" value="<%=uDTO.getBirthSec() %>" placeholder="<%=uDTO.getBirthSec()%>">
	 		</div>
	 		<div class="form-group">
	 			<label for="">생년월일</label>
	 			<input type="text" class="form-control" name="birth" value="<%=uDTO.getBirth() %>" placeholder="<%=uDTO.getBirth()%>">
	 		</div>
	 		
	 		<input type="hidden" name="userSeq" value="<%=uDTO.getUserSeq() %>" />
			<div>
				<button type="submit" class="btn btn-default" style="width:100%" >수정</button>
			</div>
	 	</form>
	 	
 	
	</div>
 	<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
 	
</body>
</html>