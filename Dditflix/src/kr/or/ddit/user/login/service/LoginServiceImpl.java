package kr.or.ddit.user.login.service;

import kr.or.ddit.user.login.dao.ILoginDao;
import kr.or.ddit.user.login.dao.LoginDaoImpl;
import kr.or.ddit.user.login.vo.LoginVO;

public class LoginServiceImpl implements ILoginService{

	private ILoginDao dao;
	private static ILoginService service;
	
	private LoginServiceImpl() {
		dao = LoginDaoImpl.getInstance();
	}
	
	public static ILoginService getInstance() {
		if(service == null) {
			service = new LoginServiceImpl();
		}
		
		return service;
	}
	
	@Override
	public LoginVO loginCheck(LoginVO vo) {
		LoginVO user = null;
		
		try {
			user = dao.loginCheck(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public String findId(LoginVO vo) {
		String userId = "";
		
		try {
			userId = dao.findId(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userId;
	}

	@Override
	public String findPw(LoginVO vo) {
		String userPw = "";
		
		try {
			userPw = dao.findPw(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userPw;
	}

}
