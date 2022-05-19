package kr.or.ddit.admin.content.service;

import kr.or.ddit.admin.content.dao.AdminContentDaoImpl;
import kr.or.ddit.admin.content.dao.IAdminContentDao;
import kr.or.ddit.admin.content.vo.AdminContentVO;

public class AdminContentServiceImpl implements IAdminContentService{
	
	private static IAdminContentService service;
	private IAdminContentDao dao;
	
	private AdminContentServiceImpl() {
		dao = AdminContentDaoImpl.getInstance();
	}
	
	public static IAdminContentService getInstance() {
		if(service == null) {
			service = new AdminContentServiceImpl();
		}
		return service;
	}

	@Override
	public int insertContent(AdminContentVO vo) {
		int result = 0;

		try {
			result = dao.insertContent(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int deleteContent(String title) {
		int result = 0;

		try {
			result = dao.deleteContent(title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int deleteVideo(String title) {
		int result = 0;

		try {
			result = dao.deleteVideo(title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int deleteEpisode(String title) {
		int result = 0;

		try {
			result = dao.deleteEpisode(title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public AdminContentVO getContent(String title) {
		AdminContentVO vo = null;
		
		try {
			vo = dao.getContent(title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public int updateContent(AdminContentVO vo) {
		int result = 0;

		try {
			result = dao.updateContent(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int updatePlot(AdminContentVO vo) {
		int result = 0;

		try {
			result = dao.updatePlot(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
