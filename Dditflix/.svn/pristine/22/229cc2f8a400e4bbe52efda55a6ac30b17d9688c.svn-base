package kr.or.ddit.user.qna.service;

import java.util.List;

import kr.or.ddit.user.qna.dao.IQnaDao;
import kr.or.ddit.user.qna.dao.QnaDaoImpl;
import kr.or.ddit.user.qna.vo.QnaVO;

public class QnaServiceImpl implements IQnaService{
	
	private static IQnaService qnaService;
	private IQnaDao qdao;

	private QnaServiceImpl() {
		qdao = QnaDaoImpl.getInstance();
	}
	
	public static IQnaService getInstance() {
		if(qnaService == null) {
			qnaService = new QnaServiceImpl();
		}
		
		return qnaService;
	}
	

	@Override
	public int insertQna(QnaVO qv) {
		return qdao.insertQna(qv);
	}

	@Override
	public int updateQna(QnaVO qv) {
		return qdao.updateQna(qv);
	}

	@Override
	public int deleteQna(String qCode) {
		return qdao.deleteQna(qCode);
	}

	@Override
	public List<QnaVO> getAllQnaList() {
		return qdao.getAllQnaList(); 
	}

	@Override
	public QnaVO getQnaDetail(String qCode) {
		return qdao.getQnaDetail(qCode);
	}

	@Override
	public QnaVO getQnaUpdateDetail(QnaVO qv) {
		return qdao.getQnaUpdateDetail(qv);
	}

}
