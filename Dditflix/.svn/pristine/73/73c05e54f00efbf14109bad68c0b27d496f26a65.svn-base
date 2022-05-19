<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userPw = (String) request.getAttribute("userPw");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>비밀번호 찾기</title>
<style>

.sub{
	color: red;
	font-weight: bolder;
	font-size: 2.5em; 
	padding-bottom: 40px;
	text-align: center;
}

#result{
	color: white;
	font-weight: bolder;
	font-size: 1.5em; 
	margin-top: 200px;
	text-align: center;
}

#loginbtn{
	border: 0;
	outline: 0;
	padding: 0.25em 1.5em 0.25em 1.5em;
	border-radius: 0.45em;
	color: white;
	background-color: #7a7a7a;
}
</style>

</head>
<body>
<div class="sub">비밀번호 찾기</div>
<%
	if(userPw != null){
%>		
	<script>
		alert("입력하신 메일로 비밀번호를 전송했습니다");
		location.href = '<%=request.getContextPath()%>/user/login/login.do';
	</script>
<% 		
	} else{
%>		
		<script>
			alert("입력하신 정보가 일치하지 않습니다!");
			window.history.go(-1);
		</script>
<%	
	}
%>

</body>
</html>