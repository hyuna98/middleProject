package kr.or.ddit.user.myPage.service;

import java.util.List;

import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

public interface IUserViewRecordService {

	/**
	 * DB안의 view_record 테이블 전체 레코드를 가져와서 List에 담아
	 * 반환하는 메서드
	 * @return ViewHistoryVO객체를 담고 있는 List객체
	 */
	public List<ViewHistoryVO> getAllUserViewRecordList(String users_id);
	
	/**
	 * 삭제시를 누를시 회원에게는 보이지 않게된다
	 * @param usersId 삭제시청기록을 가진 회원ID이 본 컨텐츠 cont_title
	 * @return 작업성공 : 1, 작업실패 : 0
	 */
	public int deleteViewRecord(ViewHistoryVO vv);	
}
