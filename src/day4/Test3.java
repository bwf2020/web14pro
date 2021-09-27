package day4;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		HttpSession session=req.getSession();
		ServletContext application=getServletContext();
		
		System.out.println("test3");
		System.out.println(req.getAttribute("name"));
		System.out.println(session.getAttribute("name"));
		System.out.println(application.getAttribute("name"));

		
		
		
	}

	
	
	
}
