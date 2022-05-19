<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = (String) request.getAttribute("userId");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.svg">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/user/login2.css">  
<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.6.0.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>

<title>아이디 찾기</title>
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
<div class="sub">아이디 찾기</div>
<%
	if(userId != null){
%>		
	<header id="header">
        <nav class="navbar navbar-expand-md navbar-dark">
            <a class="navbar-brand" href="<%=request.getContextPath()%>/user/login/login.do"><img class="logo" src="../../resources/images/Netflix_logo.svg" alt=""></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>
    </header>
    
    <div class="bgBox">
        <div class="concord-img-gradient"></div>
        <section class="main">
            <div class="titleWrap mb-5">
            <div class="sub1">아이디 찾기</div>       		
					<table class="table" border="1">
						<thead class="thead">
							<tr>
								<td>
									회원님의 아이디는 <%=userId %> 입니다!
								</td>
							</tr>
							<tr>
								<td id="trp1" colspan="2"><input type="button" value="로그인" id="loginbtn" onclick="goLogin();"></td>
							</tr>
					</table>                   	    	
            </div>
        </section>
    </div>  
    
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

<script>
function goLogin(){
	location.href = "<%=request.getContextPath()%>/user/login/login.do";
}
</script>

<jsp:include page="../../common/footer.jsp" />
