package kr.or.ddit.user.myPage.controller;
 
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import kr.or.ddit.user.login.vo.LoginVO;
import kr.or.ddit.user.myPage.service.IUserMyPageService;
import kr.or.ddit.user.myPage.service.UserMyPageServiceImpl;
 
@WebServlet("/user/myPage/main.do")
public class UserMyPageServlet extends HttpServlet  {
 
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		// 1. 파라미터정보 가져오기
		LoginVO usersid = (LoginVO) session.getAttribute("loginChk");
		
		// 2. 서비스 객체 가져오기
		IUserMyPageService myPageService = UserMyPageServiceImpl.getInstance();
		
		// 3. 회원 정보 조회
		LoginVO lv = myPageService.getUser(usersid.getUsers_id());
	
		
		request.setAttribute("lv", lv);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/myPage/main.jsp");
		dispatcher.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		// 1. 파라미터정보 가져오기
		LoginVO usersVo = (LoginVO) session.getAttribute("loginChk");
		String usersId = usersVo.getUsers_id();
		// 요청 파라미터 가져오기
		String userspw = request.getParameter("userspw");
		String usershp = request.getParameter("usershp");
		String userszip = request.getParameter("userzip");
		String usersadd1 = request.getParameter("usersadd1");
		String usersadd2 = request.getParameter("usersadd2");
		
		// servcie 객체 생성
		IUserMyPageService servcie = UserMyPageServiceImpl.getInstance();
		
		//vo에 값 입력하기
		LoginVO lv = new LoginVO();
		lv.setUsers_pw(userspw);
		lv.setUsers_hp(usershp);
		lv.setUsers_zip(userszip);
		lv.setUsers_add1(usersadd1);
		lv.setUsers_add2(usersadd2);
		lv.setUsers_id(usersId);
		
		int cnt = servcie.updateUser(lv);
		
		String msg = "";
		if(cnt >0) {
			msg="성공";
		}else {
			msg="실패";
		}
		
		String redirectUrl = request.getContextPath() + "/user/myPage/main.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);   // 목록 조회 화면으로 리다이렉트
		
		
	}
 
}
