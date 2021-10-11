package day9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sun.corba.se.impl.orbutil.ObjectWriter;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

public class Test1 {

	public static void main(String[] args) throws  Exception {


		
		//连接redis
		Jedis client=new Jedis("localhost",6379);
		
		System.out.println(client.ping());
		
		//查看所有key
		
		Set<String> keys=client.keys("*");
		
		System.out.println(keys.size());
		
		for (String key : keys) {
			System.out.println(key);
		}
		
		
		//操作字符串
		/*String b= client.set("b", "B");
		System.out.println(b);*/
		
		/*String b=client.get("b");
		System.out.println(b);
		
		client.setnx("c", "CC");
		client.setnx("d", "DD");
		
		long num= client.del("b","c");
		System.out.println(num);
*/

		
		//操作list
		//client.lpush("list", "zhangsan","lisi","wangwu");
		
		
		List<String> list= client.lrange("list", 0, -1);
		System.out.println(list.size());
		
		for (String value : list) {
			
			System.out.println(value);
			
		}
		
		System.out.println("==========");
		String v2=client.lindex("list", 2);
		System.out.println(v2);
		
		/*String popValue=client.lpop("list");
		System.out.println(popValue);*/
		
		
		//client.lset("list", 1, "zhangsan2");
		
		client.lrem("list", 1, "zhangsan2");
		
		System.out.println("=============");
		
		//hash操作
		
		/*client.hset("map", "a", "A");
		
		Map map=new HashMap();
		map.put("b", "B");
		map.put("c", "C");
		
		client.hmset("map", map);*/
		
		
		
		String a=client.hget("map", "a");
		System.out.println(a);
		
		
		Map map2= client.hgetAll("map");
		System.out.println(map2);
		
		Set<String> mapKeys= map2.keySet();
		
		for (String key : mapKeys) {
			System.out.println(key);
		}
		
		System.out.println("=========");
		
		Set<String> mapKeys2=client.hkeys("map");
		for (String key : mapKeys2) {
			System.out.println(key);
		}
		
		System.out.println("=========");
		
		List<String> mapValues= client.hvals("map");
		
		for (String value : mapValues) {
			System.out.println(value);
		}
		
		
		
		System.out.println("=========");
		
		//client.sadd("set", "zhangsan","lisi","Wangwu");
		
		long num= client.scard("set");
		System.out.println(num);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(client.srandmember("set"));
		}
		
		client.sadd("set", "zhangsan2");
		num= client.scard("set");
		System.out.println(num);
		
		System.out.println("===============");
		
		/*client.zadd("set2", 5, "zhangsan");
		
		
		Map map=new HashMap();
		map.put("lisi",Double.parseDouble("6"));
		map.put("wangwu",Double.parseDouble("7"));
		
		client.zadd("set2", map);*/
		
		Set<String> set= client.zrange("set2", 0, -1);
		for (String v : set) {
			System.out.println(v);
		}
		
		
		System.out.println("==============");
		
		
		Set<Tuple> set2=client.zrangeWithScores("set2", 0, 4);
		for (Tuple v : set2) {
			
			System.out.println("输出");
			System.out.println(v.getScore()+"-"+v.getElement());
		}
		
		System.out.println("=========");
		
		
		String num2=client.clientList();
		System.out.println(num2);
		
		System.out.println(client.save());
		
		
		set2= client.zrangeByScoreWithScores("set2", 5, 6);
		for (Tuple v : set2) {
			System.out.println(v);
		}
		
		
		System.out.println("==============");
		
		//保存对象
		User u1=new User();
		u1.setId(2);
		u1.setName("lisi");
		
		//client.set("u1", u1.toString());
		
	/*	String u2=client.get("u1");
		System.out.println(u2);*/
		
		//client.set("a".getBytes(), "A".getBytes());
		
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		ObjectOutputStream ow=new ObjectOutputStream(bout);
		ow.writeObject(u1);
		
		
		System.out.println(bout.toByteArray());
		
		//client.set("user1".getBytes(), bout.toByteArray());
		
		//反序列化
		
		/*byte[] b2= client.get("user1".getBytes());
		
		System.out.println(b2);
		
		ByteArrayInputStream bin=new ByteArrayInputStream(b2);
		ObjectInputStream oin=new ObjectInputStream(bin);
		User u2= (User) oin.readObject();
		System.out.println(u2);
		System.out.println(u2.getId());
		System.out.println(u2.getName());*/
		
		String u1Str=JSONObject.toJSONString(u1);
		//client.set("u2", u1Str);
		
		
		User u2= JSON.parseObject(client.get("u2"),User.class);
		System.out.println(u2);
		System.out.println(u2.getId());
		System.out.println(u2.getName());
		
		
	}

}
