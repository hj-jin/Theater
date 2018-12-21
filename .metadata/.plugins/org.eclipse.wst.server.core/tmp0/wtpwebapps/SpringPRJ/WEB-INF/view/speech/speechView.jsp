<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String testAudio = (String)request.getAttribute("testAudio");
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>speech View</title>
		
	<link rel="stylesheet" href="/assets/css/main.css" />
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
	<script>
	function testAudio(){
		//alert("test");
		$.ajax({
			url : "/speech/testAudio.do",
			method :"post",
			data : {
			},
			success : function(data){
				console.log(data);
				var contents ="";
					contents+= "<div style='margin-top:20%;'>";
					contents+= "google-cloud speech to text sample start <br/>";
					contents+= "audio.raw 오디오파일 변환 결과 : <br/>";
					contents+= "<b>"+data + "</b><br/>";
					contents+= "입니다.";
					contents+= "</div>";
						
				$('div#audio').html(contents);
				console.log(contents);
			},
			error : function(){
				alert("error");
			}
			
			
		});
		
	}
	</script>
</head>
<body>

		<!-- top -->
			<%@ include file="/WEB-INF/view/top.jsp" %>
		<!-- top -->
	    <div class="container" style="background-color:white;">
	    	<div>
	    		input type
	    		<br/>
	    		<br/>
	    		<input type="radio" name="file" checked />file upload
	    		<input type="radio" name="mic" />microphone
	    	</div>
		    	<br/>
		    	<br/>
		    <div>
		    	Language
		    	<br/>
		    	<hr/>
		    	<select style="width:100%">
		    		<option>English(United States)</option>
		    	</select>
		    </div>
		    <div>
				<div>
					<a>Show Json</a>
				</div>	    
				<div align="right">
					<button onclick="JavaScript:testAudio();">START NOW</button>
				</div>
		    </div>
	   
			
			<div class="col-sm-12">
				<div class="col-sm-6">
					<img src="https://cloud.google.com/images/products/speech/speech-api-lead.png" />
				</div >
				<div id="audio" class="col-sm-5">
				</div>	   
		   
			</div>
	    </div>


		<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		
</body>
</html>