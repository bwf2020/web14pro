package day26;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwf.entity.User;

@RestController
@RequestMapping(path="d/")
/*@CrossOrigin(origins="*")*/
public class Test4Controller {

	
	@RequestMapping("test1")
	public User test1(User user) {
		
		return user;
	}
	
	@RequestMapping("test2")
	public String test2() {
		
		return "vue boot1";
	}
	
	
}
