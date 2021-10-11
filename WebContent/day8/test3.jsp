<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	Date date=new Date();
	//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	pageContext.setAttribute("date", date);
	
	String num="100.3";
	pageContext.setAttribute("num", num);
	
	
%>


pc:<span>${date }</span><br/>
小程序:<span>${date }</span><br/>
app:<span>${date }</span><br/>

<span>${date }</span><br/>
<span><fmt:formatDate value="${date }"/></span><br/>
<span><fmt:formatDate value="${date }" type="date"/></span><br/>
<span><fmt:formatDate value="${date }" type="time"/></span><br/>
<span><fmt:formatDate value="${date }" type="both"/></span><br/>
<span><fmt:formatDate value="${date }" type="both" dateStyle="full"/></span><br/>
<span><fmt:formatDate value="${date }" type="both" dateStyle="full" timeStyle="full"/></span><br/>
<span><fmt:formatDate value="${date }" pattern="yyyy/MM/dd"/></span><br/>
<span><fmt:formatDate value="${date }" pattern="yyyy-MM-dd HH:mm:ss E"/></span><br/>


pc:<span><fmt:formatDate value="${date }" pattern="yyyy-MM-dd HH:mm:ss E"/></span><br/>
小程序:<span><fmt:formatDate value="${date }" pattern="yyyy年MM月dd日  HH:mm:ss"/></span><br/>
app:<span><fmt:formatDate value="${date }" pattern="yyyy/MM/dd"/></span><br/>


<hr/>

<span>${num }</span><br/>

<span><fmt:formatNumber value="${num }"></fmt:formatNumber> </span><br/>

<span><fmt:formatNumber value="${num }" type="currency"></fmt:formatNumber> </span><br/>

<span><fmt:formatNumber value="${num }" type="percent"></fmt:formatNumber> </span><br/>


<span><fmt:formatNumber value="${num }" minFractionDigits="2" minIntegerDigits="2"></fmt:formatNumber> </span><br/>

<span><fmt:formatNumber value="${num }"  pattern=".00"></fmt:formatNumber> </span><br/>


<hr/>

${fn:contains("hellobw","bwf") }<br/>

${fn:contains(param.name,"bwf") }<br/>

<c:if test="${fn:contains(param.name,'bwf') }">
	博为峰
</c:if>

<c:if test="${!fn:contains(param.name,'bwf') }">
	51testing
</c:if>

<%

String[] array={"zhangsan","lisi","wangwu"};

pageContext.setAttribute("array", array);



%>
<br/>
${fn:join(array,"-") }<br/>

${fn:join(array,":") }<br/>

${fn:split(fn:join(array,":"),":") }<br/>

<c:forEach items='${fn:split(fn:join(array,":"),":") }' var="s">

	${s }<br/>

</c:forEach>


${fn:length(array) }<br/>

${fn:substring("hellobwf",1,3) }<br/>


a${" hellobwf "}b<br/>

a${fn:trim(" hello bwf ")}b<br/>



</body>
</html>