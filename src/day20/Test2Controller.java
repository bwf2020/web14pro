package day20;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.multi.MultiListUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("b/")
public class Test2Controller {

	
	@RequestMapping("test1")
	public String test1(String name,String img) {
		
		System.out.println("================");
		System.out.println(name);
		System.out.println(img);
		return "test1";
	}
	
	
	@RequestMapping("test2")
	public String test2(HttpServletRequest request) {
		
		System.out.println("================");
		//重写对请求的对象封装 request
		
		MultipartResolver mr=new CommonsMultipartResolver();
		MultipartHttpServletRequest mrequest= mr.resolveMultipart(request);
		
		String name=mrequest.getParameter("name");
		System.out.println(name);
		
		MultipartFile mf= mrequest.getFile("img");
		//把文件保存到硬盘中
		//String pathName=application.getRealPath("/");
		//System.out.println(pathName);
		String pathName="C:\\myfiles\\a.jpg";
		File file=new File(pathName);
		try {
			
			mf.transferTo(file);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "test1";
	}
	
	
	
	

	@RequestMapping("test3")
	public String test3(User user,MultipartFile mf) {
		
		System.out.println("================");

		System.out.println(user.getName());

		String pathName="C:\\myfiles\\a.jpg";
		File file=new File(pathName);
		try {
			
			mf.transferTo(file);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "test1";
	}
	
}
