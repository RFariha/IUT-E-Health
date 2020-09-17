<%-- 
    Document   : logIn
    Created on : Oct 7, 2019, 10:03:12 PM
    Author     : Raisa
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="loginCheck" value="${ loginFailed }"/>
	
	<c:if test="${ loginCheck == 'true' }">
		<p>Login Failed</p>
	</c:if>

	<form action="verifyPatient" method="post">
		<label>Email:</label>
		<input type="text" name="email"><br/>
		<label>Password:</label>
		<input type="password" name="password"><br/>
		<input type="submit" value="Submit">
	</form>
	<br/>
	<a href="${pageContext.request.contextPath}/signIn">Sign In</a><br/>
	<a href="${ pageContext.request.contextPath }">Back To Homepage</a>

</body>
</html>