<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="edit" method="post">
		<input type="text" name="userNm" value="${modelObj.getUserName()}"><br/><br/> 
		<input type="text" name="userMail" value="${modelObj.getUserEmail()}"><br/><br/> 
		<input type="submit" value="update">
	</form>
</body>
</html>