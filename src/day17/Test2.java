package day17;

public class Test2 {

	public static void main(String[] args) {


		/*IUserService userService=new UserService();
		
		userService.show();*/
		
		//通过代理对象去调用
		
		//目标对象
		IUserService target=new UserService();
		
		MyProxy proxy=new MyProxy(target);
		
		IUserService proxyObj=(IUserService) proxy.getProxy();
		
		System.out.println("目标对象:"+target);
		//System.out.println("代理对象"+proxyObj);
		
		proxyObj.show();
		proxyObj.show2();
		
		
		IDogService target2=new DogService();
		
		 proxy=new MyProxy(target2);
		 
		 IDogService proxyObj2= (IDogService) proxy.getProxy();
		 
		 proxyObj2.m1();
		 proxyObj2.m2();

	}

}
