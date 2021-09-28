package day5;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyResponse extends HttpServletResponseWrapper {
	
	private CharArrayWriter charArrayWriter=new CharArrayWriter();

	public MyResponse(HttpServletResponse response) {
		
	
		super(response);
	
		
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		// TODO Auto-generated method stub
		
		charArrayWriter.append("zhangsan");
		PrintWriter out=new PrintWriter(charArrayWriter);
	
		return out;
	}
	

	public CharArrayWriter getCharArrayWriter() {//返回servlet中输出的内容
		return charArrayWriter;
	}
	
	

}
