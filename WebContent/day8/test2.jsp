<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	String data="zhangsan,lisi,wangwu,zhaoliu";

	String[] datas=data.split(",");
	
	pageContext.setAttribute("datas", datas);
	request.setAttribute("data", data);
	


%>

<ol>

<c:forEach items="${datas }" var="data">


		<li>${data }</li>

</c:forEach>

</ol>




<ul>

	<c:forTokens items="${data}" delims="," var="d">
	
		<li>${d }</li>
	
	</c:forTokens>
	

</ul>
	



</body>
</html>