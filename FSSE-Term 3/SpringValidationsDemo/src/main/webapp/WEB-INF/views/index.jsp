<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<body>
<form:form action="register" method="post">
	<form:input path="userName"/>
	<form:errors path="userName"></form:errors>
	<form:password path="userPass"/>
	<input type="submit" value="register"> 
	<form:errors path="userPass"></form:errors>
</form:form>
</body>
</html>
