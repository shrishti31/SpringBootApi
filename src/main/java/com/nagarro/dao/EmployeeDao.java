package com.nagarro.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.entities.Employee;

public interface EmployeeDao extends CrudRepository<Employee,Integer>{

}
