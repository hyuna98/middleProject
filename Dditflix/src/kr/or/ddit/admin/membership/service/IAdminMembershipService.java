package kr.or.ddit.admin.membership.service;

import java.util.List;

import kr.or.ddit.admin.membership.vo.AdminMembershipVO;

public interface IAdminMembershipService {

	List<AdminMembershipVO> getMembershipAll();
	
	AdminMembershipVO getMembership(String membershipId);

	int insertMembership(AdminMembershipVO vo);

	int updateMembership(AdminMembershipVO vo);

	int deleteMembership(String membershipId);

}
