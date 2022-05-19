package kr.or.ddit.user.notice.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.notice.vo.NoticeVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class NoticeDaoImpl implements INoticeDao{
	
	private SqlMapClient smc;
	private static NoticeDaoImpl ndao;
	
	private NoticeDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static INoticeDao getInstance() {
		if(ndao == null) {
			ndao = new NoticeDaoImpl();
		}
		return ndao;
	}
	

	@Override
	public int insertNotice(NoticeVO nv) {
		int cnt = 0;
		try {
			cnt = smc.update("notice.insertNotice", nv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int updateNotice(NoticeVO nv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("notice.updateNotice", nv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteNotice(String noticeId) {
		int cnt = 0;
		try {
			cnt = smc.delete("notice.deleteNotice", noticeId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<NoticeVO> getAllNoticeList() {
		List<NoticeVO> noticeList = new ArrayList<NoticeVO>();
		
		try {
			noticeList = smc.queryForList("notice.getNoticeAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return noticeList;
	}

	@Override
	public NoticeVO getNotice(String noticeId) {
		NoticeVO nv = new NoticeVO();
		try {
			nv = (NoticeVO) smc.queryForObject("notice.getNotice", noticeId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return nv;
	}
	
	
	
}
