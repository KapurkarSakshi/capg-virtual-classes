package com.capg.labook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	@Value("${eId}")
	private int empId;
	@Value("${eName}")
	private String empName;
	@Value("${eSal}")
	private double empSal;
	//@Value("${eBUnit}")
	private SBU empBU;
	@Value("${eAge}")
	private int empAge;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}


	public SBU getEmpBU() {
		return empBU;
	}


	public void setEmpBU(SBU empBU) {
		this.empBU = empBU;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ",\n empBU=" + getSbuDetails()
				+ ", empAge=" + empAge + "]";
	}


	public Employee(int empId, String empName, double empSal, SBU empBU, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empBU = empBU;
		this.empAge = empAge;
	}


	public SBU getSbuDetails() {
		ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		empBU=(SBU)context.getBean("sbu");
		return empBU;
		
		
	}

}
