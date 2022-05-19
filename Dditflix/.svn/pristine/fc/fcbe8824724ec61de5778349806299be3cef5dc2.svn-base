package kr.or.ddit.user.join.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.join.vo.UserVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class UserJoinDaoImpl implements IUserJoinDao{
	
	private static SqlMapClient smc;
	private static IUserJoinDao dao;
	
	private UserJoinDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IUserJoinDao getInstance() {
		if(dao == null) {
			dao = new UserJoinDaoImpl();
		}
		return dao;
	}
	
	@Override
	public String userIdCheck(String id) throws Exception {
		
		return (String) smc.queryForObject("join.checkId", id);
	}

	@Override
	public int userJoin(UserVO user) throws Exception {
		
		return smc.update("join.insertUser", user);
	}

}
