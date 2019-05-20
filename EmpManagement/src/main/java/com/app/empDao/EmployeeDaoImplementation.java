package com.app.empDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.app.pojos.EmpReg;
import com.app.pojos.Employee;

public class EmployeeDaoImplementation implements EmployeeDaoInterface {
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<Employee> showEmp() {
		List<Employee>emplist=jdbcTemplate.query("select * from emp_table", new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp=new Employee();
				emp.setEmpId(rs.getInt("emp_id"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setEmpAge(rs.getInt("emp_age"));
				emp.setDesignation(rs.getString("Designation"));
				emp.setQualification(rs.getString("Qualification"));
				emp.setSalary(rs.getDouble("Salary"));
				return emp;
			}
			
		});
		return emplist;
	}

	public String addEmp(Employee e) {
		String sql="insert into emp_table values('"+e.getEmpId()+"','"+e.getEmpName()+"','"+e.getEmpAge()+"','"+e.getDesignation()+"','"+e.getQualification()+"','"+e.getSalary()+"')";
		jdbcTemplate.update(sql);
		return "added successfully";
	}
	public Employee getEmpById(int empId) {	
		String sql="select * from emp_table where emp_id=?";
		Employee emp = (Employee) jdbcTemplate.queryForObject(
                sql, new Object[] { empId }, new RowMapper<Employee>() {
					public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employee emp=new Employee();
						emp.setEmpId(rs.getInt("emp_id"));
						emp.setEmpName(rs.getString("emp_name"));
						emp.setEmpAge(rs.getInt("emp_age"));
						emp.setDesignation(rs.getString("Designation"));
						emp.setQualification(rs.getString("Qualification"));
						emp.setSalary(rs.getDouble("Salary"));
						return emp;
					}
                });
		return emp;
	}
	public String updateEmp(Employee e) {
		String sql="update emp_table set emp_name='"+e.getEmpName()+"',emp_age='"+e.getEmpAge()+"',Designation='"+e.getDesignation()+"',Qualification='"+e.getQualification()+"',Salary='"+e.getSalary()+"' where emp_id='"+e.getEmpId()+"'";
		jdbcTemplate.update(sql);
		return "updated successfully";
	}
	public String deleteEmp(int empId) {
		String sql="delete from emp_table where emp_id=?";
		jdbcTemplate.update(sql, empId);
		return "deleted successfully";
	}

	public String regEmp(EmpReg empreg) {
		
		String sql="insert into empreg_table values('"+empreg.getEmpregid()+"','"+empreg.getUsername()+"','"+empreg.getPassword()+"','"+empreg.getEmail()+"','"+empreg.getAddress()+"','"+empreg.getPhone()+"')";
		jdbcTemplate.update(sql);
		return "registration successfully";
	}
	public EmpReg loginEmp(EmpReg empreg) {
		String sql="select * from empreg_table where username='"+empreg.getUsername()+"' and password='"+empreg.getPassword()+"'";
		List<EmpReg> emp1=jdbcTemplate.query(sql,new RowMapper<EmpReg>() {
			public EmpReg mapRow(ResultSet rs, int rowNum) throws SQLException {				
				EmpReg emp=new EmpReg();
				emp.setEmpregid(rs.getInt("EmpReg_id"));
				emp.setUsername(rs.getString("username"));
				emp.setPassword(rs.getString("password"));
				emp.setEmail(rs.getString("email"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getString("phoneno"));
				return emp;
			}
        }); 
		return emp1.size()>0?emp1.get(0):null;
	}
}