package day25;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bwf.entity.User;
import com.bwf.mapper.UserMapper;
import com.bwf.service.IUserService;

@Controller
@RequestMapping(path="b/")
public class Test2Controller {
	
	@Resource
	private IUserService userService;
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;
	
	@Resource
	private RedisTemplate<Object,Object> reidsTemplate;
	
	
	@RequestMapping("test1")
	@ResponseBody
	public String test1() {
		
		System.out.println("b test1............");
		return "test1";
	}
	
	
	@RequestMapping("test2")
	public String test2() {
		
		System.out.println("b test2............");
		//return "redirect:/test1.jsp";
		return "forward:/test1.jsp";
	}
	
	
	@RequestMapping("test3")
	public String test3() {
		
		System.out.println("b test3............");
		return "test1";
	}

	
	@RequestMapping("test4")
	public ModelAndView test4() {
		
		System.out.println("b test4............");
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "51testing博为峰");
		mv.setViewName("index");
		
		return mv;
		
	}
	
	@RequestMapping("test5")
	public String test5(User user) {
		
		userService.reg(user);
		return "test1";
	}
	
	@RequestMapping("test6")
	public String test6() {
		
		Set keys= stringRedisTemplate.keys("*");
		System.out.println(keys.size());
		System.out.println("操作redis");
		String a= stringRedisTemplate.boundValueOps("a").get();
		System.out.println(a);
		a=stringRedisTemplate.opsForValue().get("b");
		System.out.println(a);
		return "test1";
	}
	
	
	@RequestMapping("test7")
	public String test7(User user) {
		stringRedisTemplate.opsForValue().set("c","C");
		System.out.println(user);
		System.out.println(user.getName());
		reidsTemplate.opsForValue().set("u1", user);
		return "test1";
	}
	
	
	@RequestMapping("test8")
	public String test8() {
	
		User u1= (User) reidsTemplate.opsForValue().get("u1");
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		
		return "test1";
	}
	

}
