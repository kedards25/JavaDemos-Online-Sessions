<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<!-- in order to use JSTL in jsp we need to add jstl dependancy in maven -->

	<c:if test="${userList.size()>0 }">
		
		<c:forEach var="user" items="${userList}">
				<c:out value="${user.getUserName() }"></c:out>
				<c:out value="${user.getUserPwd() }"></c:out>
				<a href="edit/${user.getId() }">Edit</a>
				<br/>
		</c:forEach>
	
	</c:if>
</body>
</html>
