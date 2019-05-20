package com.app.pojos;

public class EmpReg {
	private int empregid;
	private String username;
	private String password;
	private String email;
	private String address;
	private String phone;
	public EmpReg() {
		super();
	}
	
	
	public EmpReg(int empregid, String username, String password, String email, String address, String phone) {
		super();
		this.empregid = empregid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}


	public int getEmpregid() {
		return empregid;
	}
	public void setEmpregid(int empregid) {
		this.empregid = empregid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
