<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<body class="is-preload">

    
		<!-- Header -->
			<div id="header">

				<div class="top">

					<!-- Logo -->
						<div id="logo" onclick="location.href='/main.do'">
							<span class="image avatar48"><img src="/assets/images/avatar.jpg" alt="" /></span>
							<h1 id="title">LOGO</h1>
							<p>Hyperspace Engineer</p>
						</div>

					<!-- Nav -->
						<nav id="nav" style="position:relative;">
							<ul>
								<li style="height:50px;">
									<%if(session.getAttribute("userSeq") != null){ %>
										<p><%=session.getAttribute("name") %>님 
										<button type="button" class="btn btn-default" onclick="location.href='/user/Logout.do'">로그아웃</button></p>
									<%}else{ %>
										<a href="" id="contact-link"><span class="icon fa-envelope">로그인</span></a>
										<!-- 로그인 클릭  -->
										<div style="width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; top:0px;" onclick="location.href='/user/userLogin.do'">
										&nbsp;
										</div>
									<%} %>
								</li>
								<li style="height:50px;"><a href="#top" id="top-link"><span class="icon fa-home">지역/날짜별 검색</span></a></li>
								<li style="height:50px;"><a href="" id="portfolio-link"><span class="icon fa-th">자막제공</span></a></li>
								<li style="height:50px;"><a href="#about" id="about-link"><span class="icon fa-user">공연장</span></a></li>
								<li style="height:50px;"><a href="" id="contact-link"><span class="icon fa-user">게시판</span></a></li>
								<li style="height:50px;"><a href="" id="contact-link"><span class="icon fa-user">회원목록</span></a></li>
							</ul>
							
							
							<!-- 지역/날짜 별 클릭  -->
							<div style="width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:200px;" onclick="location.href='/main.do'">
							&nbsp;
							</div>
							<!-- 자막제공 클릭  -->
							<div style="width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:150px;" onclick="location.href='/speech/annyang.do'">
							&nbsp;
							</div>
							<!-- 공연장 클릭  -->
							<div style="width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:100px;" onclick="location.href='/theater/theaterSelect.do'">
							&nbsp;
							</div>
							<!-- 게시판 클릭  -->
							<div style="width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:50px;" onclick="location.href='/notice/noticeList.do'">
							&nbsp;
							</div>
							<!-- 회원목록 클릭  -->
							<div style="width:100%; cursor:pointer; border:1px solid #cccccc; background-color:rgba(255,255,255,0); position:absolute; height:50px; bottom:0px;" onclick="location.href='/user/userList.do'">
							&nbsp;
							</div>
							
						</nav>

				</div>

				<div class="bottom">

					<!-- Social Icons -->
						<ul class="icons">
							<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
							<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
							<li><a href="#" class="icon fa-envelope"><span class="label">Email</span></a></li>
						</ul>

				</div>
			</div>
			
			
			
			 <!-- Scripts -->
			<script src="/assets/js/jquery.min.js"></script>
			<script src="/assets/js/jquery.scrolly.min.js"></script>
			<script src="/assets/js/jquery.scrollex.min.js"></script>
			<script src="/assets/js/browser.min.js"></script>
			<script src="/assets/js/breakpoints.min.js"></script>
			<script src="/assets/js/util.js"></script>
			<script src="/assets/js/main.js"></script> 
			
			
			
			
		