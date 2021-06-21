package com.nagarro.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.dao.EmployeeDao;
import com.nagarro.entities.Employee;
import com.nagarro.services.EmployeeService;

@Service
public class EmployeeServicesImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> viewEmployees() {
		return (List<Employee>) employeeDao.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployee(int empNo) {
		Optional<Employee> optional = employeeDao.findById(empNo);
		Employee employee = optional.get();
		return employee;
	}
}
