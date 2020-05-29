<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>
<form:form action="register" method="post">
	<form:input path="name"/>
	<form:input path="addr"/>
	<form:password path="pass"/>
	<input type="submit" value="Enter"/>
</form:form>
</body>
</html>
