package day11;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class Test2 extends JedisPubSub{

	
	Service service=new Service();
	
	public static void main(String[] args) {

		Service service2=new Service();
		//开始在后台独立处理消息队列中的数据  订阅者
		
		Jedis client=new Jedis();
		
		/*Test2 test=new Test2();
		System.out.println("正在接受消息......");
		client.subscribe(test, "c1");*/
		
		System.out.println("正在接受消息2......");
		while(true) {
			
			List num= client.brpop(0, "list");
			service2.doing(Integer.parseInt((String)num.get(1)));
			
		}
		
		
		

	}

	@Override
	public void onMessage(String channel, String message) {


		System.out.println("渠道："+channel+":有发布消息了");
		service.doing(Integer.parseInt(message));
		
	}

}
