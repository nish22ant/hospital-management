<!DOCTYPE html>
<html>
<head>
<title>ByteCity - Hospital Management</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link
	href="https://fonts.googleapis.com/css2?family=Source+Code+Pro&display=swap"
	rel="stylesheet">
<style>
body {
	font-family: 'Source Code Pro', monospace;
}

.navbar {
	background-color: #000;
}

.navbar-dark .navbar-nav .nav-link {
	color: #fff;
}

.navbar-dark .navbar-nav .nav-link:hover {
	color: #aaa;
}

.navbar-dark .navbar-toggler-icon {
	background-image: url('https://example.com/icon.png');
}

li {
	padding-left: 2rem;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-md navbar-dark">
		<a class="navbar-brand" href="/hospital-management">ByteCity</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarCollapse">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/hospital-management">Home</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="patientDropdown"
					data-toggle="dropdown"> Patients </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="/hospital-management/create-patient">Create Patient</a> <a
							class="dropdown-item" href="/hospital-management/show-patients">View Patients</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="doctorDropdown"
					data-toggle="dropdown"> Doctors </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="/hospital-management/create-doctor">Create Doctor</a> <a
							class="dropdown-item" href="/hospital-management/show-doctors">View Doctors</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="staffDropdown"
					data-toggle="dropdown"> Staff </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="/hospital-management/create-staff">Create Staff</a> <a
							class="dropdown-item" href="/hospital-management/show-staff">View Staff</a>
					</div></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="appointmentDropdown"
					data-toggle="dropdown"> Appointments </a>
					<div class="dropdown-menu">
						<a class="dropdown-item" href="/hospital-management/register">Create Appointment</a> <a
							class="dropdown-item" href="/hospital-management/show-registerations">View Appointments</a>
					</div></li>
			</ul>
		</div>
	</nav>
</body>
</html>
