package kr.or.ddit.admin.qna.controller;

import java.io.IOException;
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
 * QNA(자주묻는질문)
 */
@WebServlet("/admin/qna/qna.do")
public class QnaServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String qCode = request.getParameter("qCode");
		
	
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		List<QnaVO> qnaList = qnaService.getAllQnaList();
		request.setAttribute("qnaList", qnaList);
		
	
		
		QnaVO qv = qnaService.getQnaDetail(qCode);
		request.setAttribute("qv", qv);
		
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/admin/qna/qna.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
