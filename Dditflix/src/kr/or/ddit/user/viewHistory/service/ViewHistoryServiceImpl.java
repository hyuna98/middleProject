package kr.or.ddit.user.viewHistory.service;

import kr.or.ddit.user.viewHistory.dao.IViewHistoryDao;
import kr.or.ddit.user.viewHistory.dao.ViewHistoryDaoImple;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

public class ViewHistoryServiceImpl implements IViewHistoryService{
	
	private static IViewHistoryService service;
	private IViewHistoryDao dao;
	
	private ViewHistoryServiceImpl() {
		dao = ViewHistoryDaoImple.getInstance();
	}
	
	public static IViewHistoryService getInstance() {
		if(service == null) {
			service = new ViewHistoryServiceImpl();
		}
		return service;
	}

	@Override
	public int insertView(ViewHistoryVO history) {
		int result = 0;
		
		try {
			result = dao.insertView(history);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}

}
