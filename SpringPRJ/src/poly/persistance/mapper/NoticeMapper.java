package poly.persistance.mapper;

import java.util.List;

import config.Mapper;
import poly.dto.NoticeDTO;

@Mapper("NoticeMapper")
public interface NoticeMapper {

	public int insertNotice(NoticeDTO nDTO)throws Exception;

	public List<NoticeDTO> getnoticeList()throws Exception;

	public NoticeDTO getNoticeDetail(NoticeDTO nDTO)throws Exception;

	public int updateNotice(NoticeDTO nDTO)throws Exception;

	public int deleteNotice(NoticeDTO nDTO)throws Exception;

	public int insertReNotice(NoticeDTO nDTO)throws Exception;

	public List<NoticeDTO> getReList(NoticeDTO nDTO)throws Exception;

	public NoticeDTO getUpReple(NoticeDTO rDTO)throws Exception;

	
}
