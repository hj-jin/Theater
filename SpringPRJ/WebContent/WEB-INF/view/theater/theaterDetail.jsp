<%@page import="poly.dto.TheaterDTO"%>
<%@page import="java.util.List"%>
<%@page import="poly.dto.LocalDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List<TheaterDTO> tList = (List<TheaterDTO>)request.getAttribute("tList");

%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>theaterDetail</title>
	
	<link rel="stylesheet" href="/assets/css/main.css" />
	
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
	
	
</head>
<body>
	<!-- top -->
	<%@ include file="/WEB-INF/view/top.jsp" %>
	<!-- top -->

	<h3>Theater Detail</h3>
	<hr/>
	<div class="container">
		<table border="1px solid black">
		<%for(int i=0; i < tList.size(); i++){ %>
			
			<tr>
				<td style="color:#fdfcf0; background-color: #cccccc; opacity:0.9;">
					<a href="<%=tList.get(i).getRelateurl() %>" target="_blank">홈페이지</a> <!-- -->
					<br />공연장 : <%=tList.get(i).getFcltynm() %> / <%=tList.get(i).getFcltychartr() %><!-- -->
					<br />주소 : <%=tList.get(i).getAdres() %> <!-- -->
					<br />
					<br />번호 : <%=tList.get(i).getTelno() %> <!-- -->
					<br />공연장 /객석 수 : <%=tList.get(i).getMt13cnt() %> / <%=tList.get(i).getSeatscale() %><!--  -->
					<br />개관연도 : <%=tList.get(i).getOpende() %> <!-- -->
				</td>
			</tr>
		<%} %>
		</table>
		
		<div id="map" style="width:100%;height:400px;">
		</div>
		
		<div>
			<button onclick="window.open('about:blank').location.href='http://map.daum.net/link/to/'" style="width:100%;">다음 빠른 길찾기</button>
		</div>
	
	</div>
	
	
	<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		
	
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c449b1cbc3c291def2d6edada3e87082&libraries=services"></script>
	<script>
	var addr;
	var name;
	addr = "<%=tList.get(0).getAdres()%>";
	name = "<%=tList.get(0).getFcltynm()%>";
	
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = {
        center: new daum.maps.LatLng(37.575042, 127.043310), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };  

	// 지도를 생성합니다    
	var map = new daum.maps.Map(mapContainer, mapOption); 
	
	// 주소-좌표 변환 객체를 생성합니다
	var geocoder = new daum.maps.services.Geocoder();
	
	// 주소로 좌표를 검색합니다
	geocoder.addressSearch(addr, function(result, status) {
	
	    // 정상적으로 검색이 완료됐으면 
	     if (status === daum.maps.services.Status.OK) {
	
	        var coords = new daum.maps.LatLng(result[0].y, result[0].x);
	
	        // 결과값으로 받은 위치를 마커로 표시합니다
	        var marker = new daum.maps.Marker({
	            map: map,
	            position: coords
	        });
	
	        // 인포윈도우로 장소에 대한 설명을 표시합니다
	        var infowindow = new daum.maps.InfoWindow({
	            content: '<div style="width:150px;text-align:center;padding:6px 0;">'+name+'</div>'
	        });
	        infowindow.open(map, marker);
	
	        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
	        map.setCenter(coords);
	    } 
	});    
	</script>

</body>
</html>