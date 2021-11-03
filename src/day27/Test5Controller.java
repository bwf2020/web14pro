package day27;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwf.entity.User;

@RestController
@RequestMapping(path="e/")

public class Test5Controller {


	
	@RequestMapping("test1")
	public String test1(String name) {
		
		return "e vue boot1:"+name;
	}
	
	
}
