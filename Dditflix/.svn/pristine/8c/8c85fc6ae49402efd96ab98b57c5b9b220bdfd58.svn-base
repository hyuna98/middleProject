package kr.or.ddit.user.myPage.service;

import java.util.List;

import kr.or.ddit.user.myPage.vo.MemberShipVO;

public interface IUserMyMemberShipService {

	/**
	 * 회원의 membership 정보를 가져오기위한 메서드
	 * @param users_id 를 넣어 membership테이블과 users테이블을 join시켜 값을 가져온다
	 * @return
	 */
	public MemberShipVO getUserMemberShip(String users_id);

	/**
	 * DB안의 MEMBERSHIP 테이블 전체 레코드를 가져와서 List에 담아
	 * @return memberShipVO로 반환
	 */
	public List<MemberShipVO> getMemberShipList();
	
	/**
	 * 회원이 구독을 결제한 멤버십 아이디를 가져오기 위한 메서
	 * @param mmbrs_rating를 조건에 넣어 MEMBERSHIP 테이블에
	 * @return memberShipVO로 MMBRS_ID을 반환 받는
	 */
	public String getMemberId(String mmbrs_rating);
	
	/**
	 * 멤버십 구독 결제시 구매했다는 기록을 DB에 남기기 위한 결제내역
	 * MMBRS_PYMNT 테이블에 insert를 하기위한 메서드
	 * @param mv를 사용하여 MemberShipVO안에 값을 쿼리문(insert)에 넣어준
	 * @return
	 */
	public int insertMemberPayMent(MemberShipVO mv);
	
	/**
	 * 회원의 멤버십 등급이 변경되었을때 USERS테이블에 있는 MMBRS_ID를 바꿔주는 메서
	 * @param MemberShipVO를 통해 MMBRS_ID값과 조건을 넣어준다
	 * @return 
	 */
	public int updateUserMemberShip(MemberShipVO mv);
	
}
