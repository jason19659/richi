/**
 * 
 */
package pw.jason19659.richi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pw.jason19659.richi.dao.BaseMapper;
import pw.jason19659.richi.model.Level;
import pw.jason19659.richi.service.BaseService;

/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.service.impl
 *
 * 2016年2月24日
 */
public class BaseServiceImpl<T> implements BaseService<T>{
	
	@Autowired
	private BaseMapper<T> baseMapper;
	/* 
	 * @see pw.jason19659.richi.service.BaseService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return baseMapper.deleteByPrimaryKey(id);
	}

	/* 
	 * @see pw.jason19659.richi.service.BaseService#insert(pw.jason19659.richi.model.Level)
	 */
	@Override
	public int insert(T record) {
		return baseMapper.insert(record);
	}

	/* 
	 * @see pw.jason19659.richi.service.BaseService#insertSelective(pw.jason19659.richi.model.Level)
	 */
	@Override
	public int insertSelective(T record) {
		return baseMapper.insertSelective(record);
	}

	/* 
	 * @see pw.jason19659.richi.service.BaseService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public T selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.selectByPrimaryKey(id);
	}

	/* 
	 * @see pw.jason19659.richi.service.BaseService#updateByPrimaryKeySelective(pw.jason19659.richi.model.Level)
	 */
	@Override
	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return baseMapper.updateByPrimaryKeySelective(record);
	}

	/* 
	 * @see pw.jason19659.richi.service.BaseService#updateByPrimaryKey(pw.jason19659.richi.model.Level)
	 */
	@Override
	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return baseMapper.updateByPrimaryKey(record);
	}

}
