package kr.or.ddit.admin.content.service;

import kr.or.ddit.admin.content.vo.AdminContentVO;

public interface IAdminContentService {

	// 컨텐츠 등록
	public int insertContent(AdminContentVO vo);
	
	//컨텐츠 삭제
	public int deleteContent(String title);
		
	//비디오 삭제
	public int deleteVideo(String title);
		
	//에피소드 삭제
	public int deleteEpisode(String title);
	
	//업데이트 대상 목록 조회
	public AdminContentVO getContent(String title);
	
	//컨텐츠 업데이트
	public int updateContent(AdminContentVO vo);
	
	//줄거리 업데이트
	public int updatePlot(AdminContentVO vo);
}
