<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<style>
.inputName {
	text-align: center;
    padding: 8px 0px;
    color: gray;
    background: none;
    border-radius: 0.7ex;
    width: 250px;
    border: 1px solid rgba(225,225,225,0.3)
}

.inputHp {
	text-align: center;
    padding: 8px 0px;
    color: gray;
    background: none;
    border-radius: 0.7ex;
    width: 250px;
    border: 1px solid rgba(225,225,225,0.3)
}

</style>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>비밀번호 찾기</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.svg">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/user/login2.css">  
    <script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>

</head>

<body>
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
            <div class="sub1">비밀번호 찾기</div>
           		<form action="<%=request.getContextPath()%>/user/login/findPw.do" method="post">
					<table class="table" border="1">
						<thead class="thead">
							<tr>
								<td id="trp">
								<input type="text" placeholder="아이디" class="inputName" name="userId" autocomplete="off">
								</td>
							</tr>
							<tr>
								<td>
									<input type="text" placeholder="이메일" class="inputHp" name="userMail" autocomplete="off">
								</td>
							</tr>
							<tr>
								<td id="trp1" colspan="2"><input type="submit" value="찾기"></td>
							</tr>
					</table>                   	
              </form>
              	
            </div>
        </section>
    </div>  
<jsp:include page="../../common/footer.jsp" />