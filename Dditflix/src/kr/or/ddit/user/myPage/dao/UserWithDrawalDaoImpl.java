package kr.or.ddit.user.myPage.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.login.vo.LoginVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class UserWithDrawalDaoImpl implements IUserWithDrawalDao {
	
	private static IUserWithDrawalDao dao;
	
	private SqlMapClient smc;
	
	private UserWithDrawalDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IUserWithDrawalDao getInstance() {
		if(dao == null) {
			dao = new UserWithDrawalDaoImpl();
		}
		return dao;
	}
	
	// 삭제메소드
	@Override
	public int deleteUser(LoginVO lv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("mypage.deleteUser", lv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

}
