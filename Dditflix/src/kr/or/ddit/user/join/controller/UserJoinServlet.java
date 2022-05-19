package kr.or.ddit.user.join.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.user.join.service.IUserJoinService;
import kr.or.ddit.user.join.service.UserJoinServiceImple;
import kr.or.ddit.user.join.vo.UserVO;


@WebServlet("/user/join/join.do")
public class UserJoinServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/join/join.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserVO user = new UserVO();
		String msg = "";
		
		try {
			BeanUtils.populate(user, req.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IUserJoinService service = UserJoinServiceImple.getInstance();
		int result = service.userJoin(user);
		
		if(result > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("/WEB-INF/views/user/join/joinCheck.jsp").forward(req, resp);
	}
	
	
}
