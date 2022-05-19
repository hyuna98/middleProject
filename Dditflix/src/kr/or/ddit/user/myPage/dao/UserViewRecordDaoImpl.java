package kr.or.ddit.user.myPage.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class UserViewRecordDaoImpl implements IUserViewRecordDao {
	
	private SqlMapClient smc;
	private static UserViewRecordDaoImpl dao;
	
	private UserViewRecordDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IUserViewRecordDao getInstance() {
		if(dao == null) {
			dao = new UserViewRecordDaoImpl();
		}
		return dao;
	}
	
	@Override
	public List<ViewHistoryVO> getAllUserViewRecordList(String users_id) {
		List<ViewHistoryVO> list = new ArrayList<ViewHistoryVO>();
		
		try {
			list =smc.queryForList("view.getViewRecord", users_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 회원의 시청기록 삭제메소드
	@Override
	public int deleteViewRecord(ViewHistoryVO vv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("view.deleteViewRecord",vv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}

}
