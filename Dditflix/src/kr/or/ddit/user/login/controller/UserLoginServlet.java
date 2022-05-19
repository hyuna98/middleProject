package kr.or.ddit.user.login.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.login.service.ILoginService;
import kr.or.ddit.user.login.service.LoginServiceImpl;
import kr.or.ddit.user.login.vo.LoginVO;

@WebServlet("/user/login/login.do")
public class UserLoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/login/login.jsp");
		dispatcher.forward(req, resp);		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(true);
		
		String userId = req.getParameter("userId").trim();
		String userPw = req.getParameter("userPw").trim();
		String msg = "";
		
		LoginVO login = new LoginVO();
		ILoginService service = LoginServiceImpl.getInstance();
		login.setUsers_id(userId);
		login.setUsers_pw(userPw);
		
		LoginVO user = service.loginCheck(login);
		
		if(user != null) {
			msg = "성공";
			req.setAttribute("msg", msg);
			session.setAttribute("loginChk", user);
		}else {
			msg = "실패";
			req.setAttribute("msg", msg);
		}
		
		req.getRequestDispatcher("/user/login/loginCheck.do").forward(req, resp);
	}
	
	
}
