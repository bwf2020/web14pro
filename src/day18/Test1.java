package day18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {


		 ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"}) ;
		 
		/* UserMapper userMapper= context.getBean(UserMapper.class);
		 System.out.println(userMapper);
		 
		 User user=new User();
		 user.setId(8);
		 user.setName("wangwu");
		 userMapper.save(user);
		 
		 System.out.println(1/0);
		 
		 user.setId(9);
		 user.setName("wangwu2");
		 userMapper.save(user);
*/
		 
		 	//通过业务层调用，不要直接调用dao层
		 
		 IUserService userService=context.getBean("userService",IUserService.class);
		 
		 System.out.println(userService);
		 
		 User user=new User();
		 user.setId(8);
		 user.setName("wangwu");
		 
		 userService.reg(user);
		 
	}

}
