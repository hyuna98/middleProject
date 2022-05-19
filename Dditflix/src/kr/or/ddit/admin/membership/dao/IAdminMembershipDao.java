package kr.or.ddit.admin.membership.dao;

import java.util.List;

import kr.or.ddit.admin.membership.vo.AdminMembershipVO;

public interface IAdminMembershipDao {

	List<AdminMembershipVO> getMembershipAll();

	AdminMembershipVO getMembership(String membershipId);

	int insertMembership(AdminMembershipVO vo);

	int updateMembership(AdminMembershipVO vo);

	int deleteMembership(String membershipId);

}
