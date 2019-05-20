package com.app.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.EmpReg;
import com.app.pojos.Employee;
import com.app.service.EmployeeInterface;
import com.sun.org.apache.xpath.internal.operations.Equals;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmployeeInterface empservice;
	@GetMapping("/loginEmp")
	public String loginEmp(Model m)
	{
		m.addAttribute("LoginEmp", new EmpReg());
		System.out.println("in loginEmp");
		return "emp/loginEmp";
	}
	@PostMapping("/loginEmp")
	public String processloginEmp(@ModelAttribute("EmpReg") EmpReg empreg,RedirectAttributes flashmap)
	{
		System.out.println("in processloginEmp");
		EmpReg reg=empservice.loginEmp(empreg);
		if(reg!=null)
		{
			System.out.println("success");
			flashmap.addFlashAttribute("EmpLogin","Welcome '"+reg.getUsername()+"'");
		}
		else
		{
			flashmap.addFlashAttribute("EmpLogin","Login Failed");
			System.out.println("failed");
			return "redirect:/emp/loginEmp";
		}
		return "redirect:/emp/showEmp";	
	}
	
	@GetMapping("/regEmp")
	public String regEmp(Model m)
	{
		m.addAttribute("EmpReg", new EmpReg());
		System.out.println("in regEmp");
		return "emp/register";
	}
	@PostMapping("/regEmp")
	public String processregEmp(@ModelAttribute("EmpReg") EmpReg empreg,RedirectAttributes flashmap)
	{
		System.out.println("in processregEmp");
		flashmap.addFlashAttribute("EmpReg",empservice.regEmp(empreg));
		return "redirect:/emp/loginEmp";	
	}
	
	@GetMapping("/addEmp")
	public String showAddEmp(Model m)
	{
		m.addAttribute("employee", new Employee());
		System.out.println("in showaddemp");
		return "emp/addEmp";
	}
	@PostMapping("/addEmp")
	public String processAddEmp(@ModelAttribute("e") Employee e,RedirectAttributes flashmap)
	{
		System.out.println("in processaddemp");
		flashmap.addFlashAttribute("register",empservice.addEmp(e));
		return "redirect:/emp/showEmp";	
	}
	@GetMapping("/showEmp")
	public String showEmp(Model m)
	{
		List<Employee>listEmp=empservice.showEmp();
		m.addAttribute("listEmp",listEmp);
		return "emp/showEmp";
	}
	@GetMapping("/editEmp/{empId}")
	public String editEmp(@PathVariable int empId,Model m)
	{
		System.out.println(empId);
		try {
			m.addAttribute("employee", empservice.getEmpById(empId));
		} catch (Exception e) {
			m.addAttribute("error", "Not such Employee Id Found");
			return "emp/errorpage";
		}
		return "emp/editEmp";
	}
	@PostMapping("/editEmp")
	public String processEditEmp(@ModelAttribute("e") Employee e,RedirectAttributes flashmap)
	{
		System.out.println("in processEditemp");
		flashmap.addFlashAttribute("edit",empservice.updateEmp(e));
		return "redirect:/emp/showEmp";	
	}
	@GetMapping("/deleteEmp/{empId}")
	public String deleteEmp(@PathVariable int empId)
	{
		System.out.println(empId);
		empservice.deleteEmp(empId);
		return "redirect:/emp/showEmp";
	}
	@PostMapping("/searchEmp")
	public String listNotes(Employee e) {
		int id=e.getEmpId();
	    return "redirect:/emp/editEmp/"+id+"";
	}
}