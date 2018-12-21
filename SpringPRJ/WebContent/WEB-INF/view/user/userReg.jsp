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
	<title>로그인/회원가입</title>
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
	
	
	<!--부트스트랩 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!--부트스트랩 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 부트스트랩  합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
	
	// 이메일 중복 확인 
	
	<!--이메일 체크js -->
	$(function(){
		$('#emailCk').on('click',function(){
			//alert("test");
			
			if($('#email').val() == "") {
				alert("이메일을 입력해주세요.");
				return null;
			}
 			$.ajax({
 				type:'POST',
 				url:'/user/emailCheck.do',
 				data:{
					"email" : $('#email').val()	 					
 				},
 				success : function(data){
	 				if(data > 0 ){
	 					$('#emailCk').val('사용중인 이메일');
	 					$('#count').val('0');
	 					$('#emailCk').removeClass('btn-primary')
	 					$('#emailCk').addClass('btn-danger');
	 				}else{
	 					$('#emailCk').val('사용가능 이메일');
	 					$('#emailCk').removeClass('btn-danger')
	 					$('#emailCk').css('background-color','#555')
	 					$('#emailCk').addClass('btn-primary');
	 					//$('#emailCheck').addClass('active');
	 					$('#count').val('1');
	 				}
	 				
	 			},//success
	 			error:function(x,e){
					if(x.status==0){
			            alert('네트워크가 정상적으로 동작하지 않습니다.');
			            alert('네트워크 상태를 확인 하거나 업체에게 문의해 주세요.')
			            }else if(x.status==404){
			            alert('페이지를 찾을수가 없습니다. 지금은 주문을 받을 수 없습니다. 업체에게 문의하세요.');
			            }else if(x.status==500){
			            alert('서버에서 오류가 발생했습니다. 지금은 주문을 받을 수 없습니다. 업체에게 문의하세요.');
			            }else if(e=='parsererror'){
			            alert('json파싱에 실패했습니다.');
			            }else if(e=='timeout'){
			            alert('응답 요청 시간이 지났습니다.');
			            }else {
			            alert('Unknow Error.n'+x.responseText);
			            }
			    }
 			
 			})//ajax
 			
 		});//on click
 		
	});
	//비밀번호 조합
	   function checkUnion(str){
	      var reg1=/^[a-zA-Z0-9]{8,20}$/;//대문자 소만자 8 -20 자리 허용
	      var reg2=/[a-zA-Z]/g;
	      var reg3=/[0-9]/g;
	      return(reg1.test(str) && reg2.test(str) &&reg3.test(str))
	   }
	
	
	
	//비밀번호 일치 여부 확인 
	$(function(){
		
		var password = $('#password');
		$('#password').keyup(function(){
			
			$('font[id=check]').text('');
			if(!checkUnion(password.val())){
			   
				$('font[id=length]').text('');
				$('font[id=length]').html("8자리 이상 20자리 이하의 [영문+숫자] 조합");					
			}else{
				
				$('font[id=length]').css('color','green');
				$('font[id=length]').html("적합");
			}
		});
		
		$('#passwordSec').keyup(function(){
			if($('#password').val() != $('#passwordSec').val()){
				$('font[id=check]').text('');
				$('font[id=check]').css('color','red');
				$('font[id=check]').html("암호 틀림");
			}else{
				$('font[id=check]').text('');
				$('font[id=check]').css('color','white');
				$('font[id=check]').html("암호 일치");
			}
		});//confirm keyup
		
		
		
		//빈칸 확인 시작 
		
		$('#RegBtn').on('click',function(){
			
			 if($('#password').val() ==''){
				$('#password').focus();
				alert('비밀번호 확인 해주세요');
				
				return false;
			};
			if($('#passwordSec').val() ==''){
				$('#passwordSec').focus();
				alert('비밀번호 확인 해주세요');
			
				return false;
			};
			//비밀번호 유효성 검사
			if(!checkUnion($('#password').val())){
		         alert("비밀번호 유효성검사에 어긋남");
		         $('#password').focus();
		         return false;
		      }
		});
		
		
	})
	
	
	
	</script>
</head>

<body>
	<!-- title -->
	<div>
		<h1 onclick="javacript:location.href='/main.do'">
			<span>L</span>oGo
		</h1>
	</div>
	<!-- //title -->
	<!-- content -->
	<div class="sub-main-w3">
		<form id="demo" novalidate action="/user/userRegProc.do" method="post">
			<h2>회원가입</h2>
			<div class="form-group">
				<div class="col-xs-8" style="padding:0;">
					<input style="width:100%;" type="email" class="form-control textbox" name="email" id="email" placeholder="이메일입력" required="">
				</div>
				<div class="col-xs-4">
					<input class="btn btn-default" type="button" id="emailCk" value="중복확인" style="margin:0;">
				</div>
			</div>
			<div class="form-group">
				<input type="password" class="form-control textbox" name="password" id="password" placeholder="비밀번호입력" required="">
				<font id="length" size="2" color="red"></font>
			</div>
			<div class="form-group">
				<input type="password" class="form-control textbox" name="passwordSec" id="passwordSec" placeholder="비밀번호 확인" required="">
				<font id="check" size="2" color="red"></font>
			</div>
			
			<div class="form-group">
				<input type="text" class="form-control textbox" name="name" placeholder="이름 입력" required="">
			</div>
			<div class="form-group">
				<input type="text" class="form-control textbox" name="hp" placeholder="핸드폰번호 입력" required="">
			</div>
			<div class="form-group">
				<div class="col-xs-8" style="padding:0;">
					<input type="text" class="form-control textbox" name="birth" placeholder="생년월일" required="">
				</div>
				<div class="col-xs-1" style="color:white;"><b style="font-size:2em; color:black;">-</b></div>
				<div class="col-xs-2">
					<input type="text" class="form-control textbox" name="birthSec" placeholder="" required="">
				</div>		
			</div>
			
			
			<div class="form-group-2">
				<button class="btn btn-default btn-osx btn-lg" type="submit" id="RegBtn">
					<i class="fas fa-long-arrow-alt-right">회원가입</i>
				</button>
			</div>
		</form>
		<!-- //switch -->
	</div>
	<!-- //content -->

	<!-- copyright -->
	<div class="footer">
		<p>&copy; 2018 Validify Login Form. All rights reserved | Design by
			<a href="http://w3layouts.com">W3layouts</a>
		</p>
	</div>
</body>
</html>