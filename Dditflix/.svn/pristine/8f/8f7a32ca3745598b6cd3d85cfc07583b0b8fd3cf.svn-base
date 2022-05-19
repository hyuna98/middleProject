<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@page import="kr.or.ddit.user.notice.vo.NoticeVO"%>
<%@page import="kr.or.ddit.user.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="../../common/header.jsp" />
 <%
 		NoticeVO nv = (NoticeVO) request.getAttribute("nv");
 	String msg = request.getParameter("msg") == null ? "" : request.getParameter("msg");
 	LoginVO user = null;
	if(session.getAttribute("loginChk") != null){
		user = (LoginVO) session.getAttribute("loginChk");
	}
 %>

<title>리뷰작성</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">

<style>
label {
margin-bottom : 10px;
margin-top : 10px;
font-size: 15px;
color: #E65F5F;
font-weight: bold;
}
#send {
	margin-top: 50px;
}
.btn-default {
      background: #000;
      color: #fff;
      float: right;
      margin: 10px;
   }
.btn-default:hover {
      background: #fff;
      color: #000;
   }
span {
	display: flex;
	margin-bottom: 10px;
	line-height: 20px;
}
#list{
	float: left;
}

</style>

<body>
<div class="bgBox">
	<div class="concord-img-gradient"></div>
    <div class="main">
<div class="titleWrap mb-5">
    <h2 class="pageTitle pb-3">Notice</h2>
 </div>  
              
<div class="container">
  <form action="nodetail.do" method="post">
  
  <div class="form-group">
    <label for="reviewDate">Title</label>
    <span id="reviewDate" name="noticeTitle"><%=nv.getNoticeTitle() %></span>
  </div>

<span>-------------------------------------------------------------------</span>

    <div class="form-group">
      <label for="title">Comment</label>
       <span id="reviewContitle" name="noticeComment"><%=nv.getNoticeContent() %></span>
    </div>
    
    <span>-------------------------------------------------------------------</span>
    
    <div class="form-group">
   <label for="content">Date</label>
	<span id="reviewWriter" name="noticeDate"><%=nv.getNoticeRgsDate() %></span>
 </div>


<%
if(request.getRequestURL().indexOf("/admin/") > -1 ){
%>

    <input type="button" class="btn btn-primary" value="수정" id="modify" onclick="isIdCheck();">
    <input type="button" class="btn btn-danger" value="삭제" id="delete" onclick="noticeDelete();">

<% 		
	}
%>
<!--         등록버튼	 -->
<!--     <input type="button" class="btn btn-primary btn-sm" value = "목록으로" id="list" onclick="list();"> -->
  </form>
	</div>
  </div>
</div>

<script>

function isIdCheck(){
	<% 
	if(request.getRequestURL().indexOf("/admin/") > -1 ){
	%>
	
		location.href="/Dditflix/user/notice/noupdate.do?userId=<%=user.getUsers_id()%>&noticeId=<%=nv.getNoticeId() %>";
	
	<%
		}else {
	%>
	
		alert("공지사항은 관리자만 수정 가능합니다.");
	
	<%
		}
	%>
}


function noticeDelete(){
	<% 
	if(request.getRequestURL().indexOf("/admin/") > -1 ){
	%>
	
		location.href="/Dditflix/user/notice/nodelete.do?<%=user.getUsers_id() %>&noticeId=<%=nv.getNoticeId() %>";
	
	<%
		}else {
	%>
	
		alert("공지사항은 관리자만 삭제 가능합니다.");
	
	<%
		}
	%>
}


function list() {
	location.href = "/Dditflix/user/notice/notice.do";
}
</script>
</body>
 
 <jsp:include page="../../common/footer.jsp" />

