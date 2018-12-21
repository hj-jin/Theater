<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<!-- 합쳐지고 최소화된 최신 CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<!-- 부가적인 테마 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>


</head>
<body>

<table style="height: 100%; width: 100%">
		 
		<tr height="7%">
			<td>
				<div class="container" style="text-align:center;">
					<div class="logo">
						<a href="/main.do" class="btn" role="button" ><h1>Logo</h1></a>
					</div>
				</div>
				<hr />
			</td>
		</tr> 
	
		<tr bgcolor="">
			<td>
				<div class="container" style="height:90%">
					<div class="middle col-sm-12">
						<div class="select_id_pw col-sm-5" style="text-align:center;">
							<a href="#" class="btn" role="button" id="showEmail">아이디 찾기</a>
						</div>
						<div class="select_id_pw col-sm-5" style="text-align:center;">
							<a href="#" class="btn" role="button" id="showPwd">비밀번호 찾기</a>
						</div>
					</div>
					
					<div style="height:2%;">
					&nbsp;
					</div>
					
					<div id="hideEmailPwd">
					
						<div id="showEmailFind">
						<h2>이메일 찾기</h2>
							<form method="post" action="/user/userFindEmail.do">
								<div class="form-group">
									<input type="text" class="form-control" id="name" name="name" placeholder="이름" />		
								</div>
								<div class="form-group">
									<input type="text" class="form-control" id="phone" name="hp" placeholder="핸드폰 번호 입력" />
								</div>
									<button type="submit" class="col-sm-12 btn-primary">확인</button>
							</form>
						</div>
						<div id="showPwdFind">
						<h2>비밀번호 찾기</h2>
							<form method="post" action="/user/userFindPwd.do" >
								<div class="form-group">
									<input type="text" class="form-control" id="name" name="name" placeholder="이름" />		
								</div>
								<div class="form-group">
									<input type="email" class="form-control" id="email" name="email" placeholder="이메일 입력" />
								</div>
								
								<div class="form-group">
									<input type="text" class="form-control" id="phone" name="hp" placeholder="핸드폰 번호 입력" />
								</div>
									<button type="submit" class="col-sm-12 btn-primary">확인</button>
							</form>
						</div>
					</div>	
					
				</div>
			</td>
		</tr>
	</table>
	
	<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
	
	<script type="text/javascript">
	$(document).ready(function(){
		$("#hideEmailPwd").hide();
		
		
		$("#showEmail").click(function(){
			$("#hideEmailPwd").show();
			$("#showEmailFind").show();
			$("#showPwdFind").hide();
			//console.log($("#showEmailFind"));
			//console.log($("#showPwdFind"));
		});
		
		
		$("#showPwd").click(function(){
			$("#hideEmailPwd").show();
			$("#showEmailFind").hide();
			$("#showPwdFind").show();
		});
		
	});
	</script>

</body>
</html>