<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String elem = (String)request.getAttribute("elem");
%>
<html>
<!DOCTYPE HTML>
<!--
	Prologue by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
		<!-- head -->		
		<%@ include file="/WEB-INF/view/Head.jsp" %>
		<style>
		.Con_ST {
		    position: relative;
		    display: block;
		    width: 100%;
		    height: 328px;
		    overflow: hidden;
		    background: url(http://ticketimage.interpark.com/TicketImage/main/100506_sub/bg_t_play.jpg) top left no-repeat;
		}
		.Con_ST .wrap_Tview {
		    position: relative;
		    width: 900px;
		    margin-top: 44px;
		    margin-left: 56px;
		    display: block;
		}
		dl.Tview {
		    position: relative;
		    float: left;
		    width: 129px;
		    margin: 0 6px;
		    display: inline;
		    overflow: hidden;
		}
		dl.Tview dt.Tposter {
		    position: relative;
		    width: 129px;
		    height: 161px;
		}
		dl.Tview dt.Tposter a {
		    width: 129px;
		    height: 161px;
		    display: inline-block;
		}
		dl.Tview dt.Tposter .info {
		    position: absolute;
		    z-index: 10;
		    top: 118px;
		    left: 3px;
		    width: 123px;
		    height: 35px;
		    background: url(http://ticketimage.interpark.com/TicketImage/main/100506_sub/tp_bg_info.png);
		    cursor: pointer;
		}
		dl.Tview dt.Tposter .info .txt1 {
		    display: block;
		    color: #e7e7e7;
		    text-align: center;
		    font-size: 11px;
		    margin-top: 5px;
		    height: 13px;
		    overflow: hidden;
		}
		dl.Tview dt.Tposter .info .txt2 {
		    display: block;
		    color: #ffcfce;
		    text-align: center;
		    font-size: 11px;
		    margin-top: 0;
		    height: 14px;
		    overflow: hidden;
		}
		dl.Tview dd {
		    position: relative;
		    color: #fff;
		    text-align: center;
		    font-size: 11px;
		}
		dl.Tview dd span.txt1 {
		    display: block;
		    width: 129px;
		    height: 14px;
		    color: #FFF;
		    text-align: center;
		    font-size: 12px;
		    font-weight: bold;
		    letter-spacing: -0.1em;
		    overflow: hidden;
		    margin-top: 7px;
		}
		dl.Tview dd span.txt2 {
		    display: block;
		    color: #a0a0a0;
		    text-align: center;
		    font-size: 11px;
		    margin-top: 3px;
		    letter-spacing: -0.1em;
		    height: 12px;
		    overflow: hidden;
		}
		dl.Tview dd span.txt3 {
		    display: block;
		    color: #a0a0a0;
		    text-align: center;
		    font-size: 11px;
		    font-family: arial;
		    letter-spacing: 0;
		    height: 11px;
		    overflow: hidden;
		}
		
		</style>
		</head>
		<!-- head -->

		<!-- top -->
		<%@ include file="/WEB-INF/view/top.jsp" %>
		<!-- top -->


		<!-- Main -->
			<div id="main">

				<!-- Intro -->
					<section id="top" class="one dark cover" >
							<div class="Con_ST">
								<%=elem %>
							</div>
					</section>

				<!-- Portfolio -->
					<section id="portfolio" class="two">
						<div class="container">
							<header>
								<h3>지역별  / 날짜별 검색</h3>
							</header>
							<div class="col-sm-12">
								<div class="col-sm-6">
									<%@ include file="/WEB-INF/view//local/localSelect.jsp" %>
								</div>
								<div class="col-sm-6">
								<%@ include file="/WEB-INF/view//cal/calSelect.jsp" %>
								</div>
							
							</div>
							
						</div>
					</section>

				<!-- About Me -->
					<!-- <section id="about" class="three">
						<div class="container">

							<header>
								<h3>홍보 배너</h3>
							</header>
							

						</div>
					</section> -->

				<!-- Contact -->
					<section id="contact" class="four">
						<div class="container">

							<header>
								<h2>유의사항</h2>
							</header>

							<p>취소 시 예매수수료는 예매 당일 밤 12시 이전까지 환불되며, 그 이후 기간에는 환불되지 않습니다.
웹 취소가능시간 이후에는 취소가 불가합니다.
 단, 관람일 당일 취소가능 한 상품의 경우 관람일 당일 취소 시에는 티켓금액의 90%가 과금됩니다.
상품의 특성에 따라서, 취소수수료 정책이 달라질 수 있습니다.(각 상품 예매 시 취소수수료 확인)
배송 및 반송처리 된 티켓의 배송료는 환불되지 않습니다.
금주 주말 (토/일)공연 취소를 원할 경우 내사수령 바랍니다. 우편으로 보낼 시 우체국이 토요일 근무를 안하는 관계로 수취인(인터파크)수령이 불가능하여 취소처리가 되지 않을 수 있습니다.
취소는 관람일 하루 전(평일/주말/공휴일 오후 5시, 토요일 오전 11시 이전)까지 직접 취소가 가능하며, 배송이 시작된 티켓의 경우 티켓이 인터파크 티켓 고객센터로 공연 전일까지 반송되어야 취소가능하며, 취소수수료는 도착일자 기준으로 부과됩니다.
(※ 단, 배송료는 환불되지 않으며 일괄배송 상품의 경우 취소에 대한 자세한 문의는 고객센터로 문의해주시기 바랍니다.)
(공연 전일이 휴일인 경우, 휴일 전날까지) 반송이 확인되지 않은 티켓은 현장에서도 수령하실 수 없으며, 공연 관람 및 환불이 불가합니다.          
<br />
<br />
<br />
<br />


</p>

								<div class="row">
									<div style="background-color:#cccccc; width:100%;" >
										<p>
										공연 당일 현장 교부처에서 예약번호 및 본인 확인 후 티켓을 수령하실 수 있습니다.
										</p>
										<p>
											상단 예매확인/취소 메뉴에서 예매내역을 프린트하여 가시면 편리합니다.
										</p>
									</div>
								</div>

						</div>
					</section>

			</div>

		<!-- bottom -->

		<%@ include file="/WEB-INF/view/bottom.jsp" %>
		

	</body>
</html>