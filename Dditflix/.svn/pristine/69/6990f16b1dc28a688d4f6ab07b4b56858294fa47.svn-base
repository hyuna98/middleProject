package kr.or.ddit.user.qna.dao;

import java.util.List;

import kr.or.ddit.user.qna.vo.QnaVO;

public interface IQnaDao {
	
	
		// qnavo에 담겨진 자료를 db에 insert하는 메소드
		public int insertQna(QnaVO qv);
		
		// qnavo 자료를 이용하여 db를 update하는 메소드
		public int updateQna(QnaVO qv);
		
		// qnacode를 매개변수로 받아서 해당 정보 삭제
		public int deleteQna(String qCode);
		
		// db안의 qna테이블 전체 레코드를 가져와서 list에 담아 반환하는 메서드
		public List<QnaVO> getAllQnaList();
		
		// QCODE를 매개변수로 받아서 조회
		public QnaVO getQnaDetail(String qCode);
		
		public QnaVO getQnaUpdateDetail(QnaVO qv);
		
		
		
}
