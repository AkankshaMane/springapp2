<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<h3 style="font-size: xx-large;font-style:inherit;font: bolder;font-family:monospace;" align="center">EMPLOYEE INFORMATION</h3>
<table class="table table-hover">
 	<thead>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee designation</th>
			<th>Employee qualification</th>
			<th>Employee Salary</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="emp" items="${listEmp}">
			<tr>
				<td>${emp.empId}</td>
				<td>${emp.empName}</td>
				<td>${emp.empAge}</td>
				<td>${emp.designation}</td>
				<td>${emp.qualification}</td>
				<td>${emp.salary}</td>
				<td><a href="editEmp/${emp.empId}">Edit</a></td>
				<td><a href="deleteEmp/${emp.empId}">Delete</a></td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
${requestScope.register }
${requestScope.edit }
${requestScope.EmpLogin }

</body>
</html>