<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<link rel="stylesheet" href="/assets/css/calStyle.css"/>
	<script type="text/javascript" src="/assets/js/calendar.js"></script>

	<div class="jquery-calendar"></div>
	<script>
	function day(){
		var year = $('table.cal>caption').find('span.month').text();
		var day = $('table.cal>tbody>tr').find('td.active').text();
		
		if(day < 10){
			day = '0' + day;
		}
		year = year.replace("-","");
		
		var stdate = year + day ;
//		alert("stdate() : " + stdate);
		location.href="/cal/calSelect.do?stdate=" +stdate;
	}
	</script>