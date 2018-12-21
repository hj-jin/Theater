<%@page import="poly.util.RestoreScript"%>
<%@page import="poly.dto.NoticeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="poly.dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	NoticeDTO nDTO = (NoticeDTO)request.getAttribute("nDTO");


	//게시판 조회 결과 보여주기
	if (nDTO==null){
		nDTO = new NoticeDTO();
	}
	List<NoticeDTO> rList = (List<NoticeDTO>)request.getAttribute("rList");

%>

<html>
		<!-- head -->
		<%@ include file="/WEB-INF/view/Head.jsp" %>
			<style>
			@-moz-document url-prefix() {
	 		 fieldset { display: table-cell; }
			}
			</style>
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
			
			<script type="text/javascript">

			//댓글 수정 삭제 버튼
			function reClick(r,u){
				//r : reSeq 
				//u: userSeq
				//(String)session.getAttribute("userSeq")
			 	var ss_userSeq = <%=(String)session.getAttribute("userSeq")%>;
				var upWrite = "#upWrite"+r+"";
				alert(upWrite);
			 	if(ss_userSeq == u){
					<%-- upWrite<%=rList.get(i).getRepleSeq()%> --%>
					alert("수정 삭제");
					var upBtn="";
						//upBtn= "<button class='btn btn-default pull-right' onclick='#'>test</button>"
						upBtn += "<div class='btn-group pull-right' role='group' align='right' id='"+upWrite+"'>";
						upBtn +="<button type='button' class='btn btn-default' onClick='JavaScript:upBtn("+r+")'>수정</button>";
						upBtn +="<button type='button' class='btn btn-default' onClick='JavaScript:delBtn("+r+")'>삭제</button>";
						upBtn +="</div>"
					
					$(upWrite).html(upBtn);
				}else{
					alert("작성자만 수정 가능합니다.");
				}			
			}
			
			
			
			//댓글 수정  뷰
			function upBtn(r){
				var upView = "#upView"+r+"";
				//alert(upView);
				//alert(r);
				$.ajax({
					url : "/notice/upReple.do",
					method :"post",
					data : {
						"repleSeq" : r
						
					},
					success : function(data){
						console.log(data);
						var upBtnView ="";
							upBtnView += "<div style='margin-bottm:10%;'>";
							upBtnView += "<form id='ajaxfromUp' method='post' action='/seller/board/updateRe.do'>";
							upBtnView += "<textarea rows='3' class='col-sm-12 form-control' id='reContentUp' name='reContentUp' maxlength='2048'></textarea>";
							upBtnView += "<input type='hidden' name='regDateUp'/>";
							upBtnView += "<input type='hidden' name='userSeqUp' value='"+data.userSeq+"'/>";
							upBtnView += "<input type='hidden' name='boardPSeqUp' value='"+data.boardPSeq+"'/>";
							upBtnView += "<input type='hidden' name='levelUp' value='1'/>";
							upBtnView += "<input type='hidden' name='repleSeq' value='"+r+"'/>";
							upBtnView += "</form>";
							upBtnView += "<button class='btn btn-default pull-right' onclick='JavaScript:updateRe()'>등록</button>";
							upBtnView += "</div>";
							
						$(upView).html(upBtnView);
						console.log(upBtnView);
					},
					error : function(){
						alert("error");
					}
					
					
				});
				
			}
			
			</script>
		
		</head>
		<!-- head -->
		
		<!-- top -->
		<%@ include file="/WEB-INF/view/top.jsp" %>
		
		<script type="text/javascript" src="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
		<script>
		$(document).ready( function () {
		    $('#DT').DataTable();
		} );
		
		</script>
		<!-- ajax form  -->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script> 
		<script src="http://malsup.github.com/jquery.form.js"></script> 
		
		<div style="height:7%; background-color:#4e4945;">&nbsp;&nbsp;&nbsp;</div>
		<!-- top -->
		
		<!-- main -->
		
		<h3>게시글 상세</h3>
		<hr/>
		
		<div class="table-responsive">
		 	<table class="table">
			 	<tbody>
		 			<tr>
		 				<td>번호 : <%=nDTO.getNoticeSeq()%></td>
		 				<td>제목 : <%=RestoreScript.doRestore(nDTO.getTitle())%></td>
		 				<td>조회수 : <%=nDTO.getCnt()%></td>
		 			</tr>
		 			<tr>

		 				<td colspan="3">내용 : <%=RestoreScript.doRestore(nDTO.getContent())%></td>
		 			</tr>
		 			<tr>
		 				<td></td>
		 				<td>작성일 : <%=nDTO.getUpdDate()%></td>
		 				<td>작성자 : <%=nDTO.getUpdNo()%></td>
		 			</tr>
					 		
			 	</tbody>
			 </table>
		</div>	
		<div align="right">
			<button type="button" class="btn btn-default" onclick="location.href='#'">목록</button>
			<button type="button" class="btn btn-default" onclick="location.href='/notice/noticeUpdateView.do?noticeSeq=<%=nDTO.getNoticeSeq()%>'">수정</button>
			<button type="button" class="btn btn-default" onclick="location.href='/notice/noticeDelete.do?noticeSeq=<%=nDTO.getNoticeSeq()%>'">삭제</button>
		</div>
		
		<div>
			<div class="table-responsive">
				<hr>
				<hr>
				<form class="form-horizontal" action="/notice/reNoticeReg.do" id="ajaxForm">
				  <div class="form-group">
				    <label for="review" class="col-sm-2 control-label">review</label>
				    <div class="col-sm-8">
						<textarea rows="3" class="col-sm-12 form-control" name="reNotice" id="reNotice"></textarea>
				    </div>
				      <button type="button" class="btn btn-default" onclick="JavaScript:reReg()">등록</button>
				  </div>
				 
				  <input type="hidden" name="userSeq" value="<%=userSeq%>"/>
				  <input type="hidden" name="noticeSeq" value="<%=nDTO.getNoticeSeq()%>"/>
				</form>
			
			</div>
			<div id="rList">
				<%if(rList.size() >0 ){ %>
						<table>
						<thead>
						<tr><th></th></tr>
						</thead>
						<tbody>
					<% for (int i=0; i < rList.size(); i++){ %>
						<tr>
							<td>
								userSeq : <%= rList.get(i).getUserSeq() %> / <%=rList.get(i).getUpdDate()%><br/>
								content : <%= rList.get(i).getReNotice() %>
							</td>
							<td>
								<div id='upWrite"<%=rList.get(i).getReNoticeSeq() %>"'>
									<button class="btn btn-default pull-right" onclick="javascript:reClick('<%=rList.get(i).getReNoticeSeq() %>','<%=rList.get(i).getUpdNo() %>')">...</button>
								</div>
							</td>
						</tr>
					<%} %>
				<% }%>
			
			</div>
		
		</div>
		 	
		 	
		<!--main -->
		
		<!-- bottom -->
		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		<!-- bottom -->
		
		
		<script type="text/javascript">
		
		
		
			function reReg(){
				alert("댓글 등록 완료");
				$('#ajaxForm').ajaxForm({
					beforeSubmit : function(){
						if($('#reNotice').val() == ""){
							alert("내용을 입력해주세요");
							$('#reNotice').focus();
							return false;
						}
					},
					success:function(data){
						console.log(data);
						var content = "";
							content += "<table id='DT'>";
							content += "<thead>";
							content += "<tr><th></th></tr>";
							content += "</thead>";
							content += "<tbody>";
							
						$.each(data,function(key,value){
							content +="<tr>";
							content +="<td>";
							content +="userSeq : " + value.updNo +" " + value.updDate + "<br/>";
							content +="content : " + value.reNotice;
							content +="</td>";
							content +="<td>";
							content +="<div id='upWrite"+value.reNoticeSeq+"'>";
							content +='<button class="btn btn-default pull-right" onclick="javascript:reClick(&#39;'+value.reNoticeSeq+'&#39;,'+value.updNo+')">...</button>'
							content +="</td>";
							content +="</tr>";
						})
						$('#rList').html(content); 
							
					},
					error:function(){
						alert("error");
					}
					
				}).submit();
				
				
			};
			
			
			
			</script>
</body>
</html>