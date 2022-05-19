<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.admin.sales.vo.AdminSalesVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	AdminSalesVO vo = (AdminSalesVO) request.getAttribute("contentsSales");
	List<AdminSalesVO> dataList = (List<AdminSalesVO>) request.getAttribute("contentsSalesChart");
%>	
	<div class="gridBox maxCol2 mb-3">
		<div class="monitoringContentsBox">
			<h3 class="monitoringTitle">금일 매출</h3>
			<div class="monitoringContent">
				<div class="valueBox">
					<span class="number label value-won"><%=vo.getToday() %></span>
				</div>
			</div>
		</div>
		<div class="monitoringContentsBox">
			<h3 class="monitoringTitle">올해 매출</h3>
			<div class="monitoringContent">
				<div class="valueBox">
					<span class="number label value-won"><%=vo.getThisYear() %></span>
				</div>
			</div>
		</div>
	</div>
	<div class="gridBox maxCol2 mb-3">
		<div class="monitoringContentsBox">
			<h3 class="monitoringTitle">이번달 매출</h3>
			<div class="monitoringContent">
				<div class="valueBox">
					<span class="number label value-won"><%=vo.getThisMon() %></span>
				</div>
			</div>
		</div>
		<div class="monitoringContentsBox">
			<h3 class="monitoringTitle">지난달 매출</h3>
			<div class="monitoringContent">
				<div class="valueBox">
					<span class="number label value-won"><%=vo.getLastMon() %></span>
				</div>
			</div>
		</div>
	</div>
	<div class="gridBox">
		<div class="monitoringContentsBox">
			<h3 class="monitoringTitle">월별 컨텐츠 매출 현황</h3>
			<div id="curve_chart" class="chart ratio1 xLarge">
				<div id="google-visualization-errors-all-3" style="display: block; padding-top: 2px;">
					<div id="google-visualization-errors-2" style="font: 0.8em arial, sans-serif; margin-bottom: 5px;">
						<span style="background-color: rgb(192, 0, 0); color: white; padding: 2px;">Data column(s) for axis #0 cannot be of type string</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {

			window.addEventListener("resize", function() {
				google.charts.setOnLoadCallback(drawChart);
			});

			google.charts.load("current", {
				packages : [ "corechart" ]
			});
			google.charts.setOnLoadCallback(drawChart);
		});

		function drawChart() {
			let list = [];
		
			list.push([ "month", "영화" ]);
			<% for(int i=0;i<dataList.size(); i++){
 					String months = dataList.get(i).getMonths(); 
 					String movie = dataList.get(i).getMovie(); 
			
			%>
 					list.push([ "<%=months%>", parseInt("<%=movie%>") ]);
			<%
			}
			%>	
								
				


			var data = google.visualization.arrayToDataTable(list);

			var options = {
				title : "매출",
				curveType : "function",
				legend : {
					position : "none"
				},
			};

			var chart = new google.visualization.LineChart(document
					.getElementById("curve_chart"));

			chart.draw(data, options);
		}
	</script>