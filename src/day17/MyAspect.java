package day17;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Pointcut("execution(* day17.*.*(..))")
	public void pc() {
		
	}
	
	@Before("execution(* day17.*.*(..))")
	public void before() {
		
		
		System.out.println("之前做一些事情");
	}
	
	@After("pc()")
	public void after() {
		
		
		System.out.println("之后做一些事情");
	}
	
	@Around("pc()")
	public Object round(ProceedingJoinPoint joinPoint) {
		
		
		System.out.println("还是之前");
		
		Object obj=null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("还是之后");
		System.out.println(obj);
		
		return obj;
	}
	
}
