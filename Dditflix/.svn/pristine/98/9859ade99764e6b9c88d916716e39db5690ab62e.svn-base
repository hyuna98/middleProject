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
import kr.or.ddit.user.myPage.dao.UserMyMemberShipDaoImpl;
import kr.or.ddit.user.myPage.service.IUserMyMemberShipService;
import kr.or.ddit.user.myPage.service.UserMyMemberShipServiceImpl;
import kr.or.ddit.user.myPage.vo.MemberShipVO;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

@WebServlet("/user/myPage/myMemberShip.do")
public class UserMyMemberShipServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		// 파라미터 정보 가져오기
		LoginVO usersid = (LoginVO) session.getAttribute("loginChk");
		String usersId = usersid.getUsers_id();

		// 서비스 객체 가져오기
		IUserMyMemberShipService service = UserMyMemberShipServiceImpl.getInstance();

		MemberShipVO mv = service.getUserMemberShip(usersId);

		request.setAttribute("mv", mv);

		List<MemberShipVO> msList = service.getMemberShipList();

		request.setAttribute("msList", msList);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/myPage/myMemberShip.jsp");
		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
