package kr.or.ddit.user.downloadPayment.dao;

import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.downloadPayment.vo.UserDownloadPaymentVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class UserDownloadPaymentDaoImpl implements IUserDownloadPaymentDao {
	
	private SqlMapClient smc;
	private static IUserDownloadPaymentDao instance;

	private UserDownloadPaymentDaoImpl() {
		if(smc==null) {
			smc = SqlMapClientFactory.getInstance();
		}
	}

	public static IUserDownloadPaymentDao getInstance() {
		if(instance==null) {
			instance = new UserDownloadPaymentDaoImpl();
		}
		return instance;
	}

	@Override
	public int insertPaymentCart(List<UserDownloadPaymentVO> cartList) {
		// TODO Auto-generated method stub
		return 0;
	}


}
