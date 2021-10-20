package day17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{

	private Object target;
	
	public MyProxy(Object target) {
		
		this.target=target;
		
	}
	
	public  Object getProxy() {
		
		Object proxyObj= Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		return proxyObj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// 唤醒目标对象中的方法
		
		System.out.println("调用目标方法了");
		System.out.println(target);
		System.out.println(method);
		System.out.println(args);
		
		//通过方法，去调用这个对象中的方法 反射机制
		
		System.out.println("之前做什么事情记录操作者");
		
		Object obj= method.invoke(target);
	
		System.out.println("之后做什么事情记录时间");
		
		return obj;
	}
	
	
}
