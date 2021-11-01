package day25;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwf.entity.User;
import com.bwf.mapper.UserMapper;

@Service
public class UserService implements IUserService {

	
	@Resource
	private UserMapper userMapper;
	
	@Override
	@Transactional
	public void reg(User user) {


		System.out.println(userMapper);
		userMapper.save(user);
		
		user.setId(user.getId()+1);
		user.setName(user.getName().toUpperCase());
		
		System.out.println(1/0);
		
		userMapper.save(user);
		
	}

}
