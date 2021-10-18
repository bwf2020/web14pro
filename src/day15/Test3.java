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

public class Test3 {

	public static void main(String[] args) throws  Exception {


		SqlSession session=null;
		SqlSessionFactory ssf=null;
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		
		InputStream in=Resources.getResourceAsStream("mybatis.cfg.xml");
		ssf=ssfb.build(in);
		
		session=ssf.openSession();
		
		User u1=session.selectOne("find1",1);
		
		System.out.println(u1);
		System.out.println(u1.getName());
			
		
		/*Thread.sleep(20000);
		session.clearCache();
		*/
		
		User u2=session.selectOne("find1",1);
			
		System.out.println(u2);
		System.out.println(u2.getName());
		
		
		session.commit();	
		session.close();
		
		
		//再次打开session
		session=ssf.openSession();
		u1=session.selectOne("find1",1);
		
		System.out.println(u1);
		System.out.println(u1.getName());
		
		System.out.println("===============");
		
		User u=session.selectOne("find2", 1);
		
		System.out.println(u.getName());
		System.out.println(u.getTelList());
		
		System.out.println("======end=========");
		
		User u3=session.selectOne("find3", 1);
		System.out.println(u3.getName());
		System.out.println(u3.getTelList());
		
		
		session.commit();		
		session.close();
	}

}
