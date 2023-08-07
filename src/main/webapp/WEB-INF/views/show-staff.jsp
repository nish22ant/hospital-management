<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Show Staff</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

    <jsp:include page="navigation.jsp" />

    <div class="container">
        <h2 style="padding: 1rem;" align="center">Staff</h2>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Staff ID</th>
                    <th>Staff Name</th>
                    <th>Staff Role</th>
                    <th>Staff Email</th>
                    <th>Staff Phone</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="staff" items="${staffList}">
                    <tr>
                        <td>${staff.staffId}</td>
                        <td>${staff.staffName}</td>
                        <td>${staff.staffRole}</td>
                        <td>${staff.staffEmail}</td>
                        <td>${staff.staffPhone}</td>
                        <td>
                            <a href="/hospital-management/update-staff?id=${staff.staffId}" class="btn btn-primary">Update</a>
                            <a href="/hospital-management/delete-staff?id=${staff.staffId}" class="btn btn-danger">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>
