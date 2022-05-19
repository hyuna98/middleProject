package kr.or.ddit.user.notice.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.notice.service.INoticeService;
import kr.or.ddit.user.notice.service.NoticeServiceImpl;
import kr.or.ddit.user.notice.vo.NoticeVO;

/**
 * 공지사항 수정
 */
@WebServlet("/user/notice/noupdate.do")
public class NoticeUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String userId = request.getParameter("userId");
		String noticeId = request.getParameter("noticeId");
		
		INoticeService noticeService = NoticeServiceImpl.getInstance();
		
		
//		nv.setManagerId(userId);
	
		NoticeVO nv = noticeService.getNotice(noticeId);
		request.setAttribute("nv", nv);
		
		request.getRequestDispatcher("/WEB-INF/views/user/board/noticeUpdate.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String noticeDate = request.getParameter("noticeDate");
		String noticeTitle = request.getParameter("noticeTitle");
		String noticeContent = request.getParameter("noticeContent");
		String userId = request.getParameter("userId");
		String noticeId = request.getParameter("noticeId");
		
		INoticeService noticeService = NoticeServiceImpl.getInstance();
		
		NoticeVO nv = new NoticeVO();
		nv.setManagerId(userId);
		nv.setNoticeTitle(noticeTitle);
		nv.setNoticeContent(noticeContent);
		nv.setNoticeId(noticeId);
		
		int cnt = noticeService.updateNotice(nv);
		
		String msg = "";
		
		if(cnt > 0) {
			msg="성공";
		} else {
			msg="실패";
		}
		
		request.setAttribute("nv", nv);
		String redirectUrl = request.getContextPath() + "/user/notice/notice.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);
	}

}
