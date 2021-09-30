<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

jsp:<%=pageContext %><br/>
el:${pageContext }<br/>


<%
request.setAttribute("a", "A");
request.setAttribute("b", "B");
request.setAttribute("c", "C");
request.setAttribute("d", "DDDDDD");
session.setAttribute("d", "D");
%>

jsp:<%=request %><br/>
el:${requestScope }<br/>
el:${requestScope.a }<br/>
el:${requestScope.b }<br/>
el:${requestScope['c'] }<br/>
el:${requestScope.d }<br/>
jsp:<%=session.getAttribute("d") %><br/>
el:${sessionScope.d }<br/>

jsp:<%=session %><br/>

el:${sessionScope }<br/>

jsp:<%=pageContext.findAttribute("d") %><br/>
el:${d }<br/>
el:${requestScope.d }<br/>
el:${sessionScope.d }<br/>

jsp:<%=request.getParameter("a") %><br/>
el:${param }<br/>
el:${param.a }<br/>
el:${param.b }<br/>
el:${param['c'] }<br/>
el:${param.aihao }<br/>

jsp:<%=request.getParameterValues("aihao")[1] %><br/>
el:${paramValues }<br/>

el:${paramValues.a[0] }<br/>
el:${paramValues.aihao[0] }<br/>
el:${paramValues.aihao[1] }<br/>
el:${paramValues.aihao[2] }<br/>

jsp:<%=request.getHeader("user-agent") %><br/>
el:${header }<br/>
el:${header.cookie }<br/>
el:${header["user-agent"] }<br/>

el:${headerValues.cookie[1] }<br/>

el:${initParam }<br/>
el:${initParam.a }<br/>

el:${cookie }<br/>
el:${cookie.JSESSIONID }<br/>
el:${cookie.JSESSIONID.name }<br/>
el:${cookie.JSESSIONID.value }<br/>

<%

Cookie[] cookies=request.getCookies();

for(Cookie c:cookies){
	
	if(c.getName().equals("cna")){
		
		out.print(c.getValue());
		break;
		
	}
	
}

%>
<br/>
${cookie.cna.value }<br/>








</body>
</html>