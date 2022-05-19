package kr.or.ddit.admin.content.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.admin.content.service.AdminContentServiceImpl;
import kr.or.ddit.admin.content.service.IAdminContentService;


@WebServlet("/admin/content/deleteContent.do")
public class AdminContentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IAdminContentService service;
    
    public AdminContentDeleteServlet() {
        service = AdminContentServiceImpl.getInstance();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String conTitle = request.getParameter("conTitle");
		int cnt = service.deleteContent(conTitle);
		cnt = service.deleteVideo(conTitle);
		cnt = service.deleteEpisode(conTitle);
		
		response.getWriter().print(cnt);
		
	}

}
