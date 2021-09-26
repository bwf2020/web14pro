package day3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		
		Cookie[] cs=req.getCookies();
		System.out.println(cs);
		if(cs!=null) {
			
		System.out.println(cs.length);
			
		System.out.println(cs[0].getName());
		System.out.println(cs[0].getValue());
		System.out.println(cs[0].getMaxAge());
		System.out.println(cs[0].getPath());
		
		}
		
		
	/*	Cookie c1=new Cookie("sex", "man");
		resp.addCookie(c1);
		
		Cookie c2=new Cookie("name", "51testing");
		resp.addCookie(c2);
		
		Cookie c3=new Cookie("name", "bwf");
		c3.setPath("/web14/a");
		resp.addCookie(c3);*/
		
		
		
		/*Cookie c2=new Cookie("age", "18");
		c2.setMaxAge(30);
		resp.addCookie(c2);*/
		
		System.out.println("===============");
		
		
		HttpSession session=req.getSession();
		
		System.out.println(session);
		System.out.println(session.getId());
		System.out.println(session.isNew());
		System.out.println(session.getMaxInactiveInterval());
		
	
		
		
		
		
		
	}

	
	
	
}
