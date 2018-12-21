<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<html lang="zxx">

<head>
	<title>로그인</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="Validify Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements"
	/>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- Meta tag Keywords -->
	<!-- css files -->
	<link rel="stylesheet" href="/assets/css/logstyle.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link rel="stylesheet" href="/assets/css/fontawesome-all.css">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //css files -->
	<!-- web-fonts -->
	<link href="//fonts.googleapis.com/css?family=Nova+Round" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">
	<!-- //web-fonts -->
</head>

<body>
	<!-- title -->
	<div>
		<h1 onclick="javacript:location.href='/main.do'">
			<span>L</span>oGo
		</h1>
		<!-- //title -->
	</div>
	<!-- content -->
	<div class="sub-main-w3">
		<form id="demo" novalidate action="/user/userLoginProc.do" method="post">
			<h2>로그인</h2>
			<div class="form-group">
				<input type="email" class="form-control textbox" name="email" placeholder="E-mail" required="">
			</div>
			<div class="form-group">
				<input type="password" class="form-control textbox" name="password" placeholder="Password" required="">
			</div>
			<div class="form-group-2">
				<button class="btn btn-default btn-osx btn-lg" type="submit">
					<i class="fas fa-long-arrow-alt-right"></i>
				</button>
			</div>
			<div class="alert alert-success hidden" role="alert">You Have Successfully Logged In</div>
		</form>
		<!-- //switch -->
	</div>
	<!-- //content -->
	<div align="center">
		<span><a href="/user/userInfoFind.do" style="color:white;">아이디/비밀번호 찾기</a></span>
		<span>&nbsp;&nbsp;&nbsp;</span>
		<span><a href="/user/userReg.do" style="color:white;">회원가입</a></span>
	</div>
	
	
	
	
	

	<!-- copyright -->
	<div class="footer">
		<p>&copy; 2018 Validify Login Form. All rights reserved | Design by
			<a href="http://w3layouts.com">W3layouts</a>
		</p>
	</div>
	<!-- //copyright -->



</body>
</html>