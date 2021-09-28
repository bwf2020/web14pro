package day5;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

public class Test3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


			System.out.println("test3");
			
			HttpSession session=req.getSession();
			
			System.out.println(session.getId());
			
			req.setAttribute("aaa", "51testing");
			
			
			System.out.println(resp);
			
			PrintWriter out=resp.getWriter();
	
			
			out.print("hello");
			
			out.print(req.getAttribute("aaa"));
			
			out.print("bwf");
			
			out.flush();
			
			out.close();
		
			System.out.println("输出结束");
			
			req.removeAttribute("aaa");
		
	}

	
	
	
	
}
