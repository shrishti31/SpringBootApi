package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.nagarro")
@EntityScan(basePackages = {"com.nagarro.entities"})  
public class EmployeeApiApplication {

	
	public static void main(String[] args) {
	 SpringApplication.run(EmployeeApiApplication.class, args);
	}

}
