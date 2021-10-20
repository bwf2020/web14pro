package day16;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;


	@Override
	public void show(String name) {

		
		User6 u= userDao.findByName(name);
		u.setName(u.getName().toUpperCase());
		
		System.out.println(u.getName());

		
	}

}
