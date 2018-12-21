package poly.service;

import java.util.List;

import poly.dto.UserDTO;

public interface IUserService {

	public int insertUserInfo(UserDTO uDTO)throws Exception;

	public List<UserDTO> getUserList()throws Exception;

	public UserDTO getUserDetail(UserDTO uDTO)throws Exception;

	public int updateUserInfo(UserDTO uDTO)throws Exception;

	public int deleteUserInfo(UserDTO uDTO)throws Exception;

	public UserDTO getLogin(UserDTO uDTO)throws Exception;

	public int getEmailCh(UserDTO uDTO)throws Exception;

	public UserDTO getFindEmail(UserDTO uDTO)throws Exception;

	public UserDTO getFindPwd(UserDTO uDTO)throws Exception;

	public int UpdatePwd(UserDTO uDTO)throws Exception;

}
