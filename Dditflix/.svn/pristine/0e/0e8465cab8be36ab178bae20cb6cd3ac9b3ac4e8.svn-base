
<%@page import="kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../../common/header.jsp" />
	<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/comm_sub.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/cart.css">    
    <div class="bgBox">
        <div class="concord-img-gradient"></div>
        <section class="main">
            <div class="titleWrap mb-5">
                <h2 class="pageTitle pb-3">장바구니</h2>
            </div>
            <div class="conWrap">
                <table id="cartList" class="table"></table>
	            <script> 
	            function getCartList(){	            	
			  		$.ajax({
			  			url: "./getCartList.do",
			  			success: function(result){
			  				$("#cartList").html(result);
			  			}, 
			              error : function(request, status, error) { alert("code:" + request.status + "\n" + "error:" + error); }
			  		});
	            }
	            getCartList();
			  	</script>
            </div>
        </section>
        <div id="modalArea"></div>
    </div>
    <jsp:include page="../../common/footer.jsp" />
