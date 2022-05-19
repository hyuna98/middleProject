package kr.or.ddit.content.dao;

import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.content.vo.ContentVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class ContentDaoImpl implements IContentDao{
	
	private SqlMapClient smc;
	private static IContentDao dao;
	
	private ContentDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IContentDao getInstance() {
		if(dao == null) {
			dao = new ContentDaoImpl();
		}
		
		return dao;
	}

	@Override
	public List<ContentVO> movieList(String genre) throws Exception {
		
		return smc.queryForList("content.movieList", genre);
	}

	@Override
	public ContentVO searchContent(String search) throws Exception {
		
		return (ContentVO) smc.queryForObject("content.searchList", search);
	}

	@Override
	public List<ContentVO> tvList(String genre) throws Exception {
		
		return smc.queryForList("content.tvList", genre);
	}

	@Override
	public List<ContentVO> contentList() throws Exception {

		return smc.queryForList("content.contentList");
	}	

}
