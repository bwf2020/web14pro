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

	User user=(User)request.getAttribute("user");

%>

test12 <br/>

<%


out.print(user.getId());
out.print(user.getName());

	
%>
<br/>
<jsp:useBean id="user2" class="day6.User" scope="request"></jsp:useBean>

<jsp:getProperty property="id" name="user2"/><br/>
<jsp:getProperty property="name" name="user2"/><br/>


</body>
</html>