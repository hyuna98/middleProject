package kr.or.ddit.user.downloadPayment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.login.vo.LoginVO;

@WebServlet("/user/cart/dwnldPmList.do")
public class UserDwnldPmListServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		LoginVO user = (LoginVO) session.getAttribute("loginChk");
		String usersId = user.getUsers_id();
		
		req.setAttribute("user", user);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/cart/dwnldPmList.jsp");
		dispatcher.forward(req, resp);
		
	}
}
