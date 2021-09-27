package day4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		 ServletContext context= getServletContext();
		 System.out.println(context);
		 
		 HttpSession session=req.getSession();
		 System.out.println(session);
		 System.out.println(session.getId());
		 System.out.println(session.isNew());
		 
		 //session.invalidate();
		 
		 
		PrintWriter out=  resp.getWriter();
		out.print(resp.encodeURL("test1"));
		out.flush();
		out.close();
		
		 
	}


	
	

}
