package kr.or.ddit.user.qna.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.user.qna.vo.QnaVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class QnaDaoImpl implements IQnaDao{
	
	private SqlMapClient smc;
	private static QnaDaoImpl qdao;
	
	private QnaDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IQnaDao getInstance() {
		if(qdao == null) {
			qdao = new QnaDaoImpl();
		}
		
		return qdao;
	}

	
	@Override
	public int insertQna(QnaVO qv) {
		int cnt = 0;
		
		try {
			cnt = smc.update("qna.insertQna", qv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int updateQna(QnaVO qv) {
		int cnt = 0;
		try {
			cnt = smc.update("qna.updateQna", qv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteQna(String qCode) {
		int cnt = 0;
		try {
			cnt = smc.delete("qna.deleteQna", qCode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<QnaVO> getAllQnaList() {
		List<QnaVO> qnaList = new ArrayList<QnaVO>();
		
		try {
			qnaList = smc.queryForList("qna.getQnaAll");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return qnaList;
	}


	@Override
	public QnaVO getQnaDetail(String qCode) {
		QnaVO qv = new QnaVO();
		try {
			qv = (QnaVO) smc.queryForObject("qna.getQnaDetail", qCode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return qv;
	}

	@Override
	public QnaVO getQnaUpdateDetail(QnaVO qv) {
		
		try {
			qv = (QnaVO) smc.queryForObject("qna.getUpdateDetail", qv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return qv;
	}


}
