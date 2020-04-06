package com.capg.demo.service;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;

import com.capg.demo.model.Employee;

public class EmployeeRestController {
	
	@GetMapping("/employees")
	public Employee getEmployee() {
		Employee employee=new Employee("16211A0480","Lokesh", "lokesh@yahoo.com", 
				LocalDate.of(2010, 01, 01), LocalDate.of(2020, 01, 01));
		return employee;
	}

}
