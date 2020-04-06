package com.capg.demo.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public int getExperience(LocalDate dateOfJng, LocalDate dateOfResgntn) {
		int exp = dateOfJng.getYear() - dateOfResgntn.getYear();
		return exp;
	}
	
	
}
