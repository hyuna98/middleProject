package kr.or.ddit.content.controller;

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


@WebServlet("/user/home/tvmain.do")
public class ContentTVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ContentTVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IContentService service = ContentServiceImpl.getInstance();
		
		List<ContentVO> dramaList = service.tvList("드라마");
		List<ContentVO> varietyList = service.tvList("예능");
		
		request.setAttribute("dramaList", dramaList);
		request.setAttribute("varietyList", varietyList);
		
		request.getRequestDispatcher("/WEB-INF/views/user/home/mainTv.jsp").forward(request, response);
		
	}

	
	

}
