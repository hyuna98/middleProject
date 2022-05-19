package kr.or.ddit.admin.notice.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.notice.service.INoticeService;
import kr.or.ddit.user.notice.service.NoticeServiceImpl;
import kr.or.ddit.user.notice.vo.NoticeVO;

/**
 * Servlet implementation class NoticeWriteServlet
 */
@WebServlet("/admin/notice/noinsert.do")
public class NoticeInsertServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<NoticeVO> noticeList = (List<NoticeVO>)request.getAttribute("noticeList");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/admin/notice/noticeWrite.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 1. 요청 파라미터 가져오기
		String userId = request.getParameter("writer");
		String notitle = request.getParameter("notitle");
		String nocontent = request.getParameter("nocontent");
		
		// 2. service 객체 생성
		INoticeService noticeService = NoticeServiceImpl.getInstance();
		
		// 3. 게시글 등록 insert (vo 객체에 set)
		NoticeVO nv = new NoticeVO();
		nv.setNoticeTitle(notitle);
		nv.setNoticeContent(nocontent);
		nv.setManagerId(userId);
		
		int cnt = noticeService.insertNotice(nv);
		
		String msg = " ";
		if(cnt > 0) {
			msg = "성공";
		} else {
			msg = "실패";
		}
		
		// 4. 목록 조회 화면 (공지사항)
		String redirectUrl = request.getContextPath() + "/admin/notice/notice.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);
	}

}
