package kr.or.ddit.user.myPage.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.login.vo.LoginVO;
import kr.or.ddit.user.myPage.service.IUserWishListService;
import kr.or.ddit.user.myPage.service.UserWishListServiceImpl;
import kr.or.ddit.user.myPage.vo.wishListVO;

@WebServlet("/user/myPage/wishList.do")
public class UserWishListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession session = request.getSession();

		  // 1. 파라미터정보 가져오기
	      LoginVO usersid = (LoginVO) session.getAttribute("loginChk");
		
		  IUserWishListService Service = UserWishListServiceImpl.getInstance();
	      
	      List<wishListVO> wishList = Service.getUserWishList(usersid.getUsers_id());
	      
	      request.setAttribute("wishList", wishList);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/myPage/wishList.jsp");
		dispatcher.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		// 1. 파라미터정보 가져오기
		LoginVO usersVo = (LoginVO) session.getAttribute("loginChk");
		String usersId = usersVo.getUsers_id();
		
		String cont_title = request.getParameter("cont_title");
		
		IUserWishListService service = UserWishListServiceImpl.getInstance();
		
		// vo값 넣기
		wishListVO wv = new wishListVO();
		wv.setUsers_id(usersId);
		wv.setCont_title(cont_title);
		
		int cnt = service.deleteWishList(wv);
		
		String msg = "";
		if(cnt >0) {
			msg="성공";
		}else {
			msg="실패";
		}
		
		String redirectUrl = request.getContextPath() + "/user/myPage/wishList.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);   // 목록 조회 화면으로 리다이렉트
		
	}

}
