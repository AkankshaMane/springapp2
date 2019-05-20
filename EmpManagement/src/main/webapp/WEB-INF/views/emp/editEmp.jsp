<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Employee</h1>
	<form:form method="post" modelAttribute="employee" action="/EmpManagement/emp/editEmp">
    <table>
    	<tr>
            <td>Employee Id:</td>
            <td>
                <form:input path="empId" readonly="true" />
            </td>
        </tr>
        <tr>
            <td>Employee name:</td>
            <td>
                <form:input path="empName" />
            </td>
        </tr>
        <tr>
            <td>Employee age:</td>
            <td>
                <form:input path="empAge" />
            </td>
        </tr>
         <tr>
            <td>Employee Designation:</td>
            <td>
                <form:input path="designation" />
            </td>
        </tr>
        <tr>
            <td>Employee Qualification:</td>
            <td>
                <form:input path="qualification" />
            </td>
        </tr>
        <tr> 
            <td>Employee salary:</td>
            <td>
                <form:input path="salary" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Update" />
            </td>
        </tr>
    </table>
</form:form>

${requestScope.edit }
</body>
</html>