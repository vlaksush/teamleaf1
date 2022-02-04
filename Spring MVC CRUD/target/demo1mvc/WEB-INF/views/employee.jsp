<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>ABC - Employee Page</title>
</head>
<body>
	<div class="container">
		<h3>Employee List</h3>
		<div align="right" class="container">
		<a class="btn btn-primary mb-2" href="/demo1mvc/abc/home">Home</a>
		<table class="table table-dark">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Salary</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employeeList}" var="emp" varStatus="status">
					<tr>
						<td> <a href="/demo1mvc/employee/display/${emp.id }" > ${emp.id } </a></td>
						<td>${emp.name }</td>
						<td>${emp.salary }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>
<!--   -->
