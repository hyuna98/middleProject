<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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


	<div class="bgBox">
		<div class="concord-img-gradient">
			<nav id="nav">
				<dl>
					<dt>마이페이지</dt>
					<dd>
						<a class="menuLink" href="<%=request.getContextPath()%>/user/myPage/main.do">개인정보조회 및 수정</a>
					<dd>
						<a class="menuLink" href="<%=request.getContextPath()%>/user/myPage/myMemberShip.do">My 멤버십</a>
					</dd>
					<dd>
						<a class="menuLink" href="<%=request.getContextPath()%>/user/myPage/withdrawal.do">회원 탈퇴</a>
					</dd>
				</dl>
			</nav>
		</div>
		<div class="main">
			<div class="titleWrap mb-5">
				<h2 class="pageTitle pb-3">회원탈퇴</h2>
			</div>
			<form action="<%=request.getContextPath()%>/user/myPage/withdrawal.do" method="post">
				<div class="form-group">
            		<label class="label pr-5">비밀번호</label>
            		<input type="password" name="users_pw" placeholder="패스워드를 입력하세요." value="">
            	</div>
            	<div class="form-group">
            		<label class="label pr-5">탈퇴사유</label>
            	</div>
            	<div class="form-group">
            		<textarea placeholder="탈퇴사유를 입력하세요!" style="width: 100%; height: 200px;"></textarea>
            	</div>
            	<div class="text-align-center">
					<input id="wrt" type="submit" class="btn btn-primary" value="회원탈퇴">
            	</div>
			</form>
		</div>
	</div>

<script>
		const url = new URL(window.location.href);

		// URLSearchParams 객체
		const urlParams = url.searchParams;

		// URLSearchParams.get()
		if(urlParams.get('msg')=='실패'){
			alert("비밀번호가 틀렸습니다.");
		};
</script>


<jsp:include page="../../common/footer.jsp" />