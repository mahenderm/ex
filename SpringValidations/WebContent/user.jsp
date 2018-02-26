<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="validation.htm" modelAttribute="user">
<spring:message code="label.fname"/><form:input path="fname"/><form:errors path="fname"/><br/>
<spring:message code="label.lname"/><form:input path="lname"/><form:errors path="lname"/><br/>
<spring:message code="label.email"/><form:input path="email"/><form:errors path="email"/><br/>
<spring:message code="label.mobile"/><form:input path="mobile"/><form:errors path="mobile"/><br/>
Course::<form:select path="coursename">
<form:options items="${courseList}" itemValue="id" itemLabel="coursename"/>
</form:select>
<input type="submit" value="submit">
</form:form>
</body>
</html>