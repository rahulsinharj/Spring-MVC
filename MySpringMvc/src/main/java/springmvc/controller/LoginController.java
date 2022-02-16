package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@ResponseBody
	@RequestMapping("/login")
	public String login()
	{
		return "Hello Demo Login !!";
	}
	
	@RequestMapping("/bb")
	public String logintwo()
	{
		return "Hello Demo2 Login !!";
	}
	
	@RequestMapping("/home")
	public String loginthree()
	{
		return "home.html";
	}
}
