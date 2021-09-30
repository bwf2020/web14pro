<%@page import="day7.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${1+1 }<br/>
${5/2 }<br/>
${5%2 }<br/>

${5>2 }<br/>
${5<2 }<br/>
或者
${5 lt 2}<br/>


${true&&false }<br/>
或者
${true and false }<br/>

${true||false }<br/>
或者
${true or false}<br/>

${!true }<br/>
或者
${not true}

<%
String a=" ";
pageContext.setAttribute("name", a);
%>
<br/>
${empty name }<br/>

<%

User user=new User();
user.setId(1);
user.setName("zhangsan");
user.setFlag(true);

pageContext.setAttribute("user2", user);


String str=request.getParameter("str");
pageContext.setAttribute("str", str);

%>

${empty user2 }<br/>
${user2 }<br/>
脚本:<%=user.getName() %><br/>
作用域：<%=((User)pageContext.getAttribute("user2")).getName() %><br/>
el:${user2.getName() }<br/>
el2:${user2.name }<br/>
el3:${user2["name"] }<br/>
el4:${user2['name'] }<br/>

el5:${user2[str] }<br/>

<%=application.getRealPath("/") %>


</body>
</html>