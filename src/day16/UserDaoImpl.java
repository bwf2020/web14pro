package day16;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao{

	@Override
	public User6 findByName(String name) {
		
		User6 u=new User6();
		u.setName(name);
		
		return u;
	}

	
	
}
