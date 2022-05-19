package kr.or.ddit.user.myPage.service;

import java.util.List;

import kr.or.ddit.user.myPage.dao.IUserWishListDao;
import kr.or.ddit.user.myPage.dao.UserWishListDaoImpl;
import kr.or.ddit.user.myPage.vo.wishListVO;

public class UserWishListServiceImpl implements IUserWishListService {
	// 싱글톤 패턴
	private static IUserWishListService service;
	private IUserWishListDao dao;
	
	
	
	private UserWishListServiceImpl() {
		dao = UserWishListDaoImpl.getInstance();
	}
	
	public static IUserWishListService getInstance() {
		if(service == null) {
			service = new UserWishListServiceImpl();
		}
		
		return service;
	}
	
	@Override
	public List<wishListVO> getUserWishList(String users_id) {
		// TODO Auto-generated method stub
		return dao.getUserWishList(users_id);
	}

	@Override
	public int deleteWishList(wishListVO wv) {
		// TODO Auto-generated method stub
		return dao.deleteWishList(wv);
	}

	@Override
	public int insertWishList(wishListVO vo) {
		int result = 0;
		
		try {
			result = dao.insertWishList(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
