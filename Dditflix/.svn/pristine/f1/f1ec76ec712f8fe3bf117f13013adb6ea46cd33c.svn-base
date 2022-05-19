<%@page import="kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	LoginVO user = (LoginVO) session.getAttribute("loginChk");
%>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>마이페이지</title>
<jsp:include page="../../common/header.jsp" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/boardSelect.css">
<script src="//cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script>

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
			<form action="<%=request.getContextPath()%>/user/myPage/DownPym.do"
				method="post">
				<div class="titleWrap mb-5">
					<h2 class="pageTitle pb-3">컨텐츠 결제 목록</h2>
				</div>
				<table class="table" id="myTable">
					<thead>
						<tr>
							<td id="trp">구매번호</td>
							<td id="trp">포스터</td>
							<td id="trp">제목</td>
							<td id="trp">다운로드 / 삭제</td>
						</tr>
					</thead>
					<tbody>
						<%
							List<UserDownloadPaymentVO> list = (List<UserDownloadPaymentVO>)request.getAttribute("list");

							String msg = request.getParameter("msg") == null ? "" : request.getParameter("msg");

							int listSize = list.size();
							if (listSize > 0) {
								for (int i = 0; i < listSize; i++) {
						%>
						<tr>
							<form action="<%=request.getContextPath()%>/user/myPage/DownPym.do" method="post">
								<th><%=list.get(i).getDwnldPymCartNo()%></th>
								<td><img class="titleImg"
									src="<%=list.get(i).getPoster()%>" alt=""></td>
								<td><%=list.get(i).getContTitle()%></td>
								<td><button class="btn btn-primary btn-del" 
										data-title="<%=list.get(i).getContTitle()%>" role="downloadBtn" style="background-color: black; border-color: red;">다운로드</button>
									<button class="btn btn-primary btn-del" type="submit"
										data-idx="<%=i%>" style="background-color: black; border-color: red;">삭제</button></td>
								<td><input type="hidden" name="cont_title"
									value="<%=list.get(i).getContTitle()%>"></td>
							</form>
						</tr>
						<%
							}
							} else {
						%>
						<tr>
							<td colspan="100%">결제한 컨텐츠가 없습니다.</td>
						</tr>
						<%
							}
						%>
						<form name="downform" id="downform" action="<%=request.getContextPath()%>/user/myPage/downloadCon.do" method="post" >
							<input type="hidden" id="title" name="title" value="">
							<input type="hidden" id="userId" name="userId" value="">
						</form>
					</tbody>
				</table>
			</form>
		</div>
	</div>
	
	<script>
		
		$('button[role=downloadBtn]').on('click',function(e){
			
			e.preventDefault();
			
			let title = $(this).data('title');
			let userId = "<%=user.getUsers_id()%>";
			
			$('#title').val(title);
			$('#userId').val(userId);
			
			$('#downform').submit();
			
		});
	</script>
</body>
</html>

<jsp:include page="../../common/footer.jsp" />