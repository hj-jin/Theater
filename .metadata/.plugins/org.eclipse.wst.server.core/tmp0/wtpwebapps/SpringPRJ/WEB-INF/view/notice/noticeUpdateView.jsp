<%@page import="poly.dto.NoticeDTO"%>
<%@page import="poly.dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	NoticeDTO nDTO = (NoticeDTO)request.getAttribute("nDTO");
	
	if(nDTO == null){
		
		nDTO = new NoticeDTO();
	}
%>

<html>
<!-- head -->
		<%@include file="/WEB-INF/view/Head.jsp" %>
		
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


		</head>
		<!-- head -->
		
		<!-- top -->
		<%@ include file="/WEB-INF/view/top.jsp" %>
		<div style="height:7%; background-color:#4e4945;">&nbsp;&nbsp;&nbsp;</div>
		<!-- top -->
		
		<!-- main  -->
		<div class="table-responsive">
			<h2 style="text-align:center;">게시글 수정</h2>
			<form class="form-horizontal" action="/notice/noticeUpdate.do" method="post">
			  <div class="form-group">
			    <label for="title" class="col-sm-2 control-label">title</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="title" value="<%=nDTO.getTitle()%> "placeholder="<%=nDTO.getTitle()%>">
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="content" class="col-sm-2 control-label">content</label>
			    <div class="col-sm-10">
			     	<textarea class="form-control" rows="3" name="content" value="<%=nDTO.getContent()%> "placeholder="<%=nDTO.getContent()%>"></textarea>
			    </div>
			  </div>
			 
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="#" class="btn btn-default">목록</button>
			      <button type="submit" class="btn btn-default">수정</button>
			    
			    </div>
			  </div>
			  
			  <input type="hidden" name="userSeq" value="<%=userSeq%>">
			  <input type="hidden" name="noticeSeq" value="<%=nDTO.getNoticeSeq()%>">
			</form>
		
		</div>
		<!-- main -->
		
		<!-- bottom -->
		
		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		<!-- bottom -->
		
		
</body>
</html>