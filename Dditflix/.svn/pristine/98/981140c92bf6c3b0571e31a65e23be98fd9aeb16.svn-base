package kr.or.ddit.admin.member.service;

import java.util.List;

import kr.or.ddit.admin.member.dao.AdminMemberDaoImpl;
import kr.or.ddit.admin.member.dao.IAdminMemberDao;
import kr.or.ddit.admin.member.vo.UsersVO;

public class AdminMemberServiceImpl implements IAdminMemberService {
	
	private static IAdminMemberService service;
	
	private IAdminMemberDao dao;
	
	private AdminMemberServiceImpl() {
		dao = AdminMemberDaoImpl.getInstance();
	}
	
	public static IAdminMemberService getInstance() {
		if(service == null) {
			service = new AdminMemberServiceImpl();
		}
		return service;
	}
	
	@Override
	public List<UsersVO> getAllUserList() {
		return dao.getAllUserList();
	}

	@Override
	public int authorization(String users_id) {
		return dao.authorization(users_id);
	}

	@Override
	public int deleteUser(String users_id) {
		return dao.deleteUser(users_id);
	}

}
