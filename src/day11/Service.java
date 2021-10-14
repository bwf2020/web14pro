package day11;

import redis.clients.jedis.Jedis;

public class Service {

	/**
	 * 真正处理的业务
	 * @param i
	 */
	public void doing(int i) {
		
		
		System.out.println("第"+i+"用户请求");
		
		System.out.println("正在处理业务.......");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("处理业务结束.......");
		
	}
	
	/**
	 * 加入到消息队列,但是还没有处理
	 * @param i
	 */
	public void addMsg(int i) {
		
		
		Jedis client= new Jedis();
		
		//发布者
		//client.publish("c1", String.valueOf(i));
		
		//生成者
		client.lpush("list", String.valueOf(i));
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
