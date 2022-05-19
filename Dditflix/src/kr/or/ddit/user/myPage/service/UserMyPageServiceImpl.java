package kr.or.ddit.user.myPage.service;

import java.util.List;

import kr.or.ddit.user.login.vo.LoginVO;
import kr.or.ddit.user.myPage.dao.IUserMyPageDao;
import kr.or.ddit.user.myPage.dao.UserMyPageDaoImpl;

public class UserMyPageServiceImpl implements IUserMyPageService {
	
	private static IUserMyPageService myPageService;
	
	private IUserMyPageDao dao;
	
	private UserMyPageServiceImpl() {
		dao = UserMyPageDaoImpl.getInstance();
	}
	
	public static IUserMyPageService getInstance() {
		if(myPageService == null) {
			myPageService = new UserMyPageServiceImpl();
		}
		return myPageService;
	
	}
	
	
	// 개인정보 조회
	@Override
	public LoginVO getUser(String users_id) {
		return dao.getUser(users_id);
	}
	
	// 개인정보 수정
	@Override
	public int updateUser(LoginVO lv) {
		return dao.updateUser(lv);
	}
	
	// 전체 회원 개인정보 조회(관리자)
	@Override
	public List<LoginVO> getAllUserList() {
		return dao.getAllUserList();
	}
	
	// 회원 검색
	@Override
	public List<LoginVO> searchUser(LoginVO lv) {
		return dao.searchUser(lv);
	}

}
