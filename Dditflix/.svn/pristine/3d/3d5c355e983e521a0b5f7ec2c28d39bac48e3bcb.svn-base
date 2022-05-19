package kr.or.ddit.user.myPage.service;

import java.util.List;

import kr.or.ddit.user.myPage.dao.IUserMyMemberShipDao;
import kr.or.ddit.user.myPage.dao.UserMyMemberShipDaoImpl;
import kr.or.ddit.user.myPage.vo.MemberShipVO;

public class UserMyMemberShipServiceImpl implements IUserMyMemberShipService {
	
	private static IUserMyMemberShipService service;
	private IUserMyMemberShipDao dao;
	
	private UserMyMemberShipServiceImpl() {
		dao = UserMyMemberShipDaoImpl.getInstance();
	}
	
	public static IUserMyMemberShipService getInstance() {
		if(service == null) {
			service = new UserMyMemberShipServiceImpl();
		}
		return service;
	
	}
	
	// 회원의 멤버십 등급 가져오기
	@Override
	public MemberShipVO getUserMemberShip(String users_id) {
		return dao.getUserMemberShip(users_id);
	}
	
	
	// 멤버십 회원 등급 정보 가져오기
	@Override
	public List<MemberShipVO> getMemberShipList() {
		return dao.getMemberShipList();
	}

	@Override
	public String getMemberId(String mmbrs_rating) {
		return dao.getMemberId(mmbrs_rating);
	}

	@Override
	public int insertMemberPayMent(MemberShipVO mv) {
		return dao.insertMemberPayMent(mv);
	}

	@Override
	public int updateUserMemberShip(MemberShipVO mv) {
		return dao.updateUserMemberShip(mv);
	}

}
