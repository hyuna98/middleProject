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

<%
	if(msg.equals("성공")){
%>
		<script>
			alert("컨텐츠가 등록되었습니다!");
			location.href = "<%=request.getContextPath()%>/admin/content/insertContent.do";
		</script>
<% 		
	} else{
%>		
		<script>
			alert("컨텐츠 등록 실패!");
			location.href = "<%=request.getContextPath()%>/admin/content/insertContent.do";
		</script>
<% 	
	}
%>

</body>
</html>