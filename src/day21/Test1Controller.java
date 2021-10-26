package day21;

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
	
}
