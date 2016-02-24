/**
 * 
 */
package pw.jason19659.richi.controller.api;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pw.jason19659.richi.dto.UserDto;
import pw.jason19659.richi.model.Level;
import pw.jason19659.richi.model.User;
import pw.jason19659.richi.service.LevelService;
import pw.jason19659.richi.service.UserService;

/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.controller.api
 *
 * 2016年2月24日
 */
@Controller
@RequestMapping("/api")
public class InfoController {
	@Autowired
	private UserService userService;
	@Autowired
	private LevelService levelService;
	
	@RequestMapping("/users")
	@ResponseBody
	public List<UserDto> getAllUsers() throws IllegalAccessException, InvocationTargetException {
		List<Level> levels = levelService.selectAll();
		Map<Integer, Level> levelMap = new HashMap<Integer, Level>();
		for (Level level : levels) {
			levelMap.put(level.getId(), level);
		}
		List<UserDto> userDtos = new ArrayList<UserDto>();
		for (User user :userService.selectAll()) {
			UserDto userDto = new UserDto();
			BeanUtils.copyProperties(userDto, user);
			userDto.setLevelName(levelMap.get(user.getLevelId()).getName());
			userDtos.add(userDto);
		}
		return userDtos;
	}
}
