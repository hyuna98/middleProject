package kr.or.ddit.user.myPage.service;

import kr.or.ddit.user.login.vo.LoginVO;

public interface IUserWithDrawalService {

	/**
	 * 회원ID를 매개변수로 받아서 해당 회원정보를 삭제하는 메서드
	 * 정책상 회원탈퇴시 회원 ID는 삭제되지 않고 탈퇴여부가 1로 바뀌며
	 * 개인정보 보관인인 탈퇴후 30이 지나면 개인정보를 삭제한다.  
	 * @param usersId 삭제할 회원ID
	 * @return 작업성공 : 1, 작업실패 : 0
	 */
	public int deleteUser(LoginVO lv);	
}
