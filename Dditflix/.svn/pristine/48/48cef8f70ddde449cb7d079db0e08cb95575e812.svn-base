<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 //ID 중복체크
 
  String userId = (String) request.getAttribute("userId");
  
  if(userId == null){
%>	  
	  {
	  	"cd"  : "ok",
	  	"str" : "사용 가능한 ID 입니다"
	  }
	  
<%  
  }else {//조회하는 id 없음 
 %>
	  {
	  	"cd"  : "no",
	  	"str" : "이미 존재하는 ID 입니다" 
	  } 
<%  
}//if-else end 
%>