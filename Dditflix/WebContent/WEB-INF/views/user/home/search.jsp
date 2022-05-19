<%@page import="kr.or.ddit.content.vo.ContentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	ContentVO content = (ContentVO) request.getAttribute("search");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(content != null){
%>		
		<div class="modal fade" id="searchModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	     <div class="modal-content">
	   	  <div class="modal-header">
	    			<h2 class="modal-title"><%=content.getCont_title()%></h2>
	    			<button type="button" class="btn cancel" id="my">찜하기</button>   	         			           			         
	    	</div>
	     <div class="modal-body">
	    		<div class="form-group">
	    			<div class="mb-6">
	    				<img alt="" src="<%=content.getCont_poster() %>" id="img">
	    			</div>   
	    			<div class="mb-10">
	    			  	<span>감독    : </span><%=content.getCont_director() %><br><br>
	    				<span>출연진 : </span><%=content.getCont_cast() %><br><br>
	    				<span>줄거리 : <%=content.getEp_plot() %></span>
	    			</div>
	    		</div>
	    		<div class="form-group">
	    			<label class="control-label col-sm-2" id="mkv">예고편</label><br>
	    				<iframe id="frame" width="400" height="300"  src="<%=content.getVideo_file_save_path()%>">
	    				</iframe>
	    		</div>
	    	</div>
	    	<div class="modal-footer d-flex border-0 mb-2"> 
	    		<button type="button" class="btn cancel" id="my">다운로드</button> 
	    		<button type="button" class="btn cancel" data-bs-dismiss="modal" id="my">닫기</button> 
	    	</div>
	    	</div>
	    	</div>
<% 		
	} else{
%>
		<script>
			alert("검색한 항목이 존재하지 않습니다!");
		</script>
<% 
	}
%>
  
</body>
</html>