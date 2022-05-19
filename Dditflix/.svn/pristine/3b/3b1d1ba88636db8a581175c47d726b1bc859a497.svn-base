package kr.or.ddit.user.myPage.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.myPage.vo.MemberShipVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class UserMyMemberShipDaoImpl implements IUserMyMemberShipDao {

	private SqlMapClient smc;
	private static UserMyMemberShipDaoImpl dao;

	private UserMyMemberShipDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}

	public static IUserMyMemberShipDao getInstance() {
		if (dao == null) {
			dao = new UserMyMemberShipDaoImpl();
		}
		return dao;
	}

	@Override
	public MemberShipVO getUserMemberShip(String users_id) {
		MemberShipVO mv = new MemberShipVO();

		try {
			mv = (MemberShipVO) smc.queryForObject("mymembership.getUserMemberShip", users_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mv;
	}

	@Override
	public List<MemberShipVO> getMemberShipList() {
		List<MemberShipVO> list = new ArrayList<MemberShipVO>();

		try {
			list = smc.queryForList("mymembership.getMemberShipList");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		return list;
	}

	// MMBRS_RATING를 통해 MMBRS_ID를 가져오는 메서
	@Override
	public String getMemberId(String mmbrs_rating) {
		String id =  "";

		try {
			id = (String) smc.queryForObject("mymembership.getMemberId", mmbrs_rating);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
	
	// 결제내역을 DB에 넣어주는 메서드 
	@Override
	public int insertMemberPayMent(MemberShipVO mv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("mymembership.insertMemberPayMent", mv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	// USERS테이블에 멤버십 정보를 update해주는 메서드 
	@Override
	public int updateUserMemberShip(MemberShipVO mv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("mymembership.updateUserMemberShip", mv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}

}
