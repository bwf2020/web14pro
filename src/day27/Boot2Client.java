package day27;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bwf.entity.User;

@FeignClient(name="boot2",url="http://localhost:8082/boot2")
public interface Boot2Client {

	@RequestMapping("test1")
	public void test1();
	
	@RequestMapping("test2")
	public String test2();
	
	@RequestMapping("test3")
	public List test3();
	
	@RequestMapping("test4")
	public User test4();
	
	@RequestMapping("test5")
	public void test5(@RequestParam("name") String name);
	
	@RequestMapping("test6")
	public void test6(@RequestParam("list") List<String> list);
	

	@RequestMapping("test7")
	public void test7(@RequestBody  User user);
}
