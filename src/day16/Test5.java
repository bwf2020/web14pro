package day16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

	public static void main(String[] args) {


	 ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext5.xml"}) ;
	
	UserService userService=context.getBean(UserService.class);
	
	userService.show("bwf");
	
	 
	 
	
	}

}
