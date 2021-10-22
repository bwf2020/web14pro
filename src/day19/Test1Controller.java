package day19;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="a/")
public class Test1Controller{

	
	@RequestMapping("test1")
	public void test1() {
		
		
		System.out.println("test1............");
	}
	
	@RequestMapping(value="test2")
	public String test2() {
		
		System.out.println("test2............");
		return "test2";
		
	}
	
	@RequestMapping(value="test3")
	public ModelAndView test3() {
		
		System.out.println("test3............");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test3");
		
		return mv;
	}
	
	@RequestMapping(value="test4",method=RequestMethod.GET)
	public void test4() {
		
		System.out.println("test4 get.......");
		
	}
	
	@RequestMapping(value="test4",method=RequestMethod.POST)
	public void test5() {
		
		System.out.println("test4 post.......");
		
	}
	
	@RequestMapping(value="test4",method=RequestMethod.PUT)
	public void test6() {
		
		System.out.println("test4 put.......");
		
	}
	
	@RequestMapping(value="test4",method=RequestMethod.DELETE)
	public void test7() {
		
		System.out.println("test4 delete.......");
		
	}
	
	@RequestMapping({"test8","test8_1","test8_2"})
	public void test8() {
		
		System.out.println("test8.......");
	}
	
	
	@RequestMapping(value="test9",params="id")
	public void test9() {
		
		System.out.println("test9.......");
	}
	
	@RequestMapping("test10")
	public ModelAndView test10() {
		
		System.out.println("test10......");
		
		//return "index";//走是配置文件中的视图解决方案 /WEB-INF/pages/下的页面
		//不走默认视图配置解决方案了
		
		
		ModelAndView mv=new ModelAndView();
		//转发
		//mv.setViewName("forward:/index.jsp");
		//重定向
		mv.setViewName("redirect:/index.jsp");
		mv.addObject("name", "bwf");
		
		return mv;

		
	}
	
}
