package kr.or.ddit.admin.qna.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.qna.service.IQnaService;
import kr.or.ddit.user.qna.service.QnaServiceImpl;
import kr.or.ddit.user.qna.vo.QnaVO;

/**
 * Servlet implementation class QnaInsertServlet
 */
@WebServlet("/admin/qna/qnainsert.do")
public class QnaInsertServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<QnaVO> qnaList = (List<QnaVO>) request.getAttribute("qnaList");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/admin/qna/qnaWrite.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("writer");
		String question = request.getParameter("question");
		String answer = request.getParameter("answer");
		
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		QnaVO qv = new QnaVO();
		qv.setManagerId(userId);
		qv.setqQuestion(question);
		qv.setqAnswer(answer);
		
		int cnt = qnaService.insertQna(qv);
		
		String msg=" ";
		if(cnt > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		String redirectUrl = request.getContextPath() + "/admin/qna/qna.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);
	}

}
