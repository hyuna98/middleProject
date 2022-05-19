package kr.or.ddit.user.myPage.dao;

import java.util.List;

import kr.or.ddit.user.login.vo.LoginVO;

public interface IUserMyPageDao {

	/**
	 * 주어진 회원ID로 회원정보를 알아내기 위한 메서드
	 * @param usersId 검색할 회원ID
	 * @return 해당회원 ID가 있으면 회원정보 리턴함.
	 */
	public LoginVO getUser(String users_id);
	
	/**
	 * 하나의 MyPageVO자료를 이용하여 DB를 update하는 메서드
	 * @param mv update할 회원 정보가 담긴 MyPageVO객체
	 * @return 작업성공 : 1, 작업실패 : 0
	 */
	public int updateUser(LoginVO lv);
	
	/**
	 * DB안의 users 테이블 전체 레코드를 가져와서 List에 담아
	 * 반환하는 메서드
	 * @return MyPageVO객체를 담고 있는 List객체
	 */
	public List<LoginVO> getAllUserList();
	
	/**
	 * MyPageVO에 담긴 자료를 이용하여 회원을 검색하는 메서드
	 * @param mv 검색할 자료가 들어있는 MyPageVO객체
	 * @return 검색된 결과를 담은 List객체
	 */
	public List<LoginVO> searchUser(LoginVO lv);
	
	
}
