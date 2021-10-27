package day11;

public class Test1 {

	public static void main(String[] args) {


		Service service=new Service();
		
		
		
		long start=System.currentTimeMillis();
		
		for (int i = 1; i <= 100; i++) {
			
			
			//直接处理业务
			//service.doing(i);
			
			//加入消息队列
			service.addMsg(i);
			
			
		}
		
		long end=System.currentTimeMillis();
		System.out.println("最后一个用户需要等待:"+(end-start)/1000+" 秒");
		

	}

}
