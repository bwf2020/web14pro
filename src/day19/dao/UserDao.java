package day19.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao{

	@Override
	public void save() {


		System.out.println("数据库层的保存功能");
		
	}

}
