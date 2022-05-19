<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.admin.member.vo.UsersVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<title>마이페이이지</title>
<jsp:include page="../../common/header.jsp" />
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/boardSelect.css">

	<div class="bgBox">
		<div class="concord-img-gradient"></div>
		<div class="main">
			<div class="titleWrap mb-5">
				<h2 class="pageTitle pb-3">회원목록</h2>
			</div>
			<table class="table" id="myTable">
				<thead>
					<tr>
						<th id="trp">이름</th>
						<th id="trp">ID</th>
						<th id="trp">연락처</th>
						<th id="trp">주소</th>
						<th id="trp">권한부여 / 삭제</th>
					</tr>
				</thead>
				<tbody>
					<%
						List<UsersVO> list = (List<UsersVO>) request.getAttribute("list");

						String msg = request.getParameter("msg") == null ? "" : request.getParameter("msg");

						int listSize = list.size();
						if (listSize > 0) {
							for (int i = 0; i < listSize; i++) {		
					%>
					<tr>
						<td><%=list.get(i).getUsers_name()%></td>
						<td><%=list.get(i).getUsers_id()%></td>
						<td><%=list.get(i).getUsers_hp()%></td>
						<td><%=list.get(i).getUsers_add1()%></td>
						<td>
							<form style="display:inline" action="<%=request.getContextPath()%>/admin/member/AdminMember.do" method="post">
								<button class="btn btn-primary btn-del" type="submit" data-idx="<%=i%>">권한부여</button>
								<input type="hidden" name="users_id" value="<%=list.get(i).getUsers_id()%>">
							</form>
							<form style="display:inline" action="<%=request.getContextPath()%>/admin/member/AdminMember1.do" method="post">
								<button class="btn btn-primary btn-del" type="submit" data-idx="<%=i%>" style="background-color: red; border-color: red;">삭제</button>
								<input type="hidden" name="users_id" value="<%=list.get(i).getUsers_id()%>">
							</form>
						</td>
					</tr>
					<%
						}
						} else {
					%>
					<tr>
						<td colspan="100%">회원이 없습니다.</td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>

<script>
$(document).ready(function() {
	$('#myTable').DataTable({
		ordering : false,
		lengthChange : false
	});
});
		const url = new URL(window.location.href);

		// URLSearchParams 객체
		const urlParams = url.searchParams;

		// URLSearchParams.get()
		if(urlParams.get('msg')=='삭제성공'){
			alert("회원목록이 변경되었습니다.");
		}else if(urlParams.get('msg')=='삭제실패'){
			alert("해당 회원의 삭제에 실패해였습니다.");
		}else if(urlParams.get('msg')=='성공'){
			alert("해당 회원에게 관리자 권한을 부여하였습니다.");
		}else if(urlParams.get('msg')=='실패'){
			alert("해당 회원에게 관리자 권한을 부여 할 수 없습니다.");
		};
</script>


<jsp:include page="../../common/footer.jsp" />