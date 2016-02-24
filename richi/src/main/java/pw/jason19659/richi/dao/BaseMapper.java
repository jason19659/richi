/**
 * 
 */
package pw.jason19659.richi.dao;

import java.util.List;

import pw.jason19659.richi.model.Level;

/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.dao
 *
 * 2016年2月24日
 */
public interface BaseMapper<T> {
	int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
    
}
