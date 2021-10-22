package day19;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.apache.regexp.internal.recompile;

@Controller
@RequestMapping(path="b")
public class Test2Controller {
	
	
	@RequestMapping("test1")
	public void test1(@RequestParam String name) {
		
		System.out.println("b  test1....................");
		System.out.println(name);
		
	}
	
	
	@RequestMapping("test2")
	public void test2(@RequestParam(value="id",required=false,defaultValue="0") int id) {
		
		System.out.println("b  test2....................");
		System.out.println(id);
		
	}
	
	@RequestMapping("test3")
	public void test3(@RequestParam Integer id) {
		
		System.out.println("b  test3....................");
		System.out.println(id);
		
	}
	
	@RequestMapping("test4")
	public void test4(@RequestParam(required=false,defaultValue="BWF") String name) {
		
		System.out.println("b  test4....................");
		System.out.println(name);
		
		
	}
	
	@RequestMapping("test5")
	public void test5(User user) {
		
		System.out.println("b  test5....................");
		System.out.println(user);
		System.out.println(user.getId());
		System.out.println(user.getName());
		
	}
	
	
	@RequestMapping("test6")
	public void test6(User user) {
		
		System.out.println("b  test6....................");
		System.out.println(user);
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getDog());
		System.out.println(user.getDog().getName());
	}
	
	
	@RequestMapping("test7")
	public void test7(@RequestParam List list) {
		
		
		System.out.println("b  test7....................");
		System.out.println(list);
		System.out.println(list.size());
		
	}
	
	

	@RequestMapping("test8")
	public void test8(@RequestParam Set set) {
		
		
		System.out.println("b  test8....................");
		System.out.println(set);
		System.out.println(set.size());
		
	}
	
	@RequestMapping("test9")
	public void test9(@RequestParam Map map) {
		
		
		System.out.println("b  test9....................");
		System.out.println(map);
		map.put("a", "AAAAAA");

		
	}
	
	@RequestMapping("test10")
	public void test10(@DateTimeFormat(pattern="yyyy-MM-dd") Date date) {
		
		
		System.out.println("b  test10....................");
		System.out.println(date);
		
	}
	
	@RequestMapping("add/{id}/{name}")
	public void test11(@PathVariable("name") String name,@PathVariable("id")Integer id) {
		
		System.out.println("b  test11....................");
		System.out.println(name);
		System.out.println(id);
	}
	
	@RequestMapping("test12")
	public ModelAndView test12(@RequestParam Map map) {
		
		
		System.out.println("b  test12....................");
		System.out.println(map);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/test9");
		mv.addObject("map",map);
		mv.addObject("name", "bwf");
		mv.addAllObjects(map);//=>mv.addObject("a", "AA");mv.addObject("b", "BB");
		
		return mv;
		

		
	}
	

}
