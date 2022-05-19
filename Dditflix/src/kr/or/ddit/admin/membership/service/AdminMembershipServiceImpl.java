package kr.or.ddit.admin.membership.service;

import java.util.List;

import kr.or.ddit.admin.membership.dao.AdminMembershipDaoImpl;
import kr.or.ddit.admin.membership.dao.IAdminMembershipDao;
import kr.or.ddit.admin.membership.vo.AdminMembershipVO;

public class AdminMembershipServiceImpl implements IAdminMembershipService {
	
	private IAdminMembershipDao membershipDao;
	private static IAdminMembershipService membershipService;
	
	private AdminMembershipServiceImpl() {
		if(membershipDao==null) {
			membershipDao = AdminMembershipDaoImpl.getInstance();
		}
	}
	public static IAdminMembershipService getInstance() {
		if(membershipService==null) {
			membershipService = new AdminMembershipServiceImpl();
		}
		return membershipService;
	}
	@Override
	public List<AdminMembershipVO> getMembershipAll() {
		return membershipDao.getMembershipAll();
	}
	@Override
	public AdminMembershipVO getMembership(String membershipId) {
		return membershipDao.getMembership(membershipId);
	}
	@Override
	public int insertMembership(AdminMembershipVO vo) {
		return membershipDao.insertMembership(vo);
	}
	@Override
	public int updateMembership(AdminMembershipVO vo) {
		return membershipDao.updateMembership(vo);
	}
	@Override
	public int deleteMembership(String membershipId) {
		return membershipDao.deleteMembership(membershipId);
	}
	
	

}
