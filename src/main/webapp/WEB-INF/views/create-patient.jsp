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
			<div class="card-header">Patient Registration</div>
			<div class="card-body">
				<form:form action="submit-patient" method="post" modelAttribute="patient">
					<div class="form-group">
						<label for="patientName">Patient Name</label>
						<form:input path="patientName" type="text" class="form-control" id="patientName" required="true" />
					</div>
					<div class="form-group">
						<label for="gender">Gender</label>
						<form:select path="gender" class="form-control" id="gender" required="true">
							<form:option value="">Select Gender</form:option>
							<form:option value="male">Male</form:option>
							<form:option value="female">Female</form:option>
							<form:option value="other">Other</form:option>
						</form:select>
					</div>
					<div class="form-group">
						<label for="patientEmail">Patient Email</label>
						<form:input path="patientEmail" type="email" class="form-control" id="patientEmail" required="true" />
					</div>
					<div class="form-group">
						<label for="patientPhone">Patient Phone</label>
						<form:input path="patientPhone" type="tel" class="form-control" id="patientPhone" required="true" />
					</div>
					<button type="submit" class="btn btn-primary">Register</button>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>
