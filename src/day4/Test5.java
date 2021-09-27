package day4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test5 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		System.out.println("test5");
		
		System.out.println(req.getAttribute("name"));
		System.out.println(req.getSession().getAttribute("name"));
		System.out.println(getServletContext().getAttribute("name"));
		
		
		String content=req.getParameter("content");

		
		PrintWriter out= resp.getWriter();
		out.print("博为峰2"+content);
		out.flush();
		out.close();
		
		
		
	}

	
	
	
	
	
}
