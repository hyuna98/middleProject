package kr.or.ddit.user.myPage.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.myPage.vo.wishListVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class UserWishListDaoImpl implements IUserWishListDao {
	// 싱글톤 패턴
	private SqlMapClient smc;
	private static UserWishListDaoImpl dao;
	
	private UserWishListDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IUserWishListDao getInstance() {
		if(dao == null) {
			dao = new UserWishListDaoImpl();
		}
		return dao;
	}
	
	@Override
	public List<wishListVO> getUserWishList(String users_id) {
		List<wishListVO> list = new ArrayList<wishListVO>();
		
		try {
			list = smc.queryForList("wishList.getUserWishLsit", users_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int deleteWishList(wishListVO wv) {
		int cnt = 0;
		
		try {
			cnt = smc.delete("wishList.deleteWishLsit", wv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int insertWishList(wishListVO vo) throws Exception {
		
		return smc.update("wishList.insertWishList", vo);
	}

}
