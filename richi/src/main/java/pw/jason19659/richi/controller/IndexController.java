/**a
 * 
 */
package pw.jason19659.richi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pw.jason19659.richi.model.Level;
import pw.jason19659.richi.service.LevelService;


/**
 * @author <a href="mailto:ziywang@cisco.com">Jason</a>
 *
 * pw.jason19659.richi.controller
 *
 * 2016年2月24日
 */
@Controller
public class IndexController {
	@Autowired
	private LevelService levelService;
	
	@ResponseBody
	@RequestMapping("/index")
	public Level index() {
		return levelService.selectByPrimaryKey(1); 
	}
	
	@RequestMapping("/addUser")
	public String jumpToAddUser() {
		return "addUser";
	}
}
