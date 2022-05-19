package kr.or.ddit.user.notice.service;

import java.util.List;

import kr.or.ddit.user.notice.dao.INoticeDao;
import kr.or.ddit.user.notice.dao.NoticeDaoImpl;
import kr.or.ddit.user.notice.vo.NoticeVO;

public class NoticeServiceImpl implements INoticeService{
	private static INoticeService noticeService;
	private INoticeDao ndao;
	
	private NoticeServiceImpl() {
		ndao = NoticeDaoImpl.getInstance();
	}
	
	public static INoticeService getInstance() {
		if(noticeService == null) {
			noticeService = new NoticeServiceImpl();
		}
		
		return noticeService;
	}

	@Override
	public int insertNotice(NoticeVO nv) {
		return ndao.insertNotice(nv);
	}

	@Override
	public int updateNotice(NoticeVO nv) {
		return ndao.updateNotice(nv);
	}

	@Override
	public int deleteNotice(String noticeId) {
		return ndao.deleteNotice(noticeId);
	}

	@Override
	public List<NoticeVO> getAllNoticeList() {
		return ndao.getAllNoticeList();
	}

	@Override
	public NoticeVO getNotice(String noticeTitle) {
		return ndao.getNotice(noticeTitle);
	}
	
}
