package day15;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test2 {

	public static void main(String[] args) throws  Exception {


		SqlSession session=null;
		SqlSessionFactory ssf=null;
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		
		InputStream in=Resources.getResourceAsStream("mybatis.cfg.xml");
		ssf=ssfb.build(in);
		
		session=ssf.openSession();
		
		
		List p1=new ArrayList();
		p1.add(2);
		p1.add(5);
		p1.add(8);
		
		List<User> users= session.selectList("find9", p1);
		System.out.println(users.size());
		
		int[] p2= {2,5,8};
		
		users= session.selectList("find8", p2);
		System.out.println(users.size());
		
		Set p3=new HashSet();
		p3.add(2);
		p3.add(6);
		
		
		users= session.selectList("find9", p3);
		System.out.println(users.size());
		
		
		Map p4=new HashMap();
		p4.put("a", 2);
		p4.put("b", 8);
		
		Map map=new HashMap();
		map.put("map", p4);
		
		users= session.selectList("find10", map);
		System.out.println(users.size());
		
		System.out.println("========================");
		
		Map p5=new HashMap();
		p5.put("name", "'zhangsan' or 1=1 ");
		
		users= session.selectList("find11", p5);
		System.out.println(users.size());
		
		
		System.out.println("========================");
		
		int count= session.selectOne("find12");
		System.out.println(count);
		
		count= session.selectOne("find13");
		System.out.println(count);
		
		
		p5=new HashMap();
		p5.put("tbname", "tel");
		
		count= session.selectOne("find14",p5);
		System.out.println(count);
		
		
		
		
		session.commit();		
		session.close();

	}

}
