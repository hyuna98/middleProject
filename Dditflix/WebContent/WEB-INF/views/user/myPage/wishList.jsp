<%@page import="kr.or.ddit.user.myPage.vo.wishListVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	LoginVO lv = (LoginVO) request.getAttribute("lv");
%>

<title>마이페이지</title>
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

<body>
	<div class="bgBox">
		<div class="concord-img-gradient"></div>
		<div class="main">
			<div class="titleWrap mb-5">
				<h2 class="pageTitle pb-3">찜목록</h2>
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
							List<wishListVO> wishList = (List<wishListVO>) request.getAttribute("wishList");

							String msg = request.getParameter("msg") == null ? "" : request.getParameter("msg");

							   int wishSize = wishList.size();
								if (wishSize > 0) {
									for (int i = 0; i < wishSize; i++) {
						%>
					
					<tr>
						<form
							action="<%=request.getContextPath()%>/user/myPage/wishList.do"
							method="post">
							<th><%=i+1%></th>
							<td><img class="titleImg"
								src="<%=wishList.get(i).getCont_poster()%>" alt=""></td>
							<td><%=wishList.get(i).getCont_title()%></td>
							<td><button class="btn btn-primary btn-del" type="submit"
									data-idx="<%=i%>" style="background-color: black; border-color: red;">삭제</button></td>
							<td><input type="hidden" name="cont_title"
								value="<%=wishList.get(i).getCont_title()%>"></td>
						</form>
					</tr>
					<%
						}
						} else {
					%>
					<tr>
						<td colspan="100%">찜한 컨텐츠가 없습니다.</td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
	</div>


<script>
		const url = new URL(window.location.href);

		// URLSearchParams 객체
		const urlParams = url.searchParams;

		// URLSearchParams.get()
		if(urlParams.get('msg')=='성공'){
			alert("찜 목록에서 삭제하였습니다.");
		}else if(urlParams.get('msg')=='성공'){
			alert("오류\n\n고객센터에 문의주세요\n(☎042-222-8202)");
		};
</script>


<jsp:include page="../../common/footer.jsp" />