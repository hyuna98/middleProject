<%@page import="kr.or.ddit.admin.content.vo.AdminContentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
.sub1 {
    color: red;
    font-weight: bolder;
    font-size: 2.5em;
    padding-bottom: 40px;
}

input{
	text-align: center;
    padding: 8px 0px;
    /* border-radius: 5px; */
    color: gray;
    background: none;
    border-radius: 0.7ex;
    width: 250px;
    border: 1px solid rgba(225,225,225,0.3)
}

#btn{
	background-color: #7a7a7a;
	border : none;
	color: white;
}


label {
 	display: block;
 	width: 120px;
 	align: center;
}


</style>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dditflix</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.svg">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
	<link rel="stylesheet"	href="<%=request.getContextPath()%>/resources/css/user/myPage.css">
    <script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/login/validation.js"></script>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script> <!-- 주소api -->
 
 </head>
<body>
    
<jsp:include page="../../common/header.jsp" />
<%
	AdminContentVO content = (AdminContentVO) request.getAttribute("updateContent");
	
%>
    <div class="bgBox">
        <div class="concord-img-gradient"></div>
        <section class="main">
            <div class="titleWrap mb-5">
            <div class="pageTitle pb-3">컨텐츠 수정</div>
           		<form class="form-horizontal" action="updateContent.do" method="post" enctype="multipart/form-data">
					<table class="table" border="1">
						<thead class="thead">
							<tr>
								<td>
									<div class="form-group">
										<input type="hidden" name="contitle" value="<%=content.getCont_title() %>">
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<input type="hidden" name="genre" value="<%=content.getCont_genre() %>">
									</div>
								</td>
							</tr>	
							<tr>
								<td>
									<div class="form-group">
										<label for="cast">주연 변경</label>
										<input type="text" class=""  name="cast" autocomplete="off">
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="genre">감독 변경</label>
										<input type="text" class=""  name="director" autocomplete="off">
										
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="director">가격등급 변경</label>
										<input type="text" class=""  name="rating" autocomplete="off">
										
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="director">줄거리 변경</label>
										<input type="text" class=""  name="plot"  autocomplete="off">
										
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="conTitle">포스터 변경</label>
										<img src="<%=content.getCont_poster()%>">
										<input type="file" class=""  name="poster" autocomplete="off">
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<button type="submit" class="btn btn-primary btn-sm"> 수정</button>
								</td>
							</tr>					
					</table>                   	
              </form>
            </div>
        </section>
    </div>  


<jsp:include page="../../common/footer.jsp" />




