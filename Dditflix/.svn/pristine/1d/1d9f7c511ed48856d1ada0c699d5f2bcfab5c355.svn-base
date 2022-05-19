package kr.or.ddit.user.myPage.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.login.vo.LoginVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class UserMyPageDaoImpl implements IUserMyPageDao {
	
	private SqlMapClient smc;
	
	private static UserMyPageDaoImpl myPageDao;
	
	private UserMyPageDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IUserMyPageDao getInstance() {
		if(myPageDao == null) {
			myPageDao = new UserMyPageDaoImpl();
		}
		return myPageDao;
	}
	
	// 개인정보 조회
	@Override
	public LoginVO getUser(String users_id){
		LoginVO lv = new LoginVO();
		
		try {
			lv = (LoginVO) smc.queryForObject("mypage.getUser", users_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lv;
	}
	
	// 개인정보 수정
	@Override
	public int updateUser(LoginVO lv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("mypage.updateUser", lv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	// 전체 회원 개인정보 조회(관리자)
	@Override
	public List<LoginVO> getAllUserList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 회원 검색
	@Override
	public List<LoginVO> searchUser(LoginVO lv){
		List<LoginVO> userList = new ArrayList<>();
		
		try {
			userList = smc.queryForList("", lv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return userList;
	}

}
