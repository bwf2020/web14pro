package day20;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor1 implements HandlerInterceptor {

	
	
	public MyInterceptor1() {
		
		
		System.out.println("拦截器1被实例化了.........................");
		
	}
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("请求具体的aciton之前.......................");
			
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out.println("在渲染页面数据之前.......................");
		/*String name=(String) modelAndView.getModelMap().get("name");
		System.out.println("在模块中的数据："+name);
		
		modelAndView.addObject("name", name.toUpperCase());*/
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("之后.......................");

	}

}
