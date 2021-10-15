package day14;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		
		User u1= session.selectOne("day14.User.find1", 7);
		System.out.println(u1);
		System.out.println(u1.getName());
		System.out.println(u1.getCard());
		System.out.println(u1.getCard().getNums());
		
		
		System.out.println("=============");
		
		Category c1= session.selectOne("day14.Category.find4", 1);
		System.out.println(c1);
		System.out.println(c1.getName());
		System.out.println(c1.getProductList().size());
		System.out.println(c1.getProductList());
		
		
		System.out.println("=============");
		
		Product p1=session.selectOne("day14.Product.find1", 3);
		System.out.println(p1.getName());
		System.out.println(p1.getCategory());
		
		System.out.println(p1.getCategory().getName());
		
		
		System.out.println("=============");
		
		Orders o1= session.selectOne("day14.Orders.find1", "BH20211015002");
		System.out.println(o1);
		System.out.println(o1.getOrderItemList());
	
		for (OrderItem oi : o1.getOrderItemList()) {
			
			System.out.println(oi.getProduct());
		}
		
		
		System.out.println("=========");
		
		Orders o2=new Orders();
		o2.setId(1);

		
		Product p=new Product();
		p.setId(3);
		
		OrderItem oi=new OrderItem();
		oi.setNums(10);
		oi.setProduct(p);
		oi.setOrders(o2);

		
		session.insert("day14.Orders.save", oi);
	
		session.commit();		
		session.close();

	}

}
