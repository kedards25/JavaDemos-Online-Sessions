<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		 <h1>Name:${modelObj.getUserName()}</h1>
		<h2>Email:${modelObj.getUserEmail()}</h2> 
		<%-- <h2>${modelObj}</h2> --%>
		<a href="edit">Edit</a>
</body>
</html>