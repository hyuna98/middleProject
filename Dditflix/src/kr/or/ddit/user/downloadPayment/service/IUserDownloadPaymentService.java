package kr.or.ddit.user.downloadPayment.service;

import java.util.List;

import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;

public interface IUserDownloadPaymentService {
	
	public String getNewCartNo();

	public int insertPaymentCart(List<UserDownloadPaymentVO> cartList);

	public boolean checkPaid(UserDownloadPaymentVO vo);
	
	/**
	 * DB안의 Downlod_pym 테이블 전체 레코드를 가져와서 List에 담아
	 * 반환하는 메서드
	 * @return UserDownloadPaymentVO객체를 담고 있는 List객체
	 */
	public List<UserDownloadPaymentVO> getUserDownloadPymList(String usersId);
	
	//비디오 경로 받아오기
	public String getViedoPath(UserDownloadPaymentVO vo);
	
}
