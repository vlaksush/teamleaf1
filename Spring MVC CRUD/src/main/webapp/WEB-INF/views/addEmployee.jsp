<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Employee Add</title>
</head>
<body>
	<div class="container">
		<h1>Add Employee</h1>
		<form:form action="/demo1mvc/employee/save" method="post"
			modelAttribute="employee">

			<table class="table table-bordered">
				<tr>
					<th>ID</th>
					<td><form:input type="text" path="id" /></td>
				</tr>

				<tr>
					<th>Name</th>
					<td><form:input type="text" path="name" /></td>
				</tr>

				<tr>
					<th>Salary</th>
					<td><form:input type="text" path="salary" /></td>
				</tr>
				
				<tr>
				<td></td>
				<td><input class="btn btn-primary" type="submit" value="Submit"></td>
				</tr>
			</table>

		</form:form>

	</div>
</body>
</html>