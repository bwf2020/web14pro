package day6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String name=req.getParameter("name");
	
		
		System.out.println("test2");
		
		PrintWriter out=resp.getWriter();
		out.print(name);
		out.flush();
		out.close();
		


		
	}

	
	
	
	
}
