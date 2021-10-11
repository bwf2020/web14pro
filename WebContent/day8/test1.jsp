<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="day8.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	table {
	
	width: 300px;
	border: 1px #666 solid;
	border-collapse: collapse;
	
	
	}
	
	
	table thead tr{
		background: #eee;
	}
	
	table tbody tr td{
	
		border: 1px #999 solid;
		padding: 6px;
	
	}
	
	.bg{
		
		background: #efefef;
	
	}

</style>
</head>
<body>


<%

//使用脚本生成数据

User u1=new User();
u1.setId(1);
u1.setName("张三");
u1.setSex("男");


User u2=new User();
u2.setId(2);
u2.setName("李四");
u2.setSex("女");

User u3=new User();
u3.setId(3);
u3.setName("王五");
u3.setSex("女");

List<User> users=new ArrayList<User>();
users.add(u1);
users.add(u2);
users.add(u3);

//放在作用域属性中
pageContext.setAttribute("users", users);



%>



<table>

<thead>

	<tr><th>编号</th><th>姓名</th><th>性别</th></tr>

</thead>

<tbody>

<%-- 
	<%
	
	for(User u:users){
	
	%>

	<tr>
	
		<td><%=u.getId() %></td><td><%=u.getName() %></td><td><%=u.getSex() %></td>
	
	</tr>
	
	
	<%} %>
	 --%>
	 
	 
	 <c:forEach items="${users }" var="u" varStatus="status">
	 
	 
	 	<c:if test="${status.index%2!=0 }">
	 	 	<tr class="bg">
	 	</c:if>
	 
	 	<c:if test="${status.index%2==0 }">
	 	 	<tr>
	 	</c:if>
		
		
			<td>${u.id }</td><td>${u.name }</td><td>${u.sex }</td>
		
		 </tr>
	 
	 </c:forEach>
	

</tbody>

</table>




</body>
</html>