package day18;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;


public interface UserMapper {

	
	
	public void save(User user);
	
	
}
