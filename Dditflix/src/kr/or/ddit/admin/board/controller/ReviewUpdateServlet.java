package kr.or.ddit.admin.board.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.board.service.BoardServiceImpl;
import kr.or.ddit.user.board.service.IBoardService;
import kr.or.ddit.user.board.vo.BoardVO;

/**
 * Servlet implementation class ReviewUpdateServlet
 */
@WebServlet("/admin/board/update.do")
public class ReviewUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String writer = request.getParameter("userId");
		String contTitle = request.getParameter("contTitle");
//		String rvId = request.getParameter("rvId");
		
		IBoardService boardService = BoardServiceImpl.getInstance();
		
		BoardVO bv = new BoardVO();
		bv.setUserId(writer);
		bv.setContTitle(contTitle);
//		bv.setRvId(rvId);
		
		BoardVO reviewVO = boardService.getDetail(bv);
		request.setAttribute("reviewVO", reviewVO);
		
		request.getRequestDispatcher("/WEB-INF/views/admin/board/boardUpdate.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");	// 사용자 아이디 = 글쓴이
		String rvTitle = request.getParameter("rvTitle");	// 리뷰 제목
		String contTitle = request.getParameter("contTitle");	// 영화 제목
		String content = request.getParameter("content"); 	// 리뷰 내용
		
		IBoardService boardService = BoardServiceImpl.getInstance();
		
		BoardVO bv = new BoardVO();
		bv.setUserId(userId);  //사용자 아이디
		bv.setContTitle(contTitle);	// 영화 제목
		bv.setRvTitle(rvTitle);	// 리뷰 제목
		bv.setRvContent(content);	// 리뷰 내용
		
		int cnt = boardService.updateBoard(bv);
		
		String msg = "";
		
		if(cnt > 0) {
			msg = "성공";
		} else {
			msg = "실패";
		}
		
		request.setAttribute("bv", bv);
		String redirectUrl = request.getContextPath() + "/admin/board/board.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);   // 목록 조회 화면으로 리다이렉트
		
	}

}
