package kr.or.ddit.admin.member.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.admin.member.vo.UsersVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class AdminMemberDaoImpl implements IAdminMemberDao {
	
	private SqlMapClient smc;
	
	private static AdminMemberDaoImpl dao;
	
	private AdminMemberDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IAdminMemberDao getInstance() {
		if(dao == null) {
			dao = new AdminMemberDaoImpl();
		}
		return dao;
	}
	
	// 전체 회원 목록을 조회하여 출력하는 메서드	
	@Override
	public List<UsersVO> getAllUserList() {
		List<UsersVO> list = new ArrayList<UsersVO>();
		
		try {
			list = smc.queryForList("adminMember.getAllUserList");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	// 특정회원에게 관리자 권한을 부여하는 메서드
	@Override
	public int authorization(String users_id) {
		int cnt = 0;
		
		try {
			cnt = smc.update("adminMember.authorization", users_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	
	// 특정회원의 아이디을 삭제하는 메서드
	@Override
	public int deleteUser(String users_id) {
		int cnt = 0;
		
		try {
			cnt = smc.update("adminMember.deleteUser", users_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

}
