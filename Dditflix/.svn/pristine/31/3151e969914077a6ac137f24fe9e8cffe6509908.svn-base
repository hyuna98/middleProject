<%@page import="kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

  <colgroup>
      <col>
      <col width="20%">
      <col>
      <col>
      <col>
  </colgroup>
  <thead class="thead">
      <tr>
          <th colspan="3" scope="col">컨텐츠</th>
          <th scope="col">금액</th>
          <th scope="col">삭제</th>
      </tr>
  </thead>
  <tbody class="tbody">
  <%
  	List<UserDownloadPaymentVO> cartList = (List<UserDownloadPaymentVO>) session.getAttribute("cartList");
  	String No = (String) session.getAttribute("cartNo");
    int count = 0;
    if(cartList == null || cartList.size()==0){//장바구니 상품이 없을 때
  %>
          
      <tr>
          <td colspan="100%">장바구니 상품이 없습니다.</td>
      </tr>
     </tbody> 
  <%
  } else {
      for(int i=0; i<cartList.size(); i++){
          count += cartList.get(i).getDwnldPymPrice();
  %>
      
      <tr>
          <th scope="row"><%=i+1%></th>
          <td><img class="titleImg" src="<%=cartList.get(i).getPoster()%>" alt=""></td>
          <td class="text-align-left">
              <span><%=cartList.get(i).getContTitle()%></span>
              <%if(cartList.get(i).getVideoSerno() != 0){%>
              	<span>시즌<%=cartList.get(i).getVideoSerno()%></span>
              <%}%>
              <%if(cartList.get(i).getEpNum() != 0){%>
              	<span><%=cartList.get(i).getEpNum()%>화</span>
              <%}%>
          </td>
          <td><%=cartList.get(i).getDwnldPymPrice()%>원</td>
          <td><button class="btn btn-primary btn-del" type="button" data-idx="<%=i%>">삭제</button></td>
      </tr>
  <%
      }
  %>
  </tbody>
  <tfoot class="tfoot">
      <tr>
          <td class="text-align-right" colspan="100%">
			<span>총 금액: <%=count %>원</span>
          </td>
      </tr>
      <tr>
          <td class="text-align-right" colspan="100%">
			<button id="showDwnldPm" class="btn btn-danger" type="button">결제하기</button>
          </td>
      </tr>
  </tfoot>
  <%
  }
  %>
  <script>          
	$(".btn-del").click(function(){
   		$.ajax({
   			type: "post",
   			url: "userCartDelete.do",
   			data: {"idx": $(this).data("idx")},
   			success: function(result){
   				if(result!=-1){ 
   					alert("삭제되었습니다.") 
   					$.ajax({
   			  			url: "./getCartList.do",
   			  			success: function(result){
   			  				$("#cartList").html(result);
   			  			}, 
   			              error : function(request, status, error) { alert("code:" + request.status + "\n" + "error:" + error); }
   			  		});
   				}
   			}, 
            error : function(request, status, error) { alert("code:" + request.status + "\n" + "error:" + error); }
   		});
   	});
   	$("#showDwnldPm").click(function(){
   		$.ajax({
   			type: "post",
   			url: "dwnldPmList.do",
   			success: function(result){
				$("#modalArea").html(result);
				$('#cardListModal').modal('show',{backdrop: false});
   			}, 
     	    error : function(request, status, error) { alert("code:" + request.status + "\n" + "error:" + error); }
   		});
   	});
   	
</script>
