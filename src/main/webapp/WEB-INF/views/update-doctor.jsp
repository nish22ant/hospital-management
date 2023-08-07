<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Doctor</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

    <jsp:include page="navigation.jsp" />

    <div class="container mt-5">
        <div class="card mx-auto" style="max-width: 500px;">
            <div class="card-header">Update Doctor</div>
            <div class="card-body">
                <form:form action="update-doctor" method="POST" modelAttribute="doctor">
                    <div class="form-group">
                        <label for="id">ID</label>
                        <form:input type="text" class="form-control" id="id" path="doctorId" readonly="true" />
                    </div>
                    <div class="form-group">
                        <label for="doctorName">Doctor Name</label>
                        <form:input type="text" class="form-control" id="doctorName" path="doctorName" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="specialization">Specialization</label>
                        <form:input type="text" class="form-control" id="specialization" path="specialization" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="doctorEmail">Doctor Email</label>
                        <form:input type="email" class="form-control" id="doctorEmail" path="doctorEmail" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="doctorPhone">Doctor Phone</label>
                        <form:input type="tel" class="form-control" id="doctorPhone" path="doctorPhone" required="true" />
                    </div>
                    <button type="submit" class="btn btn-primary">Update</button>
                </form:form>
            </div>
        </div>
    </div>

</body>
</html>
