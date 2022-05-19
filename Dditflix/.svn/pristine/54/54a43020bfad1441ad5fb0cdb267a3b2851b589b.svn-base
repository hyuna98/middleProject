package kr.or.ddit.admin.board.controller;

import java.io.IOException;
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
 * 리뷰의 detail을 볼 수 있음
 */
@WebServlet("/admin/board/detail.do")
public class ReviewDetailServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String writer = request.getParameter("writer");
		String contTitle = request.getParameter("contTitle");
		String rvId = request.getParameter("rvId");
		
		IBoardService boardService = BoardServiceImpl.getInstance();
		
		BoardVO bv = new BoardVO();
		bv.setUserId(writer);
		bv.setContTitle(contTitle);
		bv.setRvId(rvId);


		BoardVO review = boardService.getDetail(bv);
		
		request.setAttribute("review", review);
		
		request.getRequestDispatcher("/WEB-INF/views/admin/board/boardDetail.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
