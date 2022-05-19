<%@page import="kr.or.ddit.content.vo.ContentVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../../common/header.jsp" />

<script src="//cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" href="//cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/comm_sub.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/boardSelect.css">
<style>
#contentTable_filter input[type="search"]{
	color : #fff;
}
table.dataTable tbody th, table.dataTable tbody td {
    padding: 8px 10px;
}
</style>
<script>
$(document).ready(function() {
	$('#contentTable').DataTable({
		ordering : false,
		lengthChange : false
	});
});
</script>
<div class="bgBox">
	<div class="concord-img-gradient"></div>
	<div class="main">
		<div class="titleWrap mb-5">
			<h2 class="pageTitle pb-3">컨텐츠 리스트</h2>
		</div>
		<div class="conWrap">
			<div class="text-align-right mb-3">
				<a id="insertBtn" class="btn btn-danger" href="insertContent.do">등록하기</a>
			</div>
			<table id="contentTable" class="table">
				<colgroup>
					<col width="10%">
					<col width="30%">
					<col width="20%">
					<col width="20%">
					<col width="20%">
				</colgroup>
				<thead>
					<tr>
						<th scope="row">순번</th>
						<th scope="row">제목</th>
						<th scope="col">장르</th>
						<th scope="col">주연</th>
						<th scope="col">변경</th>
					</tr>
				</thead>
				<tbody>
					<%
						List<ContentVO> contentList = (List<ContentVO>) request.getAttribute("contentList");
						if (contentList.size() > 0) {
							for (int i=0; i<contentList.size(); i++) {
					%>
					<tr>
						<td><%=i+1 %></td>
						<td><%=contentList.get(i).getCont_title() %></td>
						<td><%=contentList.get(i).getCont_genre() %></td>
						<td><%=contentList.get(i).getCont_cast() %></td>
						<td>
							<a class="btn btn-primary" href="updateContent.do?contitle=<%=contentList.get(i).getCont_title() %>">수정</a>
							<input class="btn btn-danger" type="button" value="삭제" role="deleteCon" data-id="<%=contentList.get(i).getCont_title() %>">
						</td>
					</tr>
					<%
							}
						} else {
					%>
					<tr>
						<td colspan="100%">컨텐츠가 존재하지 않습니다.</td>
					</tr>
					<%
						}
					%>
				</tbody>
			</table>
		</div>
		<script>
			$("input[role=deleteCon]").click(function(){
				let conTitle = $(this).data("id");
				$.ajax({
					type: "post",
					url: "deleteContent.do",
					data: { "conTitle": conTitle },
					dataType: "json",
					success: function(result){
						if(result>0){
							alert("삭제되었습니다.");
							location.href="contentList.do"
						} else {
							alert("삭제 실패.");
							location.href="contentList.do"
						}
					},
					error: function(request, status, error) { alert("code:" + request.status + "\n" + "error:" + error); }
				})
			}); 
		</script>
	</div>
</div>
<jsp:include page="../../common/footer.jsp" />
