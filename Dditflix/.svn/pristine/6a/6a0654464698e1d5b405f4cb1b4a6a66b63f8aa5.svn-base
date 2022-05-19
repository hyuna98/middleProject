<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@page import="kr.or.ddit.user.notice.vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%
  	List<NoticeVO> noticeList = (List<NoticeVO>)request.getAttribute("noticeList");
  String msg = request.getParameter("msg") == null ? "" : request.getParameter("msg");
  LoginVO user = null;
	if(session.getAttribute("loginChk") != null){
		user = (LoginVO) session.getAttribute("loginChk");
	}
  %>
 <title>공지사항</title>
 <jsp:include page="../../common/header.jsp" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/dt/dt-1.11.3/datatables.min.css"/> 
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/reset.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/common.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/sub.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/boardSelect.css">
<!--     script -->
<script src="http://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>


<body>
<div class = "bgBox">
  <div class="concord-img-gradient"></div>
      
    <div class="main">
            <div class="titleWrap mb-5">
                <h2 class="pageTitle pb-3">공지사항</h2>
            </div>
      <table class="table" id="myTable">
         <thead>
            <tr>
               <th>No</th>
               <th>Title</th>
               <th>Comments</th>
               <th>Name</th>
               <th>Date</th>
             </tr>
          </thead>
     <tbody>
     	<%
     		int noticeSize = noticeList.size();
     	if(noticeSize > 0) {
     		for(int i=0; i<noticeSize; i++) {
     	%>
     	
             <tr style="cursor:pointer; color:#blue;" onClick="location.href='/Dditflix/user/notice/nodetail.do?noticeId=<%=noticeList.get(i).getNoticeId()%>'"> 
<%--                <td><%=noticeList.get(i).getNoticeId() %></td> --%>
			   <td><%=i+1 %></td>
               <input type="hidden" value="<%=noticeList.get(i).getNoticeId() %>">
               <td><%=noticeList.get(i).getNoticeTitle() %></td>
               <td><%=noticeList.get(i).getNoticeContent() %></td>
               <td><%=noticeList.get(i).getManagerId() %></td>      
               <td><%=noticeList.get(i).getNoticeRgsDate() %></td>
             </tr>
     	
     	<% 		
     		}
     	} else {
     	%>
     	
     	<tr>
     		<td>공지사항이 없습니다!</td>
     	</tr>
     	
     	<% 	
     	}
     	%>   
     </tbody>
   </table>
   
   <%
   	if(msg.equals("성공")) {
   %>
   
   <script>
   		alert("정상적으로 처리되었습니다.");
   </script>
   
   <% 		
   	}
   %>
   
   <%
   if(request.getRequestURL().indexOf("/admin/") > -1 ){
   	%>
   	
<input type="button" class="btn btn-primary" value="등록" onclick="noticeWrite();">
   	
   	<% 		
   		}
   %>
</div>
</div>
<script>
        $(document).ready( function () {
            $('#myTable').DataTable({
                ordering: false,
                lengthChange: false
            });
        } );
        
       function noticeWrite(){
    	   
    	   <%
    	   		if(user.getUsers_id().equals("admin")){
    	   %>
    	   
    	   location.href = "/Dditflix/user/notice/noinsert.do?userId=<%=user.getUsers_id() %>";
    	   
    	   <%
    	   		}else {
    	   	%>
    	   		alert("공지사항은 관리자만 등록할 수 있습니다!");	
    	   	<%
    	   		}
    	   %>
    	   
       }
       
     
    </script>
</body>
 <jsp:include page="../../common/footer.jsp" />