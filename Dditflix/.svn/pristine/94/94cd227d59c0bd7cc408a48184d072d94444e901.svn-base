package kr.or.ddit.content.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.content.service.ContentServiceImpl;
import kr.or.ddit.content.service.IContentService;
import kr.or.ddit.content.vo.ContentVO;


@WebServlet("/user/home/search.do")
public class ContentSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ContentSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("search");
		IContentService service = ContentServiceImpl.getInstance();
		
		ContentVO searchList = service.searchContent(search);
	
		request.setAttribute("search", searchList);
		request.getRequestDispatcher("/WEB-INF/views/user/home/search.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
