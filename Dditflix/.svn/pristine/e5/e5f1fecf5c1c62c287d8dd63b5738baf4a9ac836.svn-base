package kr.or.ddit.user.join.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.join.service.IUserJoinService;
import kr.or.ddit.user.join.service.UserJoinServiceImple;
import kr.or.ddit.user.login.vo.LoginVO;

@WebServlet("/user/join/idCheck.do")
public class UserIdCheckServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userId = req.getParameter("mId");
		IUserJoinService service = UserJoinServiceImple.getInstance();
		
		String result = service.userIdCheck(userId);
		
		req.setAttribute("userId", result);
		req.getRequestDispatcher("/WEB-INF/views/user/join/idCheck.jsp").forward(req, resp);
		
	}
	
	
}
