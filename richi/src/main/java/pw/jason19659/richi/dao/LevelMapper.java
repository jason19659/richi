package pw.jason19659.richi.dao;

import java.util.List;

import pw.jason19659.richi.model.Level;

public interface LevelMapper extends BaseMapper<Level>{
    int deleteByPrimaryKey(Integer id);

    int insert(Level record);

    int insertSelective(Level record);

    Level selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);
    
    List<Level> selectAll();
}