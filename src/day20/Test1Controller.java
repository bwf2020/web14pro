package day20;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("a/")
public class Test1Controller {
	
	
	@RequestMapping("test1")
	public String test1() {
		
		System.out.println("================");
		return "test1";
		
	}
	
	@RequestMapping("test2")
	@ResponseBody
	public User test2() {
		
		System.out.println("================");
		User user=new User();
		user.setId(1);
		user.setName("bwf");
		return user;
		
	}
	
	@RequestMapping("test3")
	@ResponseBody
	public List<User> test3() {
		
		System.out.println("================");
		User user=new User();
		user.setId(1);
		user.setName("bwf");
		
		User user2=new User();
		user2.setId(2);
		user2.setName("51testing");
		
		
		List<User> users=new ArrayList<>();
		users.add(user);
		users.add(user2);
		
		
		return users;
		
	}
	
	
	@RequestMapping("test4")
	@ResponseBody
	public User test4(User user) {
		
		user.setName(user.getName().toUpperCase());
		
		return user;
		
	}

	
	
	@RequestMapping("test5")
	@ResponseBody
	public User test5(@RequestBody User user) {
		
		user.setName(user.getName().toUpperCase());
		
		return user;
		
	}
}
