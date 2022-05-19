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
import kr.or.ddit.user.myPage.service.IUserViewRecordService;
import kr.or.ddit.user.myPage.service.UserViewRecordServiceImpl;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

@WebServlet("/user/myPage/viewRecord.do")
public class UserViewRecordServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession session = request.getSession();

		  // 1. 파라미터정보 가져오기
	      LoginVO usersid = (LoginVO) session.getAttribute("loginChk");
		
		  IUserViewRecordService Service = UserViewRecordServiceImpl.getInstance();
	      
	      List<ViewHistoryVO> viewList = Service.getAllUserViewRecordList(usersid.getUsers_id());
	      
	      request.setAttribute("viewList", viewList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/myPage/viewRecord.jsp");
		dispatcher.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		// 1. 파라미터정보 가져오기
		LoginVO usersVo = (LoginVO) session.getAttribute("loginChk");
		String usersId = usersVo.getUsers_id();
		
		String cont_title = request.getParameter("cont_title");
		
		IUserViewRecordService service = UserViewRecordServiceImpl.getInstance();
		
		// vo에 값 넣기
		ViewHistoryVO vv = new ViewHistoryVO();
		vv.setUsers_id(usersId);
		vv.setCont_title(cont_title);
		
		int cnt = service.deleteViewRecord(vv);
		
		String msg = "";
		if(cnt >0) {
			msg="성공";
		}else {
			msg="실패";
		}
		
		String redirectUrl = request.getContextPath() + "/user/myPage/viewRecord.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);   // 목록 조회 화면으로 리다이렉트
		
	}

}
