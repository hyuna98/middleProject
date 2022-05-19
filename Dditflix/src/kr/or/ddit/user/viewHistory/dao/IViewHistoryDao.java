package kr.or.ddit.user.viewHistory.dao;

import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

public interface IViewHistoryDao {

	//영화 리스트 담기
	public int insertView(ViewHistoryVO history) throws Exception;
	
	

}
