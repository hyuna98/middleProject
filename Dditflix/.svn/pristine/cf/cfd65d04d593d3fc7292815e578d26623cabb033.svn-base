package kr.or.ddit.admin.content.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.admin.content.vo.AdminContentVO;
import kr.or.ddit.util.SqlMapClientFactory;

public class AdminContentDaoImpl implements IAdminContentDao{
	
	private SqlMapClient smc;
	private static IAdminContentDao dao;
	
	private AdminContentDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IAdminContentDao getInstance() {
		if(dao == null) {
			dao = new AdminContentDaoImpl();
		}
		return dao;
	}

	@Override
	public int insertContent(AdminContentVO vo) throws Exception {
		
		return smc.update("adminContent.insertContent", vo);
	}

	@Override
	public int deleteContent(String title) throws Exception {
		
		return smc.update("adminContent.deleteContent", title);
	}

	@Override
	public int deleteVideo(String title) throws Exception {
		
		return smc.update("adminContent.deleteVideo", title);
	}

	@Override
	public int deleteEpisode(String title) throws Exception {
		
		return smc.update("adminContent.deleteEpisode", title);
	}

	@Override
	public AdminContentVO getContent(String title) throws Exception {
		
		return (AdminContentVO) smc.queryForObject("adminContent.getContent",title);
	}

	@Override
	public int updateContent(AdminContentVO vo) throws Exception {
		
		return smc.update("adminContent.updateContent" , vo);
	}

	@Override
	public int updatePlot(AdminContentVO vo) throws Exception {
		
		return smc.update("adminContent.updatePlot", vo);
	}
	

}
