<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="validation.htm" modelAttribute="user">
FirstName:<form:input path="fname"/><form:errors path="fname"></form:errors><br/>
LastName:<form:input path="lname"/><form:errors path="lname"></form:errors><br/>
Email:<form:input path="email"/><form:errors path="email"></form:errors><br/>
Mobile:<form:input path="mobile"/><form:errors path="mobile"></form:errors><br/>
Course::<form:select path="coursename">
<form:options items="${courseList}" itemValue="id" itemLabel="coursename"/>
</form:select>
<input type="submit" value="submit">
</form:form>
</body>
</html>