package poly.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import poly.dto.NoticeDTO;
import poly.dto.UserDTO;
import poly.service.INoticeService;
import poly.util.CmmUtil;

/*
 * Controller 선언해야만 Spring 프레임워크에서 Controller인지 인식 가능
 * 자바 서블릿 역할 수행
 * */
@Controller
public class NoticeController {
	private Logger log = Logger.getLogger(this.getClass());
	
	/*
	 * 비즈니스 로직(중요 로직을 수행하기 위해 사용되는 서비스를 메모리에 적재(싱글톤패턴 적용됨)
	 * */
	@Resource(name = "NoticeService")
	private INoticeService noticeService;
	
	/*
	 * 함수명 위의 value="notice/NoticeList" => /notice/NoticeList.do로 호출되는 url은 무조건 이 함수가 실행된다.
	 * method=RequestMethod.GET => 폼 전송방법을 지정하는 것으로 get방식은 GET, post방식은 POST이다.
	 * method => 기입안하면 GET, POST 모두 가능하나, 가급적 적어주는 것이 좋다.
	 * */
	
	@RequestMapping(value="main")
	public String main(HttpServletRequest request, HttpServletResponse response, Model model, HttpSession session) throws Exception{
		
		String URL = "http://ticket.interpark.com/DramaIndex.asp";
		
		//2.html 가져오기
		Document doc = Jsoup.connect(URL).get();// jsoup 얻어온 경과 html 전체 문서

		//3.가져온 html 확인하기
		//System.out.println(doc.data());
		//System.out.println("===================");
		//System.out.println(doc.body().getElementsByClass("Con_ST"));
		//System.out.println(doc.toString().length());
		// System.out.println("test : " +doc.body().getElementsByClass("root").text());

		// 상세 2327줄 title="Forum"
		Elements elem = doc.select(".Con_ST"); 
		//System.out.println("++++++++++");
		//System.out.println(elem);
		
		model.addAttribute("elem",elem.html());
		
		elem =null;
		// connection : jsoup의 connect 혹은 설정 메소드들을 이용해 만들어지는 객체 . 연결을 하기 위한 정보를 담고 있다 .
		// response : jsoup가 url에 접속해 얻어온 경과 . Document와 다르게 status코드 , status 메시지나
		// charset 같은 메시지와 쿠기등을 가지고 있다.

		// Jsoup로 하는 작업은 크게 보았을 때 Connection 객체를 통해 URL에 접속하고(혹은 로컬 파일/문자열), Response
		// 객체에서 세션ID같은 쿠키와
		// HTML Document를 얻어낸 후,Document의 Element들을 파싱하는 과정으로 나누어진다고 볼 수 있다.
		System.out.println("main");
		return "/index";
	}
	
	//공지사항 글쓰기 화면
	@RequestMapping(value="notice/noticeWrite")
	public String noticeReg (HttpServletRequest request , Model model) throws Exception{
		log.info(this.getClass() + " NoticeReg start ");
		log.info(this.getClass() + " NoticeReg end ");
		return "/notice/noticeWrite";
	}
	
	//공지사항 insert
	@RequestMapping(value="notice/noticeWrieteProc")
	public String noticeWriteProc(HttpServletRequest request ,Model model) throws Exception{
		log.info(this.getClass() + " noticeWriteProc start ");
		String userSeq = CmmUtil.nvl(request.getParameter("userSeq"));
		log.info("userSeq : " + userSeq);
		String title = CmmUtil.nvl(request.getParameter("title"));
		log.info("title : " + title);
		String content = CmmUtil.nvl(request.getParameter("content"));
		log.info("content : " +content);
		
		NoticeDTO nDTO = new NoticeDTO();
		nDTO.setUserSeq(userSeq);
		nDTO.setTitle(title);
		nDTO.setContent(content);

		int result = noticeService.insertNotice(nDTO);
		log.info("result : " + result);
		
		String msg="";
		String url="";
		
		if(result == 1 ) {
			msg="글 등록 성공";
			url="/main.do";
		}else {
			msg="글 등록 실패";
			url="/main.do";
		}
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		msg=null;
		url=null;
		nDTO=null;
		result = 0;
		
		log.info(this.getClass() + " noticeWriteProc end ");
		return "/alert";
	}
	
	 //게시판 리스트 보여주기
	 
	@RequestMapping(value="notice/noticeList")
	public String NoticeList(HttpServletRequest request, HttpServletResponse response, 
			ModelMap model) throws Exception {
		
		//로그 찍기(추후 찍은 로그를 통해 이 함수에 접근했는지 파악하기 용이하다.)
		log.info(this.getClass().getName() + ".noticeList start!");
		
		//공지사항 리스트 가져오기
		List<NoticeDTO> nList = noticeService.getnoticeList();
		
		if (nList==null){
			nList = new ArrayList<NoticeDTO>();
			
		}
		
		//조회된 리스트 결과값 넣어주기
		model.addAttribute("nList", nList);
		
		//변수 초기화(메모리 효율화 시키기 위해 사용함)
		nList = null;
		
		//로그 찍기(추후 찍은 로그를 통해 이 함수 호출이 끝났는지 파악하기 용이하다.)
		log.info(this.getClass().getName() + ".noticeList end!");
		
		//함수 처리가 끝나고 보여줄 JSP 파일명(/WEB-INF/view/notice/NoticeList.jsp) 
		return "/notice/noticeList";
	}
	//공지사항 상세보기
	@RequestMapping(value="notice/noticeDetail", method=RequestMethod.GET)
	public String noticeDetail (HttpServletRequest request , Model model) throws Exception{
		log.info(this.getClass() + ".noticeDetail start ");
		String noticeSeq = CmmUtil.nvl(request.getParameter("noticeSeq"));
		log.info("noticeSeq : " + noticeSeq);
		
		NoticeDTO nDTO = new NoticeDTO();
		nDTO.setNoticeSeq(noticeSeq);
		
		nDTO = noticeService.getNoticeDetail(nDTO);
		log.info("nDTO : " + nDTO.getContent());
		
		List<NoticeDTO> rList = noticeService.getReList(nDTO);
		for(int i=0; i < rList.size(); i++) {
			System.out.println("rList : " + i + rList.get(i).getNoticeSeq());
			System.out.println("rList : " + i + rList.get(i).getReNoticeSeq());
			System.out.println("rList : " + i + rList.get(i).getReNotice());
			System.out.println("rList : " + i + rList.get(i).getUpdDate());
			System.out.println("rList : " + i + rList.get(i).getUpdNo());
			System.out.println("=============================");
			
		}
		
		model.addAttribute("nDTO",nDTO);
		model.addAttribute("rList",rList);
		
		nDTO = null;
		
		log.info(this.getClass() + ".noticeDetail end ");
		return "/notice/noticeDetail";
	}
	//공지사항 수정화면 
	@RequestMapping(value="notice/noticeUpdateView", method=RequestMethod.GET)
	public String noticeUpdateView (HttpServletRequest request, Model model) throws Exception{
		log.info(this.getClass() + ".noticeUpdateView start ");
		String noticeSeq = CmmUtil.nvl(request.getParameter("noticeSeq"));
		log.info("noticeSeq : " + noticeSeq);
		
		NoticeDTO nDTO = new NoticeDTO();
		nDTO.setNoticeSeq(noticeSeq); 
		
		nDTO = noticeService.getNoticeDetail(nDTO);
		log.info("nDTO : " + nDTO.getContent());
		
		model.addAttribute("nDTO",nDTO);
		
		nDTO =null;
		
		log.info(this.getClass() + ".noticeUpdateView end ");
		return "/notice/noticeUpdateView";
	}
	
	//공지사항 수정 UPDATE
	@RequestMapping(value="notice/noticeUpdate",method=RequestMethod.POST)
	public String noticeUpdate(HttpServletRequest request, Model model) throws Exception{
		log.info(this.getClass() + ".noticeUpdate start ");
		String userSeq = CmmUtil.nvl(request.getParameter("userSeq"));
		log.info("userSeq : " + userSeq);
		String noticeSeq = CmmUtil.nvl(request.getParameter("noticeSeq"));
		log.info("noticeSeq : " + noticeSeq);
		String title = CmmUtil.nvl(request.getParameter("title"));
		log.info("title : " + title);
		String content = CmmUtil.nvl(request.getParameter("content"));
		log.info("content : " +content);
		
		NoticeDTO nDTO = new NoticeDTO();
		nDTO.setUserSeq(userSeq);
		nDTO.setNoticeSeq(noticeSeq);
		nDTO.setTitle(title);
		nDTO.setContent(content);

		int result = noticeService.updateNotice(nDTO);
		log.info("result : " + result);
		
		String msg="";
		String url="";
		
		if(result == 1 ) {
			msg="글 수정 성공";
			url="/notice/noticeList.do";
		}else {
			msg="글 수정 실패";
			url="/main.do";
		}
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		msg=null;
		url=null;
		nDTO=null;
		result = 0;
		
		
		log.info(this.getClass() + ".noticeUpdate end ");
		return "/alert";
	}
	
	//공지사항 삭제 delete
	@RequestMapping(value="notice/noticeDelete",method=RequestMethod.GET)
	public String noticeDelete (HttpServletRequest request, Model model)throws Exception{
		log.info(this.getClass() + ".noticeDelete start");
		String noticeSeq = CmmUtil.nvl(request.getParameter("noticeSeq"));
		log.info("noticeSeq : " + noticeSeq);
		
		
		NoticeDTO nDTO = new NoticeDTO();
		nDTO.setNoticeSeq(noticeSeq);
		log.info("nDTO.set : " + nDTO.getNoticeSeq());
		
		int result = noticeService.deleteNotice(nDTO);
		log.info("result : " + result);
		
		String msg = "";
		String url = "";
		
		if(result == 1) {
			msg="삭제성공";
			url="/notice/noticeList.do";
		}else {
			msg="삭제실패";
			url="/main.do";
		}
		
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		msg = null;
		url = null;
		
		
		log.info(this.getClass() + ".noticeDelete end");
		return "/alert";
	}
	//review insert
	@RequestMapping(value="notice/reNoticeReg")
	public @ResponseBody List<NoticeDTO> reNotice (HttpServletRequest request) throws Exception{
		log.info(this.getClass() + ".reNoticeReg start ");
		String reNotice = request.getParameter("reNotice");
		log.info("reNotice : " + reNotice);
		String noticeSeq = request.getParameter("noticeSeq");
		log.info("noticeSeq : " + noticeSeq);
		String userSeq = request.getParameter("userSeq");
		log.info("userSeq : " + userSeq);
		
		NoticeDTO nDTO = new NoticeDTO();
		nDTO.setReNotice(reNotice);//댓글 내용
		nDTO.setUserSeq(userSeq);//작성자
		nDTO.setNoticeSeq(noticeSeq);//공지사항번호
		
		int result = noticeService.insertReNotice(nDTO);
		log.info("result : " + result);
		
		List<NoticeDTO> rList = noticeService.getReList(nDTO);
		for(int i=0; i < rList.size(); i++) {
			System.out.println("rList : " + i + rList.get(i).getNoticeSeq());
			System.out.println("rList : " + i + rList.get(i).getReNoticeSeq());
			System.out.println("rList : " + i + rList.get(i).getReNotice());
			System.out.println("rList : " + i + rList.get(i).getUpdDate());
			System.out.println("rList : " + i + rList.get(i).getUpdNo());
			System.out.println("=============================");
			
		}
		
		log.info(this.getClass() + ".reNoticeReg end ");
		return rList;
	}
	//리뷰 업데이트 뷰
	@RequestMapping(value="notice/upReple")
	public @ResponseBody NoticeDTO upReple (HttpServletRequest request) throws Exception{
		log.info("UpReple start ");
		String reNoticeSeq = CmmUtil.nvl(request.getParameter("repleSeq"));
		log.info("reNoticeSeq  : " + reNoticeSeq);
		
		NoticeDTO rDTO = new NoticeDTO();
		rDTO.setReNoticeSeq(reNoticeSeq);
		
		rDTO =noticeService.getUpReple(rDTO);
		
		log.info("rDTO get repleSeq: " + rDTO.getReNoticeSeq());
		log.info("rDTO get userSeq: " + rDTO.getUpdNo());
		log.info("rDTO get content : " + rDTO.getReNotice());
		log.info("rDTO get regDate : " + rDTO.getUpdDate());
		
		
		log.info( "upReple end !!!");
		return rDTO;
	}
	
	
}
