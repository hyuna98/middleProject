package kr.or.ddit.user.board.service;

import java.util.List;

import kr.or.ddit.user.board.dao.BoardDaoImpl;
import kr.or.ddit.user.board.dao.IBoardDao;
import kr.or.ddit.user.board.vo.BoardVO;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

public class BoardServiceImpl implements IBoardService{
	
	private static IBoardService boardService;
	private IBoardDao dao;

	private BoardServiceImpl() {
		dao = BoardDaoImpl.getInstance();
	}
	
	public static IBoardService getInstance() {
		if(boardService == null) {
			boardService = new BoardServiceImpl();
		}
		
		return boardService;
	}
	
	@Override
	public int insertBoard(BoardVO bv) {
		return dao.insertBoard(bv);
	}

	@Override
	public int updateBoard(BoardVO bv) {
		return dao.updateBoard(bv);
	}

	@Override
	public int deleteBoard(String rvId) {
		return dao.deleteBoard(rvId);
	}

	@Override
	public List<BoardVO> getAllBoardList() {
		return dao.getAllBoardList();
	}

	@Override
	public BoardVO getBoard(String userId) {
		return dao.getBoard(userId);
	}

	@Override
	public List<ViewHistoryVO> getContTitle(String writer) {
		return dao.getContTitle(writer);
	}

	@Override
	public BoardVO getDetail(BoardVO bv) {
		return dao.getDetail(bv);
	}

}
