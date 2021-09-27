package day4;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest extends HttpServletRequestWrapper {

	
	private HttpServletRequest req;
	
	public MyRequest(HttpServletRequest request) {
		super(request);
		this.req=request;
	
	}

	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		if(name.equals("content")) {
			
			String value=req.getParameter(name);
			if(value.contains("bwf")) {
				
				return "***";
			}
			
		}
		return req.getParameter(name);
	}
	
	

}
