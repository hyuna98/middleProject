package kr.or.ddit.user.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.login.service.ILoginService;
import kr.or.ddit.user.login.service.LoginServiceImpl;
import kr.or.ddit.user.login.vo.LoginVO;


@WebServlet("/user/login/findId.do")
public class UserFindIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserFindIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/user/login/findId.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName").trim();
		String userHp = request.getParameter("userHp").trim();
		
		LoginVO vo = new LoginVO();
		ILoginService service = LoginServiceImpl.getInstance();
		vo.setUsers_name(userName);
		vo.setUsers_hp(userHp);
		
		String userId = service.findId(vo);
		
		 request.setAttribute("userId", userId);
		 request.getRequestDispatcher("/WEB-INF/views/user/login/findIdCheck.jsp").forward(request, response);
		
		
		
	}


}
