/**
 * 
 */
package pw.jason19659.richi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pw.jason19659.richi.dao.UserMapper;
import pw.jason19659.richi.model.User;
import pw.jason19659.richi.service.UserService;

/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.service.impl
 *
 * 2016年2月24日
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	/* 
	 * @see pw.jason19659.richi.service.UserService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String uuid) {
		return userMapper.deleteByPrimaryKey(uuid);
	}

	/* 
	 * @see pw.jason19659.richi.service.UserService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public User selectByPrimaryKey(String uuid) {
		return userMapper.selectByPrimaryKey(uuid);
	}

	/* 
	 * @see pw.jason19659.richi.service.UserService#getAllUsersExceptPassword()
	 */
	@Override
	public List<User> selectAll() {
		List<User> users = userMapper.selectAll();
		return users;
	}

	/* 
	 * @see pw.jason19659.richi.service.UserService#selectByUsername(java.lang.String)
	 */
	@Override
	public User selectByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectByUsername(username);
	}

}
