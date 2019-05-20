<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOW EMPLOYEES</title>
</head>
<body>
<h3>EMPLOYEE MANAGEMENT SYSTEM</h3>
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee designation</th>
			<th>Employee qualification</th>
			<th>Employee Salary</th>
		</tr>
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
	</table>
</body>
</html>