package day21;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="a/")
public class Test1Controller {

	
	@RequestMapping("test1")
	public String test1() {
		
		System.out.println("a  test1............");
		
		return "test1";
	}
	
	@RequestMapping("test2")
	public ModelAndView test2() {
		
		System.out.println("a  test2............");
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test1");
		mv.addObject("name", "bwf");
		
		return mv;
	}
	
	
	@RequestMapping("test3")
	public ModelAndView test3() {
		
		System.out.println("a  test3............");
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test1");
		mv.addObject("name", "bwf");
		mv.addObject("id",100);
		
		User user=new User();
		user.setId(1);
		user.setName("51testing");
		
		mv.addObject("user", user);
		
		
		mv.addObject("name2", "<b>bwf</b>");
		
		List list=new ArrayList();
		list.add("zhangsan");
		list.add("lisi");
		
		mv.addObject("list", list);
		
		Map map=new HashMap();
		map.put("a", "A");
		map.put("b", "B");
		mv.addObject("map", map);
		
		
		mv.addObject("num", 3.1415926);
		mv.addObject("date", new Date());
		
		String str1=new String("51testing");
		String str2=new String("bwf");
		
		System.out.println(str1==str2);
		mv.addObject("str1",str1);
		mv.addObject("str2",str2);
		
		
		mv.addObject("flag", false);
		
		mv.addObject("num2", 10);
		
		
		List<User> users=new ArrayList<>();
		User u1=new User();
		u1.setId(1);
		u1.setName("zhangsam");
		
		User u2=new User();
		u2.setId(2);
		u2.setName("lisi");
		
		User u3=new User();
		u3.setId(3);
		u3.setName("wangwu");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		mv.addObject("users", users);
		
		
		mv.addObject("user3", u3);
		
		mv.addObject("title", "新标题");
		
		mv.addObject("color", "green");
		
		
		return mv;
	}
	
}
