package day23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bwf.proj1.UserService;

@Controller
@RequestMapping(path="a/")
public class Test2Controller {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("test1")
	public String test1(String img) {
		
		userService.show();
		
		return "test2";
	}
	
	
	
	
	

}
