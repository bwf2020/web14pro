package day20;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="c/")
public class Test3Controller {

	@RequestMapping("test1")
	public String test1() {
		
		System.out.println("c  test1...................");
		return "test1";
	}
	
	
	@RequestMapping("test2")
	public ModelAndView test2() {
		
		System.out.println("c  test2...................");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test1");
		mv.addObject("name", "bwf");
		
		return mv;
	}
	
	
	@RequestMapping("test3")
	public ModelAndView test3(String name) {
		
		System.out.println("c  test3...................");
		System.out.println("参数："+name);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test1");
		mv.addObject("name", name);
		
		return mv;
	}
	
	@RequestMapping("test4")
	public String test4() {
		
		System.out.println("c  test4...................");
		return "test1";
	}
	
	@RequestMapping("test5")
	public String test5() {
		
		System.out.println("c  test5...................");
		return "test1";
	}
	
	
	@RequestMapping(value="c1/test6")
	public String test6() {
		
		System.out.println("c  test6...................");
		return "test1";
	}
	
	@RequestMapping(value="test67")
	public String test7(HttpServletRequest req,HttpServletResponse resp,HttpSession session) {
		
		System.out.println("c  test7...................");
		System.out.println(req);
		System.out.println(resp);
		System.out.println(session);
		System.out.println(req.getServletContext());
		System.out.println(req.getServletContext().getRealPath("/"));
		return "test1";
	}
}
