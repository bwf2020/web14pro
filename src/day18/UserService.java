package day18;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

	
	@Resource
	private UserMapper userMapper;
	
	
	@Override
	public void reg(User user) {


		 System.out.println(userMapper);
		
		 user.setId(8);
		 user.setName("wangwu");
		 userMapper.save(user);
		 
		 System.out.println(1/0);
		 
		 user.setId(9);
		 user.setName("wangwu2");
		 userMapper.save(user);
		

	}

}
