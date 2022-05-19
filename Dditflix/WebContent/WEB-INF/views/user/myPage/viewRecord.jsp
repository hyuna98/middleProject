<%@page import="kr.or.ddit.user.viewHistory.vo.ViewHistoryVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	LoginVO lv = (LoginVO) request.getAttribute("lv");
%>
<jsp:include page="../../common/header.jsp" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/boardSelect.css">

<script>
	$(document).ready(function() {
		$('#myTable').DataTable({
			ordering : false,
			lengthChange : false
		});
	});

	$(function() {
		$('#sendBtn').on('click', function() {
			move();
		})
	});

	move = function() {
		location.href = "review.do";
	}

</script>

	<div class="bgBox">
		<div class="concord-img-gradient"></div>
		<div class="main">
			<form action="<%=request.getContextPath()%>/user/myPage/main.do"
				method="post">
				<div class="titleWrap mb-5">
					<h2 class="pageTitle pb-3">시청목록</h2>
				</div>
				<table class="table" id="myTable">
					<thead>
						<tr>
							<td id="trp">순번</td>
							<td id="trp">포스터</td>
							<td id="trp">제목</td>
							<td id="trp">삭제버튼</td>
						</tr>
					</thead>
					<tbody>
						<%
							List<ViewHistoryVO> viewList = (List<ViewHistoryVO>) request.getAttribute("viewList");

							String msg = request.getParameter("msg") == null ? "" : request.getParameter("msg");

							int viewSize = viewList.size();
							if (viewSize > 0) {
								for (int i = 0; i < viewSize; i++) {
						%>
						<tr>
							<form action="<%=request.getContextPath()%>/user/myPage/viewRecord.do"	method="post">
								<th><%=i+1%></th>
								<td><img class="titleImg"
									src="<%=viewList.get(i).getCont_poster()%>" alt=""></td>
								<td><%=viewList.get(i).getCont_title()%></td>
								<td><button class="btn btn-primary btn-del" type="submit"
										data-idx="<%=i%>" style="background-color: black; border-color: red;">삭제</button></td>
								<td><input type="hidden" name="cont_title"
									value="<%=viewList.get(i).getCont_title()%>"></td>
							</form>
						</tr>
						<%
							}
							} else {
						%>
						<tr>
							<td colspan="100%">시청 컨텐츠가 없습니다.</td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</form>
		</div>
	</div>

<script>
		const url = new URL(window.location.href);

		// URLSearchParams 객체
		const urlParams = url.searchParams;

		// URLSearchParams.get()
		if(urlParams.get('msg')=='성공'){
			alert("시청 목록에서 삭제하였습니다.");
		}else if(urlParams.get('msg')=='실패'){
			alert("오류\n\n고객센터에 문의주세요\n(☎042-222-8202)");
		};
</script>

<jsp:include page="../../common/footer.jsp" />