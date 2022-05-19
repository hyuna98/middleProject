package kr.or.ddit.admin.board.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.board.service.BoardServiceImpl;
import kr.or.ddit.user.board.service.IBoardService;
import kr.or.ddit.user.board.vo.BoardVO;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

/**
 * Servlet implementation class InsertReviewServlet
 */
@WebServlet("/admin/board/insert.do")
public class ReviewInsertServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<BoardVO> reviewList = (List<BoardVO>) request.getAttribute("reviewList");
		String writer = request.getParameter("userId");
		
		IBoardService boardService = BoardServiceImpl.getInstance();
		
		List<ViewHistoryVO> htContTitle = boardService.getContTitle(writer);
		request.setAttribute("htContTitle", htContTitle);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/admin/board/review.jsp");
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// 1. 요청 파라미터 가져오기
		String userId = request.getParameter("writer");
		String rvmovie = request.getParameter("rvmovie");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		// 2. servie 객체를 생성
		IBoardService boardService = BoardServiceImpl.getInstance();
		
		// 3. 게시글 등록 insert (vo객체에 set)
		BoardVO bv = new BoardVO();
		bv.setUserId(userId);
		bv.setContTitle(rvmovie);	//영화제목
		bv.setRvTitle(title);	// 글 제목
		bv.setRvContent(content);	// 글 내용
		
		int cnt = boardService.insertBoard(bv);
		
		String msg = " ";
		if(cnt > 0) {
			msg="성공";
		} else {
			msg="실패";
		}
		
		// 4. 목록 조회 화면 (board)화면으로 이동
		String redirectUrl = request.getContextPath() + "/admin/board/board.do?msg=" + URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect(redirectUrl);   // 목록 조회 화면으로 리다이렉트
		
	}

}
