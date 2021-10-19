package day16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {


	 ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"}) ;
	
	 User5 u1=context.getBean(User5.class);
	 System.out.println(u1);
	 System.out.println(u1.getDog());
	 
	
	 
	 
	
	}

}
