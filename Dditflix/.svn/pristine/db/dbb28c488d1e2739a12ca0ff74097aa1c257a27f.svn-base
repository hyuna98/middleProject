package kr.or.ddit.user.myPage.service;

import java.util.List;

import kr.or.ddit.user.board.service.BoardServiceImpl;
import kr.or.ddit.user.board.service.IBoardService;
import kr.or.ddit.user.myPage.dao.IUserViewRecordDao;
import kr.or.ddit.user.myPage.dao.UserViewRecordDaoImpl;
import kr.or.ddit.user.viewHistory.vo.ViewHistoryVO;

public class UserViewRecordServiceImpl implements IUserViewRecordService {

	// 싱글턴 패턴
	private static IUserViewRecordService service;
	private IUserViewRecordDao dao;
	
	private UserViewRecordServiceImpl() {
		dao = UserViewRecordDaoImpl.getInstance();
	}
	
	public static IUserViewRecordService getInstance() {
		if(service == null) {
			service = new UserViewRecordServiceImpl();
		}
		
		return service;
	}
	
	@Override
	public List<ViewHistoryVO> getAllUserViewRecordList(String users_id) {
		// TODO Auto-generated method stub
		return dao.getAllUserViewRecordList(users_id);
	}

	@Override
	public int deleteViewRecord(ViewHistoryVO vv) {
		// TODO Auto-generated method stub
		return dao.deleteViewRecord(vv);
	}



}
