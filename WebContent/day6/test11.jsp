<%@page import="day6.User"%>
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

	User user=new User();


	user.setId(1);
	user.setName("zhangsan");
	
	request.setAttribute("user", user);
	

%>

<%

	out.print(user.getId());
	out.print(user.getName());
	

%>

<jsp:useBean id="user2" class="day6.User" scope="request"></jsp:useBean>
<jsp:setProperty property="id" name="user2" value="2"/>
<jsp:setProperty property="name" name="user2" value="lisi"/>


<%

	out.print(user2.getId());
	out.print(user2.getName());
	//request.setAttribute("user2", user2);

%>

 <jsp:forward page="test12.jsp"></jsp:forward> 

<br/>

<jsp:getProperty property="id" name="user2"/><br/>
<jsp:getProperty property="name" name="user2"/><br/>



</body>
</html>