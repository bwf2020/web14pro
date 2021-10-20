package day17;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	
	public void save(User2 user);
	
	public User2 find1(int id);
	
	public User2 find2(@Param("id")int id,@Param("name")String name);
	
	@Insert("insert into user(id,name) values(#{id},#{name})")
	public void save2(User2 user);
	
	
}
