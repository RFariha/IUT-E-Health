<%-- 
    Document   : schedule-list
    Created on : Oct 7, 2019, 10:05:20 PM
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
					<th>Doctor's Degree</th>
					<th>Division</th>
				</tr>
				
				<c:set var="tempDoctor" value="${doctors}"/>
				
					<tr>
						<td> ${tempDoctor.name}</td>
						<td>${tempDoctor.degree}</td>
						<td>${tempDoctor.division}</td>
					</tr>
				
				
			</table>
			
			<table>
				<tr>
					<th>Start Time</th>
					<th>End Time</th>
					<th>Availability</th>
				</tr>
				
				
				
				 <c:forEach var="tempSchedule" items="${schedule}" varStatus="status" >
				
					<tr>
						<td> ${tempSchedule.startTime}</td>
						<td>${tempSchedule.endTime}</td>
						<c:choose>
						<c:when test="${tempSchedule.flag}">
						
						<td>Booked</td>
						</c:when>
						<c:otherwise>
							<td><a href="appointmentBooking?startTime= ${tempSchedule.startTime}&endTime=${tempSchedule.endTime}"><input type="button" name="book" value="Book"></a></td>
						</c:otherwise>
						</c:choose>
					</tr>
					
				</c:forEach>
			</table>
		</div>
	
	</div>
</body>
</html>