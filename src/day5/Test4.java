package day5;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test4 {

	public static void main(String[] args) throws Exception {

		
		CharArrayWriter file2=new CharArrayWriter();

		File file=new File("c:/myfiles/a.txt");
		
		
		System.out.println(file2.toString());
		
		PrintWriter out=new PrintWriter(file2);
		
		out.print("hello");

		out.print("51testing");
		
		out.flush();
		
		out.close();
		
		System.out.println(file2.toString());
		
		
	}

}
