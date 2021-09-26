package day3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {

	
	private String encode="";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		
		req.setCharacterEncoding(encode);
		
		resp.setCharacterEncoding(encode);
		resp.setContentType("text/html");
		
		
		String name=req.getParameter("name");
		
		System.out.println(name);
		
		PrintWriter out= resp.getWriter();
		out.print(name);
		out.flush();
		out.close();
		
		
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

			System.out.println("带参数的初始化");
			System.out.println(config);
			
			System.out.println(config.getServletName());
			
			System.out.println(config.getInitParameter("a"));
			System.out.println(config.getInitParameter("b"));
			
			System.out.println(config.getInitParameterNames());
			
			Enumeration<String> names=config.getInitParameterNames();
			
			while (names.hasMoreElements()) {

				
				String name=names.nextElement();
				System.out.println(name+":"+config.getInitParameter(name));
				
			}
			
			encode=config.getInitParameter("encode");
			
			String a=config.getServletContext().getInitParameter("a");
			System.out.println("test1 中获取全局的配置："+a);
			
			
	}

	@Override
	public void init() throws ServletException {


		System.out.println("无参数的初始化");
		
		
	}
	
	

}
