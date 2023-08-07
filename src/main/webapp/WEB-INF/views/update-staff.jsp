<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Update Staff</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

    <jsp:include page="navigation.jsp" />

    <div class="container mt-5">
        <div class="card mx-auto" style="max-width: 500px;">
            <div class="card-header">Update Staff</div>
            <div class="card-body">
                <form:form action="update-staff" method="POST" modelAttribute="staff">
                    <div class="form-group">
                        <label for="id">ID</label>
                        <form:input type="text" class="form-control" id="id" path="staffId" readonly="true" />
                    </div>
                    <div class="form-group">
                        <label for="staffName">Staff Name</label>
                        <form:input type="text" class="form-control" id="staffName" path="staffName" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="staffRole">Staff Role</label>
                        <form:input type="text" class="form-control" id="staffRole" path="staffRole" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="staffEmail">Staff Email</label>
                        <form:input type="email" class="form-control" id="staffEmail" path="staffEmail" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="staffPhone">Staff Phone</label>
                        <form:input type="tel" class="form-control" id="staffPhone" path="staffPhone" required="true" />
                    </div>
                    <button type="submit" class="btn btn-primary">Update</button>
                </form:form>
            </div>
        </div>
    </div>

</body>
</html>
