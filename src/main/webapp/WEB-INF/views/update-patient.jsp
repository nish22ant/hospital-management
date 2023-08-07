<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Patient</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

    <jsp:include page="navigation.jsp" />

    <div class="container mt-5">
        <div class="card mx-auto" style="max-width: 500px;">
            <div class="card-header">Update Patient</div>
            <div class="card-body">
                <form:form action="update-patient" method="POST" modelAttribute="patient">
                    <div class="form-group">
                        <label for="id">ID</label>
                        <form:input type="text" class="form-control" id="id" path="patientId" readonly="true" />
                    </div>
                    <div class="form-group">
                        <label for="patientName">Patient Name</label>
                        <form:input type="text" class="form-control" id="patientName" path="patientName" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="gender">Gender</label>
                        <form:input type="text" class="form-control" id="gender" path="gender" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="patientEmail">Patient Email</label>
                        <form:input type="email" class="form-control" id="patientEmail" path="patientEmail" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="patientPhone">Patient Phone</label>
                        <form:input type="tel" class="form-control" id="patientPhone" path="patientPhone" required="true" />
                    </div>
                    <button type="submit" class="btn btn-primary">Update</button>
                </form:form>
            </div>
        </div>
    </div>

</body>
</html>
