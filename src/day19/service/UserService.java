package day19.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import day19.dao.IUserDao;
import day19.mapper.UserMapper;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Transactional
	public void reg() {

		System.out.println("处理一些保存的业务");
		userDao.save();
		userMapper.save();

	}

}
