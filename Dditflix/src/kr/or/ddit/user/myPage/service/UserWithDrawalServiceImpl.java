package kr.or.ddit.user.myPage.service;

import kr.or.ddit.user.login.vo.LoginVO;
import kr.or.ddit.user.myPage.dao.IUserWithDrawalDao;
import kr.or.ddit.user.myPage.dao.UserWithDrawalDaoImpl;

public class UserWithDrawalServiceImpl implements IUserWithDrawalService {
	
	private static IUserWithDrawalService Service;
	
	private IUserWithDrawalDao dao;
	
	private UserWithDrawalServiceImpl() {
		dao = UserWithDrawalDaoImpl.getInstance();
	}
	
	public static IUserWithDrawalService getInstance() {
		if(Service == null) {
			Service = new UserWithDrawalServiceImpl();
		}
		return Service;
	}
	
	@Override
	public int deleteUser(LoginVO lv) {
		return dao.deleteUser(lv);
	}

}
