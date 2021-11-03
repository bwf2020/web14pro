package day26;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;



public class CrossFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		    HttpServletResponse res = (HttpServletResponse) response;
	        res.addHeader("Access-Control-Allow-Credentials", "true");
	        res.addHeader("Access-Control-Allow-Origin", "http://localhost:8070");
	        res.addHeader("Access-Control-Allow-Methods", "GET");
	        res.addHeader("Access-Control-Allow-Headers", "Content-Type,X-CAF-Authorization-Token,sessionToken,X-TOKEN");
	        
	        if (((HttpServletRequest) request).getMethod().equals("OPTIONS")) {
	            response.getWriter().println("Success");
	            return;
	        }
	        chain.doFilter(request, response);
		
	}

}
