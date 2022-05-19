package kr.or.ddit.user.viewHistory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.viewHistory.service.IViewHistoryService;
import kr.or.ddit.user.viewHistory.service.ViewHistoryServiceImpl;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;


@WebServlet("/user/home/insertHistory.do")
public class UserViewHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UserViewHistoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String userId = request.getParameter("userId");
		String msg = "";
		
		IViewHistoryService service = ViewHistoryServiceImpl.getInstance();
		
		ViewHistoryVO history = new ViewHistoryVO();
		history.setCont_title(title);
		history.setUsers_id(userId);
		
		int result = service.insertView(history);
		
		if(result > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("/WEB-INF/views/user/myPage/viewHistory.jsp").forward(request, response);
		
	}

}
