package kr.or.ddit.admin.membership.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.admin.membership.vo.AdminMembershipVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class AdminMembershipDaoImpl implements IAdminMembershipDao {
	private SqlMapClient smc;
	private static IAdminMembershipDao membershipDao;
	
	private AdminMembershipDaoImpl() {
		if(smc==null) {
			smc = SqlMapClientFactory.getInstance();
		}
	}
	public static IAdminMembershipDao getInstance() {
		if(membershipDao == null) {
			membershipDao = new AdminMembershipDaoImpl();
		}
		return membershipDao;	
	}
	
	public List<AdminMembershipVO> getMembershipAll(){
		
		List<AdminMembershipVO> result = new ArrayList<AdminMembershipVO>();
		try {
			result =  smc.queryForList("adminMembership.getMembershipAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	@Override
	public AdminMembershipVO getMembership(String membershipId) {
		AdminMembershipVO result = new AdminMembershipVO();
		try {
			
			result = (AdminMembershipVO) smc.queryForObject("adminMembership.getMembership", membershipId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public int insertMembership(AdminMembershipVO vo) {
		int result = 0;
		try {
			result =  smc.update("adminMembership.insertMembership", vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public int updateMembership(AdminMembershipVO vo) {
		int result = 0;
		try {
			result =  smc.update("adminMembership.updateMembership", vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public int deleteMembership(String membershipId) {
		int result = 0;
		try {
			result =  smc.update("adminMembership.deleteMembership", membershipId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}
