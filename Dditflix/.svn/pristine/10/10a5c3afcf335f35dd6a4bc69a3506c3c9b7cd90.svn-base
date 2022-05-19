package kr.or.ddit.user.board.service;

import java.util.List;



import kr.or.ddit.user.board.vo.BoardVO;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

public interface IBoardService {
	
		//BoardVO에 담겨진 자료를 db에 insert하는 메소드
		public int insertBoard(BoardVO bv);
		
		// boardvo 자료를 이용하여 db를 update하는 메서드
		public int updateBoard(BoardVO bv);
		
		// review를 매개변수로 받아서 해당 정보 삭제
		public int deleteBoard(String rvId);
		
		// db안의 review테이블 전체 레커드를 가져와서 list에 담아 반환하는 메서드
		public List<BoardVO> getAllBoardList();
		
		/**
		 * 주어진 writer로 회원정보를 알아내기 위한 메서드
		 * @param writer 검색할 writer
		 * @return writer 있으면 회원정보 리턴
		 */
		public BoardVO getBoard(String userId);
		
		public List<ViewHistoryVO> getContTitle (String writer);
		
		public BoardVO getDetail(BoardVO bv);
	
}
