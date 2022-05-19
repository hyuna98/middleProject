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

<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/user/myPage.css">
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
	
	function findZip() {
		new daum.Postcode({
		    oncomplete: function(data) {
		        // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
		             var addr = ''; // 주소 변수

		            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
		            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
		                addr = data.roadAddress;
		            } else { // 사용자가 지번 주소를 선택했을 경우(J)
		                addr = data.jibunAddress;
		            }

		       // 우편번호와 주소 정보를 해당 필드에 넣는다.
		       document.getElementById('zip').value = data.zonecode;
		       document.getElementById("add1").value = addr;
		       // 커서를 상세주소 필드로 이동한다.
		       document.getElementById("add2").focus();
		    }
		}).open();
		}
</script>

<style>
</style>
</head>

<body>
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
		<!--     <div class="concord-img-gradient"></div>  -->
		<div class="main">
			<form action="<%=request.getContextPath()%>/user/myPage/main.do" method="post" >
			<div class="titleWrap mb-5">
				<h2 class="pageTitle pb-3">|개인정보 조회 및 변경</h2>
			</div>
			<table class="table" id="myTable">
				<thead>
					<tr>
						<td id="trp">회원등급&nbsp&nbsp&nbsp:&nbsp<mark
								style="font-size: 15px; font-weight: bolder; padding: 3px; border-radius: 3px; background-color: yellow; color: red;"><%=lv.getMmbrs_id()%></mark></td>
					</tr>
					<tr>
						<td id="trp">아이디&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:&nbsp<%=lv.getUsers_id()%></td>
					</tr>
					<tr>
						<td id="trp">이름&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:&nbsp<%=lv.getUsers_name()%></td>
					</tr>
					<tr>
						<td id="trp">성별&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:&nbsp<%=lv.getUsers_gender()%></td>
					</tr>
					<tr>
						<td id="trp">생년월일&nbsp&nbsp&nbsp:&nbsp<%=lv.getUsers_bir()%></td>
					</tr>
					<tr>
						<td id="trp">비밀번호&nbsp&nbsp&nbsp: <input type="text" name="userspw"
							placeholder="********" autocomplete="off"></td>
					</tr>
					<tr>
						<td id="trp">연락처&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp: <input
							type="text" name="usershp" value="<%=lv.getUsers_hp()%>" autocomplete="off">
						</td>
					</tr>
					<tr>
						<td><label for="zip">우편번호&nbsp&nbsp&nbsp:</label>
						<input type="text" class="" id="zip" name="userZip" value="<%=lv.getUsers_zip()%>" autocomplete="off">
						<button type="button" id="modalBtn" class="btn btn-info btn-sm"
							onclick="findZip();" autocomplete="off" style="background-color:gray; color: white; border-color: black;">우편검색</button>
						</td>
					</tr>
					<tr>
						<td id="trp"><label for="add1">주소&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp:</label>
						<input
							type="text" id="add1" name="usersadd1" value="<%=lv.getUsers_add1()%>"
							style="width: 430px; font-size: 15px;" autocomplete="off">
						</td>
					</tr>
					<tr>
						<td id="trp"><label for="add2">상세주소&nbsp&nbsp&nbsp: <input type="text" id="add2" name="usersadd2"
							value="<%=lv.getUsers_add2()%>"
							style="width: 250px; font-size: 15px;" autocomplete="off"></td>
					</tr>
				</thead>
			</table>
			<input id="sendBtn" type="submit" class="btn btn-primary" value="회원정보수정">
			</form>
		</div>
	</div>
</body>
</html>
<script>
		const url = new URL(window.location.href);

		// URLSearchParams 객체
		const urlParams = url.searchParams;

		// URLSearchParams.get()
		if(urlParams.get('msg')=='성공'){
			alert("회원정보가 변경되었습니다.");
		}else if(urlParams.get('msg')=='실패'){
			alert("잘못된 회원정보를 입력하였습니다.");
		};
</script>
<jsp:include page="../../common/footer.jsp" />