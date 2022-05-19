package kr.or.ddit.content.service;

import java.util.List;

import kr.or.ddit.content.dao.ContentDaoImpl;
import kr.or.ddit.content.dao.IContentDao;
import kr.or.ddit.content.vo.ContentVO;

public class ContentServiceImpl implements IContentService{
	
	private IContentDao dao;
	private static IContentService service;
	
	private ContentServiceImpl() {
		dao = ContentDaoImpl.getInstance();
	}
	
	public static IContentService getInstance() {
		if(service == null) {
			service = new ContentServiceImpl();
		}
		
		return service;
	}
	
	@Override
	public List<ContentVO> movieList(String genre) {
		
		List<ContentVO> list = null;
		
		try {
			list = dao.movieList(genre);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public ContentVO searchContent(String search) {
		ContentVO vo = null;
	
		try {
			vo = dao.searchContent(search);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public List<ContentVO> tvList(String genre) {
		List<ContentVO> list = null;
		
		try {
			list = dao.tvList(genre);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ContentVO> contentList() {
		
		List<ContentVO> list = null;
		
		try {
			list = dao.contentList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}


}
