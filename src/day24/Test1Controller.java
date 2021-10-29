package day24;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1Controller {
	
	
	@Value("${a}")
	private String a;
	
	@Value("${b}")
	private String b;
	
	@Value("${c}")
	private List c;
	
	@Value("#{${d}}")
	private Map d;
	
	
	
	public Test1Controller() {
		
		System.out.println("Test1Controller被数理化.....................");
		
	}
	
	@RequestMapping("test1")
	@ResponseBody
	public String test1() {
		
		
		System.out.println("test1............");
		
		return "hello springboot"+a+b+c+d+"update";
	}
	

}
