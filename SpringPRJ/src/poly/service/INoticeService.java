package poly.service;

import java.util.List;

import poly.dto.NoticeDTO;

public interface INoticeService {

	public int insertNotice(NoticeDTO nDTO)throws Exception;

	public List<NoticeDTO> getnoticeList()throws Exception;

	public NoticeDTO getNoticeDetail(NoticeDTO nDTO)throws Exception;

	public int updateNotice(NoticeDTO nDTO)throws Exception;

	public int deleteNotice(NoticeDTO nDTO)throws Exception;

	public int insertReNotice(NoticeDTO nDTO)throws Exception;

	public List<NoticeDTO> getReList(NoticeDTO nDTO)throws Exception;

	public NoticeDTO getUpReple(NoticeDTO rDTO)throws Exception;
	
}
