package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.empDao.EmployeeDaoInterface;
import com.app.pojos.EmpReg;
import com.app.pojos.Employee;
@Service
public class EmployeeImplementation implements EmployeeInterface {
	@Autowired
	private EmployeeDaoInterface empDao;

	public List<Employee> showEmp() {
		return empDao.showEmp();
	}

	public String addEmp(Employee e) {
		return empDao.addEmp(e);
	}

	public Employee getEmpById(int empId) {
		
		return empDao.getEmpById(empId);
	}

	public String updateEmp(Employee e) {
		
		return empDao.updateEmp(e);
	}

	public String deleteEmp(int empId) {
		
		return empDao.deleteEmp(empId);
	}

	public String regEmp(EmpReg empreg) {
		return empDao.regEmp(empreg);
	}

	public EmpReg loginEmp(EmpReg empreg) {
		return empDao.loginEmp(empreg);
	}
}
