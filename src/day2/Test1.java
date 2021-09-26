package day2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet(urlPatterns= "/test21",name="test21",loadOnStartup=0)*/
public class Test1 extends HttpServlet{

	
	public Test1() {
		
		System.out.println("day2 test1 被实例化了");
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			System.out.println("day2 test1 service");
			
	}
	
	
	
	
}
