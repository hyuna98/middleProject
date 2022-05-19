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
import kr.or.ddit.util.SendMail;


@WebServlet("/user/login/findPw.do")
public class UserFindPwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserFindPwServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/user/login/findPw.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId").trim();
		String userMail = request.getParameter("userMail").trim();
		
		LoginVO vo = new LoginVO();
		ILoginService service = LoginServiceImpl.getInstance();
		vo.setUsers_id(userId);
		vo.setUsers_mail(userMail);
		
		String userPw = service.findPw(vo);
		
		if(userPw != null) {
			SendMail.SendPw(userPw, userMail);
		}
		
		 request.setAttribute("userPw", userPw);
		 request.getRequestDispatcher("/WEB-INF/views/user/login/findPwCheck.jsp").forward(request, response);
		
	}


}
