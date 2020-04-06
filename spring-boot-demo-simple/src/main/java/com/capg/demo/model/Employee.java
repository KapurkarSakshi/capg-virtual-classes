package com.capg.demo.model;

import java.time.LocalDate;

public class Employee {

	private String empId;
	private String empName;
	private String email;
	private LocalDate dateOfJng;
	private LocalDate dateOfResgntn;
	private int experience;
	
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Employee() {
		super();
	}
		

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfJng() {
		return dateOfJng;
	}

	public void setDateOfJng(LocalDate dateOfJng) {
		this.dateOfJng = dateOfJng;
	}

	public LocalDate getDateOfResgntn() {
		return dateOfResgntn;
	}

	public void setDateOfResgntn(LocalDate dateOfResgntn) {
		this.dateOfResgntn = dateOfResgntn;
	}

	public Employee(String empId, String empName, String email, LocalDate dateOfJng, LocalDate dateOfResgntn) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.dateOfJng = dateOfJng;
		this.dateOfResgntn = dateOfResgntn;
	}
	
	
	
}
