<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>theaterSelect</title>
	
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
	
	
	<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />
	<script type='text/javascript' src='//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js'></script>
	
	<style>
		div#list{
		border:1px solid black;
		margin: 0.3% 0;
		}
		
		ul#ul_none>li {
		position : relative;
		float:left;
		margin: 0 0.3% ;
		}
	</style>
	
</head>
<body>
	<!-- top -->
	<%@ include file="/WEB-INF/view/top.jsp" %>
	<!-- top -->
	<div style="style=width:20%; background-color:#cccccc;">
	
	</div>
	
	
	<h3>공연장</h3>

	<div id="list">
		<ul style="list-style:none;" id="ul_none">
			<li><a href="JavaScript:theaterSelect('11');">서울</a></li>
			<li><a href="JavaScript:theaterSelect('42');">강원도</a></li>
			<li><a href="JavaScript:theaterSelect('28');">인천</a></li>
			<li><a href="JavaScript:theaterSelect('41');">경기도</a></li>
			<li><a href="JavaScript:theaterSelect('43');">충천북도</a></li>
			<li><a href="JavaScript:theaterSelect('44');">충청남도</a></li>
			<li><a href="JavaScript:theaterSelect('30');">대전</a></li>
			<li><a href="JavaScript:theaterSelect('47');">경상북도</a></li>
			<li><a href="JavaScript:theaterSelect('28');">대구</a></li>
			<li><a href="JavaScript:theaterSelect('31');">울산</a></li>
			<li><a href="JavaScript:theaterSelect('26');">부산</a></li>
			<li><a href="JavaScript:theaterSelect('48');">경상남도</a></li>
			<li><a href="JavaScript:theaterSelect('45');">전라북도</a></li>
			<li><a href="JavaScript:theaterSelect('29');">광주</a></li>
			<li><a href="JavaScript:theaterSelect('46');">전라남도</a></li>
			<li><a href="JavaScript:theaterSelect('50');">제주도</a></li>
		</ul>
		&nbsp;
	</div>
	
	<div style="text-align:center;">
		<hr>
			<img src="http://img.cgv.co.kr/R2014/images/title/h3_theater.gif"  />
		<hr>
	</div>
	<div id="list" style="height:30%;">
		
		<div>
			<img src="http://img.cgv.co.kr/Theater/Theater/2015/1027/대학로문화극장04.jpg"/>
		</div>
		<div>
			chart
		</div>
		
	</div>
	
	
	<script type="text/javascript">
	function theaterSelect(sido){
		
		//alert("sidoCode : " +sido);
		$.ajax({
			url: "/theater/theaterList.do",
			type: "post",
			data : {
				"sido" : sido
			},
			success: function(data){
			console.log(data);
			//	console.log(data.length);
				var contents ="";
					contents +="<table border:1px solid black; id='DT'>";
					contents +="<thead>";
					contents +="<tr>"
					contents +="<th></th>";
					contents +="<th></th>";
					contents +="<th></th>";
					contents +="<th></th>";
					contents +="<th></th>";
					contents +="<th></th>";
					contents +="</tr>";
					contents +="</thead>";
					contents +="<tbody>";
					
					
							for(var i=0; i<data.length;){

							 console.log("i : " + i +"."+data[i].fcltynm +" , " + data[i].mt10id );
							 contents +="<tr>";
							
							 contents +="<td>";
							 contents +="<a href='/theater/theaterDetail.do?id="+data[i].mt10id+"'>"+data[i].fcltynm+"</a>";
							 contents +="</td>";
						 	 i++;
							  contents +="<td>";
							 contents +="<a href='/theater/theaterDetail.do?id="+data[i].mt10id+"'>"+data[i].fcltynm+"</a>";
							 contents +="</td>";
						 	 i++; 
						
							 
							// 3꺠 뿌터 오류까 생성된다. 왜???
							/* contents +="<td>";
							 contents +="<a href='#'>"+data[i].mt10id+"</a>";
							 contents +="</td>";
						 	 i++;  */
							 
							 contents +="</tr>"; 
							}
					
					contents +="</tbody>";
					contents +="</table>";
					
					$('#list').html(contents);
					
				
			},
			error:function(){
				alert("에러");
			}
			
			
			
			
		})//ajax end
	}
	</script>
	
	<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
	
</body>
</html>