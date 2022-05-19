package kr.or.ddit.admin.content.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.content.service.ContentServiceImpl;
import kr.or.ddit.content.service.IContentService;
import kr.or.ddit.content.vo.ContentVO;


@WebServlet("/admin/content/contentList.do")
public class AdminContentListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IContentService service;
    
    public AdminContentListServlet() {
       service = ContentServiceImpl.getInstance();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ContentVO> contentList = service.contentList();
		
		request.setAttribute("contentList", contentList);
		request.getRequestDispatcher("/WEB-INF/views/admin/content/ContentList.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
