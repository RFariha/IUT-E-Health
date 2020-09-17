<%-- 
    Document   : doctorList
    Created on : Oct 7, 2019, 10:04:29 PM
    Author     : Raisa
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

	<title>Doctor Info</title>

	<link type="text/css"
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
	  
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Doctor's Information</h2>
		</div>
	
	</div>
	
	<div id="container">
		
		<div id="content">
		
			<table>
				<tr>
					<th>Doctor's Name</th>
					<th>Degree</th>
					<th>Division</th>
				</tr>
				
				<c:forEach var="tempDoctor" items="${doctors}">
				
					<tr>
						<td> ${tempDoctor.name}</td>
						<td>${tempDoctor.degree}</td>
						<td>${tempDoctor.division}</td>
						<td><a href="scheduleList?id=${tempDoctor.id}"><input type="button" name="appoint" value="Appoint"></a></td>
					</tr>
					
				</c:forEach>
				
			</table>
			
		</div>
	
	</div>
</body>
</html>