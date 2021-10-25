package day16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {

	 ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"}) ;
	 
	 //主动创建
	 User3 u1=new User3();
	 System.out.println(u1);
	 
	 //是从容器中获取 
	 Object u2=context.getBean("user");
	 System.out.println(u2);
	 
	 
	 User u3=context.getBean(User.class);
	 System.out.println(u3);
	 
	 User3 u4=(User3) context.getBean("user2");
	 System.out.println(u4);
	 System.out.println(u2);
	 
	 User3 u5= context.getBean("user3",User3.class);
	 System.out.println(u5);
	 
	 
	 User3 u5_2= context.getBean("user3",User3.class);
	 System.out.println(u5_2);
	 

	}

}
