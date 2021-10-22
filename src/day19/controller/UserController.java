package day19.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import day19.service.IUserService;

@Controller
@RequestMapping(path="user")
public class UserController {

	@Resource
	private IUserService userService;
	
	@RequestMapping("add")
	public String add() {
		
		System.out.println("接受客户端的请求");
		System.out.println(userService);
		userService.reg();
		
		return "success";
	}
	
}
