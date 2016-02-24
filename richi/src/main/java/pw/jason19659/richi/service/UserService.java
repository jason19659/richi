package pw.jason19659.richi.service;

import java.util.List;

import pw.jason19659.richi.model.User;

public interface UserService {
    int deleteByPrimaryKey(String uuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAll();
    
    User selectByUsername(String username);
}