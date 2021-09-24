package day2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {

	
	
	public Test2() {
		
		
		
		System.out.println("day2 test2对象被实例化");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		
		System.out.println("每次请求都会调用的一个方法");
		
		super.service(req, resp);
		

		
	}

	@Override
	public void init() throws ServletException {

		System.out.println("day2 test2 初始化");
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		System.out.println("day2 test2 get请求");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


			System.out.println("day2 test2 post请求");
		
	}

	@Override
	public void destroy() {
		System.out.println("day2 test2对象被销毁了");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	


	
	
}
