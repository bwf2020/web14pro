<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	user.setSex("man");
	
	User user2=new User();
	user2.setId(2);
	user2.setName("lisi");
	user2.setSex("woman");
	
	User user3=new User();
	user3.setId(3);
	user3.setName("wangwu");
	user3.setSex("woman");
	
	List<User> users=new ArrayList<User>();
	
	users.add(user);
	users.add(user2);
	users.add(user3);

	
	

%>


编号:<%=user.getId() %><br/>
姓名:<%=user.getName() %><br/>
性别:<%=user.getSex() %><br/>


<table>

<thead>
<tr><td>编号</td><td>姓名</td><td>性别</td></tr>
</thead>

<tbody>


	<%
	
	for(User u:users){
	%>
	
	<tr>
	<td><%=u.getId() %></td>
	<td><%=u.getName() %></td>
	<td><%=u.getSex() %></td>
	</tr>
	
	<%} %>

</tbody>

</table>



</body>
</html>