package kr.or.ddit.admin.notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.notice.service.INoticeService;
import kr.or.ddit.user.notice.service.NoticeServiceImpl;
import kr.or.ddit.user.notice.vo.NoticeVO;

/**
 * Servlet implementation class NoticeDetailServlet
 */
@WebServlet("/admin/notice/nodetail.do")
public class NoticeDetailServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String noticeId = request.getParameter("noticeId");
		
		
		INoticeService noticeService = NoticeServiceImpl.getInstance();
		
		NoticeVO nv = noticeService.getNotice(noticeId);
		request.setAttribute("nv", nv);
		
		request.getRequestDispatcher("/WEB-INF/views/admin/notice/noticeDetail.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
