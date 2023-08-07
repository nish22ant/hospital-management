<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Registration Form - Doctor</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<jsp:include page="navigation.jsp" />
	
	<div class="container">
		<div class="card mx-auto mt-5" style="max-width: 500px;">
			<div class="card-header">Doctor Registration</div>
			<div class="card-body">
				<form:form action="submit-doctor" method="post" modelAttribute="doctor">
					<div class="form-group">
						<label for="doctorName">Doctor Name</label>
						<form:input path="doctorName" type="text" class="form-control" id="doctorName" required="true" />
					</div>
					<div class="form-group">
						<label for="specialization">Specialization</label>
						<form:input path="specialization" type="text" class="form-control" id="specialization" required="true" />
					</div>
					<div class="form-group">
						<label for="doctorEmail">Doctor Email</label>
						<form:input path="doctorEmail" type="email" class="form-control" id="doctorEmail" required="true" />
					</div>
					<div class="form-group">
						<label for="doctorPhone">Doctor Phone</label>
						<form:input path="doctorPhone" type="tel" class="form-control" id="doctorPhone" required="true" />
					</div>
					<button type="submit" class="btn btn-primary">Register</button>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>
