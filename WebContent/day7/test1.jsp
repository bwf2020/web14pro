<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="day7.User"></jsp:useBean>
<jsp:setProperty property="name" name="user" value="bwf"/>
<jsp:setProperty property="flag" name="user" value="true"/>

<%

out.print(user.isFlag());

%>

<jsp:getProperty property="flag" name="user"/><br/>

</body>
</html>