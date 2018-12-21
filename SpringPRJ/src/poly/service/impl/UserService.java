package poly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import poly.dto.UserDTO;
import poly.persistance.mapper.UserMapper;
import poly.service.IUserService;

@Service(value="UserService")
public class UserService implements IUserService {


	@Resource(name="UserMapper")
	private UserMapper userMapper;

	@Override
	public int insertUserInfo(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("insertUserInfo service start ");
		return userMapper.insertUserInfo(uDTO);
		
		
	}

	@Override
	public List<UserDTO> getUserList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("getUserList service start");
		return userMapper.getUserList();
	}

	@Override
	public UserDTO getUserDetail(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("getUserDetail service start");
		return userMapper.getUserDetail(uDTO);
	}

	@Override
	public int updateUserInfo(UserDTO uDTO) throws Exception {
		System.out.println("updateUserInfo service start ");
		return userMapper.updateUserInfo(uDTO);
	}

	@Override
	public int deleteUserInfo(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.deleteUserInfo(uDTO);
	}

	@Override
	public UserDTO getLogin(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getLogin(uDTO);
	}

	@Override
	public int getEmailCh(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getEmailCh(uDTO);
	}

	@Override
	public UserDTO getFindEmail(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getFindEmail(uDTO);
	}

	@Override
	public UserDTO getFindPwd(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.getFindPwd(uDTO);
	}

	@Override
	public int UpdatePwd(UserDTO uDTO) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("service start ");
		return userMapper.UpdatePwd(uDTO);
	}

}
