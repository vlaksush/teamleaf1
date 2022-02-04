<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>ABC - Update</title>
</head>
<body>

	<div class="container">
		<h1>Edit Employee</h1>
		<form:form method="post" action="/demo1mvc/employee/update"
			modelAttribute="employee">

			<table class="table table-bordered" style="width: 300px">
				<tr>
					<td>Id :</td>
					<td>${employee.id }<form:hidden path="id" />
					</td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><form:input type="text" path="name" /></td>
				</tr>
				<tr>
					<td>Salary :</td>
					<td><form:input type="text" path="salary" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input class="btn btn-primary btn-sm" type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>