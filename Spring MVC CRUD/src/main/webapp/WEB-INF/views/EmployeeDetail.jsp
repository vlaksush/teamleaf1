<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Detail View</title>
</head>
<body>

	<div class="container">
	<h4>Detail View of the Employee</h4>
		<table class="table table-bordered mt=5">

			<tr>
				<td>ID</td>
				<td>${employee.id }
			</tr>

			<tr>
				<td>Name</td>
				<td>${employee.name }
			</tr>

			<tr>
				<td>Salary</td>
				<td>${employee.salary }
			</tr>

		</table>
	</div>


</body>
</html>