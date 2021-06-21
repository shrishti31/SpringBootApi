package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entities.Employee;
import com.nagarro.servicesImpl.EmployeeServicesImpl;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServicesImpl employeeServiceImpl;
	
	@PostMapping(value="/add")
	public Employee addEmployeeDetails(@RequestBody Employee employee) {
		return employeeServiceImpl.addEmployee(employee);

		
	}
	
	@GetMapping(value="/all")
	public List<Employee> getAllEmployee()
	{
		return employeeServiceImpl.viewEmployees();
	}
	
	@GetMapping(value="getById/{empNo}")
	public Employee getEmployee(@PathVariable String empNo) {
		return this.employeeServiceImpl.getEmployee(Integer.parseInt(empNo));
	}
	
	
	@PutMapping(value="/update")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeServiceImpl.updateEmployee(employee);
	}
}
