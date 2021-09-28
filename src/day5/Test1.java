package day5;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		//req.getRequestDispatcher("../b/test2").forward(req, resp);
		
		ServletContext application=getServletContext();
		application.getRequestDispatcher("/b/test2").forward(req, resp);
		

		
	}
	
	
	

}
