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
String name=request.getParameter("name");
%>

<%=name.toUpperCase() %>

<%

request.getRequestDispatcher("test2.jsp").forward(request, response);

%>

hello

</body>
</html>