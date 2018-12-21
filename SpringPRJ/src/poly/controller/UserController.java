package poly.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.sun.java.swing.plaf.motif.resources.motif;

import poly.dto.UserDTO;
import poly.service.IUserService;
import poly.util.CmmUtil;

@Controller
public class UserController {
	
	//로그 찍기
	private Logger log = Logger.getLogger(this.getClass());
	
	//서비스 연결하기 
	@Resource(name="UserService")
	private IUserService userService ;
	
	//로그인 화면
	@RequestMapping(value="user/userLogin")
	public String userLogin () throws Exception{
		log.info(this.getClass() + " userRegView start!!");
		log.info(this.getClass() + " userRegView end");
		return "/user/userLogin";
	}
	
	//회원가입 페이지
	@RequestMapping(value="user/userReg")
	public String userReg () throws Exception{
		log.info(this.getClass() + " userReg Start !!!!");
		log.info(this.getClass() + " userReg end !!!!");
		return "/user/userReg" ;
	}
	
	//회원가입 정보 insert
	@RequestMapping(value="user/userRegProc",method=RequestMethod.POST)
	public String userRegProc (HttpServletRequest request, Model model) throws Exception{
		log.info(this.getClass() + " userRegProc Start !!!");
		
		String email = CmmUtil.nvl(request.getParameter("email"));
		String password = CmmUtil.nvl(request.getParameter("password"));
		String passwordSec = CmmUtil.nvl(request.getParameter("passwordSec")); 
		String name = CmmUtil.nvl(request.getParameter("name"));
		String hp = CmmUtil.nvl(request.getParameter("hp"));
		String birth = CmmUtil.nvl(request.getParameter("birth"));
		String birthSec = CmmUtil.nvl(request.getParameter("birthSec"));
		
		log.info("email : " + email);
		log.info("password : " + password);
		log.info("passwordSec : " + passwordSec);
		log.info("name : " + name);
		log.info("hp : " + hp);
		log.info("birth : " + birth);
		log.info("birthSec : " + birthSec);
		
		UserDTO uDTO = new UserDTO();
		uDTO.setEmail(email);
		uDTO.setPassword(password);
		uDTO.setName(name);
		uDTO.setHp(hp);
		uDTO.setBirth(birth);
		uDTO.setBirthSec(birthSec);
		
		log.info("uDTO set : " + uDTO.getEmail());
		log.info("uDTO set : " + uDTO.getPassword());
		log.info("uDTO set : " + uDTO.getName());
		log.info("uDTO set : " + uDTO.getHp());
		log.info("uDTO set : " + uDTO.getBirth());
		log.info("uDTO set : " + uDTO.getBirthSec());
		
		
		int result = userService.insertUserInfo(uDTO);
		log.info("result : " + result);
		
		String msg ="";
		String url ="";
		if(result == 1 ) {
			msg = "회원가입 성공";
			url = "/main.do";
		}else {
			msg = "회원가입 실패";
			url = "/main.do";
		}
		
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);

		msg = null;
		url = null;
		
		log.info(this.getClass() + " userRegProc end !!!");
		return "/alert";
	}
	
	// 관리자 회원목록 불러오기
	@RequestMapping(value="user/userList")
	public String userList(Model model) throws Exception{
		log.info(this.getClass() + " userList start " );
		
		List<UserDTO> uList = userService.getUserList();
		
		for(int i=0; i < uList.size(); i++) {
			
			log.info("uList seq : " + uList.get(i).getUserSeq());
			log.info("uList email : " + uList.get(i).getEmail());
			log.info("uList name : " + uList.get(i).getName());
			log.info("uList birth : " + uList.get(i).getBirth());
			log.info("uList gender : " + uList.get(i).getBirthSec());
			log.info("uList hp : " + uList.get(i).getHp());
			log.info("uList regdate : " + uList.get(i).getRegDate());
			log.info("=========================");
		}
		
		model.addAttribute("uList",uList);
		
		uList = null;
		log.info(this.getClass() + " userList end " );
		return "/user/userList";
	}
	
	//회원목록 detail
	@RequestMapping(value="user/userDetail", method=RequestMethod.GET)
	public String userDetail (HttpServletRequest request, Model model)throws Exception{
		log.info(this.getClass() + " userDetail start ");
		String userSeq = request.getParameter("userSeq");
		log.info("userSeq : " + userSeq);
		
		UserDTO uDTO = new UserDTO();
		uDTO.setUserSeq(userSeq);
		
		uDTO = userService.getUserDetail(uDTO);
		log.info("uDTO.get : " + uDTO.getUserSeq());
		
		model.addAttribute("uDTO",uDTO);
		
		uDTO = null;
		
		log.info(this.getClass() + " userDetail end ");
		return "/user/userDetail";
	}
	
	//회원정보수정 화면 updateView
	@RequestMapping(value="user/userUpdateView", method=RequestMethod.GET)
	public String userUpdateView (HttpServletRequest request, Model model) throws Exception{
		log.info(this.getClass() + " userUpdateView start ");
		String userSeq = request.getParameter("userSeq");
		log.info("userSeq : " + userSeq);
		
		UserDTO uDTO = new UserDTO();
		uDTO.setUserSeq(userSeq);
		
		uDTO = userService.getUserDetail(uDTO);
		log.info("uDTO.get : " + uDTO.getUserSeq());
		log.info("uDTO.get : " + uDTO.getEmail());
		log.info("uDTO.get : " + uDTO.getName());
		log.info("uDTO.get : " + uDTO.getHp());
		log.info("uDTO.get : " + uDTO.getBirth());
		log.info("uDTO.get : " + uDTO.getPassword());
		
		model.addAttribute("uDTO",uDTO);
		
		uDTO = null;
		log.info(this.getClass() + " userUpdateView end ");
		return "/user/userUpdateView";
	}
	
	//회원정보수정 update
	@RequestMapping(value="user/userUpdate", method=RequestMethod.POST)
	public String userUpdate (HttpServletRequest request, Model model) throws Exception{
		log.info(this.getClass() + "userUpdate start ");
		String userSeq = CmmUtil.nvl(request.getParameter("userSeq"));
		log.info("userSeq : " + userSeq);
		String password = CmmUtil.nvl(request.getParameter("password"));
		log.info("password : " + password);
		String hp = CmmUtil.nvl(request.getParameter("hp"));
		log.info("hp : " + hp);
		String birthSec = CmmUtil.nvl(request.getParameter("birthSec"));
		log.info("gender : " + birthSec);
		String birth = CmmUtil.nvl(request.getParameter("birth"));
		log.info("birth : " + birth);
		
		UserDTO uDTO = new UserDTO();
		uDTO.setUserSeq(userSeq);
		uDTO.setPassword(password);
		uDTO.setHp(hp);
		uDTO.setBirth(birth);
		uDTO.setBirthSec(birthSec);
	
		int result = userService.updateUserInfo(uDTO);
		log.info("result : " + result);
		
		String msg ="";
		String url ="";
		if( result == 1) {
			msg = "수정성공";
			url = "/main.do";
		}else {
			msg = "수정실패";
			url = "/user/userList.do";
		}
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		
		msg = null;
		url = null;
		
		log.info(this.getClass() + "userUpdate end ");
		return "/alert";
	}
	
	//회원 삭제 delete
		@RequestMapping(value="user/deleteUserInfo", method=RequestMethod.GET)
		public String deleteUserInfo (HttpServletRequest request, Model model)throws Exception{
			log.info(this.getClass() + " deleteUserInfo start");
			String userSeq = CmmUtil.nvl(request.getParameter("userSeq"));
			log.info("userSeq : " + userSeq);
			
			UserDTO uDTO = new UserDTO();
			uDTO.setUserSeq(userSeq);
			log.info("uDTO.set : " + uDTO.getUserSeq());
			
			int result = userService.deleteUserInfo(uDTO);
			log.info("result : " + result);
			
			String msg = "";
			String url = "";
			
			if(result == 1) {
				msg="탕퇴성공";
				url="/main.do";
			}else {
				msg="탈퇴실패";
				url="/main.do";
			}
			
			model.addAttribute("msg",msg);
			model.addAttribute("url",url);
			
			msg = null;
			url = null;
			
			log.info(this.getClass() + " deleteUserInfo end");
			return "/alert";
		}
		
		//로그인 
		@RequestMapping(value="user/userLoginProc", method=RequestMethod.POST)
		public String userLoginProc (HttpServletRequest request, Model model, HttpSession session)throws Exception{
			log.info(this.getClass() +  " userLoginProc start ");
			String email = CmmUtil.nvl(request.getParameter("email"));
			log.info("email : " + email);
			String password = CmmUtil.nvl(request.getParameter("password"));
			log.info("password : " + password);
			
			UserDTO uDTO = new UserDTO();
			uDTO.setEmail(email);
			uDTO.setPassword(password);
			
			uDTO = userService.getLogin(uDTO);
			
			if(uDTO != null) {
				//로그인 성공
				log.info("uDTO : " + uDTO.getUserSeq());
				session.setAttribute("userSeq", uDTO.getUserSeq());
				session.setAttribute("email", uDTO.getEmail());
				session.setAttribute("name", uDTO.getName());
				session.setAttribute("hp", uDTO.getHp());
				session.setAttribute("birth", uDTO.getBirth());
				session.setAttribute("gender", uDTO.getBirthSec());
			}else {
				//로그인 실패
				
				String msg="아이디/비밀번호를 확인해주세요";
				String url="/main.do";
				model.addAttribute("msg",msg);
				model.addAttribute("url",url);
				return "/alert";
			}
			
			uDTO = null;
			
			log.info(this.getClass() +  " userLoginProc end ");
			return "redirect:/main.do";
		}
		
		//로그아웃
		@RequestMapping(value="user/Logout")
		public String Logout (HttpSession session) throws Exception{
			log.info(this.getClass() + " Logout start ");
			
			session.invalidate();
			
			log.info(this.getClass() + " Logout end ");
			return "redirect:/main.do";
		}
		
		@RequestMapping(value="user/userInfoFind")
		public String userInfoFind () throws Exception{
			log.info(this.getClass() +".userInfoFind start");

			
			log.info(this.getClass() +".userInfoFind end");
			return "/user/userInfoFind";
		}
		
		//이메일 중복 체크 
		@RequestMapping(value="/user/emailCheck")
		public @ResponseBody String emailCk (HttpServletRequest request) throws Exception{
		log.info("emailCh start ");	
		String email = CmmUtil.nvl(request.getParameter("email"));
		log.info("email : " + email);
		
		UserDTO uDTO = new UserDTO();
		uDTO.setEmail(email);
		
		int rowcount = userService.getEmailCh(uDTO);
		
		log.info("emailCh end ");	
			return String.valueOf(rowcount);
		}
		
		//아이디 찾기
		@RequestMapping(value="/user/userFindEmail")
		public String findEmail(UserDTO uDTO, Model model) throws Exception{
		log.info("FindEmail start " );
		log.info("uDTO.get : " + uDTO.getName());
		log.info("uDTO.get : " + uDTO.getHp());
		
		uDTO = userService.getFindEmail(uDTO);
		//log.info("uDTO.get : " + uDTO.getEmail());
		
		if(uDTO == null) {
			uDTO = new UserDTO();
			String msg = "동일한 정보가 없습니다.";
			String url = "/main.do";
			
			model.addAttribute("msg",msg);
			model.addAttribute("url",url);
			return "/alert";
		}

		model.addAttribute("uDTO",uDTO);
		uDTO = null;
		log.info("FindEmail end" );
		
		return "/user/userFindEmail";
		}
		
		//비밀번호 수정 확인
		@RequestMapping(value="user/userFindPwd")
		public String findPwd (UserDTO uDTO, Model model)throws Exception{
			
			log.info("FindPwd start " );
			log.info("uDTO.set : " + uDTO.getEmail());
			log.info("uDTO.set : " + uDTO.getName());
			log.info("uDTO.set : " + uDTO.getHp());
			
			uDTO = userService.getFindPwd(uDTO);
			//log.info("uDTO.get : " + uDTO.getEmail());
			
			if(uDTO == null) {
				uDTO = new UserDTO();
				String msg = "동일한 정보가 없습니다.";
				String url = "/main.do";
				
				model.addAttribute("msg",msg);
				model.addAttribute("url",url);
				return "/alert";
			}

			model.addAttribute("uDTO",uDTO);
			uDTO = null;
			log.info("FindPwd end" );
			
			return "/user/userFindPwd";
		}
		//비밀번호 수정 
		@RequestMapping(value="user/updatePwd")
		public String updatePwd(UserDTO uDTO, Model model) throws Exception{
			log.info("UpPwd start " );
			log.info("uDTO.set : " + uDTO.getUserSeq());
			log.info("uDTO.set : " + uDTO.getPassword());
			
			int result = userService.UpdatePwd(uDTO);
			log.info("result : " + result);
			
			String msg = "";
			String url = "";

			if(result == 1) {
				msg = "비밀번호 변경 성공";
				
				model.addAttribute("msg",msg);
				model.addAttribute("url",url);
			}else {
				msg ="비밀번호 변경 실패";
			}

			url = "/main.do";

			model.addAttribute("url",url);
			model.addAttribute("msg",msg);
			
			
			log.info("UPPwd end" );
			
			return "/alert";
		}
	
}
