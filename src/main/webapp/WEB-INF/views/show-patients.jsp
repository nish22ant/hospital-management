<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Show Patients</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<jsp:include page="navigation.jsp" />

	<div class="container">
		<h2 style="padding: 1rem;" align="center">Patients</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Patient ID</th>
					<th>Patient Name</th>
					<th>Gender</th>
					<th>Patient Email</th>
					<th>Patient Phone</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="patient" items="${patients}">
					<tr>
						<td>${patient.patientId}</td>
						<td>${patient.patientName}</td>
						<td>${patient.gender}</td>
						<td>${patient.patientEmail}</td>
						<td>${patient.patientPhone}</td>
						<td>
							<a href="/hospital-management/update-patient?id=${patient.patientId}" class="btn btn-primary">Update</a>
							<a href="/hospital-management/delete-patient?id=${patient.patientId}" class="btn btn-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
