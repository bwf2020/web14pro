package day15;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test1 {

	public static void main(String[] args) throws  Exception {


		SqlSession session=null;
		SqlSessionFactory ssf=null;
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		
		InputStream in=Resources.getResourceAsStream("mybatis.cfg.xml");
		ssf=ssfb.build(in);
		
		session=ssf.openSession();
		
		List<User> users=session.selectList("find1", "zhangsan");
		
		System.out.println(users.size());
		
		
		users=session.selectList("find2", "1");
		
		System.out.println(users.size());
		
		
		Map map=new HashMap();
		map.put("name", "zhangsan");
		map.put("sex", "1");
		
		
		users=session.selectList("find3", map);
		
		
		System.out.println(users.size());
		
		System.out.println("==================");
		
		
		Map map2=new HashMap();
		map2.put("id", 8);
		//map2.put("name", "bwf");
		map2.put("sex", "1");
		
		users=session.selectList("find", map2);
		System.out.println(users.size());
		
		
		users=session.selectList("find4", map2);
		System.out.println(users.size());
		
		session.update("up", map2);
		
		
		
		Map map3=new HashMap();
		map3.put("name", "zhangsan");
		map3.put("sex", "1");
		map3.put("id", 8);
		users=session.selectList("find5", map3);
		System.out.println(users.size());
		
		session.update("up2", map3);
		
		
		Map map4=new HashMap();
		//map4.put("name", "zhangsan");
		map4.put("sex", "1");
		//map3.put("id", 8);
		users=session.selectList("find6", map4);
		System.out.println(users.size());
		
		
		
		session.commit();		
		session.close();

	}

}
