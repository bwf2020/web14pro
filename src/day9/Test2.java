package day9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import redis.clients.jedis.Jedis;

public class Test2 {

	
	
	public static void main(String[] args) throws  Exception {
		
		while(true) {
		
		List<User> users=new ArrayList<>();
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		long start=System.currentTimeMillis();
		
		//首先去redis中查询
		Jedis client=new Jedis();
		
		String users_r=client.get("users");
		
		if(users_r==null) {
			
		System.out.println("走的是mysql数据库");

		String url="jdbc:mysql://localhost:3306/java14";
		String user="root";
		String password="123456";
		Connection conn=DriverManager.getConnection(url, user, password);
		String sql=" select * from user ";
		PreparedStatement pcmd=conn.prepareStatement(sql);
		ResultSet rs=pcmd.executeQuery();
		while(rs.next()) {
			
			User u=new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			
			users.add(u);
			
		}
		
		//把整个集合保存到redis中
		String users_str= JSON.toJSONString(users);
		client.setex("users",10,users_str);
		
		
		
	}else {
		
		System.out.println("走的是redis缓存");
		
		users=JSONArray.parseArray(users_r, User.class);
		
		
	}
		

	
		
		long end=System.currentTimeMillis();
		
		System.out.println(users.size());
		System.out.println(users);
		for (User user : users) {
			System.out.println(user.getName());
		}
		//462  429  440  463
		System.out.println("总共消耗:"+(end-start));
		
		Thread.sleep(1000);
		
	}
		
		
		
	}
	
}
