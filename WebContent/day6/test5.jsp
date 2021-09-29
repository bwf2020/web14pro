<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


test5<br/>
<%=application.getRealPath("/") %><br/>

<%=request %><br/>

<%=request.getParameter("name") %><br/>

<%=response %><br/>

<%=request.getSession().getId() %><br/>
<%=session.getId() %><br/>

<%=out %><br/>

<%
out.print("i am  out ");
%>


<%=application %><br/>

<%=config %><br/>

<%=config.getInitParameter("a") %><br/>


<%=pageContext %><br/>

<%=pageContext.getSession().getId()%><br/>
<%=session.getId() %><br/>


<%

pageContext.setAttribute("name", "zhangsan");
request.setAttribute("name", "lisi");
session.setAttribute("name", "wangwu");
application.setAttribute("name", "zhaoliu");


pageContext.setAttribute("a", "A", PageContext.REQUEST_SCOPE);
pageContext.setAttribute("a", "A", PageContext.SESSION_SCOPE);


%>

<%

String name="bwf";

%>

<%=pageContext.getAttribute("name")%><br/>
<%=request.getAttribute("name") %><br/>
<%=session.getAttribute("name") %><br/>
<%=application.getAttribute("name") %><br/>
<%=name %><br/>

<%-- <%=pageContext.getAttribute("a",PageContext.PAGE_SCOPE) %><br/>
<%=pageContext.getAttribute("a",PageContext.REQUEST_SCOPE) %><br/>
<%=request.getAttribute("a") %><br/>
<%=session.getAttribute("a") %><br/>

<%=pageContext.getAttribute("name",PageContext.APPLICATION_SCOPE) %><br/> --%>

<%

//request.getRequestDispatcher("test6.jsp").forward(request, response);
response.sendRedirect("test6.jsp");

%>



</body>
</html>