package kr.or.ddit.user.qna.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.qna.service.IQnaService;
import kr.or.ddit.user.qna.service.QnaServiceImpl;

/**
 * Servlet implementation class QnaDeleteServlet
 */
@WebServlet("/user/qna/qnadelete.do")
public class QnaDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qCode = request.getParameter("qCode");
		
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		int cnt = qnaService.deleteQna(qCode);
		
		String msg = "";
		
		if(cnt > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		String redirectUrl = request.getContextPath() + "/user/qna/qna.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
