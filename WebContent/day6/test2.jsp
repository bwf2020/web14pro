<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<span>zhangsan</span>
<br/>

<%

	String name="zhangsan";

	for(int i=0;i<10;i++){
		
		
		System.out.print(i);
		
	}

%>

<br/>
<%=1+1 %>
<br/>

<%="hello bwf" %><br/>


<%

for(int i=0;i<5;i++){%>

<%=i %>

<%}%>

</body>
</html>