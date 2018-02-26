<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="2.jpg">
<font color="yellow">
<h1><marquee>All Users Records</marquee></h1>
<table bordercolor="blue" border="2">
<c:forEach items="${ulist}" var="user">
<tr>
<td><c:out value="${user.id }"></c:out></td>
<td><c:out value="${user.username }"></c:out></td>
<td><c:out value="${user.password }"></c:out></td>
</c:forEach>
</tr>
</table>
</font>
</body>
</html>