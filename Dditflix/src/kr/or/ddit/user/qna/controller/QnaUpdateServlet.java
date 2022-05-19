package kr.or.ddit.user.qna.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.board.vo.BoardVO;
import kr.or.ddit.user.qna.service.IQnaService;
import kr.or.ddit.user.qna.service.QnaServiceImpl;
import kr.or.ddit.user.qna.vo.QnaVO;

/**
 * qna 수정
 */
@WebServlet("/user/qna/qnaupdate.do")
public class QnaUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String qCode = request.getParameter("qCode");
		
		System.out.println("userId");
		System.out.println("qCode");
	
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		QnaVO qv = new QnaVO();
//		qv.setManagerId(userId);
		qv.setqCode(qCode);
		
		QnaVO qnaVO = qnaService.getQnaUpdateDetail(qv);
		
		request.setAttribute("qnaVO", qnaVO);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/board/qnaUpdate.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qQuestion = request.getParameter("qQuestion");
		String qAnswer = request.getParameter("qAnswer");
		String qCode = request.getParameter("qCode");
		
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		QnaVO qv = new QnaVO();
		qv.setqQuestion(qQuestion);
		qv.setqAnswer(qAnswer);
		qv.setqCode(qCode);
		
		int cnt = qnaService.updateQna(qv);
		
		String msg = "";
		if(cnt > 0) {
			msg="성공";
		} else {
			msg="실패";
		}
		
		request.setAttribute("qv", qv);
		String redirectUrl = request.getContextPath() + "/user/qna/qna.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);
				
	}

}
