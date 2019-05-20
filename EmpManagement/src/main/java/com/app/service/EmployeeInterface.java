package com.app.service;

import java.util.List;

import com.app.pojos.EmpReg;
import com.app.pojos.Employee;

public interface EmployeeInterface {
	public String addEmp(Employee e);
	public List<Employee> showEmp();
	public Employee getEmpById(int empId);
	public String updateEmp(Employee e);
	public String deleteEmp(int empId);
	public String regEmp(EmpReg empreg);
	public EmpReg loginEmp(EmpReg empreg);
}
