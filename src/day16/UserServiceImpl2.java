package day16;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl2 implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public void show(String name) {


		User6 user= userDao.findByName(name);
		user.setName(user.getName().toUpperCase()+"-博为峰");
		System.out.println(user.getName());

	}

}
