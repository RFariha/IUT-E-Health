<%-- 
    Document   : appointmentBooking
    Created on : Oct 7, 2019, 10:05:55 PM
    Author     : Raisa
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>

	<title>Patient Info</title>

	<link type="text/css"
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
	  
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Patient's Information</h2>
		</div>
	
	</div>
	
	<div id="container">
		
		<div id="content">
		
			<table>
				<tr>
					<th>Patient's Name</th>
					<th>Mobile Numbber</th>
					<th>Credit Card</th>
				</tr>
				
				<c:forEach var="tempPatient" items="${patient}">
				
					<tr>
						<td> ${tempPatient.name}</td>
						<td>${tempPatient.mobile}</td>
						<td>${tempPatient.credit}</td>
					</tr>
					
				</c:forEach>
				
			</table>
			
		</div>
	
	</div>
</body>
</html>
