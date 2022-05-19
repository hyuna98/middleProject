package kr.or.ddit.user.downloadPayment.service;

import java.util.List;

import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;

public interface IUserDownloadPaymentService {
	
	public int insertPaymentCart(List<UserDownloadPaymentVO> cartList, String userId);
	
}
