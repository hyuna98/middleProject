package kr.or.ddit.admin.board.controller;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

import kr.or.ddit.user.board.service.BoardServiceImpl;
import kr.or.ddit.user.board.service.IBoardService;
import kr.or.ddit.user.board.vo.BoardVO;

/**
 * Servlet implementation class ReviewDeleteServlet
 */
@WebServlet("/admin/board/delete.do")
public class ReviewDeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 파라미터 정보 가져오기 - delete 할 때 매개변수 값?
//		String userId = request.getParameter("userId");
		String rvId = request.getParameter("rvId");
		System.out.println(rvId);
	
		
		// 2. 서비스 객체 가져오기
		IBoardService boardService = BoardServiceImpl.getInstance();
		
//		BoardVO bv = new BoardVO();
//		bv.setUserId(userId);
//		bv.setContTitle(contTitle);
//		
//		BoardVO rvDelete = boardService.getDetail(bv);
		
		int cnt = boardService.deleteBoard(rvId);
		
		String msg=" ";
		if(cnt > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		// 3. 삭제 후 목록 조회 화면 = board.do로 돌아가기
		String redirectUrl = request.getContextPath() +  "/admin/board/board.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}