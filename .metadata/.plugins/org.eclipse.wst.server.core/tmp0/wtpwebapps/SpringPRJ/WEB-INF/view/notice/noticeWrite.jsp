<%@page import="poly.dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- head -->
		<%@ include file="/WEB-INF/view/Head.jsp" %>
		
		<script type="text/javascript">
		
		//로그인 여부 체크
		<%-- function doOnload(){
			var user_id = "<%=SESSION_USER_ID%>";
			
			if (user_id==""){
				alert("로그인된 사용자만 글을 쓸 수 있습니다.");
				top.location.href="/notice/NoticeList.do";
				
			}
			
		} --%>
		</script>


		<!-- 글쓰기 편짐 -->
		
		

		</head>
		<!-- head -->
		
		<!-- top -->
		<%@ include file="/WEB-INF/view/top.jsp" %>
	
		<div style="height:7%; background-color:#4e4945;">&nbsp;&nbsp;&nbsp;</div>
		<!-- top -->
		
		<!-- include libraries(jQuery, bootstrap) -->
	    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
	    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
	    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 
	
	    <!-- include summernote css/js -->
	    <link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote.css" rel="stylesheet">
	    <script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote.js"></script>
    
		
		<style>
			.btn-default {
				background-color: #009688;
			}
		</style>
		<!-- main  -->
		<div class="table-responsive">
			<h2 style="text-align:center;">게시글 작성</h2>
			<form class="form-horizontal" action="/notice/noticeWrieteProc.do">
			  <div class="form-group">
			    <label for="title" class="col-sm-2 control-label">title</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="title" placeholder="title">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="content" class="col-sm-2 control-label">content</label>
			    <div class="col-sm-10">
			     	<!-- <textarea class="form-control" rows="3" name="content" placeholder="content"></textarea> -->
			     	<textarea id="summernote" name="content"></textarea>
			    </div>
			  </div>
			 
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="#" class="btn btn-default">목록</button>
			      <button type="submit" class="btn btn-default">등록</button>
			    
			    </div>
			  </div>
			  
			  <input type="hidden" name="userSeq" value="<%=userSeq%>">
			</form>
		
		</div>
		<!-- main -->
		
		<!-- bottom -->
		
		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		<!-- bottom -->
		
		
</body>

	
<script type="text/javascript">
$(document).ready(function() {
	  $('#summernote').summernote({
		  height:300
		  
	  });
	});
</script>
</html>