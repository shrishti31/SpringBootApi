package com.nagarro.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.entities.Employee;

@Component
public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	
	public List<Employee> viewEmployees();
	
	public Employee updateEmployee(Employee employee);
	
	public Employee getEmployee(int empNo);

}
