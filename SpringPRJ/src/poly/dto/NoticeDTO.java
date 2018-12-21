package poly.dto;

/**
 * @author 이협건
 * @version 1.1 공지사항 DTO
 */
public class NoticeDTO {

	private String noticeSeq; // 기본키, 순번
	private String title; // 제목
	private String noticeYn; // 공지글 여부
	private String content; // 글 내용
	private String userSeq; // 작성자
	private String cnt; // 조회수
	private String regNo; // 등록자 아이디
	private String regDate; // 등록일
	private String updNo; // 수정자 아이디
	private String updDate; // 수정일
	
	private String reNoticeSeq; // 댓글 번호
	private String reNotice; //댓글 내용
	
	
	
	public String getReNoticeSeq() {
		return reNoticeSeq;
	}
	public void setReNoticeSeq(String reNoticeSeq) {
		this.reNoticeSeq = reNoticeSeq;
	}
	public String getReNotice() {
		return reNotice;
	}
	public void setReNotice(String reNotice) {
		this.reNotice = reNotice;
	}
	public String getNoticeSeq() {
		return noticeSeq;
	}
	public void setNoticeSeq(String noticeSeq) {
		this.noticeSeq = noticeSeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNoticeYn() {
		return noticeYn;
	}
	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(String userSeq) {
		this.userSeq = userSeq;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUpdNo() {
		return updNo;
	}
	public void setUpdNo(String cpdNo) {
		this.updNo = cpdNo;
	}
	public String getUpdDate() {
		return updDate;
	}
	public void setUpdDate(String cpdDate) {
		this.updDate = cpdDate;
	}


	

}
