package day17;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {


	 ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"}) ;
	
	 UserMapper userMapper=context.getBean(UserMapper.class);
	 System.out.println(userMapper);

	 User2 user=new User2();
	 user.setId(9);
	 user.setName("wangwu");
	 
	 //userMapper.save(user);
	 
	 user=userMapper.find1(2);
	 System.out.println(user.getName());
	 
	 
	 user=userMapper.find2(3,"c");
	 System.out.println(user.getName());
	 
	 
	 user.setId(10);
	 user.setName("zhaoliu");
	 
	 userMapper.save2(user);
	 
	}

}
