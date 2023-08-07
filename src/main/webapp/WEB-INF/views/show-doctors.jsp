<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Show Doctors</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<jsp:include page="navigation.jsp" />

	<div class="container">
		<h2 style="padding: 1rem;" align="center">Doctors</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Doctor ID</th>
					<th>Doctor Name</th>
					<th>Specialization</th>
					<th>Doctor Email</th>
					<th>Doctor Phone</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="doctor" items="${doctors}">
					<tr>
						<td>${doctor.doctorId}</td>
						<td>${doctor.doctorName}</td>
						<td>${doctor.specialization}</td>
						<td>${doctor.doctorEmail}</td>
						<td>${doctor.doctorPhone}</td>
						<td>
							<a href="/hospital-management/update-doctor?id=${doctor.doctorId}" class="btn btn-primary">Update</a>
							<a href="/hospital-management/delete-doctor?id=${doctor.doctorId}" class="btn btn-danger">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>
