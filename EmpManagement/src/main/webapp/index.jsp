<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h2>EMPLOYEE MANAGEMENT SYSYTEM!</h2>
<div class="form-group">
<form method="post" action="/EmpManagement/emp/searchEmp">
    <table>
        <tr>
            <td>Employee Id:</td>
            <td>
                <input type="number" name="empId"/>
            </td>&nbsp;&nbsp;&nbsp;&nbsp;
            <td colspan="2">
                <input type="submit" class="btn btn-info" value="Search" />
            </td>
        </tr>
    </table>
</form>
</div>
<a href="emp/addEmp">Add Employee</a><br></br>
<a href="emp/showEmp">Show Employee</a>

<a href="emp/regEmp">Register</a>
<a href="emp/loginEmp">Login</a>
</body>
</html>
