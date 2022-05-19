<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	response.setDateHeader("Expires",0);
	if(request.getProtocol().equals("HTTP/1.1")){
	    response.setHeader("Cache-Control","no-cache");	
	}
	session.invalidate();
	
%>

<script>
	alert("로그아웃되었습니다!");
	location.href = "<%=request.getContextPath()%>/user/login/login.do";
</script>
</body>
</html>