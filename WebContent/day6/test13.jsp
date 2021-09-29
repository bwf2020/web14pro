<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="day6.User" scope="request"></jsp:useBean>

<jsp:setProperty property="id" name="user" value="1"/>
<jsp:setProperty property="name2" name="user" value="zhangsan"/>


<jsp:getProperty property="id" name="user"/><br/>
<jsp:getProperty property="name2" name="user"/><br/>

</body>
</html>