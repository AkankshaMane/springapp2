package com.app.pojos;

public class Employee
{
	private int empId;
	private String empName;
	private int empAge;
	private String designation;
	private String qualification;
	private Double salary;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int empAge, String designation, String qualification, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.designation = designation;
		this.qualification = qualification;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}