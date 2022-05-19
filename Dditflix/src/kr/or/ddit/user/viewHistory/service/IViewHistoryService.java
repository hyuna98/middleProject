package kr.or.ddit.user.viewHistory.service;

import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

public interface IViewHistoryService {
		
	//영화 리스트 담기
	public int insertView(ViewHistoryVO history);
	
	
}
