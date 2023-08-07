<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Show Appointments</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<jsp:include page="navigation.jsp" />

	<div class="container">
		<h2 style="padding: 1rem;" align="center">Appointments</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Appointment ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Mobile Number</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="appointment" items="${appointments}">
					<tr>
						<td>${appointment.appointmentId}</td>
						<td>${appointment.firstName}</td>
						<td>${appointment.lastName}</td>
						<td>${appointment.age}</td>
						<td>${appointment.mobileNumber}</td>
						<td><a
							href="/hospital-management/update-appointment?id=${appointment.appointmentId}"
							class="btn btn-primary">Update</a> <a
							href="/hospital-management/delete-appointment?id=${appointment.appointmentId}"
							class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
