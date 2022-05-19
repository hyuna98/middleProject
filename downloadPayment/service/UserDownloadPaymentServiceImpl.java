package kr.or.ddit.user.downloadPayment.service;

import java.util.List;

import kr.or.ddit.user.downloadPayment.dao.IUserDownloadPaymentDao;
import kr.or.ddit.user.downloadPayment.dao.UserDownloadPaymentDaoImpl;
import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;
import kr.or.ddit.user.myCardInfo.service.IUserMyCardInfoService;
import kr.or.ddit.user.myCardInfo.vo.UserMyCardInfoVO;

public class UserDownloadPaymentServiceImpl implements IUserDownloadPaymentService {
	
	private IUserDownloadPaymentDao cartDao;
	private static IUserDownloadPaymentService instance;
	
	private UserDownloadPaymentServiceImpl() {
		if(cartDao==null) {
			cartDao = UserDownloadPaymentDaoImpl.getInstance();
		}
	}
	public static IUserDownloadPaymentService getInstance() {
		if(instance==null) {
			instance = new UserDownloadPaymentServiceImpl();
		}
		return instance;
	}
	@Override
	public int insertPaymentCart(List<UserDownloadPaymentVO> cartList, String userId) {
		//-1:결제오류
		//1:결제완료
		int result = 0;
		
		cartDao.insertPaymentCart(cartList);
		
		return result;
	}


	
	
}
