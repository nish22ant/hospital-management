<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Appointment</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

    <jsp:include page="navigation.jsp" />

    <div class="container mt-5">
        <div class="card mx-auto" style="max-width: 500px;">
            <div class="card-header">Update Appointment</div>
            <div class="card-body">
                <form:form action="update-app" method="POST" modelAttribute="appointment">
                    <div class="form-group">
                        <label for="id">ID</label>
                        <form:input type="text" class="form-control" id="id" path="appointmentId" readonly="true" />
                    </div>
                    <div class="form-group">
                        <label for="firstName">First Name</label>
                        <form:input type="text" class="form-control" id="firstName" path="firstName" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="lastName">Last Name</label>
                        <form:input type="text" class="form-control" id="lastName" path="lastName" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="age">Age</label>
                        <form:input type="number" class="form-control" id="age" path="age" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="mobileNumber">Mobile Number</label>
                        <form:input type="tel" class="form-control" id="mobileNumber" path="mobileNumber" required="true" />
                    </div>
                    <button type="submit" class="btn btn-primary">Update</button>
                </form:form>
            </div>
        </div>
    </div>

</body>
</html>