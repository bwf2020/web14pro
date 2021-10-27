<%@page import="com.alibaba.fastjson.JSON"%>
<%@page import="day22.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<b>51testing</b>

<%
	
String name="bwf";
pageContext.setAttribute("name", name);
User user=new User();
user.setName("zhangsan");

pageContext.setAttribute("user", user);

%>

hello

</body>
</html>

<script>

var name='${name}';
alert(name)

var user=${user};
alert(user.name)


</script>