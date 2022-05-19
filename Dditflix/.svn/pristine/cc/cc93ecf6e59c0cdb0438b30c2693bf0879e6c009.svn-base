package kr.or.ddit.user.join.service;

import kr.or.ddit.user.join.dao.IUserJoinDao;
import kr.or.ddit.user.join.dao.UserJoinDaoImpl;
import kr.or.ddit.user.join.vo.UserVO;

public class UserJoinServiceImple implements IUserJoinService{
	
	private static IUserJoinService service;
	private IUserJoinDao dao;
	
	private UserJoinServiceImple() {
		dao = UserJoinDaoImpl.getInstance();
	}
	
	public static IUserJoinService getInstance() {
		if(service == null) {
			service = new UserJoinServiceImple();
		}
		return service;
	}
	
	@Override
	public String userIdCheck(String id) {
		
		String userId = "";
		
		try {
			userId = dao.userIdCheck(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userId;
	}

	@Override
	public int userJoin(UserVO user) {
		int result = 0;
		
		try {
			result = dao.userJoin(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
