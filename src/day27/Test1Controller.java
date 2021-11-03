package day27;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bwf.entity.User;
import com.bwf.service.IUserService;

@RestController
public class Test1Controller {

	@Resource
	private IUserService userService;
	
	@RequestMapping("test1")
	public void test1() {
		
		System.out.println("boot2 test1.........");
		userService.show1();
		
	}
	
	@RequestMapping("test2")
	public String test2() {
		
		System.out.println("boot2 test2.........");
		userService.show1();
		
		return "ok";
		
	}
	
	
	@RequestMapping("test3")
	public List test3() {
		
		System.out.println("boot2 test3.........");
		userService.show1();
		List list=new ArrayList();
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");
		
		return list;
		
	}
	
	
	@RequestMapping("test4")
	public User test4() {
		
		System.out.println("boot2 test4.........");
		userService.show1();
		User u=new User();
		u.setId(100);
		u.setName("zhaoliu");
		System.out.println(u);
		
		return u;
		
	}
	
	
	@RequestMapping("test5")
	public void test5(String name) {
		
		System.out.println("boot2 test5.........");
		System.out.println("来自客户端的参数："+name);
		userService.show1();
		
	}
	
	@RequestMapping("test6")
	public void test6(@RequestParam("list") List list) {
		
		System.out.println("boot2 test6.........");
		System.out.println("来自客户端的参数："+list);
		userService.show1();
		
	}
	
	
	@RequestMapping("test7")
	public void test7(@RequestBody User user) {
		
		System.out.println("boot2 test7.........");
		System.out.println("来自客户端的参数："+user+user.getName());
		userService.show1();
		
	}
	
}
