/**
 * 
 */
package pw.jason19659.richi.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;

import pw.jason19659.richi.dto.Status;
import pw.jason19659.richi.model.User;
import pw.jason19659.richi.service.UserService;

/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.controller
 *
 * 2016年2月24日
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/addUserAction")
	@ResponseBody
	public Status addUser(User user) {
		if (StringUtils.isEmpty(user.getUsername()) || userService.selectByUsername(user.getUsername()) != null) {
			return new Status(Status.FAILED_CODE, "用户名已存在");
		}
		user.setUuid(UUID.randomUUID().toString());
		user.setRole("user");
		user.setPoint(0);
		user.setLevelId(1);
		userService.insert(user);
		return Status.SUCCESSED;
	}
}
