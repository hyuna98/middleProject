package kr.or.ddit.admin.content.dao;

import kr.or.ddit.admin.content.vo.AdminContentVO;

public interface IAdminContentDao {

	// 컨텐츠 등록
	public int insertContent(AdminContentVO vo) throws Exception;
	
	//컨텐츠 삭제
	public int deleteContent(String title) throws Exception;
	
	//비디오 삭제
	public int deleteVideo(String title) throws Exception;
	
	//에피소드 삭제
	public int deleteEpisode(String title) throws Exception;
	
	//업데이트 대상 목록 조회
	public AdminContentVO getContent(String title) throws Exception;
	
	//컨텐츠 업데이트
	public int updateContent(AdminContentVO vo)throws Exception;
		
	//줄거리 업데이트
	public int updatePlot(AdminContentVO vo)throws Exception;
}
