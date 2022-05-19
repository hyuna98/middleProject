package kr.or.ddit.admin.member.dao;

import java.util.List;

import kr.or.ddit.admin.member.vo.UsersVO;

public interface IAdminMemberDao {
	
	/**
	 * DB안의 users 테이블 전체 레코드를 가져와서 List에 담아
	 * 반환하는 메서드
	 * @return LoginVO객체를 담고 있는 List객체
	 */
	public List<UsersVO> getAllUserList();
	
	/**
	 *  특정 회원에게 관리자 권한을 부여해주는 메서드
	 * @param users_id에게 권한부여
	 * @return 작업성공 : 1, 작업실패 : 0
	 */
	public int authorization(String users_id);
	
	/**
	 * 회원ID를 매개변수로 받아서 해당 회원정보를 삭제하는 메서드
	 * 정책상 회원탈퇴시 회원 ID는 삭제되지 않고 탈퇴여부가 1로 바뀌며
	 * 개인정보 보관인인 탈퇴후 30이 지나면 개인정보를 삭제한다.  
	 * @param usersId 삭제할 회원ID
	 * @return 작업성공 : 1, 작업실패 : 0
	 */
	public int deleteUser(String users_id);	
}
