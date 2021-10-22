package day19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test3Controller {

	@RequestMapping("ajax1")
	public void test1(HttpServletRequest req,HttpServletResponse resp) {
		
		System.out.println("test1...............");
		
		PrintWriter out;
		try {
			out = resp.getWriter();
			out.print("hello");
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@RequestMapping("ajax2")
	@ResponseBody
	public String test2() {
		
		System.out.println("test2...............");
		return "bwf2";
	}
	
	
	@RequestMapping("ajax3")
	@ResponseBody
	public User test3() {
		
		System.out.println("test3...............");
		User user=new User();
		user.setId(1);
		user.setName("zhangsan");
		
		return user;
		
	}
}
