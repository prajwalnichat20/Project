package com.app.criatsoft.main.adminModel;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee {
	@Id
	private	long employeeid;
	private	String employeename;
	private	String employeeemail;
	private String employeepassword;
	private String employeemobile;
	private String employeedesignation;
	private double employeesalary;
	public long getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeemail() {
		return employeeemail;
	}
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}
	public String getEmployeepassword() {
		return employeepassword;
	}
	public void setEmployeepassword(String employeepassword) {
		this.employeepassword = employeepassword;
	}
	public String getEmployeemobile() {
		return employeemobile;
	}
	public void setEmployeemobile(String employeemobile) {
		this.employeemobile = employeemobile;
	}
	public String getEmployeedesignation() {
		return employeedesignation;
	}
	public void setEmployeedesignation(String employeedesignation) {
		this.employeedesignation = employeedesignation;
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}
	
	
	
	
	

}
