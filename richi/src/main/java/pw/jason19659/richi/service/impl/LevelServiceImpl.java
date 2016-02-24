/**
 * 
 */
package pw.jason19659.richi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pw.jason19659.richi.dao.LevelMapper;
import pw.jason19659.richi.model.Level;
import pw.jason19659.richi.service.LevelService;

/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.service.impl
 *
 * 2016年2月24日
 */
@Service
public class LevelServiceImpl extends BaseServiceImpl<Level> implements LevelService {

	@Autowired
	private LevelMapper levelMapper;
	@Override
	public List<Level> selectAll() {
		return levelMapper.selectAll();
	}
	

}
