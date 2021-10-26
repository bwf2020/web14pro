package day21;

public class Test2 {

	public static void main(String[] args) {


		StringBuffer sb=new StringBuffer();
		sb.append("zhangsan");
		sb.append("-");
		sb.append("lisi");
		sb.append("-");
		sb.append("wangwu");
		sb.append("-");
		sb.append("zhaoliu");
		
		System.out.println(sb.toString());
		
		
		String s1=concat("zhangsa1","lisi1","wangwu1","zhaoliu1");
		System.out.println(s1);
		
		
		String s2=concat("zhangsa2","lisi2","wangwu2","zhaoliu2");
		System.out.println(s2);
		
		String s3=concat("zhangsa3","lisi3","wangwu3","zhaoliu3");
		System.out.println(s3);
		
		

	}
	
	public static String concat(String... str) {
		
		if(str==null) {
			return "";
		}
		
		StringBuffer sb=new StringBuffer();
		for (String s : str) {
			sb.append(s);
			sb.append(":");
		}
		return sb.toString().substring(0, sb.toString().length()-1);
	}

}
