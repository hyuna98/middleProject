package kr.or.ddit.user.myPage.service;

import java.util.List;

import kr.or.ddit.user.myPage.vo.wishListVO;

public interface IUserWishListService {
	
	
	// 찜목록 등록
	public int insertWishList(wishListVO vo);
	// 찜목록 조회
	/**
	 * DB안의 view_record 테이블 전체 레코드를 가져와서 List에 담아
	 * 반환하는 메서드
	 * @return ViewHistoryVO객체를 담고 있는 List객체
	 */
	public List<wishListVO> getUserWishList(String users_id);
	// 찜목록 삭제
	public int deleteWishList(wishListVO wv);
	// 찜목록 전체 삭제
}
