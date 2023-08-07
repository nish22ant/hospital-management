<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Registration Form - Staff</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

    <jsp:include page="navigation.jsp" />

    <div class="container">
        <div class="card mx-auto mt-5" style="max-width: 500px;">
            <div class="card-header">Staff Registration</div>
            <div class="card-body">
                <form:form action="submit-staff" method="post" modelAttribute="staff">
                    <div class="form-group">
                        <label for="staffName">Staff Name</label>
                        <form:input path="staffName" type="text" class="form-control" id="staffName" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="staffRole">Staff Role</label>
                        <form:input path="staffRole" type="text" class="form-control" id="staffRole" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="staffEmail">Staff Email</label>
                        <form:input path="staffEmail" type="email" class="form-control" id="staffEmail" required="true" />
                    </div>
                    <div class="form-group">
                        <label for="staffPhone">Staff Phone</label>
                        <form:input path="staffPhone" type="tel" class="form-control" id="staffPhone" required="true" />
                    </div>
                    <button type="submit" class="btn btn-primary">Register</button>
                </form:form>
            </div>
        </div>
    </div>

</body>
</html>
