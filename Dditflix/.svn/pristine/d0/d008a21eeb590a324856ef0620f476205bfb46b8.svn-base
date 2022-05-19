package kr.or.ddit.user.board.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.board.vo.BoardVO;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class BoardDaoImpl implements IBoardDao{
	
	private SqlMapClient smc;
	private static BoardDaoImpl dao;
	
	private BoardDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IBoardDao getInstance() {
		if(dao == null) {
			dao = new BoardDaoImpl();
		}
		return dao;
	}


	@Override
	public int insertBoard(BoardVO bv) {
		int cnt = 0;
		try {
			cnt = smc.update("board.insertBoard", bv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int updateBoard(BoardVO bv) {
		int cnt = 0;
		try {
			cnt = smc.update("board.updateBoard", bv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteBoard(String rvId) {
		int cnt = 0;
		try {
			cnt = smc.delete("board.deleteBoard", rvId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<BoardVO> getAllBoardList() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			boardList = smc.queryForList("board.getBoardAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return boardList;
	}

	@Override
	public BoardVO getBoard(String writer) {
	
		BoardVO bv = new BoardVO();
		try {
			bv = (BoardVO) smc.queryForObject("board.getBoard", writer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bv;
	}

	@Override
	public List<ViewHistoryVO> getContTitle(String writer) {
		
		List<ViewHistoryVO> htContTitle = new ArrayList<ViewHistoryVO>();
		try {
			htContTitle = (List<ViewHistoryVO>) smc.queryForList("view.getContTitle", writer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return htContTitle;
	}

	@Override
	public BoardVO getDetail(BoardVO bv) {
		
		try {
			 bv= (BoardVO)smc.queryForObject("board.getDetail", bv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bv;
	}

}
