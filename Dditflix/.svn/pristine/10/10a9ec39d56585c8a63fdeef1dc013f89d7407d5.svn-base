package kr.or.ddit.user.viewHistory.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class ViewHistoryDaoImple implements IViewHistoryDao{
	
	private SqlMapClient smc;
	private static IViewHistoryDao dao;
	
	private ViewHistoryDaoImple() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IViewHistoryDao getInstance() {
		if(dao == null) {
			dao = new ViewHistoryDaoImple();
		}
		return dao;
	}

	@Override
	public int insertView(ViewHistoryVO history) throws Exception {
		
		return smc.update("view.insertView", history);
	}

}
