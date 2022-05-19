package kr.or.ddit.user.board.controller;

import java.io.IOException;
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

/**
 * 게시판 board
 */
@WebServlet("/user/board/board.do")
public class ReviewServlet extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IBoardService boardService = BoardServiceImpl.getInstance();
		
		List<BoardVO> boardList = boardService.getAllBoardList();
		request.setAttribute("boardList", boardList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/user/board/board.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
