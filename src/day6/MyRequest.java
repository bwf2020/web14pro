package day6;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper {

	
	private HttpServletRequest request=null;
	
	
	public MyRequest(HttpServletRequest request) {
		
		super(request);
		
		this.request=request;
	}

	@Override
	public String getParameter(String name) {
	
		
		String value=request.getParameter("name");
		

		if(value.contains("bwf")) {
			
			value=value.replaceAll("bwf", "***");
			
		}
		
		return value;
	}

	
	
	
}
