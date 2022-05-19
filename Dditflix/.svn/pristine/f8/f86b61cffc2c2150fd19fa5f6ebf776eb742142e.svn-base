<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
		<%
			if(msg.equals("성공")){
		%> 
				location.href = "<%=request.getContextPath()%>/user/home/main.do";
		<%
			}else{
		%> 
				alert("아이디 또는 비밀번호가 일치하지 않습니다!");
				location.href = "<%=request.getContextPath()%>/user/login/login.do";
		<%
			}
		%> 
	
	</script>
</body>
</html>