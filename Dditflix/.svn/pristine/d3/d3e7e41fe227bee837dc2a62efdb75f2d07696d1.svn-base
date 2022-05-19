<%@page import="kr.or.ddit.user.login.vo.LoginVO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="kr.or.ddit.content.vo.ContentVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../../common/header.jsp" />

<%
	List<ContentVO> dramaList = (List<ContentVO>) request.getAttribute("dramaList");
	List<ContentVO> varietyList = (List<ContentVO>) request.getAttribute("varietyList");
	
	
	
	LoginVO user = null;
	if(session.getAttribute("loginChk") != null){
		user = (LoginVO) session.getAttribute("loginChk");
	}
%>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/slider.css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/user/main.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css">
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/content/contentInfo.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/content/searchContent.js"></script>
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

    
    <div id="visualFrame">
        <div class="contents">
            <img class="image-layer" src="../../resources/images/mainPoster.jfif" alt="mainPoster">
            <div class="vignette-layer"></div>
            <div class="info">
                <div class="logo-and-text">
                    <div class="title-wrapper mb-sm-4">
                        <img alt="SpiderMan" class="title-logo" src="../../resources/images/main.png" title="SpiderMan">
                    </div>
                    <div class="info-wrapper pb-sm-4">
                        <div class="synopsis"> Male celebs play make-believe as high schoolers, welcoming star transfer students every week and engaging in battles of witty humor and slapstick. </div>
                    </div>
                    <div class="button-layer">
                        <a data-uia="play-button" role="link" aria-label="Play" class="playLink" href="/watch/81414458?trackId=254015180&amp;tctx=0%2C0%2C84f33d78-3678-4daf-a667-8b661b78830d-726360064%2Ce94e816b-bba8-4a68-87b2-dbd9fd97ae33_524920419X20XX1641301743595%2Ce94e816b-bba8-4a68-87b2-dbd9fd97ae33_ROOT%2C%2C%2C">
                            <button class="btn btn-light btn-xlg d-flex align-items-center hasLabel hasIcon" type="button">
                                <img src="../../resources/images/play.svg" alt="play">
                                <span>Play</span>
                            </button>
                        </a>
                        <!-- <button class="color-secondary hasLabel hasIcon" data-uia="billboard-more-info" type="button">
                            <img src="../../resources/images/info.svg" alt="info">
                            <span>More Info</span>
                        </button> -->
                    </div>
                </div>
            </div>
        </div>
        <div class="shadow"></div>
    </div>
       
   
    <div class="netflix-slider">
	    <h2 class="rowTitle">드라마</h2>
	      <div class="swiper-container swiper">
	       <div class="swiper-wrapper">
	    <%
	    	for(int i = 0; i < dramaList.size(); i++){
	    		ContentVO vo = dramaList.get(i);
	    		
	    %>
		    	<div class="swiper-slide">
		        	<img src="<%=vo.getCont_poster()%>" alt="드라마">
		        	<span class="item-load-icon button opacity-none"><i class="fa fa-play"
		        											onclick="contentInfo('<%=vo.getCont_title()%>',
		        														 '<%=vo.getCont_poster()%>',
		        														 '<%=vo.getCont_cast()%>',
		        														 '<%=user.getUsers_id()%>',
		        														 '<%=vo.getCont_director()%>',
		        														 '<%=vo.getEp_plot()%>',
		        														 '<%=vo.getVideo_file_save_path()%>',
		        														 '<%=vo.getPrice_rating_price()%>');"></i>
		        	</span>
		        </div>	        
	    <%		
	    	}
	    %>
	      </div>                                 
	      <div class="swiper-button-next"></div>
	      <div class="swiper-button-prev"></div>
	    </div>
	  </div>
	  
	  
    <div class="netflix-slider">
	    <h2 class="rowTitle">예능</h2>
	      <div class="swiper-container swiper">
	       <div class="swiper-wrapper">
	    <%
	    	for(int i = 0; i < varietyList.size(); i++){
	    		ContentVO vo = varietyList.get(i);
	    		
	    %>
		    	<div class="swiper-slide">
		        	<img src="<%=vo.getCont_poster()%>" alt="드라마">
		        	<span class="item-load-icon button opacity-none"><i class="fa fa-play"
		        											onclick="contentInfo('<%=vo.getCont_title()%>',
		        														 '<%=vo.getCont_poster()%>',
		        														 '<%=vo.getCont_cast()%>',
		        														 '<%=user.getUsers_id()%>',
		        														 '<%=vo.getCont_director()%>',
		        														 '<%=vo.getEp_plot()%>',
		        														 '<%=vo.getVideo_file_save_path()%>',
		        														 '<%=vo.getPrice_rating_price()%>');"></i>
		        	</span>
		        </div>	        
	    <%		
	    	}
	    %>
	      </div>                                 
	      <div class="swiper-button-next"></div>
	      <div class="swiper-button-prev"></div>
	    </div>
	  </div>
	  
	  
  
	  
    
	  
    
	  
	  
    
	  
	  <div id="modalArea">
	  </div>    
		  	  
     
     
	   <script>
	   $(document).on('click', "button[role='addCart']", function(){
			let title = $(this).data("title");
			let poster = $(this).data("poster");
			let videoSerno = $(this).data("video_serno");
			let epNum = $(this).data("ep_num");
			let price = $(this).data("price");
			
			$.ajax({
                type : "POST", 
                url : "../cart/userCartInsert.do", 
                data : {
                	"title": title,
                	"poster": poster,
                	"videoSerno": videoSerno,
                	"epNum": epNum,
                	"price": price
                }, 
                success : function(result) { 
                			if(result == -2) { alert('이미 결제한 컨텐츠 입니다.') }
                			else if (result == -1) { alert('이미 장바구니에 담긴 컨텐츠 입니다.') } 
                            else { alert(result + '이(가) 장바구니에 담겼습니다.'); getCartList(); } 
                        }, 
                error : function(request, status, error) { alert("code:" + request.status + "\n" + "error:" + error); }

            });

			
		});
        let mySwiper = new Swiper('.swiper-container', {
            // Optional parameters
		    slidesPerView: 6,
		    spaceBetween: 10,
		    slidesPerGroup: 2,
		    pagination: {
		       el: '.swiper-pagination',
		       clickable: true,
		    },
		    navigation: {
		       nextEl: '.swiper-button-next',
		       prevEl: '.swiper-button-prev',
		    },
            breakpoints: {
                // when window width is >= 640px
                640: {
                    slidesPerView: 5,
                    slidesPerGroup: 5,
                    freeMode: false
                }
            }
        });
    </script>
    
    <jsp:include page="../../common/footer.jsp" />
