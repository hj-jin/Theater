package poly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.NoticeDTO;
import poly.persistance.mapper.NoticeMapper;
import poly.service.INoticeService;

@Service("NoticeService")
public class NoticeService implements INoticeService{
	
	@Resource(name="NoticeMapper")
	private NoticeMapper noticeMapper;

	@Override
	public int insertNotice(NoticeDTO nDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.insertNotice(nDTO);
	}

	@Override
	public List<NoticeDTO> getnoticeList() throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.getnoticeList();
	}

	@Override
	public NoticeDTO getNoticeDetail(NoticeDTO nDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.getNoticeDetail(nDTO);
	}

	@Override
	public int updateNotice(NoticeDTO nDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.updateNotice(nDTO);
	}

	@Override
	public int deleteNotice(NoticeDTO nDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.deleteNotice(nDTO);
	}

	@Override
	public int insertReNotice(NoticeDTO nDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.insertReNotice(nDTO);
	}

	@Override
	public List<NoticeDTO> getReList(NoticeDTO nDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.getReList(nDTO);
	}

	@Override
	public NoticeDTO getUpReple(NoticeDTO rDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.getUpReple(rDTO);
	}
	
}
