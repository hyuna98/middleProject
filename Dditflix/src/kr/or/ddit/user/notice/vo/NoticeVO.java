package kr.or.ddit.user.notice.vo;

public class NoticeVO {
	private String noticeId;
	private String noticeTitle;
	private String noticeRgsDate;	// 등록일
	private String noticeContent;
	private String managerId;
	private String noticeMod;	// 수정일
	private String noticeDelDate;	// 삭제일
	
	
	
	public String getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeRgsDate() {
		return noticeRgsDate;
	}
	public void setNoticeRgsDate(String noticeRgsDate) {
		this.noticeRgsDate = noticeRgsDate;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getNoticeMod() {
		return noticeMod;
	}
	public void setNoticeMod(String noticeMod) {
		this.noticeMod = noticeMod;
	}
	public String getNoticeDelDate() {
		return noticeDelDate;
	}
	public void setNoticeDelDate(String noticeDelDate) {
		this.noticeDelDate = noticeDelDate;
	}
	
	
}
