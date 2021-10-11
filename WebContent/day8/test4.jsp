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

String name="bwf";


%>

<%

out.print(name);

%>
<br/>

表达式:<%=name %>

<%=application.getRealPath("/") %>

</body>
</html>