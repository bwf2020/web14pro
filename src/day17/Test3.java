package day17;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {


	 ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"}) ;
	
	 IUserService userService=context.getBean("userService", IUserService.class);
	 
	 System.out.println(userService);
	 userService.show();
	 
	 userService.show2();
	 
	 System.out.println("===============");
	 
	 IDogService dogService=context.getBean("dogService",IDogService.class);
	 dogService.m1();
	 
	}

}
