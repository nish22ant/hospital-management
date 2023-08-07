<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Registration Form - Patient</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

	<jsp:include page="navigation.jsp" />
	
	<div class="container">
		<div class="card mx-auto mt-5" style="max-width: 500px;">
			<div class="card-header">Create Appointment</div>
			<div class="card-body">
				<form:form action="submit-appointment" method="post" modelAttribute="appointment">
					<div class="form-group">
						<label for="firstName">First Name</label>
						<form:input path="firstName" type="text" class="form-control" id="firstName" required="true" />
					</div>
					<div class="form-group">
						<label for="lastName">Last Name</label>
						<form:input path="lastName" type="text" class="form-control" id="lastName" required="true" />
					</div>
					<div class="form-group">
						<label for="age">Age</label>
						<form:input path="age" type="number" class="form-control" id="age" required="true" />
					</div>
					<div class="form-group">
						<label for="mobileNumber">Mobile Number</label>
						<form:input path="mobileNumber" type="tel" class="form-control" id="mobileNumber" required="true" />
					</div>
					<button type="submit" class="btn btn-primary">Register</button>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>
