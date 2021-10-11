package day8;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		//接受参数
		String name=req.getParameter("name");

		
		//调用业务层
		name=name.toUpperCase();

		//封装数据
		req.setAttribute("name", name);
		
		//页面跳转
		req.getRequestDispatcher("test10.jsp").forward(req, resp);
		
		
		
	}
	
	
	

}
