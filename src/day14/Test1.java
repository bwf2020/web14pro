package day14;

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
		
		
		
		List<Category> list1= session.selectList("day14.Category.find1", "c");
		System.out.println(list1);
		
		
		Map map=new HashMap();
		map.put("id", 5);
		map.put("name", "c");
		
		list1= session.selectList("day14.Category.find2", map);
		System.out.println(list1);
		
		
		//所有的
		Map<Integer,Category> map2= session.selectMap("day14.Category.find3","id");
		System.out.println(map2);
		System.out.println(map2.get(2).getName());
		
		
		//所有的
		list1= session.selectList("day14.Category.find1", "");
		System.out.println(list1);

		//找id为2的数据
		for (Category category : list1) {
			
			if(category.getId()==2) {
				
				System.out.println(category.getName());

				break;
			}
		}
		
		
		System.out.println("多表");
		
		session.commit();		
		session.close();

	}

}
