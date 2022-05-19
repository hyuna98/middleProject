package kr.or.ddit.user.notice.dao;

import java.util.List;

import kr.or.ddit.user.board.vo.BoardVO;
import kr.or.ddit.user.notice.vo.NoticeVO;

public interface INoticeDao {
	
	// NoticeVO에 담겨진 자료를 DB에 insert하는 메소드
	public int insertNotice(NoticeVO nv);
	
	// noticevo 자료를 이용하여 db를 update하는 메서드
	public int updateNotice(NoticeVO nv);
	
	// noticeId를 매개변수로 받아서 해당 정보 삭제
	public int deleteNotice(String noticeId);
	
	//db안의 notice 테이블 전체 레코드를 가져와서 list에 담아 반환하는 메소드
	public List<NoticeVO> getAllNoticeList();
	
	public NoticeVO getNotice(String noticeTitle);
	
	
}
