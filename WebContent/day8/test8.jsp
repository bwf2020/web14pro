<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

String name=request.getParameter("name");

if(name!=null){

name=name.toUpperCase();

out.print("处理的结果："+name);
}else{
	


%>

<form action="test8.jsp">

姓名:<input name="name" /><input type="submit" 提交 />

</form>

<%} %>

</body>
</html>