<%-- 
    Document   : signIn
    Created on : Oct 7, 2019, 10:03:59 PM
    Author     : Raisa
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="signInCheck" value="${ signInFailed }"/>
	
	<c:if test="${ signInCheck == 'true' }">
		<p>Email already exist</p>
	</c:if>
	
	<form:form action="savePatient" modelAttribute="patient" method="post">
		Name: <form:input path="name"/><br/>
		Email: <form:input path="email"/><br/>
		Password: <form:input path="password"/><br/>
		Mobile: <form:input path="mobile"/><br/>
		Credit Card: <form:input path="credit"/><br/>
		Address: <form:input path="address"/><br/>
		<input type="submit" value="Submit"/>
	</form:form>
	<br/>
	
	<a href="${ pageContext.request.contextPath }/logIn">Log In</a><br/>
	<a href="${ pageContext.request.contextPath }">Back To Home Page</a>
	

</body>
</html>
