package day16;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {

	public static void main(String[] args) {


	 ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"}) ;
	
	User7 u1=context.getBean(User7.class);
	System.out.println(u1);
	System.out.println(u1.getName());
	System.out.println(u1.getList());
	System.out.println(u1.getList().size());
	
	for (String i : (List<String>)u1.getList()) {
		System.out.println(i);
	}
	
	 
	 
	
	}

}
